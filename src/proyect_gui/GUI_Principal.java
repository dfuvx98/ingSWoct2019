package proyect_gui;

public class GUI_Principal extends javax.swing.JFrame {

    public GUI_Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        registroUsuario = new javax.swing.JButton();
        registroRutas = new javax.swing.JButton();
        registroPasajero = new javax.swing.JButton();
        ventaBoletos = new javax.swing.JButton();
        reporteVentas = new javax.swing.JButton();
        reporteAcceso = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menu_registroUsuario = new javax.swing.JMenuItem();
        menu_registroRutas = new javax.swing.JMenuItem();
        menu_ventaBoletos = new javax.swing.JMenuItem();
        menu_reporteVenta = new javax.swing.JMenuItem();

        jMenuItem5.setText("jMenuItem5");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modulo Principal Ventas");
        setFocusCycleRoot(false);
        setLocation(new java.awt.Point(350, 200));

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 255));

        registroUsuario.setText("REGISTRO USUARIO");
        registroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroUsuarioActionPerformed(evt);
            }
        });

        registroRutas.setText("REGISTRO RUTAS");
        registroRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroRutasActionPerformed(evt);
            }
        });

        registroPasajero.setText("REGISTRO PASAJERO");
        registroPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroPasajeroActionPerformed(evt);
            }
        });

        ventaBoletos.setText("VENTA BOLETOS");
        ventaBoletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventaBoletosActionPerformed(evt);
            }
        });

        reporteVentas.setText("REPORTE VENTAS");
        reporteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteVentasActionPerformed(evt);
            }
        });

        reporteAcceso.setText("REPORTE ACCSESO");
        reporteAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteAccesoActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(registroUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(registroRutas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(registroPasajero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ventaBoletos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(reporteVentas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(reporteAcceso, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(ventaBoletos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(reporteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(reporteAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(registroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(registroRutas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(registroPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registroRutas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registroPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ventaBoletos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reporteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reporteAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jMenu2.setText("Menu Principal");

        menu_registroUsuario.setText("Resgistro de Usuarios");
        menu_registroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_registroUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(menu_registroUsuario);

        menu_registroRutas.setText("Registro de Rutas");
        jMenu2.add(menu_registroRutas);

        menu_ventaBoletos.setText("Venta de Boletos");
        jMenu2.add(menu_ventaBoletos);

        menu_reporteVenta.setText("Reporte Ventas");
        jMenu2.add(menu_reporteVenta);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_registroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_registroUsuarioActionPerformed
        // TODO add your handling code here:
        GUI_RegistroUsuarios b = new GUI_RegistroUsuarios();
        b.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_menu_registroUsuarioActionPerformed

    private void registroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroUsuarioActionPerformed
        // TODO add your handling code here:
        GUI_RegistroUsuarios b = new GUI_RegistroUsuarios();
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_registroUsuarioActionPerformed

    private void registroRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroRutasActionPerformed
        // TODO add your handling code here:
        GUI_RegistroRutas c = new GUI_RegistroRutas();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_registroRutasActionPerformed

    private void registroPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroPasajeroActionPerformed
        // TODO add your handling code here:
        GUI_RegistroPasajeros b = new GUI_RegistroPasajeros();
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_registroPasajeroActionPerformed

    private void ventaBoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventaBoletosActionPerformed
        // TODO add your handling code here:
        GUI_VentaDeBoletos b = new GUI_VentaDeBoletos();
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_ventaBoletosActionPerformed

    private void reporteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteVentasActionPerformed
        // TODO add your handling code here:
        GUI_ReporteVentas b = new GUI_ReporteVentas();
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_reporteVentasActionPerformed

    private void reporteAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteAccesoActionPerformed
        // TODO add your handling code here:
        GUI_ReporteAccesos b = new GUI_ReporteAccesos();
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_reporteAccesoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem menu_registroRutas;
    private javax.swing.JMenuItem menu_registroUsuario;
    private javax.swing.JMenuItem menu_reporteVenta;
    private javax.swing.JMenuItem menu_ventaBoletos;
    private javax.swing.JButton registroPasajero;
    private javax.swing.JButton registroRutas;
    private javax.swing.JButton registroUsuario;
    private javax.swing.JButton reporteAcceso;
    private javax.swing.JButton reporteVentas;
    private javax.swing.JButton ventaBoletos;
    // End of variables declaration//GEN-END:variables
}
