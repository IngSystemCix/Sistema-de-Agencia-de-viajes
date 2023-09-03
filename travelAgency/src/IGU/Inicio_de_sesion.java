/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IGU;

/**
 *
 * @author Juan Romero
 */
public class Inicio_de_sesion extends javax.swing.JFrame {

    /**
     * Creates new form Inicio_de_sesion
     */
    public Inicio_de_sesion() {
        initComponents();
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
        LuminousHorizons = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        inputUsuario = new javax.swing.JTextField();
        inputPassword = new javax.swing.JPasswordField();
        btn_inicio_de_sesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LabelDerechosDeAutor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INICIO DE SESIÓN | Luminous Horizons");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LuminousHorizons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/Luminous Horizons.png"))); // NOI18N
        jPanel1.add(LuminousHorizons, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        labelUsuario.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(226, 199, 153));
        labelUsuario.setText("Usuario:");
        jPanel1.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        labelPassword.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(226, 199, 153));
        labelPassword.setText("Contraseña:");
        jPanel1.add(labelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        inputUsuario.setBackground(new java.awt.Color(51, 51, 51));
        inputUsuario.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        inputUsuario.setForeground(new java.awt.Color(255, 255, 255));
        inputUsuario.setToolTipText("Usuario");
        inputUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(226, 199, 153), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.add(inputUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 520, 40));

        inputPassword.setBackground(new java.awt.Color(51, 51, 51));
        inputPassword.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        inputPassword.setForeground(new java.awt.Color(255, 255, 255));
        inputPassword.setToolTipText("Contraseña");
        inputPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(226, 199, 153), 3, true)));
        jPanel1.add(inputPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 520, 40));

        btn_inicio_de_sesion.setBackground(new java.awt.Color(226, 199, 153));
        btn_inicio_de_sesion.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_inicio_de_sesion.setForeground(new java.awt.Color(51, 51, 51));
        btn_inicio_de_sesion.setText("Iniciar sesión");
        btn_inicio_de_sesion.setBorderPainted(false);
        btn_inicio_de_sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_inicio_de_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 590, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/wave.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 140));

        LabelDerechosDeAutor.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        LabelDerechosDeAutor.setForeground(new java.awt.Color(153, 153, 153));
        LabelDerechosDeAutor.setText("©CopyRigth 2023 Luminous Horizons");
        jPanel1.add(LabelDerechosDeAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 660, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Inicio_de_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_de_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_de_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_de_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_de_sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelDerechosDeAutor;
    private javax.swing.JLabel LuminousHorizons;
    private javax.swing.JButton btn_inicio_de_sesion;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JTextField inputUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsuario;
    // End of variables declaration//GEN-END:variables
}
