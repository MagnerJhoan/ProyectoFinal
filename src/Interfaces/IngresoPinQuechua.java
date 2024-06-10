/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
/**
 *
 * @author MAGNER
 */
/**
 * La clase IngresoPinQuechua es una interfaz de usuario para ingresar el PIN de un usuario.
 * Permite cargar los datos de usuarios desde un archivo y verificar la existencia del usuario y su contraseña.
 */
public class IngresoPinQuechua extends javax.swing.JFrame {
    public Principal principal = new Principal(); // Instancia de la clase Principal para acceder a los datos de los usuarios
    public String usuario = "null"; // Nombre de usuario
    
    /**
     * Constructor de la clase IngresoPin con parámetro para el nombre de usuario.
     * @param name Nombre del usuario
     */
    public IngresoPinQuechua(String name) {
        initComponents();
        cargar(); // Cargar los datos de los usuarios desde el archivo
    }
    
    /**
     * Constructor de la clase IngresoPin sin parámetros.
     */
    public IngresoPinQuechua() {
        initComponents();
        cargar(); // Cargar los datos de los usuarios desde el archivo
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
    }
    
    /**
     * Método para cargar los datos de los usuarios desde un archivo.
     */
    public void cargar() {
        FileInputStream archivo = null; // Variable para leer datos de un archivo
        ObjectInputStream convertidorarchivo = null; // Variable para convertir el archivo a objetos

        try {
            archivo = new FileInputStream("C://Metodos//Cajero.txt"); // Abrir el archivo de datos de usuarios
            convertidorarchivo = new ObjectInputStream(archivo); // Convertir el archivo a objetos
            principal = (Principal) convertidorarchivo.readObject(); // Leer el objeto Principal del archivo
        } catch (IOException ex) {
            // Si no se encuentra el archivo, se crea uno nuevo
            File archivos = new File("C://Metodos//Cajero.txt");
        } catch (ClassNotFoundException cnfe) {
            // Si Java no puede encontrar la clase específica en tiempo de ejecución, imprime el error
            cnfe.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Allinmi kawsaykama");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 320, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Runakuna paqta churaykachani");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 220, 20));

        txtContraseña.setBackground(new java.awt.Color(0, 51, 51));
        txtContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 280, -1));

        jButton6.setBackground(new java.awt.Color(0, 51, 51));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("RIKCH'A CHURAY ");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 150, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Simikama");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 70, 20));

        txtUsuario.setBackground(new java.awt.Color(0, 51, 51));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 280, -1));

        jButton7.setBackground(new java.awt.Color(0, 51, 51));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("ARI");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 80, 20));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BANKU CACHUPIN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("QHINAPAY");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logf1nuevo.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngwing.com (4).png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f3.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, -10, 1970, 1200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Botón para abrir la ventana de registro de usuario
        RegistroQuechua ventana = new RegistroQuechua ();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // Botón para verificar la existencia del usuario y su contraseña
        if (existeUsuario(txtUsuario.getText()) && existeContraseña(new String(txtContraseña.getPassword()))) {
            // Si el usuario y la contraseña son correctos, se abre la ventana de cuentas
            Cuentas ventana = new Cuentas(txtUsuario.getText());
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);
            dispose();
        } else {
            // Si el usuario o la contraseña son incorrectos, se muestra un mensaje de error
            JOptionPane.showMessageDialog(null, "Runapa huk simikama hukchi yuyarinki. ", "Error", JOptionPane.INFORMATION_MESSAGE);

        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // Botón para regresar a la ventana de bienvenida
        Bienvenida ventana = new Bienvenida ();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * Método para verificar si existe un usuario dado su nombre.
     * @param usu Nombre de usuario
     * @return true si el usuario existe, de lo contrario false
     */
    public boolean existeUsuario(String usu) {
        boolean res = false;
        
        for (int i = 0; i < principal.getListaCliente().size(); i++) {
            if (principal.getListaCliente().get(i).getUsuario().equals(usu)) {
                res = true;
                break;
            }
        }
        
        return res;
    }
    
    /**
     * Método para verificar si existe una contraseña.
     * @param contra Contraseña a verificar
     * @return true si la contraseña existe, de lo contrario false
     */
    public boolean existeContraseña(String contra) {
        boolean res = false;
       
        for (int i = 0; i < principal.getListaCliente().size(); i++) {
            if (principal.getListaCliente().get(i).getContraseña().equals(contra)) {
                res = true;
                break;
            }
        }
        
        return res;
    } 
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
            java.util.logging.Logger.getLogger(IngresoPinQuechua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoPinQuechua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoPinQuechua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoPinQuechua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoPinQuechua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
