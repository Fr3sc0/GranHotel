package Vistas;

import AccesoDatos.HabitacionData;
import Entidades.Habitacion;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GestionHabitacion extends javax.swing.JInternalFrame {
    private List<Habitacion> listaH;
    private HabitacionData hd= new HabitacionData();
    private Habitacion habitacionActual=null;
    private DefaultTableModel modelo;

    public GestionHabitacion() {
        initComponents();
        listaH= hd.listarHabitacion();
        modelo=new DefaultTableModel();
        
        armarCabeceraTabla();
        cargarData();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNroHabitacion = new javax.swing.JTextField();
        bNuevo = new javax.swing.JButton();
        bGuardar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        bBuscar = new javax.swing.JButton();
        cbTH = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tHabitacion = new javax.swing.JTable();
        jEstado = new javax.swing.JLabel();
        jrEstado = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        jLabel1.setText("Gestion habitacion.");

        jLabel2.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel2.setText("Numero de Habitacion:");

        jLabel3.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel3.setText("Tipo de Habitacion:");

        bNuevo.setText("Limpiar");
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

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        cbTH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija un tipo de habitacion", "ES", "D", "T", "SL" }));

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

        jEstado.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jEstado.setText("Estado");

        jrEstado.setText("Ocupado/Desocupado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bSalir)
                            .addComponent(bNuevo)
                            .addComponent(bEliminar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(tfNroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(73, 73, 73)
                                .addComponent(jrEstado)
                                .addGap(144, 144, 144)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bGuardar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bBuscar)
                                .addGap(62, 62, 62)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cbTH, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(327, 327, 327))))
            .addGroup(layout.createSequentialGroup()
                .addGap(492, 492, 492)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar)
                    .addComponent(jLabel3)
                    .addComponent(cbTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrEstado))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bNuevo)
                        .addGap(34, 34, 34)
                        .addComponent(bEliminar)
                        .addGap(34, 34, 34)
                        .addComponent(bSalir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(178, Short.MAX_VALUE))
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
            if (cbTH.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Debe ingresar una opcion de tipo habitacion.");
            }
            if (habitacionActual==null) {
                habitacionActual= new Habitacion(nro,th,true);
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
