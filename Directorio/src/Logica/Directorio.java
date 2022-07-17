/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author mauricio.munoz
 */
public class Directorio {
    
    //private ArrayList<Persona> personas;
    private ArrayList<Archivo> archivos;
    private Archivo archivoPersona;

    public Directorio() {
      //  this.personas = personas;
      // this.archivoPersona = archivoPersona;
      archivos = new ArrayList<>();
    }

    public ArrayList<Archivo> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<Archivo> archivos) {
        this.archivos = archivos;
    }
    
    private void agregarPersona(Persona persona) throws IOException{
        FileWriter archivoTexto = new FileWriter("src/archivos/persona_" + 
                (archivos.size() + 1) + ".txt");
        
        PrintWriter pw = new PrintWriter(archivoTexto);
        
        pw.println("Nombre : " + persona.getNombre());
        pw.println("Apellidos : " + persona.getApellidos());
        pw.println("");
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
