package Vistas;

import AccesoDatos.*;
import Entidades.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionReserva extends javax.swing.JInternalFrame {

    private List<Huesped> listaHues;
    private List<Habitacion> listaHab;
    private List<Reserva> listaRes;
    private ReservaData rd;
    private Reserva reservaActual = null;
    private HuespedData hd;
    private HabitacionData habD;
    private TipoHabitacionData thd;
    private DefaultTableModel modelo;
    private DefaultComboBoxModel<Habitacion> cbm = new DefaultComboBoxModel<>();

    public GestionReserva() {
        initComponents();
        hd = new HuespedData();
        habD = new HabitacionData();
        rd = new ReservaData();
        thd = new TipoHabitacionData();
        listaHues = hd.listarHuesped();
        listaHab = habD.listarHabitacion();
        listaRes = rd.listarRes();
        modelo = new DefaultTableModel();
        tReserva.setDefaultEditor(Object.class, null);
        cbTH.setModel(cbm);
        cargaHabi();
        armarCabeceraTabla();
        cargarData();
    }

    private void cargaHabi() {
        cbTH.removeAllItems();
        listaHab = habD.listarHabitacion();
        for (Habitacion h : listaHab) {
            if (!h.isEstado()) {
                cbTH.addItem(h);
            }
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filacabecera = new ArrayList<>();
        filacabecera.add("Dni.");
        filacabecera.add("Nombre");
        filacabecera.add("Habitacion");
        filacabecera.add("TipoHabitacion");
        filacabecera.add("Cant. Personas");
        filacabecera.add("Fecha Entrada");
        filacabecera.add("Fecha Salida");
        for (Object it : filacabecera) {
            modelo.addColumn(it);
        }

        tReserva.setModel(modelo);
    }

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void cargarData() {
        listaRes = rd.listarRes();
        for (Reserva r : listaRes) {
            Huesped h = hd.buscarHuesped(r.getHuesped());
            modelo.addRow(new Object[]{r.getHuesped(), h.getNombre(), r.getHabi().getNroHabitacion(), r.getHabi().getTipoHabitacion(), r.getCantPersonas(), r.getFechaEntrada(), r.getFechaSalida()});
        }
    }

    private void limpiarCampos() {
        tDocumento.setText("");
        dFechaE.setDate(null);
        dFechaS.setDate(null);
        cbCantP.setSelectedIndex(0);
        cbTH.setSelectedIndex(0);
        tIT.setText("");
        borrarFilaTabla();
        cargarData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tReserva = new javax.swing.JTable();
        bNuevo = new javax.swing.JButton();
        bFin = new javax.swing.JButton();
        dFechaE = new com.toedter.calendar.JDateChooser();
        dFechaS = new com.toedter.calendar.JDateChooser();
        cbCantP = new javax.swing.JComboBox<>();
        cbTH = new javax.swing.JComboBox<>();
        bBuscar = new javax.swing.JButton();
        bGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tDocumento = new javax.swing.JTextField();
        bSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tIT = new javax.swing.JTextField();
        bSelec = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        jLabel1.setText("Reserva.");

        jLabel4.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad de personas:");

        jLabel5.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel5.setText("Fecha de Entrada");

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel6.setText("Fecha de Salida");

        jLabel7.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel7.setText("Habitación:");

        tReserva.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tReserva);

        bNuevo.setText("Limpiar");
        bNuevo.setPreferredSize(new java.awt.Dimension(100, 30));
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });

        bFin.setText("Fin Reserva");
        bFin.setPreferredSize(new java.awt.Dimension(100, 30));
        bFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFinActionPerformed(evt);
            }
        });

        dFechaE.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dFechaEPropertyChange(evt);
            }
        });

        dFechaS.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dFechaSPropertyChange(evt);
            }
        });

        cbCantP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingrese una Cant.", "1", "2", "3", "4", "5", "6", "7", "8" }));

        cbTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTHActionPerformed(evt);
            }
        });

        bBuscar.setText("Buscar");
        bBuscar.setPreferredSize(new java.awt.Dimension(75, 30));
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        bGuardar.setText("Guardar");
        bGuardar.setPreferredSize(new java.awt.Dimension(100, 30));
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel2.setText("Documento:");

        tDocumento.setPreferredSize(new java.awt.Dimension(75, 30));

        bSalir.setText("Salir");
        bSalir.setPreferredSize(new java.awt.Dimension(100, 30));
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel3.setText("Importe Total:");

        tIT.setEditable(false);
        tIT.setPreferredSize(new java.awt.Dimension(75, 30));

        bSelec.setText("Seleccionar");
        bSelec.setPreferredSize(new java.awt.Dimension(100, 30));
        bSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSelecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(cbCantP, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(cbTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(tIT, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(564, 564, 564)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(169, 169, 169)
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(tDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(dFechaE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(dFechaS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175)
                                .addComponent(bFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(bSelec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175)
                                .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(180, 180, 180))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(tDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(dFechaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dFechaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCantP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(tIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bSelec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        limpiarCampos();
        reservaActual = null;
        cargaHabi();
    }//GEN-LAST:event_bNuevoActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        if (tDocumento.getText().isEmpty() && dFechaE.getDate() != null) {
            Instant ins = dFechaE.getDate().toInstant();
            LocalDate lc = ins.atZone(ZoneId.systemDefault()).toLocalDate();
            borrarFilaTabla();
            listaRes = rd.listarRes();
            for (Reserva r : listaRes) {
                Huesped h = hd.buscarHuesped(r.getHuesped());
                if (lc.equals(r.getFechaEntrada())) {
                    modelo.addRow(new Object[]{r.getHuesped(), h.getNombre(), r.getHabi().getNroHabitacion(), r.getHabi().getTipoHabitacion(), r.getCantPersonas(), r.getFechaEntrada(), r.getFechaSalida()});
                }
            }
            if (modelo.getRowCount() == 0) {
                cargarData();
                JOptionPane.showMessageDialog(null, "No se encuentran reservas en la fecha seleccionada.");
            }
        } else {
            try {
                int dni = Integer.parseInt(tDocumento.getText());
                reservaActual = rd.buscarReservaHuesped(dni);
                if (reservaActual != null) {
                    borrarFilaTabla();
                    listaRes = rd.listarRes();
                    for (Reserva r : listaRes) {
                        Huesped h = hd.buscarHuesped(r.getHuesped());
                        if (dni == r.getHuesped()) {
                            modelo.addRow(new Object[]{r.getHuesped(), h.getNombre(), r.getHabi().getNroHabitacion(), r.getHabi().getTipoHabitacion(), r.getCantPersonas(), r.getFechaEntrada(), r.getFechaSalida()});
                        }
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Debe ingresar un caracter valido");
            }
        }
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        try {
            int dni = Integer.parseInt(tDocumento.getText());
            Habitacion cth = (Habitacion) cbTH.getSelectedItem();
            int cp = Integer.parseInt(cbCantP.getSelectedItem().toString());
            Date fechaE = dFechaE.getDate();
            LocalDate fE = fechaE.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Date fechaS = dFechaS.getDate();
            LocalDate fS = fechaS.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            double impT = Double.parseDouble(tIT.getText());
            if (fE.isAfter(fS)) {
                JOptionPane.showMessageDialog(null, "Error al seleccionar la estadia");
            } else if (reservaActual == null) {
                reservaActual = new Reserva(dni, cth, cp, fE, fS, impT, true);
                rd.crearReserva(reservaActual);
                if (!cth.isEstado()) {
                    habD.actEst(cth);
                }
                borrarFilaTabla();
                cargarData();
                cargaHabi();
            } else {
                reservaActual.setHuesped(dni);
                reservaActual.setHabi(cth);
                reservaActual.setCantPersonas(cp);
                reservaActual.setFechaEntrada(fE);
                reservaActual.setFechaSalida(fS);
                reservaActual.setImporteTotal(impT);
                rd.modificarReserva(reservaActual);
                borrarFilaTabla();
                cargarData();
                cargaHabi();
            }
            reservaActual = null;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero valido");
        }
    }//GEN-LAST:event_bGuardarActionPerformed

    private void bFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFinActionPerformed
        if (reservaActual != null) {
            //habD.actEst(reservaActual.getHabi());
            //rd.cancelarReserva(reservaActual.getHuesped());
            rd.finReserva(reservaActual.getHuesped(), reservaActual.getFechaEntrada(), reservaActual.getHabi().getNroHabitacion());
            reservaActual = null;
            limpiarCampos();
            borrarFilaTabla();
            cargarData();
        } else {
            JOptionPane.showMessageDialog(this, "No hay una reserva seleccionada.");
        }
    }//GEN-LAST:event_bFinActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    private void cbTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTHActionPerformed
        // TODO add your handling code here:
        if (cbTH.equals(null)) {
            Habitacion cth = (Habitacion) cbTH.getSelectedItem();
            Habitacion h = habD.buscarHabitacion(cth.getNroHabitacion());
            TipoHabitacion th = thd.buscarTH(h.getTipoHabitacion());
            if (dFechaE.getDate() != null && dFechaS.getDate() != null) {
                LocalDate fe = dFechaE.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate fs = dFechaS.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                if (fe.isBefore(fs)) {
                    tIT.setText(String.valueOf(rd.calcularMontoEstadia(th, fe, fs)));
                }
            } else {
                tIT.setText(String.valueOf(th.getPrecioNoche()));
            }
        }
    }//GEN-LAST:event_cbTHActionPerformed

    private void dFechaEPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dFechaEPropertyChange
        // TODO add your handling code here:
        Habitacion cth = (Habitacion) cbTH.getSelectedItem();
        Habitacion hab = habD.buscarHabitacion(cth.getNroHabitacion());
        TipoHabitacion th = thd.buscarTH(hab.getTipoHabitacion());
        if (dFechaE.getDate() != null && dFechaS.getDate() != null) {
            LocalDate fe = dFechaE.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fs = dFechaS.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            if (fe.isBefore(fs)) {
                tIT.setText(String.valueOf(rd.calcularMontoEstadia(th, fe, fs)));
            }
            LocalDate re;
            LocalDate rs;
            cbTH.removeAllItems();
            listaHab = habD.listarHabitacion();
            listaRes = rd.listarRes();
            List<Integer> aux = new ArrayList();
            for (Reserva r : listaRes) {
                re = r.getFechaEntrada();
                rs = r.getFechaSalida();
                if (!aux.contains(r.getHabi().getNroHabitacion())) {
                    if (rs.isBefore(fe) || re.isAfter(fs)) {
                        cbTH.addItem(r.getHabi());
                        listaHab.remove(r.getHabi());
                        aux.add(r.getHabi().getNroHabitacion());
                    }
                }
            }
            for (Habitacion h : listaHab) {
                if (!h.isEstado()) {
                    cbTH.addItem(h);
                }
            }
        }
    }//GEN-LAST:event_dFechaEPropertyChange

    private void dFechaSPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dFechaSPropertyChange
        // TODO add your handling code here:
        Habitacion cth = (Habitacion) cbTH.getSelectedItem();
        Habitacion hab = habD.buscarHabitacion(cth.getNroHabitacion());
        TipoHabitacion th = thd.buscarTH(hab.getTipoHabitacion());
        if (dFechaE.getDate() != null && dFechaS.getDate() != null) {
            LocalDate fe = dFechaE.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fs = dFechaS.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            if (fe.isBefore(fs)) {
                tIT.setText(String.valueOf(rd.calcularMontoEstadia(th, fe, fs)));
            }
            LocalDate re;
            LocalDate rs;
            cbTH.removeAllItems();
            listaHab = habD.listarHabitacion();
            listaRes = rd.listarRes();
            List<Integer> aux = new ArrayList();
            for (Reserva r : listaRes) {
                re = r.getFechaEntrada();
                rs = r.getFechaSalida();
                if (!aux.contains(r.getHabi().getNroHabitacion())) {
                    if (rs.isBefore(fe) || re.isAfter(fs)) {
                        cbTH.addItem(r.getHabi());
                        listaHab.remove(r.getHabi());
                        aux.add(r.getHabi().getNroHabitacion());
                    }
                }
            }
            for (Habitacion h : listaHab) {
                if (!h.isEstado()) {
                    cbTH.addItem(h);
                }
            }
        }
    }//GEN-LAST:event_dFechaSPropertyChange

    private void bSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSelecActionPerformed
        // TODO add your handling code here:
        int i = tReserva.getSelectedRow();
        if (i != -1) {
            
            tDocumento.setText(tReserva.getValueAt(i, 0).toString());
            cbCantP.setSelectedItem(tReserva.getValueAt(i, 4).toString());
            LocalDate lde=(LocalDate) tReserva.getValueAt(i, 5);
            Date de= Date.from(lde.atStartOfDay(ZoneId.systemDefault()).toInstant());
            dFechaE.setDate(de);
            LocalDate lds=(LocalDate) tReserva.getValueAt(i, 6);
            Date ds= Date.from(lds.atStartOfDay(ZoneId.systemDefault()).toInstant());
            dFechaS.setDate(ds);
            Habitacion h= habD.buscarHabitacion(Integer.parseInt(tReserva.getValueAt(i, 2).toString()));
            cbTH.addItem(h);
            cbTH.setSelectedItem(h);
            /*
            int cp=0;
            double impT=Double.parseDouble(tIT.getText());
            reservaActual.setHuesped(Integer.parseInt(tDocumento.getText()));
                reservaActual.setHabi(h);
                reservaActual.setCantPersonas(cp);
                reservaActual.setFechaEntrada(lde);
                reservaActual.setFechaSalida(lds);
                reservaActual.setImporteTotal(impT);
*/
            int dni = Integer.parseInt(tReserva.getValueAt(i, 0).toString());
            reservaActual = rd.busquedaReservasDyF(dni, lde);
        } else {
            JOptionPane.showMessageDialog(null, "Ninguna fila seleccionada.");
        }


    }//GEN-LAST:event_bSelecActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bFin;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bNuevo;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton bSelec;
    private javax.swing.JComboBox<String> cbCantP;
    private javax.swing.JComboBox<Habitacion> cbTH;
    private com.toedter.calendar.JDateChooser dFechaE;
    private com.toedter.calendar.JDateChooser dFechaS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tDocumento;
    private javax.swing.JTextField tIT;
    private javax.swing.JTable tReserva;
    // End of variables declaration//GEN-END:variables
}
