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
    private  int numero;
    private String tipo;

    public Telefono(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
