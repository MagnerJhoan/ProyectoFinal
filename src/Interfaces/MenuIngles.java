/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import java.io.File; // Importa la clase File del paquete java.io para manejar archivos y directorios
import java.io.FileInputStream; // Importa la clase FileInputStream del paquete java.io para leer datos de un archivo como secuencia de bytes
import java.io.FileOutputStream; // Importa la clase FileOutputStream del paquete java.io para escribir datos en un archivo como secuencia de bytes
import java.io.IOException; // Importa la clase IOException del paquete java.io para manejar excepciones relacionadas con entrada/salida
import java.io.ObjectInputStream; // Importa la clase ObjectInputStream del paquete java.io para leer objetos de una secuencia de entrada
import java.io.ObjectOutputStream; // Importa la clase ObjectOutputStream del paquete java.io para escribir objetos en una secuencia de salida

/**
 *
 * @author MAGNER
 */
/**
 * Clase que representa el menú de la aplicación
 * Extiende de JFrame para crear una ventana.
 */
public class MenuIngles extends javax.swing.JFrame {
    public String usuario = "null"; // Variable para almacenar el nombre de usuario, inicializada como "null"
    public int numeroCuenta = 000; // Variable para almacenar el número de cuenta, inicializada como 000
    public Principal principal = new Principal(); // Instancia de la clase Principal que gestionará los datos

    /**
     * Constructor de la clase Menu que recibe el nombre de usuario y el número de cuenta.
     * @param name Nombre de usuario.
     * @param numerocuenta Número de cuenta.
     */
    public MenuIngles(String name, int numerocuenta) {
        initComponents(); // Inicializa los componentes de la interfaz gráfica
        this.usuario = name; // Asigna el nombre de usuario recibido
        this.numeroCuenta = numerocuenta; // Asigna el número de cuenta recibido
        cargar(); // Carga los datos del archivo
        txtNombre.setText(nombre(name)); // Muestra el nombre de usuario en un campo de texto
        txtApellido.setText(apellido(name)); // Muestra el apellido de usuario en un campo de texto
    }

    /**
     * Constructor de la clase Menu sin parámetros.
     */
    public MenuIngles() {
        initComponents(); // Inicializa los componentes de la interfaz gráfica
        setLocationRelativeTo(null); // Coloca la ventana en el centro de la pantalla
    }

    /**
     * Método para cargar los datos desde un archivo.
     */
    public void cargar() {
        FileInputStream archivo = null; // Variable para leer datos de un archivo
        ObjectInputStream convertidorarchivo = null; // Variable para convertir los datos del archivo

        try {
            archivo = new FileInputStream("C://Metodos//Cajero.txt"); // Abre el archivo para leer datos
            convertidorarchivo = new ObjectInputStream(archivo); // Crea un convertidor para leer los datos del archivo

            principal = (Principal) convertidorarchivo.readObject(); // Lee los datos del archivo y los asigna a la instancia de la clase Principal
        } catch (IOException ex) { // Maneja las excepciones de E/S
            File archivos = new File("C://Metodos//Cajero.txt"); // Crea un nuevo archivo si no se encuentra el archivo existente
        } catch (ClassNotFoundException cnfe) { // Maneja las excepciones de clase no encontrada
            cnfe.printStackTrace(); // Imprime el rastreo de la pila de la excepción
        }
    }

    /**
     * Método para obtener el nombre de usuario.
     * @param usu Nombre de usuario.
     * @return El nombre del usuario.
     */
    public String nombre(String usu) {
        String res = ""; // Variable para almacenar el nombre
        for (int i = 0; principal.getListaCliente().size() > i; i++) { // Itera sobre la lista de clientes
            if (principal.getListaCliente().get(i).getUsuario().equals(usu)) { // Comprueba si el usuario coincide
                res = principal.getListaCliente().get(i).getNombre(); // Obtiene el nombre del cliente
            }
        }
        return res; // Devuelve el nombre del usuario
    }

    /**
     * Método para obtener el apellido del usuario.
     * @param usu Nombre de usuario.
     * @return El apellido del usuario.
     */
    public String apellido(String usu) {
        String res = ""; // Variable para almacenar el apellido
        for (int i = 0; principal.getListaCliente().size() > i; i++) { // Itera sobre la lista de clientes
            if (principal.getListaCliente().get(i).getUsuario().equals(usu)) { // Comprueba si el usuario coincide
                res = principal.getListaCliente().get(i).getApellido(); // Obtiene el apellido del cliente
            }
        }
        return res; // Devuelve el apellido del usuario
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        txttitulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 900));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setBackground(new java.awt.Color(0, 51, 51));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("TRANSFER");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        jButton7.setBackground(new java.awt.Color(0, 51, 51));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("REPORT");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        jButton8.setBackground(new java.awt.Color(0, 51, 51));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("RETREAT");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("BALANCE");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("EXIT");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 60, -1));

        jButton9.setBackground(new java.awt.Color(0, 51, 51));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("DEPOSIT");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        txttitulo.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        txttitulo.setForeground(new java.awt.Color(255, 255, 255));
        txttitulo.setText("BANK CACHUPIN");
        jPanel3.add(txttitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("WELCOMW SELECT THE OPERATION TO BE PERFORMED");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logf1nuevo.jpg"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("RETURN TO");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USER");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 50, -1));

        txtApellido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setText("LAST NAMES");
        jPanel3.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setText("NAME");
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngwing.com (4).png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f3.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         TransferenciaIngles ventana = new TransferenciaIngles (usuario,numeroCuenta); // Crea una instancia de la ventana de TransferenciaQuechua, pasando el usuario y el número de cuenta como parámetros
    ventana.setVisible(true); // Hace visible la ventana de TransferenciaQuechua
    ventana.setLocationRelativeTo(null); // Centra la ventana de TransferenciaQuechua en la pantalla
    dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        HistorialIngles ventana = new HistorialIngles (usuario,numeroCuenta); // Crea una instancia de la ventana de HistorialQuechua, pasando el usuario y el número de cuenta como parámetros
    ventana.setVisible(true); // Hace visible la ventana de HistorialQuechua
    ventana.setLocationRelativeTo(null); // Centra la ventana de HistorialQuechua en la pantalla
    dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        RetiroIngles ventana = new RetiroIngles (usuario,numeroCuenta); // Crea una instancia de la ventana de RetiroQuechua, pasando el usuario y el número de cuenta como parámetros
    ventana.setVisible(true); // Hace visible la ventana de RetiroQuechua
    ventana.setLocationRelativeTo(null); // Centra la ventana de RetiroQuechua en la pantalla
    dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SaldoIngles ventana = new SaldoIngles (usuario,numeroCuenta,saldo()); // Crea una instancia de la ventana de SaldoQuechua, pasando el usuario, el número de cuenta y el saldo como parámetros
    ventana.setVisible(true); // Hace visible la ventana de SaldoQuechua
    ventana.setLocationRelativeTo(null); // Centra la ventana de SaldoQuechua en la pantalla
    dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Bienvenida ventana = new Bienvenida (); // Crea una instancia de la ventana de Bienvenida
    ventana.setVisible(true); // Hace visible la ventana de Bienvenida
    ventana.setLocationRelativeTo(null); // Centra la ventana de Bienvenida en la pantalla
    dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        DepositoIngles ventana = new DepositoIngles (usuario,numeroCuenta); // Crea una instancia de la ventana de DepositoQuechua, pasando el usuario y el número de cuenta como parámetros
    ventana.setVisible(true); // Hace visible la ventana de DepositoQuechua
    ventana.setLocationRelativeTo(null); // Centra la ventana de DepositoQuechua en la pantalla
    dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CuentasIngles ventana = new CuentasIngles (usuario); // Crea una instancia de la ventana de CuentasQuechua, pasando el usuario como parámetro
    ventana.setVisible(true); // Hace visible la ventana de CuentasQuechua
    ventana.setLocationRelativeTo(null); // Centra la ventana de CuentasQuechua en la pantalla
    dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton2ActionPerformed
    public double saldo(){ // Método para obtener el saldo del usuario
    double res = 0; // Inicializa la variable de saldo como 0
    if(principal.getListaCuenta()!=null){ // Verifica si la lista de cuentas no es nula
        for(int i = 0; principal.getListaCuenta().size() > i; i++) { // Itera sobre la lista de cuentas
            if (principal.getListaCuenta().get(i).getNumeroCuenta() == numeroCuenta) { // Comprueba si el número de cuenta coincide
                res = principal.getListaCuenta().get(i).getSaldo(); // Obtiene el saldo de la cuenta
                break; // Sale del bucle
            }
        }
    }
    return res; // Devuelve el saldo obtenido
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
            java.util.logging.Logger.getLogger(MenuIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuIngles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtApellido;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txttitulo;
    // End of variables declaration//GEN-END:variables
}
