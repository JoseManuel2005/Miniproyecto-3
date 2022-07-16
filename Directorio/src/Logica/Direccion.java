/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Usuario
 */
public class Direccion {
    private String direccion;
    private String barrio;
    private String ciudad;

    public Direccion(String direccion, String barrio, String ciudad) {
        this.direccion = direccion;
        this.barrio = barrio;
        this.ciudad = ciudad;
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
