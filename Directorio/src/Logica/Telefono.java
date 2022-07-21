/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

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
public class Telefono {
    private long numero;
    private String tipo;

    public Telefono() {
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
