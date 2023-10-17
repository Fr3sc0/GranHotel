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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Estado)
                        .addGap(67, 67, 67)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbEstado)
                        .addGap(55, 55, 55)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(bNuevo)
                        .addGap(47, 47, 47)
                        .addComponent(bGuardar)
                        .addGap(44, 44, 44)
                        .addComponent(bEliminar)
                        .addGap(36, 36, 36)
                        .addComponent(bSalir)))
                .addContainerGap(71, Short.MAX_VALUE))
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
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Estado)
                    .addComponent(rbEstado))
                .addGap(62, 62, 62)
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
        Integer nro= Integer.parseInt(tfNroHabitacion.getText());
        String th= tfTipoHabitacion.getText();
            if (th.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No puede haber campos vacios.");
                return;
            }
            Boolean estado=rbEstado.isSelected();
            if (habitacionActual==null) {
                habitacionActual= new Habitacion(nro,th,estado);
                hd.modificarH(habitacionActual);
            }else{
                habitacionActual.setNroHabitacion(nro);
                habitacionActual.setTipoHabitacion(th);
                hd.agregarHabitacion(habitacionActual);
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
    private void limpiarCampos(){
        tfNroHabitacion.setText("");
        tfTipoHabitacion.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Estado;
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
