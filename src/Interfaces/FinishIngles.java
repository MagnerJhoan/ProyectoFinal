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
/**
 *
 * @author MAGNER
 */
/**
 * La clase Finish proporciona una interfaz para mostrar un mensaje de finalización de transacción.
 * Pregunta al usuario si desea realizar otra operación o salir.
 * Esta clase extiende javax.swing.JFrame para crear una ventana de finalización.
 */
public class FinishIngles extends javax.swing.JFrame {

    /**
     * Creates new form Finish
     */
    public String usuario = "null"; // Variable para almacenar el nombre de usuario
    public Principal principal = new Principal(); // Instancia de la clase Principal para gestionar la información del banco
    public int numeroCuenta = 000; // Variable para almacenar el número de cuenta

    /**
     * Constructor de la clase Finish.
     * Crea una nueva instancia de la ventana de finalización y la inicializa.
     */
    public FinishIngles() {
        initComponents();
        setLocationRelativeTo(null); // Establece la ubicación de la ventana en el centro de la pantalla
    }

    /**
     * Constructor sobrecargado de la clase Finish.
     * Crea una nueva instancia de la ventana de finalización y la inicializa con los datos proporcionados.
     * @param name Nombre de usuario
     * @param numerocuenta Número de cuenta
     */
    public FinishIngles(String name, int numerocuenta) {
        initComponents();
        this.usuario = name;
        this.numeroCuenta = numerocuenta;
        cargar(); // Carga la información del archivo de almacenamiento
    }

    /**
     * Método para cargar la información del archivo de almacenamiento.
     */
    public void cargar() {

        FileInputStream archivo = null; // Variable para leer datos de un archivo
        ObjectInputStream convertidorarchivo = null; // Variable que permite sacar datos del archivo

        try {
            archivo = new FileInputStream("C://Metodos//Cajero.txt"); // Abre el archivo para lectura
            convertidorarchivo = new ObjectInputStream(archivo); // Crea un objeto para leer datos del archivo

            principal = (Principal) convertidorarchivo.readObject(); // Lee la información del archivo y la asigna a la instancia de Principal

        } catch (IOException ex) { // Maneja la excepción si no se encuentra el archivo
            File archivos = new File("C://Metodos//Cajero.txt"); // Crea un nuevo archivo si no se encuentra
        } catch (ClassNotFoundException cnfe) { // Maneja la excepción si no se encuentra la clase necesaria
            cnfe.printStackTrace(); // Imprime el rastreo de la pila del error
        }

    }

    /**
     * Método para actualizar la lista de datos en el archivo de almacenamiento.
     */
    private void actualizarLista() {
        try {

            FileOutputStream ficherosalida = new FileOutputStream("C://Metodos//Cajero.txt"); // Abre el archivo para escritura
            ObjectOutputStream convertidor = new ObjectOutputStream(ficherosalida); // Crea un objeto para escribir datos en el archivo

            convertidor.writeObject(principal); // Escribe la información de la instancia de Principal en el archivo

            convertidor.close(); // Cierra el objeto de escritura
            ficherosalida.close(); // Cierra el archivo de escritura
        } catch (IOException ex) { // Maneja la excepción si ocurre un error de escritura
            ex.printStackTrace(); // Imprime el rastreo de la pila del error
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PLEASE REMOVE YOUR BALLOT");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 290, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DO YOU WISH TO MAKE ANOTHER OPERATION?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 440, 40));

        jButton5.setBackground(new java.awt.Color(0, 51, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("YES");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 60, -1));

        jButton4.setBackground(new java.awt.Color(0, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("EXIT");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 90, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BANK CACHUPIN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logf1nuevo.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngwing.com (4).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, -1, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1930, 1190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 456));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método que se ejecuta al hacer clic en el botón "SI".
     * Abre la ventana de menú para realizar otra operación.
     * @param evt Evento de clic del botón
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        MenuIngles ventana = new MenuIngles(usuario, numeroCuenta); // Crea una instancia de la ventana de menú
        ventana.setVisible(true); // Hace visible la ventana de menú
        ventana.setLocationRelativeTo(null); // Establece la ubicación de la ventana en el centro de la pantalla
        dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton5ActionPerformed
    /**
     * Método que se ejecuta al hacer clic en el botón "SALIR".
     * Abre la ventana de bienvenida para iniciar sesión nuevamente.
     * @param evt Evento de clic del botón
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Bienvenida ventana = new Bienvenida(); // Crea una instancia de la ventana de bienvenida
        ventana.setVisible(true); // Hace visible la ventana de bienvenida
        ventana.setLocationRelativeTo(null); // Establece la ubicación de la ventana en el centro de la pantalla
        dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(FinishIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinishIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinishIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinishIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinishIngles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
