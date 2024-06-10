/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import java.io.File; // Importa la clase File para manipulación de archivos
import java.io.FileInputStream; // Importa la clase FileInputStream para leer datos de un archivo
import java.io.FileOutputStream; // Importa la clase FileOutputStream para escribir datos en un archivo
import java.io.IOException; // Importa la clase IOException para manejo de excepciones de entrada/salida
import java.io.ObjectInputStream; // Importa la clase ObjectInputStream para leer objetos de un archivo
import java.io.ObjectOutputStream; // Importa la clase ObjectOutputStream para escribir objetos en un archivo
/**
 *
 * @author MAGNER
 */
/**
 * Define la clase DepositoIngles que extiende de javax.swing.JFrame, que representa la ventana de depósito.
 * Contiene métodos para cargar y actualizar datos desde/hacia un archivo.
 */
public class DepositoIngles extends javax.swing.JFrame {

    // Variables de instancia
    public String usuario = "null"; // Nombre de usuario
    public Principal principal = new Principal(); // Instancia de la clase Principal
    public int numeroCuenta = 000; // Número de cuenta

    /**
     * Constructor de la clase Deposito.
     * Inicializa los componentes de la interfaz y establece la posición de la ventana.
     */
    public DepositoIngles() {
        initComponents(); // Inicialización de componentes
        setLocationRelativeTo(null); // Establece la posición de la ventana en el centro de la pantalla
    }

    /**
     * Constructor de la clase Deposito que recibe el nombre de usuario y el número de cuenta como parámetros.
     * @param name Nombre de usuario
     * @param numerocuent Número de cuenta
     */
    public DepositoIngles(String name, int numerocuent) {
        initComponents(); // Inicialización de componentes
        this.usuario = name; // Asigna el nombre de usuario
        this.numeroCuenta = numerocuent; // Asigna el número de cuenta
        cargar(); // Carga los datos desde el archivo
    }

    /**
     * Método que carga los datos desde un archivo.
     */
    public void cargar() {
        FileInputStream archivo = null; // Variable para leer datos de un archivo
        ObjectInputStream convertidorarchivo = null; // Variable que permite sacar datos del archivo

        try {
            archivo = new FileInputStream("C://Metodos//Cajero.txt"); // Abre el archivo para lectura
            convertidorarchivo = new ObjectInputStream(archivo); // Convierte el archivo a objetos
            principal = (Principal) convertidorarchivo.readObject(); // Asigna los datos al objeto principal
        } catch (IOException ex) { // Manejo de excepciones en caso de error de lectura
            File archivos = new File("C://Metodos//Cajero.txt"); // Crea un nuevo archivo si no existe
        } catch (ClassNotFoundException cnfe) { // Manejo de excepciones en caso de no encontrar la clase
            cnfe.printStackTrace(); // Imprime la traza de la excepción
        }
    }

    /**
     * Método que actualiza la lista de datos en el archivo.
     */
    private void actualizarLista() {
        try {
            FileOutputStream ficherosalida = new FileOutputStream("C://Metodos//Cajero.txt"); // Abre el archivo para escritura
            ObjectOutputStream convertidor = new ObjectOutputStream(ficherosalida); // Convierte objetos a bytes
            convertidor.writeObject(principal); // Escribe el objeto principal en el archivo
            convertidor.close(); // Cierra el convertidor
            ficherosalida.close(); // Cierra el archivo de salida
        } catch (IOException ex) { // Manejo de excepciones en caso de error de escritura
            ex.printStackTrace(); // Imprime la traza de la excepción
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
        btnDolares = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnBolivianos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CHOOSE THE TYPE OF CURRENCY YOU WISH TO DEPOSIT");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 420, 30));

        btnDolares.setBackground(new java.awt.Color(0, 51, 51));
        btnDolares.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDolares.setForeground(new java.awt.Color(255, 255, 255));
        btnDolares.setText("DOLLARS");
        btnDolares.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDolares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDolaresActionPerformed(evt);
            }
        });
        jPanel1.add(btnDolares, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 80, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DEPOSITS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 190, 50));

        btnBolivianos.setBackground(new java.awt.Color(0, 51, 51));
        btnBolivianos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBolivianos.setForeground(new java.awt.Color(255, 255, 255));
        btnBolivianos.setText("BOLIVIANS");
        btnBolivianos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBolivianos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBolivianosActionPerformed(evt);
            }
        });
        jPanel1.add(btnBolivianos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PREPARE THE MONEY  ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 170, 40));

        jButton5.setBackground(new java.awt.Color(0, 51, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("RETORN TO");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logf1nuevo.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngwing.com (4).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-270, 0, -1, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(900, 900));
        jLabel1.setPreferredSize(new java.awt.Dimension(900, 900));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 650, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método que se ejecuta al hacer clic en el botón "Dólares".
     * Abre la ventana para el depósito en dólares.
     * @param evt Evento de acción
     */
    private void btnDolaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDolaresActionPerformed
        Deposito2Ingles ventana = new Deposito2Ingles(usuario, numeroCuenta, true, false); // Crea una instancia de la clase Deposito2 para depósito en dólares
        ventana.setVisible(true); // Hace visible la ventana para depósito en dólares
        ventana.setLocationRelativeTo(null); // Establece la posición de la ventana en el centro de la pantalla
        dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_btnDolaresActionPerformed
    /**
     * Método que se ejecuta al hacer clic en el botón "Bolivianos".
     * Abre la ventana para el depósito en bolivianos.
     * @param evt Evento de acción
     */
    private void btnBolivianosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBolivianosActionPerformed
         Deposito2Ingles ventana = new Deposito2Ingles(usuario, numeroCuenta, false, true); // Crea una instancia de la clase Deposito2 para depósito en bolivianos
        ventana.setVisible(true); // Hace visible la ventana para depósito en bolivianos
        ventana.setLocationRelativeTo(null); // Establece la posición de la ventana en el centro de la pantalla
        dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_btnBolivianosActionPerformed
    /**
     * Método que se ejecuta al hacer clic en el botón "REGRESAR".
     * Abre la ventana del menú principal.
     * @param evt Evento de acción
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        MenuIngles ventana = new MenuIngles(usuario, numeroCuenta); // Crea una instancia de la clase Menu
        ventana.setVisible(true); // Hace visible la ventana del menú principal
        ventana.setLocationRelativeTo(null); // Establece la posición de la ventana en el centro de la pantalla
        dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(DepositoIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepositoIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepositoIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepositoIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepositoIngles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBolivianos;
    private javax.swing.JButton btnDolares;
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
