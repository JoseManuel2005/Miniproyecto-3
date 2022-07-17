/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private String fecha;
    private long id;
    private String idTipo;
    private ArrayList<Direccion> direcciones;
    private ArrayList<Telefono> telefonos;
    private  Map<String,Integer> contacto;

    public Persona() {
        nombre = "";
        apellidos = "";
        fecha = "";
        id = 0;
        idTipo = "";
        direcciones = new ArrayList<>();
        telefonos = new ArrayList<>();
        contacto = new HashMap();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFecha() {
        return fecha;
    }

    public long getId() {
        return id;
    }

    public String getIdTipo() {
        return idTipo;
    }

    public ArrayList<Direccion> getDirreciones() {
        return direcciones;
    }

    public ArrayList<Telefono> getTelefonos() {
        return telefonos;
    }

    public Map<String, Integer> getContacto() {
        return contacto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setIdTipo(String idTipo) {
        this.idTipo = idTipo;
    }

    public void setDirreciones(ArrayList<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public void setTelefonos(ArrayList<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public void setContacto(Map<String, Integer> contacto) {
        this.contacto = contacto;
    }
    
    
}
