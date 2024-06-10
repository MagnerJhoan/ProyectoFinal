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
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author MAGNER
 */
/**
 * La clase Historial representa la interfaz de usuario para mostrar el historial bancario de un usuario.
 * Permite cargar el historial desde un archivo buscar el historial de un número de cuenta específico y llenar una tabla con los registros del historial.
 */
public class Historial extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel(); // Modelo para la tabla que muestra el historial
    public String usuario = "null"; // Nombre del usuario
    public int numeroCuenta = 000; // Número de cuenta del usuario
    public Principal principal = new Principal(); // Instancia de la clase Principal para acceder a la lista de cuentas
    
    /**
     * Constructor de la clase Historial sin parámetros.
     * Inicializa los componentes de la interfaz gráfica y centra la ventana en la pantalla.
     */
    public Historial() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    /**
     * Constructor de la clase Historial con parámetros.
     * @param name Nombre del usuario
     * @param numerocuen Número de cuenta del usuario
     */
    public Historial(String name, int numerocuen) {
        initComponents();
        this.usuario = name;
        this.numeroCuenta = numerocuen;
        cargar(); // Cargar el historial desde el archivo
       
        modelo.addColumn("fecha"); // Agregar columna de fecha al modelo de la tabla
        modelo.addColumn("Descripcion"); // Agregar columna de descripción al modelo de la tabla
        modelo.addColumn("Monto"); // Agregar columna de monto al modelo de la tabla
        modelo.addColumn("Rem/Dest"); // Agregar columna de Remitente/Destinatario al modelo de la tabla
        modelo.addColumn("N° cuenta del Rem/Dest"); // Agregar columna de número de cuenta del Remitente/Destinatario al modelo de la tabla
        modelo.addColumn("saldo"); // Agregar columna de saldo al modelo de la tabla
        
        llenarTabla(); // Llenar la tabla con los registros del historial
    }
    
    /**
     * Método para llenar la tabla con los registros del historial.
     */
    public void llenarTabla() {
        // Borra todos los elementos del modelo para que no se dupliquen
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        } 
        
        ArrayList<Historia> historias = buscarHistorial(numeroCuenta); // Buscar el historial del número de cuenta especificado
        
        for (Historia historia : historias) {
            Object a[] = new Object[6];
            a[0] = historia.getFecha();
            a[1] = historia.getDescripcion();
            a[2] = historia.getMonto();
            a[3] = historia.getDestinatario();
            a[4] = historia.getCuenta();
            a[5] = historia.getSaldo();
            modelo.addRow(a);
        }
       
        jTable1.setModel(modelo); // Establecer el modelo de la tabla
    }
    
    /**
     * Método para buscar el historial de un número de cuenta específico.
     * @param numerocuenta Número de cuenta del usuario
     * @return Una lista de objetos Historia que representan el historial de transacciones del número de cuenta especificado
     */
    public ArrayList<Historia> buscarHistorial(int numerocuenta) {
        ArrayList<Historia> res = new ArrayList<>();
        
        for (int i = 0; i < principal.getListaCuenta().size(); i++) {
            if (principal.getListaCuenta().get(i).getNumeroCuenta() == numerocuenta) {
                res = principal.getListaCuenta().get(i).getListaHistoria();
                break;
            }
        }
        
        return res;
    }
    
    /**
     * Método para cargar el historial desde un archivo.
     */
    public void cargar() {
        FileInputStream archivo = null; // Variable para leer datos de un archivo
        ObjectInputStream convertidorarchivo = null; // Variable para convertir el archivo a objetos

        try {
            archivo = new FileInputStream("C://Metodos//Cajero.txt"); // Abrir el archivo de historial
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HISTORIAL BANCARIO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 27, 390, 70));

        jTable1.setBackground(new java.awt.Color(0, 51, 51));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 670, 360));

        jButton4.setBackground(new java.awt.Color(0, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("ATRAS");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 120, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngwing.com (4).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 755, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método que se ejecuta al hacer clic en el botón "REGRESAR".
     * Abre la ventana del menú principal.
     * @param evt Evento de acción
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Menu ventana = new Menu(usuario, numeroCuenta); // Instancia de la clase Menu
        ventana.setVisible(true); // Hace visible la ventana del menú principal
        ventana.setLocationRelativeTo(null); // Establece la posición de la ventana en el centro de la pantalla
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
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
