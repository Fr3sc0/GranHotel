package Vistas;


public class MenuPrincipal extends javax.swing.JFrame {

    
    public MenuPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mHuesped = new javax.swing.JMenu();
        mGestionHuesped = new javax.swing.JMenuItem();
        mHabitacionTH = new javax.swing.JMenu();
        mHabitacion = new javax.swing.JMenuItem();
        mTipoHabitacion = new javax.swing.JMenuItem();
        mR = new javax.swing.JMenu();
        mReserva = new javax.swing.JMenuItem();
        mSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
        );

        mHuesped.setText("Huésped");

        mGestionHuesped.setText("GestionHuésped");
        mGestionHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGestionHuespedActionPerformed(evt);
            }
        });
        mHuesped.add(mGestionHuesped);

        jMenuBar1.add(mHuesped);

        mHabitacionTH.setText("Habitacion");

        mHabitacion.setText("GestionHabitacion");
        mHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mHabitacionActionPerformed(evt);
            }
        });
        mHabitacionTH.add(mHabitacion);

        mTipoHabitacion.setText("TipoHabitacion");
        mTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTipoHabitacionActionPerformed(evt);
            }
        });
        mHabitacionTH.add(mTipoHabitacion);

        jMenuBar1.add(mHabitacionTH);

        mR.setText("Reserva");

        mReserva.setText("Reserva");
        mReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mReservaActionPerformed(evt);
            }
        });
        mR.add(mReserva);

        jMenuBar1.add(mR);

        mSalir.setText("Salir");
        mSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mSalirMouseClicked(evt);
            }
        });
        mSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(mSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mHabitacionActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        GestionHabitacion h=new GestionHabitacion();
        h.setVisible(true);
        escritorio.add(h);
        escritorio.moveToFront(h);
    }//GEN-LAST:event_mHabitacionActionPerformed

    private void mTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTipoHabitacionActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        TipoHabitacion th=new TipoHabitacion();
        th.setVisible(true);
        escritorio.add(th);
        escritorio.moveToFront(th);
    }//GEN-LAST:event_mTipoHabitacionActionPerformed

    private void mSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirActionPerformed
        dispose();
    }//GEN-LAST:event_mSalirActionPerformed

    private void mReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mReservaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        Reserva r=new Reserva();
        r.setVisible(true);
        escritorio.add(r);
        escritorio.moveToFront(r);
    }//GEN-LAST:event_mReservaActionPerformed

    private void mGestionHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mGestionHuespedActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        GestionHuesped gh=new GestionHuesped();
        gh.setVisible(true);
        escritorio.add(gh);
        escritorio.moveToFront(gh);
    }//GEN-LAST:event_mGestionHuespedActionPerformed

    private void mSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_mSalirMouseClicked

    
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mGestionHuesped;
    private javax.swing.JMenuItem mHabitacion;
    private javax.swing.JMenu mHabitacionTH;
    private javax.swing.JMenu mHuesped;
    private javax.swing.JMenu mR;
    private javax.swing.JMenuItem mReserva;
    private javax.swing.JMenu mSalir;
    private javax.swing.JMenuItem mTipoHabitacion;
    // End of variables declaration//GEN-END:variables
}
