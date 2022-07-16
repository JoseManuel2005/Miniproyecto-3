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
public class VentanaDirectorio extends JFrame {

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
    private JPanel pnelNorte;
    private JPanel pnelTelefono;
    private JPanel pnelDireccion;
    private JPanel pnelBotones;
    Container contenedorPpal;

    public VentanaDirectorio() {
        setTitle("Directorio");
        setSize(800, 700);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        iniciarComponentes();
    }

    private void iniciarComponentes() {

        lblNombres = new JLabel("Nombres: ");
        txtNombres = new JTextField();
        lblApellidos = new JLabel("Apellidos: ");
        txtApellidos = new JTextField();
        lblFechaNacimiento = new JLabel("Fecha nacimiento mm/dd/aa: ");
        txtFechaNacimiento = new JTextField();
        lblId = new JLabel("Id: ");
        txtId = new JTextField();
        cBoxTipoTelefono = new JComboBox();
        cBoxTipoTelefono.addItem("CC");
        cBoxTipoTelefono.addItem("TI");
        cBoxTipoTelefono.addItem("CE");
        pnelNorte = new JPanel();
        pnelNorte.setLayout(new GridLayout(2, 3, 5, 5));
        pnelNorte.add(lblNombres);
        pnelNorte.add(txtNombres);
        pnelNorte.add(lblApellidos);
        pnelNorte.add(txtApellidos);
        pnelNorte.add(lblFechaNacimiento);
        pnelNorte.add(txtFechaNacimiento);
        pnelNorte.add(lblId);
        pnelNorte.add(txtId);
        pnelNorte.add(cBoxTipoTelefono);

        lblTelefono = new JLabel("Telefono #   : ");
        txtTipoTelefono = new JTextField();
        txtTelefono = new JTextField();
        btnTelefonoAnterior = new JButton("Anterior");
        btnTelefonoSiguiente = new JButton("Siguiente");
        pnelTelefono = new JPanel();
        pnelTelefono.setLayout(new GridLayout(2, 3, 5, 5));
        pnelTelefono.add(lblTelefono);
        pnelTelefono.add(txtTipoTelefono);
        pnelTelefono.add(txtTelefono);
        pnelTelefono.add(btnTelefonoAnterior);
        pnelTelefono.add(btnTelefonoSiguiente);

        lblDireccion = new JLabel("Direccion # : ");
        txtDireccion = new JTextField();
        lblBarrio = new JLabel("Barrio");
        txtBarrio = new JTextField();
        lblCiudad = new JLabel("Ciudad");
        txtCiudad = new JTextField();
        btnDireccionAnterior = new JButton("Anterior");
        btnDireccionSiguiente = new JButton("Siguiente");
        pnelDireccion = new JPanel();
        pnelDireccion.setLayout(new GridLayout(3, 3, 5, 5));
        pnelDireccion.add(lblDireccion);
        pnelDireccion.add(txtDireccion);
        pnelDireccion.add(lblBarrio);
        pnelDireccion.add(txtBarrio);
        pnelDireccion.add(lblCiudad);
        pnelDireccion.add(txtCiudad);
        pnelDireccion.add(btnDireccionAnterior);
        pnelDireccion.add(btnDireccionSiguiente);

        btnAgregar = new JButton("Agregar");
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");
        btnListar = new JButton("Listar");
        btnRestauracion = new JButton("Restaurar");
        btnExportarContactos = new JButton("Exportar contactos");
        btnContactoAnterior = new JButton("Anterior");
        lblNumeroContacto = new JLabel("#");
        btnContactoSiguiente = new JButton("Siguiente");
        pnelBotones = new JPanel();
        pnelBotones.setLayout(new GridLayout(2, 10, 10, 10));
        pnelBotones.add(btnAgregar);
        pnelBotones.add(btnActualizar);
        pnelBotones.add(btnEliminar);
        pnelBotones.add(btnListar);
        pnelBotones.add(btnRestauracion);
        pnelBotones.add(btnExportarContactos);
        pnelBotones.add(btnContactoAnterior);
        pnelBotones.add(lblNumeroContacto);
        pnelBotones.add(btnContactoSiguiente);

        contenedorPpal = getContentPane();
        contenedorPpal.setLayout(new FlowLayout(FlowLayout.LEFT));
        contenedorPpal.add(pnelNorte);
        contenedorPpal.add(pnelTelefono);
        contenedorPpal.add(pnelDireccion);
        contenedorPpal.add(pnelBotones);

    }

}
