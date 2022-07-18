/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

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
    
    public void agregarPersona(Persona persona) throws IOException{
        FileWriter archivoTexto = new FileWriter("src/archivos/persona_" + 
                (archivos.size() + 1) + ".txt");
        
        PrintWriter pw = new PrintWriter(archivoTexto);
        
        pw.println("Nombre : " + persona.getNombre());
        pw.println("Apellidos : " + persona.getApellidos());
        pw.println("Fecha de Nacimiento : " + persona.getApellidos());
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
            pw.println("Telefono " + i + " : " + telefono.getNumero());
            pw.println("Tipo de Telefono " + i + " : " + telefono.getTipo());
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
