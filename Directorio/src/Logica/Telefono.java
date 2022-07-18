/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Usuario
 */
public class Telefono {
    private long numero;
    private String tipo;

    public Telefono(/*long numero, String tipo*/) {
        numero = 0;
        tipo = "";
    }

    public long getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
