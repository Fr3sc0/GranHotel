package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import Entidades.TipoHabitacion;
import AccesoDatos.TipoHabitacionData;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GestionTipoHabitacion extends javax.swing.JInternalFrame {
    private TipoHabitacionData thd= new TipoHabitacionData();
    private TipoHabitacion tipoHActual=null;
    private List<TipoHabitacion> listaTH;
    private DefaultTableModel modelo;

    public GestionTipoHabitacion() {
        initComponents();
        modelo=new DefaultTableModel();
        listaTH=thd.listarTipoHabitacion();
        
        armarCabeceraTabla();
        cargarData();
    }
    
    private void cargarData(){
        listaTH =thd.listarTipoHabitacion();
        for(TipoHabitacion th:listaTH){
            modelo.addRow(new Object[]{th.getCodigo(),th.getCantPersonas(),th.getCantCamas(),th.getTipoCama(),th.getPrecioNoche()});
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono=new ImageIcon(getClass().getResource("/Recursos/GestionTipoH.jpg"));
        Image iMenu=icono.getImage();
        escritorioTH = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(iMenu,0,0,getWidth(),getHeight(),this);
            }
        };
        escritorioTH.setPreferredSize(new java.awt.Dimension(1280, 720));
        jScrollPane1 = new javax.swing.JScrollPane();
        tTH = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        tfTipoCama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfPrecioN = new javax.swing.JTextField();
        bGuardar = new javax.swing.JButton();
        bNuevo = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbCantP = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbCantC = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

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

        jLabel5.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel5.setText("Tipo de cama:");

        jLabel6.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel6.setText("Precio por noche:");

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

        jLabel2.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel2.setText("Codigo:");

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel3.setText("Cant. Personas:");

        cbCantP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoja una cant. de personas", "1", "2", "3", "4", "5", "6", "7", "8" }));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel4.setText("Cant. de Camas:");

        cbCantC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoja una cant. de camas", "1", "2", "3", "4", "5", "6", " ", " ", " " }));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel1.setText("Gestion Tipo de Habitacion.");

        escritorioTH.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioTH.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioTH.setLayer(tfTipoCama, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioTH.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioTH.setLayer(tfPrecioN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioTH.setLayer(bGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioTH.setLayer(bNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioTH.setLayer(bEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioTH.setLayer(bSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioTH.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioTH.setLayer(tfCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioTH.setLayer(bBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioTH.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioTH.setLayer(cbCantP, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioTH.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioTH.setLayer(cbCantC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioTH.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioTHLayout = new javax.swing.GroupLayout(escritorioTH);
        escritorioTH.setLayout(escritorioTHLayout);
        escritorioTHLayout.setHorizontalGroup(
            escritorioTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioTHLayout.createSequentialGroup()
                .addGroup(escritorioTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioTHLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(escritorioTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioTHLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bBuscar))
                            .addGroup(escritorioTHLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfTipoCama, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(escritorioTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioTHLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(escritorioTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(escritorioTHLayout.createSequentialGroup()
                                        .addGap(328, 328, 328)
                                        .addComponent(jLabel4))
                                    .addGroup(escritorioTHLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbCantP, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(38, 38, 38)
                                .addComponent(cbCantC, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(escritorioTHLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfPrecioN, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bGuardar)
                                .addGap(27, 27, 27)
                                .addComponent(bNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(bEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(bSalir))))
                    .addGroup(escritorioTHLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(escritorioTHLayout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        escritorioTHLayout.setVerticalGroup(
            escritorioTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioTHLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(escritorioTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar)
                    .addComponent(jLabel3)
                    .addComponent(cbCantP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbCantC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(escritorioTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfTipoCama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tfPrecioN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGuardar)
                    .addComponent(bNuevo)
                    .addComponent(bEliminar)
                    .addComponent(bSalir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorioTH, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorioTH, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void armarCabeceraTabla() {
        ArrayList<Object> filacabecera = new ArrayList<>();
        filacabecera.add("Codigo");
        filacabecera.add("Cant. Personas");
        filacabecera.add("Cant. Camas");
        filacabecera.add("Tipo cama");
        filacabecera.add("Precio Noche"); 
        for (Object it : filacabecera) {
            modelo.addColumn(it);
        }
        tTH.setModel(modelo);
    }
    private void borrarFilaTabla(){
        int indice = modelo.getRowCount() -1;
        
        for(int i = indice;i>=0;i--){
             modelo.removeRow(i);
        }
    }
    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        try{
        String code= tfCodigo.getText();
        tipoHActual=thd.buscarTH(code);
        if (tipoHActual!=null) {
            cbCantP.setSelectedItem(Integer.toString(tipoHActual.getCantPersonas()));
            tfTipoCama.setText(tipoHActual.getTipoCama());
            cbCantC.setSelectedItem(Integer.toString(tipoHActual.getCantCamas()));
            tfPrecioN.setText(String.valueOf(tipoHActual.getPrecioNoche()));
            borrarFilaTabla();
            cargarData();
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
        String tipoCama=tfTipoCama.getText();
        if (cbCantP.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Debe ingresar una opcion de cantidad de personas.");
            }else if(cbCantC.getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(this, "Debe ingresar una opcion de cantidad de camas.");
            }else if (code.isEmpty()||tipoCama.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No puede haber campos vacios.");
            }else{                
                Integer personas=Integer.valueOf(cbCantP.getSelectedItem().toString());               
                Integer cantCamas= Integer.valueOf(cbCantC.getSelectedItem().toString());
                double precioN= Double.parseDouble(tfPrecioN.getText());
                if (tipoHActual==null) {
                tipoHActual=new TipoHabitacion(code,personas, cantCamas,tipoCama, precioN);
                thd.agregarTipoHabitacion(tipoHActual);
                borrarFilaTabla();
                cargarData();
            }else{
                tipoHActual.setCodigo(code);
                tipoHActual.setCantPersonas(personas);
                tipoHActual.setCantCamas(cantCamas);
                tipoHActual.setTipoCama(tipoCama);
                tipoHActual.setPrecioNoche(precioN);
                thd.modificarTh(tipoHActual);
                borrarFilaTabla();
                cargarData();
            }
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
            borrarFilaTabla();
            cargarData();
        }else{
            JOptionPane.showMessageDialog(this, "No hay un tipo de habitacion seleccionada");
        } 
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    private void limpiarCampos(){
        tfCodigo.setText("");
        cbCantP.setSelectedIndex(0);
        tfTipoCama.setText("");
        cbCantC.setSelectedIndex(0);
        tfPrecioN.setText("");
        borrarFilaTabla();
        cargarData();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bNuevo;
    private javax.swing.JButton bSalir;
    private javax.swing.JComboBox<String> cbCantC;
    private javax.swing.JComboBox<String> cbCantP;
    private javax.swing.JDesktopPane escritorioTH;
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
