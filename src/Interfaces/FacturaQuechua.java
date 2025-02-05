/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author MAGNER
 */
/**
 * Define la clase FacturaQuechua que extiende de javax.swing.JFrame, que representa la ventana de la factura.
 * Contiene métodos para crear una instancia de la ventana de factura y para inicializarla.
 */
public class FacturaQuechua extends javax.swing.JFrame {

    /**
     * Constructor de la clase Factura.
     * Crea una nueva instancia de la ventana de factura y la inicializa.
     */
    public FacturaQuechua() {
        initComponents();
        setLocationRelativeTo(null); // Establece la ubicación de la ventana en el centro de la pantalla
    }
    
    /**
     * Constructor sobrecargado de la clase Factura.
     * Crea una nueva instancia de la ventana de factura y la inicializa con los datos proporcionados.
     * @param usu Nombre de usuario
     * @param numerocuenta Número de cuenta
     * @param tipoTransaccion Tipo de transacción
     * @param monto Monto de la transacción
     */
    public FacturaQuechua(String usu, int numerocuenta, String tipoTransaccion, double monto) {
        initComponents();
        // Obtiene la fecha y hora actual
        LocalDateTime ahora = LocalDateTime.now();
        // Formatea la fecha y hora en el formato especificado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // Convierte la fecha y hora a una cadena formateada
        String fechaYHoraActual = ahora.format(formatter);
        
        // Establece los datos en los campos de la factura
        txtFecha.setText("" + fechaYHoraActual);
        txtNumeroCuenta.setText("" + numerocuenta);
        txtTipoTransaccion.setText(tipoTransaccion);
        txtMonto.setText(monto + "");
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
        txtFecha = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        MONTO = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNumeroCuenta = new javax.swing.JLabel();
        txtMonto = new javax.swing.JLabel();
        txtTipoTransaccion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setText("P'unchaw / Orasqa :");
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 180, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("WILLA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 120, 60));

        MONTO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MONTO.setForeground(new java.awt.Color(255, 255, 255));
        MONTO.setText("qapariy");
        jPanel1.add(MONTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 60, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Riqsiy tukuy");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 90, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Qillqana riqsiy");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("P'unchaw / Orasqa");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 130, -1));

        txtNumeroCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNumeroCuenta.setForeground(new java.awt.Color(255, 255, 255));
        txtNumeroCuenta.setText("P'unchaw / Orasqa :");
        jPanel1.add(txtNumeroCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 180, -1));

        txtMonto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMonto.setForeground(new java.awt.Color(255, 255, 255));
        txtMonto.setText("P'unchaw / Orasqa:");
        jPanel1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 150, -1));

        txtTipoTransaccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTipoTransaccion.setForeground(new java.awt.Color(255, 255, 255));
        txtTipoTransaccion.setText("P'unchaw / Orasqa :");
        jPanel1.add(txtTipoTransaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 190, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("x");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logf1nuevo.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngwing.com (4).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 0, -1, 380));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 500, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(FacturaQuechua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacturaQuechua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacturaQuechua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacturaQuechua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacturaQuechua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MONTO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtMonto;
    private javax.swing.JLabel txtNumeroCuenta;
    private javax.swing.JLabel txtTipoTransaccion;
    // End of variables declaration//GEN-END:variables
}
