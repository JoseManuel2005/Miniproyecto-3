/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class DirectorioGUI extends JFrame {

    private JLabel lblNombres;
    private JLabel lblApellidos;
    private JLabel lblFechaNacimiento;
    private JLabel lblId;
    private JLabel lblTelefono;
    private JLabel lblDireccion;
    private JLabel lblBarrio;
    private JLabel lblCiudad;
    private JLabel lblNumeroContacto;
    private JTextField txtNombres;
    private JTextField txtApellidos;
    private JTextField txtFechaNacimiento;
    private JTextField txtId;
    private JTextField txtTipoTelefono;
    private JTextField txtTelefono;
    private JTextField txtDireccion;
    private JTextField txtBarrio;
    private JTextField txtCiudad;
    private JButton btnAgregar;
    private JButton btnActualizar;
    private JButton btnEliminar;
    private JButton btnListar;
    private JButton btnRestauracion;
    private JButton btnExportarContactos;
    private JButton btnTelefonoAnterior;
    private JButton btnTelefonoSiguiente;
    private JButton btnDireccionAnterior;
    private JButton btnDireccionSiguiente;
    private JButton btnContactoAnterior;
    private JButton btnContactoSiguiente;
    private JComboBox cBoxTipoTelefono;
    private JPanel pnel1;
    private JPanel pnel2; 
   

    Container contenedorPpal;

    public DirectorioGUI() {
        iniciarComponentes();
        setTitle("Directorio");
        setSize(800, 540);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void iniciarComponentes() {

        lblNombres = new JLabel("Nombres: ");
        lblNombres.setBounds(20, 40, 100, 10);
        txtNombres = new JTextField();
        txtNombres.setBounds(90, 35, 200, 30);
        lblApellidos = new JLabel("Apellidos: ");
        lblApellidos.setBounds(20, 70, 100, 15);
        txtApellidos = new JTextField();
        txtApellidos.setBounds(90, 70, 200, 30);
        lblFechaNacimiento = new JLabel("Fecha nacimiento mm/dd/aa: ");
        lblFechaNacimiento.setBounds(320, 40, 200, 10);
        txtFechaNacimiento = new JTextField();
        txtFechaNacimiento.setBounds(495, 35, 200, 30);
        lblId = new JLabel("Id: ");
        lblId.setBounds(470, 70, 100, 10);
        txtId = new JTextField();
        txtId.setBounds(495, 70, 200, 30);
        cBoxTipoTelefono = new JComboBox();
        cBoxTipoTelefono.setBounds(700, 70, 50, 30);
        cBoxTipoTelefono.addItem("CC");
        cBoxTipoTelefono.addItem("TI");
        cBoxTipoTelefono.addItem("CE");
        lblTelefono = new JLabel("Telefono #   : ");
        lblTelefono.setBounds(20, 150, 100, 15);
        txtTipoTelefono = new JTextField();
        txtTipoTelefono.setBounds(20, 170, 200, 30);
        txtTelefono = new JTextField();
        txtTelefono.setBounds(240, 170, 200, 30);
        btnTelefonoAnterior = new JButton("<");
        btnTelefonoAnterior.setBounds(450, 170, 50, 30);
        btnTelefonoSiguiente = new JButton(">");
        btnTelefonoSiguiente.setBounds(505, 170, 50, 30);
        lblDireccion = new JLabel("Direccion # : ");
        lblDireccion.setBounds(20, 250, 100, 15);
        txtDireccion = new JTextField();
        txtDireccion.setBounds(20, 270, 200, 30);
        lblBarrio = new JLabel("Barrio");
        lblBarrio.setBounds(240, 250, 100, 10);
        txtBarrio = new JTextField();
        txtBarrio.setBounds(240, 270, 200, 30);
        lblCiudad = new JLabel("Ciudad");
        lblCiudad.setBounds(460, 250, 100, 10);
        txtCiudad = new JTextField();
        txtCiudad.setBounds(460, 270, 200, 30);
        btnDireccionAnterior = new JButton("<");
        btnDireccionAnterior.setBounds(20, 310, 50, 30);
        btnDireccionSiguiente = new JButton(">");
        btnDireccionSiguiente.setBounds(75, 310, 50, 30);       
        btnAgregar = new JButton("Agregar");
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");
        btnListar = new JButton("Listar");
        btnRestauracion = new JButton("Restaurar");
        btnExportarContactos = new JButton("Exportar contactos");
        btnContactoAnterior = new JButton("Anterior");
        lblNumeroContacto = new JLabel("#");
        btnContactoSiguiente = new JButton("Siguiente");
        pnel1 = new JPanel();
        pnel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnel1.setBounds(0, 370, 800, 40);
        pnel1.add(btnAgregar);
        pnel1.add(btnActualizar);
        pnel1.add(btnEliminar);
        pnel1.add(btnListar);
        pnel1.add(btnRestauracion);
        pnel1.add(btnExportarContactos);
        pnel2 = new JPanel();
        pnel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnel2.add(btnContactoAnterior);
        pnel2.add(lblNumeroContacto);
        pnel2.add(btnContactoSiguiente);
        pnel2.setBounds(0, 430, 800, 40);
        contenedorPpal = getContentPane();
        contenedorPpal.setLayout(null);
        contenedorPpal.add(lblNombres);
        contenedorPpal.add(txtNombres);
        contenedorPpal.add(lblApellidos);
        contenedorPpal.add(txtApellidos);
        contenedorPpal.add(lblFechaNacimiento);
        contenedorPpal.add(txtFechaNacimiento);
        contenedorPpal.add(lblId);
        contenedorPpal.add(txtId);
        contenedorPpal.add(cBoxTipoTelefono);
        contenedorPpal.add(lblTelefono);
        contenedorPpal.add(txtTipoTelefono);
        contenedorPpal.add(txtTelefono);
        contenedorPpal.add(btnTelefonoAnterior);
        contenedorPpal.add(btnTelefonoSiguiente);
        contenedorPpal.add(lblDireccion);
        contenedorPpal.add(txtDireccion);
        contenedorPpal.add(lblBarrio);
        contenedorPpal.add(txtBarrio);
        contenedorPpal.add(lblCiudad);
        contenedorPpal.add(txtCiudad);
        contenedorPpal.add(btnDireccionAnterior);
        contenedorPpal.add(btnDireccionSiguiente);
        contenedorPpal.add(pnel1);
        contenedorPpal.add(pnel2);   
    }

}
