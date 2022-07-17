/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Logica.Persona;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Usuario
 */
public class DirectorioGUI extends JFrame {

    private JLabel lblNombres;
    private JLabel lblApellidos;
    private JLabel lblFechaNacimiento;
    private JLabel lblId;
    private JLabel lblTelefono1;
    private JLabel lblTelefono2;
    private JLabel lblTelefono3;
    private JLabel lblDireccion;
    private JLabel lblBarrio;
    private JLabel lblCiudad;
    private JLabel lblNumeroContacto;
    private JLabel lblRol;
    private JCheckBox chkEstudiante;
    private JCheckBox chkProfesor;
    private JCheckBox chkEmpleado;
    private JTextField txtNombres;
    private JTextField txtApellidos;
    private JTextField txtFechaNacimiento;
    private JTextField txtId;
    private JTextField txtTelefono1;
    private JTextField txtTelefono2;
    private JTextField txtTelefono3;
    private JTextField txtDireccion;
    private JTextField txtBarrio;
    private JTextField txtCiudad;
    private JButton btnAgregar;
    private JButton btnActualizar;
    private JButton btnEliminar;
    private JButton btnListar;
    private JButton btnRestauracion;
    private JButton btnExportarContactos;
    private JButton btnDireccionAnterior;
    private JButton btnDireccionSiguiente;
    private JButton btnAddDireccion;
    private JButton btnDelDireccion;
    private JButton btnContactoAnterior;
    private JButton btnContactoSiguiente;
    private JComboBox cBoxTipoId;
    private JComboBox cBoxTelefono1;
    private JComboBox cBoxTelefono2;
    private JComboBox cBoxTelefono3;
    private GridBagConstraints c;
    private JPanel pnel1;
    private JPanel pnel2; 
    private JPanel pnel3; 
    private JPanel pnel4;
    private JPanel pnel5;

    Container contenedorPpal;
    
    Persona personaAux;

    public DirectorioGUI() {
        iniciarComponentes();
        setTitle("Directorio");
        setSize(750, 540);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void iniciarComponentes() {
        personaAux = new Persona();
        
        lblNombres = new JLabel("Nombres: ",SwingConstants.RIGHT);
        txtNombres = new JTextField();
        lblApellidos = new JLabel("Apellidos: ",SwingConstants.RIGHT);
        txtApellidos = new JTextField();
        lblFechaNacimiento = new JLabel("Fecha nacimiento (mm/dd/aaaa): ",SwingConstants.RIGHT);
        txtFechaNacimiento = new JTextField();
        lblId = new JLabel("ID : ",SwingConstants.RIGHT);
        txtId = new JTextField(); 
        cBoxTipoId = new JComboBox();
        cBoxTipoId.addItem("CC");
        cBoxTipoId.addItem("TI");
        cBoxTipoId.addItem("CE");
        lblRol = new JLabel("Rol: ", SwingConstants.RIGHT);
        chkEstudiante = new JCheckBox("Estudiante");
        chkProfesor = new JCheckBox("Profesor");
        chkEmpleado = new JCheckBox("Empleado");
        
        lblTelefono1 = new JLabel("Teléfono 1");
        lblTelefono2 = new JLabel("Teléfono 2 (opcional)");
        lblTelefono3 = new JLabel("Teléfono 3 (opcional)");
        txtTelefono1 = new JTextField();
        txtTelefono2 = new JTextField();
        txtTelefono3 = new JTextField();
        cBoxTelefono1 = new JComboBox();
        cBoxTelefono1.addItem("");
        cBoxTelefono1.addItem("Casa");
        cBoxTelefono1.addItem("Móvil");
        cBoxTelefono1.addItem("Trabajo");
        cBoxTelefono2 = new JComboBox();
        cBoxTelefono2.addItem("");
        cBoxTelefono2.addItem("Casa");
        cBoxTelefono2.addItem("Móvil");
        cBoxTelefono2.addItem("Trabajo");
        cBoxTelefono3 = new JComboBox();
        cBoxTelefono3.addItem("");
        cBoxTelefono3.addItem("Casa");
        cBoxTelefono3.addItem("Móvil");
        cBoxTelefono3.addItem("Trabajo");
        
        lblDireccion = new JLabel("Dirección");
        txtDireccion = new JTextField();   
        lblBarrio = new JLabel("Barrio");  
        txtBarrio = new JTextField();    
        lblCiudad = new JLabel("Ciudad");   
        txtCiudad = new JTextField();      
        btnDireccionAnterior = new JButton("<");   
        btnDireccionSiguiente = new JButton(">");
        btnAddDireccion = new JButton("Nuevo");   
        btnDelDireccion = new JButton("Eliminar"); 
        
        
        btnAgregar = new JButton("Nuevo");
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");
        btnListar = new JButton("Listar");
        btnRestauracion = new JButton("Restaurar");
        btnExportarContactos = new JButton("Exportar contactos");
        
        btnContactoAnterior = new JButton("Anterior");
        lblNumeroContacto = new JLabel("#");
        btnContactoSiguiente = new JButton("Siguiente");
        
        c = new GridBagConstraints();
        
        pnel1 = new JPanel();
        pnel1.setLayout(new GridBagLayout());        
        pnel1.setBounds(15,20,700,100);
        c.fill = GridBagConstraints.HORIZONTAL;
        sizeC(0,0,1,1,0.05,0.1);
        pnel1.add(lblNombres,c);
        sizeC(1,0,1,1,1,0.1);
        pnel1.add(txtNombres,c);
        sizeC(3,0,1,1,0.05,0.1);
        pnel1.add(lblFechaNacimiento,c);
        sizeC(2,0,1,1,0.1,0.01);
        pnel1.add(new JLabel(""),c);
        sizeC(4,0,1,1,1,0.01);
        pnel1.add(txtFechaNacimiento,c);
        sizeC(0,1,1,1,0.05,0.1);
        pnel1.add(lblApellidos,c);
        sizeC(1,1,1,1,1,0.1);
        pnel1.add(txtApellidos,c);
        sizeC(3,1,1,1,0.05,0.1);
        pnel1.add(lblId,c);
        sizeC(4,1,1,1,0.7,0.1);
        pnel1.add(txtId,c);
        sizeC(0,2,1,1,0.05,0.1);
        pnel1.add(lblRol,c);
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.CENTER;
        sizeC(1,2,1,1,0.05,0.1);
        pnel1.add(chkEstudiante,c);
        sizeC(3,2,1,1,0.05,0.1);
        pnel1.add(chkProfesor,c);
        sizeC(4,2,1,1,0.05,0.1);
        pnel1.add(chkEmpleado,c);
        sizeC(5,1,1,1,0.05,0.1);
        pnel1.add(cBoxTipoId,c);
        pnel1.setBorder(BorderFactory.createTitledBorder(null, 
                "Información del contacto", 
                TitledBorder.DEFAULT_JUSTIFICATION, 
                TitledBorder.DEFAULT_POSITION, 
                new Font("Tahoma", 1, 12), 
                new Color(0, 153, 204)));
        
        pnel2 = new JPanel();
        pnel2.setLayout(new GridBagLayout());        
        pnel2.setBounds(15,140,700,100);
        c.fill = GridBagConstraints.HORIZONTAL;
        sizeC(0,0,1,1,0.8,0.1);
        pnel2.add(lblTelefono1,c);
        sizeC(1,0,1,1,0.05,0.1);
        pnel2.add(new JLabel(),c);
        sizeC(2,0,1,1,0.8,0.1);
        pnel2.add(lblTelefono2,c);
        sizeC(3,0,1,1,0.05,0.1);
        pnel2.add(new JLabel(),c);
        sizeC(4,0,1,1,0.8,0.1);
        pnel2.add(lblTelefono3,c);
        sizeC(0,1,1,1,0.8,0.1);
        pnel2.add(txtTelefono1,c);
        sizeC(2,1,1,1,0.8,0.1);
        pnel2.add(txtTelefono2,c);
        sizeC(4,1,1,1,0.8,0.1);
        pnel2.add(txtTelefono3,c);
        sizeC(0,2,1,1,0.8,0.1);
        pnel2.add(cBoxTelefono1,c);
        sizeC(2,2,1,1,0.8,0.1);
        pnel2.add(cBoxTelefono2,c);
        sizeC(4,2,1,1,0.8,0.1);
        pnel2.add(cBoxTelefono3,c);
        pnel2.setBorder(BorderFactory.createTitledBorder(null, 
                "Telefonos del contacto", 
                TitledBorder.DEFAULT_JUSTIFICATION, 
                TitledBorder.DEFAULT_POSITION, 
                new Font("Tahoma", 1, 12), 
                new Color(0, 153, 204)));
        
        pnel3 = new JPanel();
        pnel3.setLayout(new GridBagLayout());        
        pnel3.setBounds(15,250,700,120);
        sizeC(0,0,1,1,0.8,0.1);
        pnel3.add(lblDireccion, c);
        sizeC(1,0,1,1,0.05,0.1);
        pnel3.add(new JLabel(), c);
        sizeC(2,0,1,1,0.8,0.1);
        pnel3.add(lblBarrio, c);
        sizeC(3,0,1,1,0.05,0.1);
        pnel3.add(new JLabel(), c);
        sizeC(4,0,1,1,0.8,0.1);
        pnel3.add(lblCiudad, c);
        sizeC(5,0,1,1,0.05,0.1);
        pnel3.add(new JLabel(), c);
        sizeC(0,1,1,1,0.8,0.1);
        pnel3.add(txtDireccion, c);
        sizeC(2,1,1,1,0.8,0.1);
        pnel3.add(txtBarrio, c);
        sizeC(4,1,1,1,0.8,0.1);
        pnel3.add(txtCiudad, c);
        sizeC(6,2,1,1,0.3,0.1);
        pnel3.add(btnDelDireccion, c);
        sizeC(6,0,1,1,0.3,0.1);
        pnel3.add(btnAddDireccion, c);
        c.fill = GridBagConstraints.NONE;
        sizeC(0,2,1,1,0.8,0.1);
        pnel3.add(btnDireccionAnterior, c);
        sizeC(4,2,1,1,0.8,0.1);
        pnel3.add(btnDireccionSiguiente, c);
        pnel3.setBorder(BorderFactory.createTitledBorder(null, 
                "Direcciones del contacto", 
                TitledBorder.DEFAULT_JUSTIFICATION, 
                TitledBorder.DEFAULT_POSITION, 
                new Font("Tahoma", 1, 12), 
                new Color(0, 153, 204)));
        
        pnel4 = new JPanel();
        pnel4.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnel4.setBounds(15, 390, 700, 60);
        pnel4.add(btnAgregar);
        pnel4.add(btnActualizar);
        pnel4.add(btnEliminar);
        pnel4.add(btnListar);
        pnel4.add(btnRestauracion);
        pnel4.add(btnExportarContactos);
        pnel4.setBorder(BorderFactory.createTitledBorder(null, 
                "Opciones", 
                TitledBorder.DEFAULT_JUSTIFICATION, 
                TitledBorder.DEFAULT_POSITION, 
                new Font("Tahoma", 1, 12), 
                new Color(0, 153, 204)));
        
        
        pnel5 = new JPanel();
        pnel5.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnel5.add(btnContactoAnterior);
        pnel5.add(lblNumeroContacto);
        pnel5.add(btnContactoSiguiente);
        pnel5.setBounds(0, 450, 700, 40);
        
        contenedorPpal = getContentPane();
        contenedorPpal.setLayout(null);
        contenedorPpal.add(pnel1);
        contenedorPpal.add(pnel2);
        contenedorPpal.add(pnel3);
        contenedorPpal.add(pnel4);
        contenedorPpal.add(pnel5);
        
        btnAgregar.addMouseListener(new ManejadorDeEventos());
        txtTelefono2.addKeyListener(new ManejadorDeEventos());
        txtTelefono3.addKeyListener(new ManejadorDeEventos());
        
        deshabilitarCampos();
    }
    
    private void sizeC(int columna, int fila, int x, int y, double wx, double wy){
        c.gridx = columna; //La columna en la que empieza
        c.gridy = fila; //La fila en la que empieza
        c.gridwidth = x; //Cuantas columnas ocupa
        c.gridheight = y; //Cuantas filas ocupa
        c.weightx = wx; //Tamano en x
        c.weighty = wy; // Tamano en y
    }
    
    private void deshabilitarCampos(){
        txtNombres.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtFechaNacimiento.setEnabled(false);
        txtId.setEnabled(false);
        cBoxTipoId.setEnabled(false);
        chkEstudiante.setEnabled(false);
        chkProfesor.setEnabled(false);
        chkEmpleado.setEnabled(false);
        
        txtTelefono1.setEnabled(false);
        txtTelefono2.setEnabled(false);
        txtTelefono3.setEnabled(false);
        cBoxTelefono1.setEnabled(false);
        cBoxTelefono2.setEnabled(false);
        cBoxTelefono3.setEnabled(false);
        
        txtDireccion.setEnabled(false);
        txtBarrio.setEnabled(false);
        txtCiudad.setEnabled(false);
        btnDireccionAnterior.setEnabled(false);
        btnDireccionSiguiente.setEnabled(false);
        btnAddDireccion.setEnabled(false);
        btnDelDireccion.setEnabled(false);
    }
    
    private void habilitarCampos(){
        txtNombres.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtFechaNacimiento.setEnabled(true);
        txtId.setEnabled(true);
        cBoxTipoId.setEnabled(true);
        chkEstudiante.setEnabled(true);
        chkProfesor.setEnabled(true);
        chkEmpleado.setEnabled(true);
        
        txtTelefono1.setEnabled(true);
        txtTelefono2.setEnabled(true);
        txtTelefono3.setEnabled(true);
        cBoxTelefono1.setEnabled(true);
        if(txtTelefono2.getText().length() > 0){
            cBoxTelefono2.setEnabled(true);
        }
        if(txtTelefono3.getText().length() > 0){
            cBoxTelefono3.setEnabled(true);
        }
                
        txtDireccion.setEnabled(true);
        txtBarrio.setEnabled(true);
        txtCiudad.setEnabled(true);
        btnDireccionAnterior.setEnabled(true);
        btnDireccionSiguiente.setEnabled(true);
        btnAddDireccion.setEnabled(true);
        btnDelDireccion.setEnabled(true);
    }
    
    private void habilitarOpciones(){
        btnAgregar.setEnabled(true);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnListar.setEnabled(true);
        btnRestauracion.setEnabled(true);
        btnExportarContactos.setEnabled(true);
        btnContactoAnterior.setEnabled(true);
        btnContactoSiguiente.setEnabled(true);
    }
    
    private void deshabilitarOpciones(){
        btnAgregar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnListar.setEnabled(false);
        btnRestauracion.setEnabled(false);
        btnExportarContactos.setEnabled(false);
        btnContactoAnterior.setEnabled(false);
        btnContactoSiguiente.setEnabled(false);
    }
    
    private boolean verificarCampos(){
        boolean error = false;
        if(txtNombres.getText().equals("")){
            error = true;
            txtNombres.setBackground(new Color(255, 210, 200));
            JOptionPane.showMessageDialog(this, 
                    "Introduce un nombre",
                    "error",
                    ERROR_MESSAGE);
        }
        if(txtApellidos.getText().equals("")){
            error = true;
            txtApellidos.setBackground(new Color(255, 210, 200));
            JOptionPane.showMessageDialog(this, 
                    "Introduce un apellido",
                    "error",
                    ERROR_MESSAGE);
        }
        if(txtFechaNacimiento.getText().equals("")){
            error = true;
            txtFechaNacimiento.setBackground(new Color(255, 210, 200));
            JOptionPane.showMessageDialog(this, 
                    "Introduce una fecha de nacimiento en el formato (mm/dd/aaaa)",
                    "error",
                    ERROR_MESSAGE);
        }
        try{
            if(txtId.getText().equals("")){
                error = true;
                txtId.setBackground(new Color(255, 210, 200));
                JOptionPane.showMessageDialog(this, 
                    "Introduce un ID",
                    "error",
                    ERROR_MESSAGE);
            }
            else{
                Long.parseLong(txtId.getText());
            }
        }catch(NumberFormatException ne){
            error = true;
            txtId.setBackground(new Color(255, 210, 200));
            JOptionPane.showMessageDialog(this, 
                    "Introduce un valor valido en el ID",
                    "error",
                    ERROR_MESSAGE);
        }
        if(!chkEstudiante.isSelected() 
                && !chkProfesor.isSelected() 
                && !chkEmpleado.isSelected()){
            error = true;
            JOptionPane.showMessageDialog(this, 
                    "Selecciona un rol para el contacto",
                    "error",
                    ERROR_MESSAGE);
        }
        try{
            if(txtTelefono1.getText().equals("")){
                error = true;
                txtTelefono1.setBackground(new Color(255, 210, 200));
                JOptionPane.showMessageDialog(this, 
                    "Introduce un número en teléfono 1",
                    "error",
                    ERROR_MESSAGE);
            }
            else{
                Long.parseLong(txtTelefono1.getText());
                if(cBoxTelefono1.getSelectedItem().equals("")){
                        error = true;
                        cBoxTelefono1.setBackground(new Color(255, 210, 200));
                        JOptionPane.showMessageDialog(this, 
                            "Selecciona el tipo para teléfono 1",
                            "error",
                            ERROR_MESSAGE);
                    }
            }
        }catch(NumberFormatException ne){
            error = true;
            txtTelefono1.setBackground(new Color(255, 210, 200));
            JOptionPane.showMessageDialog(this, 
                        "Introduce un valor numérico en teléfono 1",
                        "error",
                        ERROR_MESSAGE);
        }
        try{
            if(txtTelefono2.getText().length() > 0){
                Long.parseLong(txtTelefono2.getText());
                if(cBoxTelefono2.getSelectedItem().equals("")){
                        error = true;
                        cBoxTelefono2.setBackground(new Color(255, 210, 200));
                        JOptionPane.showMessageDialog(this, 
                            "Selecciona el tipo para teléfono 1",
                            "error",
                            ERROR_MESSAGE);
                    }
            }
        }catch(NumberFormatException ne){
            error = true;
            txtTelefono2.setBackground(new Color(255, 210, 200));
            JOptionPane.showMessageDialog(this, 
                        "Introduce un valor numérico en teléfono 2",
                        "error",
                        ERROR_MESSAGE);
        }
        try{
            if(txtTelefono3.getText().length() > 0){
                Long.parseLong(txtTelefono3.getText());
                if(cBoxTelefono1.getSelectedItem().equals("")){
                        error = true;
                        cBoxTelefono3.setBackground(new Color(255, 210, 200));
                        JOptionPane.showMessageDialog(this, 
                            "Selecciona el tipo para teléfono 1",
                            "error",
                            ERROR_MESSAGE);
                    }
            }
        }catch(NumberFormatException ne){
            error = true;
            txtTelefono3.setBackground(new Color(255, 210, 200));
            JOptionPane.showMessageDialog(this, 
                        "Introduce un valor numérico en teléfono 3",
                        "error",
                        ERROR_MESSAGE);
        }
        if(txtDireccion.getText().equals("")){
            error = true;
            txtDireccion.setBackground(new Color(255, 210, 200));
            JOptionPane.showMessageDialog(this, 
                    "Introduce una dirección",
                    "error",
                    ERROR_MESSAGE);
        }
        if(txtBarrio.getText().equals("")){
            error = true;
            txtBarrio.setBackground(new Color(255, 210, 200));
            JOptionPane.showMessageDialog(this, 
                    "Introduce un Barrio",
                    "error",
                    ERROR_MESSAGE);
        }
        if(txtCiudad.getText().equals("")){
            error = true;
            txtCiudad.setBackground(new Color(255, 210, 200));
            JOptionPane.showMessageDialog(this, 
                    "Introduce una ciudad",
                    "error",
                    ERROR_MESSAGE);
        }
        return error;
    }
    
    private void reestablecerColores(){
        txtNombres.setBackground(null);
        txtApellidos.setBackground(null);
        txtFechaNacimiento.setBackground(null);
        txtId.setBackground(null);
        txtTelefono1.setBackground(null);
        txtTelefono2.setBackground(null);
        txtTelefono3.setBackground(null);
        cBoxTelefono1.setBackground(null);
        cBoxTelefono2.setBackground(null);
        cBoxTelefono3.setBackground(null);
        txtDireccion.setBackground(null);
        txtBarrio.setBackground(null);
        txtCiudad.setBackground(null);
    }
    
    public class ManejadorDeEventos implements MouseListener, KeyListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if(e.getSource() == btnAgregar){
                if(btnAgregar.getText().equals("Nuevo")){
                    habilitarCampos();
                    btnAgregar.setText("Agregar");
                    deshabilitarOpciones();
                    btnAgregar.setEnabled(true);
                }
                else if (btnAgregar.getText().equals("Agregar")){
                    reestablecerColores();
                    if(!verificarCampos()){
                        
                    }
                }
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        
        }

        @Override
        public void mouseExited(MouseEvent e) {
        
        }

        @Override
        public void keyTyped(KeyEvent e) {
        
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getSource() == txtTelefono2){
                if(txtTelefono2.getText().length() == 0){
                    cBoxTelefono2.setEnabled(true);
                }
                if(e.getKeyCode() == 8){
                    if(txtTelefono2.getText().length() == 1)
                    cBoxTelefono2.setEnabled(false);
                }
            }
            if(e.getSource() == txtTelefono3){
                if(txtTelefono3.getText().length() == 0){
                    cBoxTelefono3.setEnabled(true);
                }
                if(e.getKeyCode() == 8){
                    if(txtTelefono3.getText().length() == 1)
                    cBoxTelefono3.setEnabled(false);
                }
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            
        }
    }
}
