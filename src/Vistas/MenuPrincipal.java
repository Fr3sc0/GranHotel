package Vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class MenuPrincipal extends javax.swing.JFrame {
    Color c=new Color(70,100,100);
    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono=new ImageIcon(getClass().getResource("/Recursos/Hotel.jpg"));
        Image iMenu=icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(iMenu,0,0,getWidth(),getHeight(),this);
            }
        };

        escritorio.setPreferredSize(new java.awt.Dimension(1280, 720));
        jMenuBar1 = new javax.swing.JMenuBar();
        mHuesped = new javax.swing.JMenu();
        mGestionHuesped = new javax.swing.JMenuItem();
        mHabitacion = new javax.swing.JMenu();
        mGestionHabitacion = new javax.swing.JMenuItem();
        mGestionTipoHabitacion = new javax.swing.JMenuItem();
        mR = new javax.swing.JMenu();
        mReserva = new javax.swing.JMenuItem();
        mSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
        );

        mHuesped.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Huesped.png"))); // NOI18N
        mHuesped.setText("Huésped");

        mGestionHuesped.setText("GestionHuésped");
        mGestionHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGestionHuespedActionPerformed(evt);
            }
        });
        mHuesped.add(mGestionHuesped);

        jMenuBar1.add(mHuesped);

        mHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion y Tipo habitacion.png"))); // NOI18N
        mHabitacion.setText("Habitacion");

        mGestionHabitacion.setText("GestionHabitacion");
        mGestionHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGestionHabitacionActionPerformed(evt);
            }
        });
        mHabitacion.add(mGestionHabitacion);

        mGestionTipoHabitacion.setText("GestionTipoHabitacion");
        mGestionTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGestionTipoHabitacionActionPerformed(evt);
            }
        });
        mHabitacion.add(mGestionTipoHabitacion);

        jMenuBar1.add(mHabitacion);

        mR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Reserva.png"))); // NOI18N
        mR.setText("Reserva");

        mReserva.setText("Reserva");
        mReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mReservaActionPerformed(evt);
            }
        });
        mR.add(mReserva);

        jMenuBar1.add(mR);

        mSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Salida.png"))); // NOI18N
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

    private void mSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirActionPerformed
        dispose();
    }//GEN-LAST:event_mSalirActionPerformed

    private void mReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mReservaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        GestionReserva r=new GestionReserva();
        r.setVisible(true);
        r.getContentPane().setBackground(c);
        escritorio.add(r);
        escritorio.moveToFront(r);
    }//GEN-LAST:event_mReservaActionPerformed

    private void mGestionHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mGestionHuespedActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        GestionHuesped gh=new GestionHuesped();
        gh.setVisible(true);
        gh.getContentPane().setBackground(c);
        escritorio.add(gh);
        escritorio.moveToFront(gh);
    }//GEN-LAST:event_mGestionHuespedActionPerformed

    private void mSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_mSalirMouseClicked

    private void mGestionTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mGestionTipoHabitacionActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        GestionTipoHabitacion gth= new GestionTipoHabitacion();
        gth.setVisible(true);
        gth.getContentPane().setBackground(c);
        escritorio.add(gth);
        escritorio.moveToFront(gth);
    }//GEN-LAST:event_mGestionTipoHabitacionActionPerformed

    private void mGestionHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mGestionHabitacionActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        GestionHabitacion gha= new GestionHabitacion();
        gha.setVisible(true);
        gha.getContentPane().setBackground(c);
        escritorio.add(gha);
        escritorio.moveToFront(gha);
    }//GEN-LAST:event_mGestionHabitacionActionPerformed

    
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
    private javax.swing.JMenuItem mGestionHabitacion;
    private javax.swing.JMenuItem mGestionHuesped;
    private javax.swing.JMenuItem mGestionTipoHabitacion;
    private javax.swing.JMenu mHabitacion;
    private javax.swing.JMenu mHuesped;
    private javax.swing.JMenu mR;
    private javax.swing.JMenuItem mReserva;
    private javax.swing.JMenu mSalir;
    // End of variables declaration//GEN-END:variables
}
