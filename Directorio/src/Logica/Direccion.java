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
public class Direccion {
    private String direccion;
    private String barrio;
    private String ciudad;

    public Direccion() {
        direccion = "";
        barrio = "";
        ciudad = "";
    }

    public String getDireccion() {
        return direccion;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
