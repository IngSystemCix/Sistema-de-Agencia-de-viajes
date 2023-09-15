/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IGU;

import javax.swing.ImageIcon;

/**
 *
 * @author Juan Romero
 */
public class Panel_de_control extends javax.swing.JFrame {

    /**
     * Creates new form Panel_de_control
     */
    public Panel_de_control() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/favicon/luminous_horizons.png")).getImage());
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
        btnEmpleados = new javax.swing.JButton();
        wave = new javax.swing.JLabel();
        btnEmpleados1 = new javax.swing.JButton();
        btnEmpleados2 = new javax.swing.JButton();
        btnEmpleados3 = new javax.swing.JButton();
        btnEmpleados4 = new javax.swing.JButton();
        LabelDerechosDeAutor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel de control");
        setMinimumSize(new java.awt.Dimension(670, 687));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btnEmpleados.setBackground(new java.awt.Color(51, 51, 51));
        btnEmpleados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clientes.png"))); // NOI18N
        btnEmpleados.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(192, 130, 97), 3, true), "Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        btnEmpleados.setContentAreaFilled(false);
        btnEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        wave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/wave.png"))); // NOI18N

        btnEmpleados1.setBackground(new java.awt.Color(51, 51, 51));
        btnEmpleados1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEmpleados1.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/empleados.png"))); // NOI18N
        btnEmpleados1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(192, 130, 97), 3, true), "Empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        btnEmpleados1.setContentAreaFilled(false);
        btnEmpleados1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnEmpleados2.setBackground(new java.awt.Color(51, 51, 51));
        btnEmpleados2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEmpleados2.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reserva.png"))); // NOI18N
        btnEmpleados2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(192, 130, 97), 3, true), "Reservas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        btnEmpleados2.setContentAreaFilled(false);
        btnEmpleados2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnEmpleados3.setBackground(new java.awt.Color(51, 51, 51));
        btnEmpleados3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEmpleados3.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/usuario.png"))); // NOI18N
        btnEmpleados3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(192, 130, 97), 3, true), "Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        btnEmpleados3.setContentAreaFilled(false);
        btnEmpleados3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnEmpleados4.setBackground(new java.awt.Color(51, 51, 51));
        btnEmpleados4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEmpleados4.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/viajes.png"))); // NOI18N
        btnEmpleados4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(192, 130, 97), 3, true), "Viajes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        btnEmpleados4.setContentAreaFilled(false);
        btnEmpleados4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        LabelDerechosDeAutor.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        LabelDerechosDeAutor.setForeground(new java.awt.Color(153, 153, 153));
        LabelDerechosDeAutor.setText("©CopyRigth 2023 Luminous Horizons");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(wave)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEmpleados3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEmpleados1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEmpleados4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addComponent(btnEmpleados2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(LabelDerechosDeAutor)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(wave)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmpleados1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmpleados2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEmpleados3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmpleados4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(LabelDerechosDeAutor)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelDerechosDeAutor;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnEmpleados1;
    private javax.swing.JButton btnEmpleados2;
    private javax.swing.JButton btnEmpleados3;
    private javax.swing.JButton btnEmpleados4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel wave;
    // End of variables declaration//GEN-END:variables
}
