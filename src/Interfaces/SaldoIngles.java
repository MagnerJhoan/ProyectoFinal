/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import java.io.File; // Importa la clase File del paquete java.io para manejar archivos y directorios
import java.io.FileInputStream; // Importa la clase FileInputStream del paquete java.io para leer datos de un archivo
import java.io.FileOutputStream; // Importa la clase FileOutputStream del paquete java.io para escribir datos en un archivo
import java.io.IOException; // Importa la clase IOException del paquete java.io para manejar excepciones de entrada y salida de datos
import java.io.ObjectInputStream; // Importa la clase ObjectInputStream del paquete java.io para leer objetos desde un flujo de entrada
import java.io.ObjectOutputStream; // Importa la clase ObjectOutputStream del paquete java.io para escribir objetos en un flujo de salida


/**
 *
 * @author MAGNER
 */
/**
 * Clase Saldo que representa la interfaz para consultar el saldo.
 */
public class SaldoIngles extends javax.swing.JFrame {
    public String usuario = "null"; // Variable para almacenar el nombre de usuario
    public int numeroCuenta = 000; // Variable para almacenar el número de cuenta
    public Principal principal = new Principal(); // Instancia de la clase Principal
    public double saldo = 00; // Variable para almacenar el saldo

    /**
     * Constructor de la clase Saldo.
     */
    public SaldoIngles() {
        initComponents(); // Inicializa los componentes de la interfaz gráfica
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
    }
    
    /**
     * Constructor de la clase Saldo.
     * @param name El nombre de usuario.
     * @param numerocuenta El número de cuenta.
     * @param saldo El saldo actual.
     */
    public SaldoIngles(String name, int numerocuenta, double saldo){
        initComponents(); // Inicializa los componentes de la interfaz gráfica
        this.usuario = name; // Asigna el nombre de usuario
        this.numeroCuenta = numerocuenta; // Asigna el número de cuenta
        this.saldo = saldo; // Asigna el saldo
        txtSaldo.setText(saldo + ""); // Actualiza el campo de texto con el saldo
        cargar(); // Carga los datos del cliente desde el archivo
        txtMoneda.setText(tipoMoneda(numerocuenta)); // Muestra el tipo de moneda
    }
    
    /**
     * Método para determinar el tipo de moneda.
     * @param numerocuenta El número de cuenta.
     * @return El tipo de moneda.
     */
    public String tipoMoneda(int numerocuenta){
        String res = "";
        for (int i = 0; principal.getListaCuenta().size() > i; i++) { // Recorre la lista de cuentas
            if (principal.getListaCuenta().get(i).getNumeroCuenta() == numerocuenta) { // Compara el número de cuenta
                if (principal.getListaCuenta().get(i).getMoneda().equals("Dolares")) { // Comprueba si la moneda es dólares
                    res = "$"; // Asigna el símbolo de dólar
                } else {
                    res = "Bs"; // Asigna el símbolo de bolívares
                }
            }
        }
        return res; // Devuelve el tipo de moneda
    }
    
    /**
     * Método para cargar los datos del cliente desde el archivo.
     */
    public void cargar (){
       FileInputStream archivo = null; // Variable para leer datos de un archivo
        ObjectInputStream convertidorarchivo = null; // Variable para convertir datos desde un archivo

        try {
            archivo = new FileInputStream("D://cajerocachupin.txt"); // Abre el archivo para lectura
            convertidorarchivo = new ObjectInputStream(archivo); // Prepara el objeto para leer desde el archivo
            principal = (Principal) convertidorarchivo.readObject(); // Lee el objeto Principal desde el archivo y lo asigna a la instancia principal
        } catch (IOException ex) { // Captura la excepción en caso de error de entrada/salida
            File archivos = new File("D://cajerocachupin.txt"); // Crea un nuevo archivo si no se encuentra el archivo existente
        } catch (ClassNotFoundException cnfe) { // Captura la excepción en caso de no encontrar la clase principal
            cnfe.printStackTrace(); // Imprime la traza de la excepción
        }
    }
    
    /**
     * Método para obtener el saldo de una cuenta.
     * @param numeroCuenta El número de cuenta.
     * @return El saldo de la cuenta.
     */
    public double saldo(int numeroCuenta){
        double res = 0; // Inicializa el saldo como cero
        if (principal.getListaCuenta() != null) { // Verifica si la lista de cuentas no es nula
            for (int i = 0; principal.getListaCuenta().size() > i; i++) { // Recorre la lista de cuentas
                if (principal.getListaCuenta().get(i).getNumeroCuenta() == numeroCuenta) { // Compara el número de cuenta
                    res = principal.getListaCuenta().get(i).getSaldo(); // Asigna el saldo de la cuenta
                    break; // Sale del bucle
                }
            }
        }
        return res; // Devuelve el saldo
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
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        txtSaldo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        txtMoneda = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BALANCE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 180, 40));

        jButton5.setBackground(new java.awt.Color(0, 51, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("RETURN TO");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 130, -1));

        txtSaldo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtSaldo.setForeground(new java.awt.Color(255, 255, 255));
        txtSaldo.setText("$$$");
        jPanel1.add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 80, 50));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("YOUR CURRENT BALANCE IS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, 30));

        jButton6.setBackground(new java.awt.Color(0, 51, 51));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("PRINT");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 110, 30));

        jButton7.setBackground(new java.awt.Color(0, 51, 51));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("EXIT");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 80, -1));

        txtMoneda.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtMoneda.setForeground(new java.awt.Color(255, 255, 255));
        txtMoneda.setText("$$$");
        jPanel1.add(txtMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 110, 60));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BANK CACHUPIN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logf1nuevo.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngwing.com (4).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método invocado cuando se hace clic en el botón jButton5.
     * Abre la ventana del menú principal.
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        MenuIngles ventana = new MenuIngles(usuario,numeroCuenta); // Crea una instancia de la ventana del menú principal
        ventana.setVisible(true); // Hace visible la ventana del menú principal
        ventana.setLocationRelativeTo(null); // Centra la ventana del menú principal en la pantalla
        dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton5ActionPerformed
    /**
     * Método invocado cuando se hace clic en el botón jButton6.
     * Abre la ventana de finalización.
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         FinishIngles ventana = new FinishIngles(usuario,numeroCuenta); // Crea una instancia de la ventana de finalización
        ventana.setVisible(true); // Hace visible la ventana de finalización
        ventana.setLocationRelativeTo(null); // Centra la ventana de finalización en la pantalla

        FacturaIngles factura =new FacturaIngles(usuario,numeroCuenta,"Consulta saldo",saldo); // Crea una instancia de la factura
        factura.setVisible(true); // Hace visible la factura
        factura.setLocationRelativeTo(null); // Centra la factura en la pantalla
        dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton6ActionPerformed
    /**
     * Método invocado cuando se hace clic en el botón jButton7.
     * Abre la ventana de bienvenida.
     */
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Bienvenida ventana = new Bienvenida(); // Crea una instancia de la ventana de bienvenida
        ventana.setVisible(true); // Hace visible la ventana de bienvenida
        ventana.setLocationRelativeTo(null); // Centra la ventana de bienvenida en la pantalla
        dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(SaldoIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaldoIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaldoIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaldoIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaldoIngles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtMoneda;
    private javax.swing.JLabel txtSaldo;
    // End of variables declaration//GEN-END:variables
}
