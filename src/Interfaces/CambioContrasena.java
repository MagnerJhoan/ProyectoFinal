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
public class CambioContrasena extends javax.swing.JFrame {
    // Declaración de variables
    public String usuario = ""; // Variable para almacenar el nombre de usuario
    Principal principal = new Principal(); // Instancia de la clase Principal
    
    // Constructor sin argumentos
    public CambioContrasena() {
        initComponents(); // Inicializa los componentes de la interfaz gráfica
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
    }
    
    // Constructor con argumento
    public CambioContrasena(String name) {
        initComponents(); // Inicializa los componentes de la interfaz gráfica
        cargar(); // Carga los datos desde un archivo
        this.usuario = name; // Asigna el nombre de usuario recibido como argumento
    }
    
    // Método para cargar los datos desde un archivo
    public void cargar(){
        FileInputStream archivo = null; // Variable para leer datos de un archivo
        ObjectInputStream convertidorarchivo = null; // Variable para convertir datos del archivo a objetos

        try {
            archivo = new FileInputStream("C://Metodos//Cajero.txt"); // Abre el archivo para lectura
            convertidorarchivo = new ObjectInputStream(archivo); // Abre el archivo para leer objetos
            principal = (Principal)convertidorarchivo.readObject(); // Lee el objeto y lo asigna a la variable principal
        } catch (IOException ex) { // Manejo de excepción para errores de entrada/salida
            File archivos = new File ("C://Metodos//Cajero.txt"); // Si el archivo no existe, se crea uno nuevo
        } catch (ClassNotFoundException cnfe) { // Manejo de excepción para clase no encontrada
            cnfe.printStackTrace(); // Imprime la traza de la excepción
        }
    }
    
    // Método para actualizar la lista y guardar en un archivo
    private void actualizarLista() {
        try {
            FileOutputStream ficherosalida = new FileOutputStream ("C://Metodos//Cajero.txt"); // Abre el archivo para escritura
            ObjectOutputStream  convertidor = new ObjectOutputStream (ficherosalida); // Abre el archivo para escribir objetos
            convertidor.writeObject(principal); // Escribe el objeto principal en el archivo
            convertidor.close(); // Cierra el convertidor
            ficherosalida.close(); // Cierra el fichero de salida
        } catch (IOException ex) { // Manejo de excepción para errores de entrada/salida
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtContraseñaActual = new javax.swing.JTextField();
        txtContraseñaNueva = new javax.swing.JTextField();
        txtContraseñaNuevaRepetida = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("REPITA CONTRASEÑA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CAMBIO DE CONTRASEÑA ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, 42));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NUEVA CONTRASEÑA  ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CONTRASEÑA ACTUAL");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 30));

        txtContraseñaActual.setBackground(new java.awt.Color(0, 51, 51));
        txtContraseñaActual.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtContraseñaActual.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtContraseñaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 283, 30));

        txtContraseñaNueva.setBackground(new java.awt.Color(0, 51, 51));
        txtContraseñaNueva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtContraseñaNueva.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtContraseñaNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 283, 30));

        txtContraseñaNuevaRepetida.setBackground(new java.awt.Color(0, 51, 51));
        txtContraseñaNuevaRepetida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtContraseñaNuevaRepetida.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtContraseñaNuevaRepetida, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 283, 30));

        jButton6.setBackground(new java.awt.Color(0, 51, 51));
        jButton6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("LISTO");
        jButton6.setAutoscrolls(true);
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 51, 51));
        jButton5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("REGRESAR ");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngwing.com (4).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-270, 0, -1, 450));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logf1nuevo.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
 * Método que se ejecuta al hacer clic en el botón para cambiar la contraseña.
 * Verifica la contraseña actual y la nueva contraseña ingresada.
 * Si la verificación es exitosa, cambia la contraseña y muestra un mensaje de éxito.
 * Si no, muestra un mensaje de error.
 * @param evt Evento de acción generado al hacer clic en el botón
 */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Verificar si la contraseña actual es correcta
    if (verificarContraseñaActual(txtContraseñaActual.getText())) {
        // Verificar si la nueva contraseña y su repetición coinciden
        if (verificarContraseñaNueva(txtContraseñaNueva.getText(), txtContraseñaNuevaRepetida.getText())) {
            // Cambiar la contraseña
            cambiarcontraseña(txtContraseñaNueva.getText());
            // Mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(null, "Contraseña modificada con éxito.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            // Abrir la ventana de cuentas
            Cuentas ventana = new Cuentas(usuario);
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);
            dispose();
        } else {
            // Mostrar un mensaje de error si las contraseñas no coinciden
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden. Por favor, asegúrate de ingresar la misma contraseña en ambos campos.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    } else {
        // Mostrar un mensaje de error si la contraseña actual es incorrecta
        JOptionPane.showMessageDialog(null, "Contraseña actual incorrecta.", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
    /**
 * Método para cambiar la contraseña de un usuario.
 * Recibe la nueva contraseña y la actualiza en los datos del usuario.
 * @param contraseña Nueva contraseña del usuario
 */
    }//GEN-LAST:event_jButton6ActionPerformed
    public void cambiarcontraseña(String contraseña) {
    for (int i = 0; principal.getListaCliente().size() > i; i++) {
        if (principal.getListaCliente().get(i).getUsuario().equals(usuario)) {
            principal.getListaCliente().get(i).setContraseña(contraseña);
        }
    }
}

/**
 * Método para verificar si dos contraseñas coinciden.
 * @param contraseña1 Primera contraseña
 * @param contraseña2 Segunda contraseña
 * @return true si las contraseñas coinciden, false de lo contrario
 */
public boolean verificarContraseñaNueva(String contraseña1, String contraseña2) {
    boolean res = false;
    // Verificar si las contraseñas coinciden
    if (contraseña1.equals(contraseña2)) {
        res = true;
    }
    return res;
}

/**
 * Método para verificar si la contraseña actual de un usuario es correcta.
 * @param contraseña Contraseña actual del usuario
 * @return true si la contraseña es correcta, false de lo contrario
 */
public boolean verificarContraseñaActual(String contraseña) {
    boolean res = false;
    for (int i = 0; principal.getListaCliente().size() > i; i++) {
        if (principal.getListaCliente().get(i).getUsuario().equals(usuario)) {
            if (principal.getListaCliente().get(i).getContraseña().equals(contraseña)) {
                res = true;
                break;
            }
        }
    }
    return res;
}

/**
 * Método que se ejecuta al hacer clic en el botón "Regresar".
 * Abre la ventana de cuentas y cierra la ventana actual.
 * @param evt Evento de acción generado al hacer clic en el botón
 */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Abrir la ventana de cuentas
    Cuentas ventana = new Cuentas(usuario);
    ventana.setVisible(true);
    ventana.setLocationRelativeTo(null);
    // Cerrar la ventana actual
    dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(CambioContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambioContrasena().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtContraseñaActual;
    private javax.swing.JTextField txtContraseñaNueva;
    private javax.swing.JTextField txtContraseñaNuevaRepetida;
    // End of variables declaration//GEN-END:variables
}
