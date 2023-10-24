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
        tfTipoCama = new javax.swing.JTextField();
        tfPrecioN = new javax.swing.JTextField();
        bEliminar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        cbCantP = new javax.swing.JComboBox<>();
        cbCantC = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tTH = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        jLabel1.setText("Gestion Tipo de Habitacion.");

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

        bNuevo.setText("Limpiar");
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

        cbCantP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoja una cant. de personas", "1", "2", "3", "4", "5", "6", "7", "8" }));

        cbCantC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoja una cant. de camas", "Simple", "Queen", "King Size" }));

        tTH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tTH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(bBuscar)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(cbCantP, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(cbCantC, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(tfTipoCama, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(tfPrecioN, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bGuardar)
                        .addGap(31, 31, 31)
                        .addComponent(bNuevo)
                        .addGap(37, 37, 37)
                        .addComponent(bEliminar)
                        .addGap(27, 27, 27)
                        .addComponent(bSalir)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar)
                    .addComponent(jLabel3)
                    .addComponent(cbCantP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbCantC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPrecioN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tfTipoCama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(bGuardar)
                    .addComponent(bNuevo)
                    .addComponent(bEliminar)
                    .addComponent(bSalir))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        /*try{
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
        }*/
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
       /* try{
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
        }*/
    }//GEN-LAST:event_bGuardarActionPerformed

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        limpiarCampos();
        tipoHActual=null;
    }//GEN-LAST:event_bNuevoActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        if (tipoHActual!=null) {
            thd.borrarTipoHabitacion(tipoHActual.getCodigo());
            tipoHActual=null;
        }else{
            JOptionPane.showMessageDialog(this, "No hay un tipo de habitacion seleccionada");
        } 
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    private void limpiarCampos(){
        /*tfCodigo.setText("");
        tfPersonas.setText("");
        tfTipoCama.setText("");
        tfCantCamas.setText("");
        tfPrecioN.setText("");*/
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bNuevo;
    private javax.swing.JButton bSalir;
    private javax.swing.JComboBox<String> cbCantC;
    private javax.swing.JComboBox<String> cbCantP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tTH;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfPrecioN;
    private javax.swing.JTextField tfTipoCama;
    // End of variables declaration//GEN-END:variables
}
