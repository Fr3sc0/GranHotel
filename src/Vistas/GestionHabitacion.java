package Vistas;

import AccesoDatos.HabitacionData;
import Entidades.Habitacion;
import javax.swing.JOptionPane;


public class GestionHabitacion extends javax.swing.JInternalFrame {
    private HabitacionData hd= new HabitacionData();
    private Habitacion habitacionActual=null;

    public GestionHabitacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNroHabitacion = new javax.swing.JTextField();
        tfTipoHabitacion = new javax.swing.JTextField();
        bNuevo = new javax.swing.JButton();
        bGuardar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        Estado = new javax.swing.JLabel();
        rbEstado = new javax.swing.JRadioButton();
        bBuscar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jLabel1.setText("Gestion habitacion.");

        jLabel2.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel2.setText("Numero de Habitacion:");

        jLabel3.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel3.setText("Tipo de Habitacion:");

        bNuevo.setText("Nuevo");
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });

        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });

        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        Estado.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        Estado.setText("Estado:");

        rbEstado.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        rbEstado.setText("Ocupada/Desocupada");

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(70, 70, 70)
                                    .addComponent(tfTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(22, 22, 22)
                                            .addComponent(Estado)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rbEstado))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(53, 53, 53)
                                            .addComponent(bNuevo)
                                            .addGap(47, 47, 47)
                                            .addComponent(bGuardar)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(44, 44, 44)
                                            .addComponent(bEliminar)
                                            .addGap(36, 36, 36)
                                            .addComponent(bSalir))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(102, 102, 102)
                                            .addComponent(bBuscar)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(44, 44, 44)
                                .addComponent(tfNroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Estado)
                    .addComponent(rbEstado)
                    .addComponent(bBuscar))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bNuevo)
                    .addComponent(bGuardar)
                    .addComponent(bEliminar)
                    .addComponent(bSalir))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        try{
        Integer nro= Integer.valueOf(tfNroHabitacion.getText());
        String th= tfTipoHabitacion.getText();
        boolean est= rbEstado.isSelected();
            if (th.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No puede haber campos vacios.");
                return;
            }
            if (habitacionActual==null) {
                habitacionActual= new Habitacion(nro,th,est);
                hd.agregarHabitacion(habitacionActual);
            }else{
                habitacionActual.setNroHabitacion(nro);
                habitacionActual.setTipoHabitacion(th);
                habitacionActual.setEstado(est);
                hd.modificarH(habitacionActual);
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero valido");
        }
    }//GEN-LAST:event_bGuardarActionPerformed

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        limpiarCampos();
        habitacionActual= null;
    }//GEN-LAST:event_bNuevoActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        if (habitacionActual!=null) {
            hd.borrarHabitacion(habitacionActual.getNroHabitacion());
            habitacionActual=null;
            limpiarCampos();
        }else{
            JOptionPane.showMessageDialog(this, "No hay una habitacion seleccionada");
        }                           
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        try{
         Integer nro= Integer.valueOf(tfNroHabitacion.getText()); 
         habitacionActual= hd.buscarHabitacion(nro);
            if (habitacionActual!=null) {
               tfTipoHabitacion.setText(habitacionActual.getTipoHabitacion());
               rbEstado.setSelected(habitacionActual.isEstado());
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero valido");
            limpiarCampos();
        }
    }//GEN-LAST:event_bBuscarActionPerformed
    private void limpiarCampos(){
        tfNroHabitacion.setText("");
        tfTipoHabitacion.setText("");
        rbEstado.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Estado;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bNuevo;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton rbEstado;
    private javax.swing.JTextField tfNroHabitacion;
    private javax.swing.JTextField tfTipoHabitacion;
    // End of variables declaration//GEN-END:variables
}
