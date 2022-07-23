/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 * @author Mauricio Munoz Gutierrez
 * @author Jose Manuel Palma Oquedno
 * 
 * Profesor Luis Johany Romo Portilla
 * 
 * Fundamentos de Programacion Orientada por Eventos
 * Grupo 1
 * 
 * Miniproyecto 3
 */
public class Directorio {
    private ArrayList<Archivo> archivos;

    public Directorio() {
      archivos = new ArrayList<>();
      verificarArchivos();
    }

    public ArrayList<Archivo> getArchivos() {
        return archivos;
    }

    public void verificarArchivos() {
        archivos = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i == 0){
            Archivo auxFile = new Archivo(new File("src/archivos/persona_" + (j+1) + ".txt"));
            if(auxFile.getArchivo().exists()){
                archivos.add(auxFile);
                j++;
            }else{
                i++;
            }
        }
    }
    
    public Persona sacarInfoDeArchivo(int archivo) throws FileNotFoundException, IOException{
        if(archivos.get(archivo).getArchivo().exists()){
            Persona auxPersona = new Persona();
            ArrayList<Telefono> auxTels = new ArrayList<>();
            ArrayList<Direccion> auxDirecciones = new ArrayList<>();
            int auxNumTel = 1;
            int auxNumDir = 1;

            FileReader fr = new FileReader(archivos.get(archivo).getArchivo());
            BufferedReader br = new BufferedReader(fr);

            String linea = "";

            while((linea = br.readLine()) != null) {
                if(linea.contains("Nombre")){
                    auxPersona.setNombre(linea.substring(linea.indexOf(":")+2));
                }
                else if(linea.contains("Apellidos")){
                    auxPersona.setApellidos(linea.substring(linea.indexOf(":")+2));
                }
                else if(linea.contains("Fecha de Nacimiento")){
                    auxPersona.setFecha(linea.substring(linea.indexOf(":")+2));
                }
                else if(linea.contains("ID")){
                    auxPersona.setId(Long.parseLong(linea.substring(linea.indexOf(":")+2)));
                }
                else if(linea.contains("Tipo de Documento")){
                    auxPersona.setIdTipo(linea.substring(linea.indexOf(":")+2));
                }
                else if(linea.contains("Rol")){
                    Map<String,Boolean> tipoContactoAux;
                            tipoContactoAux = new HashMap<>();
                            tipoContactoAux.put("Estudiante",false);
                            tipoContactoAux.put("Profesor",false);
                            tipoContactoAux.put("Empleado",false);
                    if(linea.contains("Estudiante")){
                        tipoContactoAux.replace("Estudiante", true);
                    }
                    if(linea.contains("Profesor")){
                        tipoContactoAux.replace("Profesor", true);
                    }
                    if(linea.contains("Empleado")){
                        tipoContactoAux.replace("Empleado", true);
                    }
                    auxPersona.setContacto(tipoContactoAux);
                }
                else if(linea.contains("Telefono 1")){
                    Telefono auxTel = new Telefono();
                    auxTel.setNumero(Long.parseLong(linea.substring(linea.indexOf(":")+2,linea.indexOf(","))));
                    auxTel.setTipo(linea.substring(linea.indexOf(",")+2));
                    auxTels.add(auxTel);
                    auxPersona.setTelefonos(auxTels);
                }
                else if(linea.contains("Telefono 2")){
                    Telefono auxTel2 = new Telefono();
                    auxTel2.setNumero(Long.parseLong(linea.substring(linea.indexOf(":")+2,linea.indexOf(","))));
                    auxTel2.setTipo(linea.substring(linea.indexOf(",")+2));
                    auxTels.add(auxTel2);
                    auxPersona.setTelefonos(auxTels);
                }
                else if(linea.contains("Telefono 3")){
                    Telefono auxTel3 = new Telefono();
                    auxTel3.setNumero(Long.parseLong(linea.substring(linea.indexOf(":")+2,linea.indexOf(","))));
                    auxTel3.setTipo(linea.substring(linea.indexOf(",")+2));
                    auxTels.add(auxTel3);
                    auxPersona.setTelefonos(auxTels);
                }
                else if(linea.contains("Direccion "+auxNumDir)){
                    Direccion auxDir = new Direccion();
                    String auxStr = linea;
                    String auxStr2 = linea.substring(linea.indexOf(",")+2); 
                    String auxStr3 = linea.substring(auxStr2.indexOf(",")+2);
                    
                    String auxDireccion = auxStr.substring(14,linea.indexOf(","));
                    String auxBarrio = auxStr2.substring(0,auxStr2.indexOf(","));
                    String auxCiudad = auxStr2.substring(auxStr2.indexOf(",")+2);
                    
                    auxDir.setDireccion(auxDireccion);
                    auxDir.setBarrio(auxBarrio);
                    auxDir.setCiudad(auxCiudad);
                    auxDirecciones.add(auxDir);
                    auxPersona.setDirecciones(auxDirecciones);
                    auxNumDir++;
                }
            }
            fr.close();
            return auxPersona;
        }
        else{
            JOptionPane.showMessageDialog(null, 
                            ("El archivo persona_ " + archivo + ".txt no existe"),
                            "error",
                            ERROR_MESSAGE);
            Persona auxPersona = new Persona();
            return auxPersona;
        }
    }
    
    public void crearTxtPersona(Persona persona, int archivo) throws IOException{
        FileWriter archivoTexto;
        if(archivo == -1){ //Nuevo contacto
            archivoTexto = new FileWriter("src/archivos/persona_" + 
                (archivos.size() + 1) + ".txt");
        }
        else{ // Actualizar Contacto
            System.out.println("Entra");
            archivoTexto = new FileWriter("src/archivos/persona_" + 
                (archivo+1) + ".txt");
        }
        
        PrintWriter pw = new PrintWriter(archivoTexto);
        
        pw.println("Nombre : " + persona.getNombre());
        pw.println("Apellidos : " + persona.getApellidos());
        pw.println("Fecha de Nacimiento : " + persona.getFecha());
        pw.println("ID : " + persona.getId());
        pw.println("Tipo de Documento : " + persona.getIdTipo());
        String auxStr = "";
        for(Map.Entry<String, Boolean> entry : persona.getContacto().entrySet()){
            if(entry.getKey().equals("Estudiante")){
                if(entry.getValue()){
                    auxStr += "Estudiante,";
                }
            }
            if(entry.getKey().equals("Profesor")){
                if(entry.getValue()){
                    auxStr += "Profesor,";
                }
            }   
            if(entry.getKey().equals("Empleado")){
                if(entry.getValue()){
                    auxStr += "Empleado,";
                }
            }   
        }
        pw.println("Rol : " + auxStr);
        int i = 1;
        for(Telefono telefono : persona.getTelefonos()){
            pw.println("Telefono " + i + " : " + telefono.getNumero() + ", " + telefono.getTipo());
            i++;
        }
        i = 1;
        for(Direccion direccion : persona.getDirecciones()){
            pw.println("Direccion " + i + " : " + 
                    direccion.getDireccion() + ", " +
                    direccion.getBarrio() + ", " +
                    direccion.getCiudad());
            i++;
        }
        try {
           if ( archivoTexto != null)
              archivoTexto.close();
        } catch (IOException e2) {
              e2.printStackTrace();
        }
        verificarArchivos();
    }
    
    public void eliminarPersona(int archivo) {
        archivos.get(archivo).getArchivo().delete();
        for (int i = 0; i < archivos.size(); i++) {
            File auxFile = new File("src/archivos/persona_"+(i+1)+".txt");
            archivos.get(i).renombrarArchivo(auxFile);
        }
        verificarArchivos();
    }
    
    public void crearArchivoPlano() throws IOException{
        Persona pr = new Persona();
        FileWriter archivoTexto = new FileWriter("src/archivos/contactos.txt");
        PrintWriter pw = new PrintWriter(archivoTexto);
        
        String linea = "";
        for(int i = 0; i < archivos.size();i++){
            pr = sacarInfoDeArchivo(i);
            
            linea = pr.getNombre() + ";"
                + pr.getApellidos() + ";"
                + pr.getFecha() + ";"
                + pr.getId() + ";"
                + pr.getIdTipo() + ";"
                + pr.getTelefonos().get(0).getNumero() + ";"
                + pr.getTelefonos().get(0).getTipo()+ ";"
                + pr.getDirecciones().get(0).getDireccion() + ";"
                + pr.getDirecciones().get(0).getBarrio() + ";"
                + pr.getDirecciones().get(0).getCiudad() + ";";
            
            for(Map.Entry<String, Boolean> entry : pr.getContacto().entrySet()){
                if(entry.getKey().equals("Estudiante")){
                    if(entry.getValue()){
                        linea += "Estudiante;";
                    }
                }
                if(entry.getKey().equals("Profesor")){
                    if(entry.getValue()){
                        linea += "Profesor;";
                    }
                }   
                if(entry.getKey().equals("Empleado")){
                    if(entry.getValue()){
                        linea += "Empleado";
                    }
                }   
            }    
            pw.println(linea);
        }
        try {
            if ( archivoTexto != null)
                archivoTexto.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }   
}
