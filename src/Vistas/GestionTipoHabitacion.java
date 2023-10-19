package Vistas;

import Entidades.TipoHabitacion;
import AccesoDatos.TipoHabitacionData;
import javax.swing.JOptionPane;


public class GestionTipoHabitacion extends javax.swing.JInternalFrame {
    private TipoHabitacionData thd= new TipoHabitacionData();
    private TipoHabitacion tipoHActual=null;

    public GestionTipoHabitacion() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bBuscar = new javax.swing.JButton();
        bGuardar = new javax.swing.JButton();
        bNuevo = new javax.swing.JButton();
        tfCodigo = new javax.swing.JTextField();
        tfPersonas = new javax.swing.JTextField();
        tfTipoCama = new javax.swing.JTextField();
        tfPrecioN = new javax.swing.JTextField();
        tfCantCamas = new javax.swing.JTextField();
        bEliminar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel1.setText("Gestion Tipo de Habitacion");

        jLabel2.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel2.setText("Codigo:");

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel3.setText("Cant. Personas:");

        jLabel4.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel4.setText("Cant. de Camas:");

        jLabel5.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel5.setText("Tipo de cama:");

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel6.setText("Precio por noche:");

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });

        bNuevo.setText("Nuevo");
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bBuscar)
                        .addGap(15, 15, 15))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTipoCama)
                                    .addComponent(tfPrecioN)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCodigo)
                                    .addComponent(tfPersonas)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfCantCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(bGuardar)
                        .addGap(43, 43, 43)
                        .addComponent(bNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bEliminar)
                        .addGap(25, 25, 25)))
                .addGap(3, 3, 3)
                .addComponent(bSalir)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(bBuscar)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfCantCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfTipoCama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfPrecioN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGuardar)
                    .addComponent(bNuevo)
                    .addComponent(bEliminar)
                    .addComponent(bSalir))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        try{
        String code= tfCodigo.getText();
        tipoHActual=thd.buscarTH(code);
        if (tipoHActual!=null) {
            tfPersonas.setText(Integer.toString(tipoHActual.getCantPersonas()));
            tfTipoCama.setText(tipoHActual.getTipoCama());
            tfCantCamas.setText(Integer.toString(tipoHActual.getCantCamas()));
            tfPrecioN.setText(String.valueOf(tipoHActual.getPrecioNoche()));    
            }else{
                JOptionPane.showMessageDialog(this, "El tipo de Habitacion no se encuentra registrada.");
            }    
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Debe ingresar un caracter valido");
        }
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        try{
        String code= tfCodigo.getText();
        Integer personas=Integer.parseInt(tfPersonas.getText());
        String tipoCama=tfTipoCama.getText();
        Integer cantCamas= Integer.parseInt(tfCantCamas.getText());
        if (code.isEmpty()||tipoCama.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No puede haber campos vacios.");
                return;
            }
        double precioN= Double.parseDouble(tfPrecioN.getText());
            if (tipoHActual==null) {
                tipoHActual=new TipoHabitacion(code,personas, cantCamas,tipoCama, precioN);
                thd.agregarTipoHabitacion(tipoHActual);
            }else{
                tipoHActual.setCodigo(code);
                tipoHActual.setCantPersonas(personas);
                tipoHActual.setCantCamas(cantCamas);
                tipoHActual.setTipoCama(tipoCama);
                tipoHActual.setPrecioNoche(precioN);
                thd.modificarTh(tipoHActual);
            }
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Debe ingresar un caracter valido");
        }
    }//GEN-LAST:event_bGuardarActionPerformed

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        limpiarCampos();
        tipoHActual=null;
    }//GEN-LAST:event_bNuevoActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        if (tipoHActual!=null) {
            thd.borrarTipoHabitacion(tipoHActual.getCodigo());
            tipoHActual=null;
            limpiarCampos();
        }else{
            JOptionPane.showMessageDialog(this, "No hay un tipo de habitacion seleccionada");
        } 
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    private void limpiarCampos(){
        tfCodigo.setText("");
        tfPersonas.setText("");
        tfTipoCama.setText("");
        tfCantCamas.setText("");
        tfPrecioN.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bNuevo;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tfCantCamas;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfPersonas;
    private javax.swing.JTextField tfPrecioN;
    private javax.swing.JTextField tfTipoCama;
    // End of variables declaration//GEN-END:variables
}
