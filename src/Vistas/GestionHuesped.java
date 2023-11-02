package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
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

        ImageIcon icono=new ImageIcon(getClass().getResource("/Recursos/GestionH.jpg"));
        Image iMenu=icono.getImage();
        escritorioH = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(iMenu,0,0,getWidth(),getHeight(),this);
            }
        };
        escritorioH.setPreferredSize(new java.awt.Dimension(1280, 720));
        bGuardar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        bNuevo = new javax.swing.JButton();
        tfCelular = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfCorreo = new javax.swing.JTextField();
        tfDomicilio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfDni = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        bGuardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
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

        bNuevo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bNuevo.setText("Limpiar");
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel6.setText("Celular:");

        jLabel5.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel5.setText("Correo:");

        jLabel4.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel4.setText("Domicilio:");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        bBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Small", 3, 24)); // NOI18N
        jLabel1.setText("Gestion Huésped.");

        jLabel3.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel3.setText("Documento:");

        escritorioH.setLayer(bGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(bEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(bSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(bNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(tfCelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(tfCorreo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(tfDomicilio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(tfNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(tfDni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(bBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioHLayout = new javax.swing.GroupLayout(escritorioH);
        escritorioH.setLayout(escritorioHLayout);
        escritorioHLayout.setHorizontalGroup(
            escritorioHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioHLayout.createSequentialGroup()
                .addGroup(escritorioHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioHLayout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(bBuscar))
                    .addGroup(escritorioHLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(bGuardar)
                        .addGap(132, 132, 132)
                        .addComponent(bNuevo)
                        .addGap(180, 180, 180)
                        .addComponent(bEliminar)
                        .addGap(173, 173, 173)
                        .addComponent(bSalir)))
                .addContainerGap(182, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioHLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(504, 504, 504))
            .addGroup(escritorioHLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(escritorioHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addGroup(escritorioHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addComponent(tfDomicilio))
                .addGroup(escritorioHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioHLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(escritorioHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioHLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(escritorioHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6))
                        .addGap(56, 56, 56))
                    .addGroup(escritorioHLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        escritorioHLayout.setVerticalGroup(
            escritorioHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioHLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(escritorioHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar))
                .addGap(65, 65, 65)
                .addGroup(escritorioHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addGroup(escritorioHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(escritorioHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioHLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(bGuardar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioHLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(escritorioHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bNuevo)
                            .addComponent(bEliminar)
                            .addComponent(bSalir))))
                .addGap(180, 180, 180))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorioH)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorioH))
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
    private javax.swing.JDesktopPane escritorioH;
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
