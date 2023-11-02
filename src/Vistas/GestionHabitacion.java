package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import AccesoDatos.HabitacionData;
import AccesoDatos.TipoHabitacionData;
import Entidades.Habitacion;
import Entidades.TipoHabitacion;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GestionHabitacion extends javax.swing.JInternalFrame {
    private List<Habitacion> listaH;
    private List<TipoHabitacion> listaTH;
    private HabitacionData hd= new HabitacionData();
    private Habitacion habitacionActual=null;
    private TipoHabitacion th=null;
    private TipoHabitacionData thd=new TipoHabitacionData();
    private DefaultTableModel modelo;

    public GestionHabitacion() {
        initComponents();
        listaH= hd.listarHabitacion();
        modelo=new DefaultTableModel();
        cargaTH();
        armarCabeceraTabla();
        cargarData();
    }
    
    private void cargaTH(){
        listaTH= thd.listarTipoHabitacion();
        for(TipoHabitacion th:listaTH){
            cbTH.addItem(th.toString());
        }
    }
    
    private void cargarData(){
        listaH =hd.listarHabitacion();
        for(Habitacion h:listaH){
            int est=(h.isEstado()) ? 1 : 0;
            modelo.addRow(new Object[]{h.getNroHabitacion(),h.getTipoHabitacion(),est});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono=new ImageIcon(getClass().getResource("/Recursos/GestionHab.jpg"));
        Image iMenu=icono.getImage();
        escritorioH = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(iMenu,0,0,getWidth(),getHeight(),this);
            }
        };
        escritorioH.setPreferredSize(new java.awt.Dimension(1280, 720));
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNroHabitacion = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        bGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbTH = new javax.swing.JComboBox<>();
        bNuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tHabitacion = new javax.swing.JTable();
        bEliminar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        jrEstado = new javax.swing.JRadioButton();
        jEstado = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        jLabel1.setText("Gestion habitacion.");

        jLabel2.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Numero de Habitacion:");

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

        jLabel3.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo de Habitacion:");

        bNuevo.setText("Limpiar");
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });

        tHabitacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tHabitacion);

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

        jrEstado.setText("Ocupado/Desocupado");

        jEstado.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jEstado.setText("Estado:");

        escritorioH.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(tfNroHabitacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(bBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(bGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(cbTH, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(bNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(bEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(bSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(jrEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioH.setLayer(jEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioHLayout = new javax.swing.GroupLayout(escritorioH);
        escritorioH.setLayout(escritorioHLayout);
        escritorioHLayout.setHorizontalGroup(
            escritorioHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioHLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(497, 497, 497))
            .addGroup(escritorioHLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(escritorioHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioHLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(78, Short.MAX_VALUE))
                    .addGroup(escritorioHLayout.createSequentialGroup()
                        .addGroup(escritorioHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(escritorioHLayout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrEstado)
                                .addGap(51, 51, 51)
                                .addComponent(bGuardar)
                                .addGap(72, 72, 72)
                                .addComponent(bNuevo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(escritorioHLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfNroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bBuscar)
                                .addGap(84, 84, 84)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(escritorioHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioHLayout.createSequentialGroup()
                                .addComponent(bEliminar)
                                .addGap(62, 62, 62)
                                .addComponent(bSalir))
                            .addGroup(escritorioHLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(cbTH, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(145, 145, 145))))
        );
        escritorioHLayout.setVerticalGroup(
            escritorioHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioHLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(escritorioHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar)
                    .addComponent(tfNroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(escritorioHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEstado)
                    .addComponent(jrEstado)
                    .addComponent(bGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bNuevo)
                    .addComponent(bEliminar)
                    .addComponent(bSalir))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorioH))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorioH))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    private void armarCabeceraTabla() {
        ArrayList<Object> filacabecera = new ArrayList<>();
        filacabecera.add("Nro. de Habitacion");
        filacabecera.add("Tipo de Habitacion");
        filacabecera.add("Estado");
        for (Object it : filacabecera) {
            modelo.addColumn(it);
        }
        tHabitacion.setModel(modelo);
    }
    private void borrarFilaTabla(){
        int indice = modelo.getRowCount() -1;
        
        for(int i = indice;i>=0;i--){
             modelo.removeRow(i);
        }
    }
    
    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        try{
        Integer nro= Integer.valueOf(tfNroHabitacion.getText());
        String th= cbTH.getSelectedItem().toString();
        habitacionActual= hd.buscarHabitacion(nro);
            if (cbTH.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Debe ingresar una opcion de tipo habitacion.");
            }
            if (habitacionActual==null) {
                habitacionActual= new Habitacion(nro,th,jrEstado.isSelected());
                hd.agregarHabitacion(habitacionActual);
                borrarFilaTabla();
                cargarData();
            }else{
                habitacionActual.setTipoHabitacion(th);
                habitacionActual.setEstado(jrEstado.isSelected());
                hd.modificarH(habitacionActual);
                borrarFilaTabla();
                cargarData();
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
        int nro= Integer.parseInt(tfNroHabitacion.getText());
        habitacionActual= hd.buscarHabitacion(nro);
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
        Habitacion habitacionActuall= hd.buscarHabitacion(nro);
            if (habitacionActuall!=null) {
                cbTH.setSelectedItem(habitacionActuall.getTipoHabitacion());
                if(habitacionActuall.isEstado()==true){
                    jrEstado.setSelected(true);
                    borrarFilaTabla();
                    cargarData();
                } else {
                    jrEstado.setSelected(false);
                    borrarFilaTabla();
                    cargarData();
                }
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero valido");
            limpiarCampos();
        }
    }//GEN-LAST:event_bBuscarActionPerformed
    private void limpiarCampos(){
        tfNroHabitacion.setText("");
        cbTH.setSelectedIndex(0);
        borrarFilaTabla();
        cargarData();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bNuevo;
    private javax.swing.JButton bSalir;
    private javax.swing.JComboBox<String> cbTH;
    private javax.swing.JDesktopPane escritorioH;
    private javax.swing.JLabel jEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTable tHabitacion;
    private javax.swing.JTextField tfNroHabitacion;
    // End of variables declaration//GEN-END:variables
}
