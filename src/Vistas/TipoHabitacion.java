package Vistas;
import AccesoDatos.TipoHabitacionData;
import javax.swing.JOptionPane;

public class TipoHabitacion extends javax.swing.JInternalFrame {
    private TipoHabitacionData thd= new TipoHabitacionData();
    private TipoHabitacion tipoHActual=null;

    
    public TipoHabitacion() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bGuardar = new javax.swing.JButton();
        bNuevo = new javax.swing.JButton();
        bBorrar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        tfCantCamas = new javax.swing.JTextField();
        tfTipoCama = new javax.swing.JTextField();
        tfPrecioN = new javax.swing.JTextField();
        tfPersonas = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel1.setText("Tipo de Habitacion.");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel2.setText("Codigo:");

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel3.setText("Cant. Personas:");

        jLabel4.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel4.setText("Cant. de Camas:");

        jLabel5.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel5.setText("Tipo de cama:");

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel6.setText("Precio por noche:");

        bGuardar.setText("Guardar");

        bNuevo.setText("Nuevo");
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });

        bBorrar.setText("Borrar");

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(bGuardar)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bNuevo)
                                .addGap(40, 40, 40)
                                .addComponent(bBorrar)
                                .addGap(37, 37, 37)
                                .addComponent(bSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfPersonas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                    .addComponent(tfPrecioN, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTipoCama, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCantCamas, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCodigo, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(49, 49, 49)
                                .addComponent(bBuscar)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfCantCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfTipoCama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfPrecioN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGuardar)
                    .addComponent(bNuevo)
                    .addComponent(bBorrar)
                    .addComponent(bSalir))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
       limpiarCampos();
       tipoHActual=null;
    }//GEN-LAST:event_bNuevoActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        
    }//GEN-LAST:event_bBuscarActionPerformed
    private void limpiarCampos(){
        tfCodigo.setText("");
        tfPersonas.setText("");
        tfCantCamas.setText("");
        tfTipoCama.setText("");
        tfPrecioN.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bBuscar;
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
