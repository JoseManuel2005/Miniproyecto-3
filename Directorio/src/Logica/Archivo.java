/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.*;

/**
 *
 * @author Usuario
 */
public class Archivo {
    private File archivo;

    public Archivo(File archivo) {
        this.archivo = archivo;
    }

    public File getArchivo() {
        return archivo;
    }
    
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void renombrarArchivo(File archivo){
        this.archivo.renameTo(archivo);
    }
}
