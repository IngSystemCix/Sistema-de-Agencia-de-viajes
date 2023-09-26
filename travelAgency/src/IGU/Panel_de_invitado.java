/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IGU;

import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Juan Romero
 */
public class Panel_de_invitado extends javax.swing.JFrame {

    /**
     * Creates new form Panel_de_invitado
     */
    
    public Panel_de_invitado() {
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

        panel_Principal = new javax.swing.JPanel();
        Barra_de_menu = new javax.swing.JPanel();
        btn_inicar_sesion = new swing.ButtonGradient();
        jLabel1 = new javax.swing.JLabel();
        btn_registrarse = new swing.ButtonGradient();
        jLabel2 = new javax.swing.JLabel();
        panelRound1 = new test.PanelRound();
        calendario_regreso = new com.toedter.calendar.JCalendar();
        calendario_ida = new com.toedter.calendar.JCalendar();
        label_decha_de_ida = new javax.swing.JLabel();
        label_decha_de_regreso = new javax.swing.JLabel();
        btn_registrarse1 = new swing.ButtonGradient();
        label_destino = new javax.swing.JLabel();
        cb_destino = new javax.swing.JComboBox<>();
        cb_origen = new javax.swing.JComboBox<>();
        label_origen = new javax.swing.JLabel();
        Spinner_cantidad_pasajeros = new javax.swing.JSpinner(new SpinnerNumberModel(1, 1, 8, 1));
        label_cantidad_de_pasajeros = new javax.swing.JLabel();
        cb_tipo_de_viaje = new javax.swing.JComboBox<>();
        cb_forma_de_viaje = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel de invitado | Luminous Horizons");

        panel_Principal.setBackground(new java.awt.Color(51, 51, 51));
        panel_Principal.setFocusTraversalPolicyProvider(true);
        panel_Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Barra_de_menu.setBackground(new java.awt.Color(154, 59, 59));
        Barra_de_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_inicar_sesion.setText("Inciar sesión");
        btn_inicar_sesion.setColor1(new java.awt.Color(154, 59, 59));
        btn_inicar_sesion.setColor2(new java.awt.Color(51, 51, 51));
        btn_inicar_sesion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_inicar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicar_sesionActionPerformed(evt);
            }
        });
        Barra_de_menu.add(btn_inicar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/Luminous Horizons small.png"))); // NOI18N
        Barra_de_menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        btn_registrarse.setText("Registrarse");
        btn_registrarse.setColor1(new java.awt.Color(154, 59, 59));
        btn_registrarse.setColor2(new java.awt.Color(51, 51, 51));
        btn_registrarse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Barra_de_menu.add(btn_registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, -1));

        panel_Principal.add(Barra_de_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1043, 53));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descubre tu próximo viaje");
        panel_Principal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 280, -1));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calendario_regreso.setDecorationBackgroundColor(new java.awt.Color(241, 222, 201));
        calendario_regreso.setDecorationBordersVisible(true);
        calendario_regreso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        calendario_regreso.setMinimumSize(new java.awt.Dimension(251, 180));
        calendario_regreso.setPreferredSize(new java.awt.Dimension(251, 180));
        panelRound1.add(calendario_regreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 440, 230));

        calendario_ida.setDecorationBackgroundColor(new java.awt.Color(241, 222, 201));
        calendario_ida.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        calendario_ida.setMinimumSize(new java.awt.Dimension(251, 180));
        calendario_ida.setPreferredSize(new java.awt.Dimension(251, 180));
        panelRound1.add(calendario_ida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 440, 230));

        label_decha_de_ida.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_decha_de_ida.setText("Fecha de ida");
        panelRound1.add(label_decha_de_ida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        label_decha_de_regreso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_decha_de_regreso.setText("Fecha de regreso");
        panelRound1.add(label_decha_de_regreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        btn_registrarse1.setText("Buscar vuelos");
        btn_registrarse1.setColor1(new java.awt.Color(154, 59, 59));
        btn_registrarse1.setColor2(new java.awt.Color(51, 51, 51));
        btn_registrarse1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        panelRound1.add(btn_registrarse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 400, -1, -1));

        label_destino.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_destino.setText("Ingresa el destino");
        panelRound1.add(label_destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, -1, 30));

        panelRound1.add(cb_destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 150, 30));

        panelRound1.add(cb_origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 150, 30));

        label_origen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_origen.setText("Ingresa el origen");
        panelRound1.add(label_origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, 30));
        panelRound1.add(Spinner_cantidad_pasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        label_cantidad_de_pasajeros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_cantidad_de_pasajeros.setText("Cantidad de pasajeros");
        panelRound1.add(label_cantidad_de_pasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 16, -1, 30));

        cb_tipo_de_viaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Económico", "Premium económico", "Premium empresarial" }));
        panelRound1.add(cb_tipo_de_viaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 201, -1));

        cb_forma_de_viaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solo ida", "Ida y Vuelta" }));
        cb_forma_de_viaje.setSelectedIndex(1);
        panelRound1.add(cb_forma_de_viaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 201, -1));

        panel_Principal.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 980, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inicar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicar_sesionActionPerformed
        Inicio_de_sesion inicio_de_sesion = new Inicio_de_sesion();
        inicio_de_sesion.setVisible(true);
        inicio_de_sesion.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btn_inicar_sesionActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra_de_menu;
    private javax.swing.JSpinner Spinner_cantidad_pasajeros;
    private swing.ButtonGradient btn_inicar_sesion;
    private swing.ButtonGradient btn_registrarse;
    private swing.ButtonGradient btn_registrarse1;
    private com.toedter.calendar.JCalendar calendario_ida;
    private com.toedter.calendar.JCalendar calendario_regreso;
    private javax.swing.JComboBox<String> cb_destino;
    private javax.swing.JComboBox<String> cb_forma_de_viaje;
    private javax.swing.JComboBox<String> cb_origen;
    private javax.swing.JComboBox<String> cb_tipo_de_viaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label_cantidad_de_pasajeros;
    private javax.swing.JLabel label_decha_de_ida;
    private javax.swing.JLabel label_decha_de_regreso;
    private javax.swing.JLabel label_destino;
    private javax.swing.JLabel label_origen;
    private test.PanelRound panelRound1;
    private javax.swing.JPanel panel_Principal;
    // End of variables declaration//GEN-END:variables
}