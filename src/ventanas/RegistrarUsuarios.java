/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Conexion;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import static ventanas.Login.user;

/**
 *
 * @author franc
 */
public class RegistrarUsuarios extends javax.swing.JFrame {

    String user;

    /**
     * Creates new form RegistrarUsuarios
     */
    public RegistrarUsuarios() {
        initComponents();
        user = Login.user;
        this.setTitle("registrar nuevo usuario - admin: " + user);
        this.setSize(630, 380);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        //Metodo para poder cerrar la interfaz sin cerrar el programa en total.
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_wallpaper.getWidth(),
                jLabel_wallpaper.getHeight(), Image.SCALE_DEFAULT));

        jLabel_wallpaper.setIcon(icono);
        this.repaint();

    }

    // Metodo para insertar el logo en la interfaz (en barra maestra de tareas/y barra superior de la interfaz).
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_tituloInterfaz = new javax.swing.JLabel();
        jLabel_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel_mail = new javax.swing.JLabel();
        txt_mail = new javax.swing.JTextField();
        jLabel_telefono = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel_nombre1 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel_password = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        cmb_niveles = new javax.swing.JComboBox();
        jLabel_Footer = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_tituloInterfaz.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_tituloInterfaz.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_tituloInterfaz.setText("Registro de  usuarios");
        getContentPane().add(jLabel_tituloInterfaz, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre.setText("Nombre:");
        getContentPane().add(jLabel_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txt_nombre.setBackground(new java.awt.Color(153, 153, 255));
        txt_nombre.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, -1));

        jLabel_mail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_mail.setText("Em@il:");
        getContentPane().add(jLabel_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txt_mail.setBackground(new java.awt.Color(153, 153, 255));
        txt_mail.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, -1));

        jLabel_telefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_telefono.setText("Telefono:");
        getContentPane().add(jLabel_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txt_telefono.setBackground(new java.awt.Color(153, 153, 255));
        txt_telefono.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, -1));

        jLabel_nombre1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre1.setText("Username:");
        getContentPane().add(jLabel_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        txt_username.setBackground(new java.awt.Color(153, 153, 255));
        txt_username.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 210, -1));

        jLabel_password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_password.setText("Password:");
        getContentPane().add(jLabel_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        txt_password.setBackground(new java.awt.Color(153, 153, 255));
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 210, -1));

        cmb_niveles.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Capturista", "Tecnico" }));
        getContentPane().add(cmb_niveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel_Footer.setText("Creado por Francisco Berwart");
        getContentPane().add(jLabel_Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 120, 100));
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int permisos_cmb, validacion = 0; // se inicializa en 0 poruq se usara como variable bandera.
        String nombre, mail, telefono, username, pass, permisos_string = "";

        mail = txt_mail.getText().trim();
        username = txt_username.getText().trim();
        pass = txt_password.getText().trim();
        nombre = txt_nombre.getText().trim();
        telefono = txt_telefono.getText().trim();

        permisos_cmb = cmb_niveles.getSelectedIndex() + 1; // se suma 1 pq el cmbx al igual que un vector parte desde 0. son temas visulaes para usuario.

        /*
        Esta secuencia de if´s se encarga de validar que los campos NO esten vacios.
         */
        if (mail.equals("")) {
            txt_mail.setBackground(Color.red);
            validacion++;
        }
        if (username.equals("")) {
            txt_username.setBackground(Color.red);
            validacion++;
        }
        if (pass.equals("")) {
            txt_password.setBackground(Color.red);
            validacion++;
        }
        if (nombre.equals("")) {
            txt_nombre.setBackground(Color.red);
            validacion++;
        }
        if (telefono.equals("")) {
            txt_telefono.setBackground(Color.red);
            validacion++;
        }

        // CAMBIO DE VALIDACIONES documentar luego.
        if (permisos_cmb == 1) {
            permisos_string = "Administrador";
        } else if (permisos_cmb == 2) {
            permisos_string = "Capturista";
        } else if (permisos_cmb == 3) {
            permisos_string = "Tecnico";
        }

        /*
        Ahora vamos a revisar que el nombre de usuario (username) no este YA
        registrado en la base de datos, para esto debemos realizar una nueva 
        conexion a la base de datos.
         */
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select username from usuarios where username = '" + username + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txt_username.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Nombre de usuario NO disponible");
                cn.close();
            } else {

                cn.close();

                if (validacion == 0) {
                    try {
                        Connection cn2 = Conexion.conectar();

                        PreparedStatement pst2 = cn2.prepareStatement(
                                "insert into usuarios values (?,?,?,?,?,?,?,?,?)");

                        pst2.setInt(1, 0);
                        pst2.setString(2, nombre);
                        pst2.setString(3, mail);
                        pst2.setString(4, telefono);
                        pst2.setString(5, username);
                        pst2.setString(6, pass);
                        pst2.setString(7, permisos_string);
                        pst2.setString(8, "Activo");
                        pst2.setString(9, user);

                        pst2.executeUpdate();
                        cn2.close();
                        /*
                        Metodo que limpia todos los campos, una vez realizada la
                        insercion de un nuevo usuario, el metodo fue codificado
                        al final de TODO el codigo, para revisar bajar hasta el fondo
                        o con boton derecho navegar a la fuente.
                         */
                        Limpiar();

                        txt_mail.setBackground(Color.GREEN);
                        txt_username.setBackground(Color.GREEN);
                        txt_password.setBackground(Color.GREEN);
                        txt_nombre.setBackground(Color.GREEN);
                        txt_telefono.setBackground(Color.GREEN);

                        JOptionPane.showMessageDialog(null, "Registro exitoso");
                        this.dispose();

                    } catch (SQLException e) {
                        System.err.println("Error en Registrar usuario. " + e);
                        JOptionPane.showMessageDialog(null, "¡¡Error al registrar!!\n"
                                + "Contacte al administrador");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos");
                }

            }

        } catch (SQLException e) {
            System.err.println("Error en validar nombre de usuario" + e);
            JOptionPane.showMessageDialog(null, "¡¡ERROR al comparar usuario!!\n"
                    + "Contacte al Administrador");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmb_niveles;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel_Footer;
    private javax.swing.JLabel jLabel_mail;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_nombre1;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_telefono;
    private javax.swing.JLabel jLabel_tituloInterfaz;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    //Metodo que limpia todos los campos, una vez realizada la insercion de un nuevo usuario.
    public void Limpiar() {
        txt_mail.setText("");
        txt_nombre.setText("");
        txt_password.setText("");
        txt_telefono.setText("");
        txt_username.setText("");

        cmb_niveles.setSelectedIndex(0);

    }

}