package Vistas;

import AccesoDatos.HuespedData;
import Entidades.Huesped;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class GestionHuesped extends javax.swing.JInternalFrame {

    private HuespedData hd= new HuespedData();
    private Huesped huespedActual= null;
    private List<Huesped> listaH;

    public GestionHuesped() {
        initComponents();
        listaH= hd.listarHuesped();
        
       
    }
    
    public static boolean validarTxt(String txt) {
        Pattern patron = Pattern.compile("^[A-Za-z ]+$");
        Matcher coincidencia = patron.matcher(txt);
        
        return coincidencia.matches();
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
        tfDni = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfDomicilio = new javax.swing.JTextField();
        tfCorreo = new javax.swing.JTextField();
        tfCelular = new javax.swing.JTextField();
        bGuardar = new javax.swing.JButton();
        bNuevo = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        bBuscar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        jLabel1.setText("Gestion Huésped.");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel3.setText("Documento:");

        jLabel4.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel4.setText("Domicilio:");

        jLabel5.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel5.setText("Correo:");

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel6.setText("Celular:");

        bGuardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });

        bNuevo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bNuevo.setText("Limpiar");
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });

        bEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        bSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        bBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(487, 487, 487)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(bBuscar))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(bGuardar)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bNuevo)
                                        .addGap(85, 85, 85)
                                        .addComponent(bEliminar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bSalir))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEliminar)
                    .addComponent(bNuevo)
                    .addComponent(bGuardar)
                    .addComponent(bSalir))
                .addGap(163, 163, 163))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        try{
        Integer dni= Integer.parseInt(tfDni.getText());
        huespedActual=hd.buscarHuesped(dni);
            if (huespedActual!=null) {
                tfNombre.setText(huespedActual.getNombre());
                tfDomicilio.setText(huespedActual.getDomicilio());
                tfCorreo.setText(huespedActual.getCorreo());
                tfCelular.setText(Integer.toString(huespedActual.getCelular()));
            }else{
                JOptionPane.showMessageDialog(this, "El huesped no se encuentra registrado.");
                limpiarCampos();
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero o caracter valido");
        }
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        limpiarCampos();
        huespedActual=null;
    }//GEN-LAST:event_bNuevoActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        try{
        Integer dni= Integer.parseInt(tfDni.getText());
        String nombre="";
        if (validarTxt(tfNombre.getText())) {
            nombre=tfNombre.getText();
        } else {
            JOptionPane.showMessageDialog(null,"El texto no es válido, contiene números o caracteres especiales.");
            return;
        }
        
        String domicilio=tfDomicilio.getText();
        String correo=tfCorreo.getText();
            if (nombre.isEmpty()||domicilio.isEmpty()||correo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No puede haber campos vacios.");
                return;
            }
        Integer celu= Integer.parseInt(tfCelular.getText());
            if (huespedActual== null) {
                huespedActual= new Huesped(dni, nombre, domicilio, correo, celu);
                hd.agregarHuesped(huespedActual);
            }else{
                huespedActual.setDni(dni);
                huespedActual.setNombre(nombre);
                huespedActual.setDomicilio(domicilio);
                huespedActual.setCorreo(correo);
                huespedActual.setCelular(celu);
                hd.modificarHuesped(huespedActual);
            }
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero valido");
        }
    }//GEN-LAST:event_bGuardarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        if (huespedActual!=null) {
            hd.eliminarHuesped(huespedActual.getDni());
            huespedActual=null;
            limpiarCampos();
        }else{
            JOptionPane.showMessageDialog(this, "No hay un huesped seleccionado");
        }
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    private void limpiarCampos(){
        tfDni.setText("");
        tfNombre.setText("");
        tfDomicilio.setText("");
        tfCorreo.setText("");
        tfCelular.setText("");
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
    private javax.swing.JTextField tfCelular;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfDomicilio;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables

}
