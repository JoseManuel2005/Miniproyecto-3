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
 *
 * @author mauricio.munoz
 */
public class Directorio {
    
    //private ArrayList<Persona> personas;
    private ArrayList<Archivo> archivos;
    private Archivo archivoPersona;

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
                    String auxStr = linea;//.substring(linea.indexOf(":")+2); //Cadena despues de los dos puntos
                    String auxStr2 = linea.substring(linea.indexOf(",")+2); //Cadena despues de la primera coma
                    String auxStr3 = linea.substring(auxStr2.indexOf(",")+2); //Cadena despues de la segunda coma
                    
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
    
    public void agregarPersona(Persona persona) throws IOException{
        FileWriter archivoTexto = new FileWriter("src/archivos/persona_" + 
                (archivos.size() + 1) + ".txt");
        
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
        for(Direccion direccion : persona.getDirreciones()){
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
    
    private void actualizarPersona(){
        
    }
    
    private void eliminarPersona(){
        
    }
    
    private void mostrarLista(){
        
    }
    
    private void actualizarVentana(){
        
    }
    
    private void crearArchivoPlano(){
        
    }
    
    private void generarBkp(){
        
    }    
}
