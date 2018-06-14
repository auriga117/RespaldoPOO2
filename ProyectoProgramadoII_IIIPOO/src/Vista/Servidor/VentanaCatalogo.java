/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Servidor;

import Clases.Platillo;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author retr0
 */
public class VentanaCatalogo extends javax.swing.JFrame {

    public ArrayList<Platillo> platillos;
    /**
     * Creates new form VentanaCatalogo
     * @param platillos
     */
    public VentanaCatalogo(ArrayList<Platillo> platillos) {
        this.platillos=platillos;
        initComponents();
        if(platillos.isEmpty()){
            lstComidas.add("No existen platillos");
        }else{
            for (Platillo platillosSelec1 : platillos) {
            lstComidas.add(platillosSelec1.toString());
        }
        }
    }

    public ArrayList<Platillo> getPlatillos() {
        return platillos;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxFiltro = new javax.swing.JComboBox<>();
        lstComidas = new java.awt.List();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAnadir = new javax.swing.JButton();
        radioBtnNoBebida = new javax.swing.JRadioButton();
        radioBtnBebida = new javax.swing.JRadioButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cbxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alfabéticamente", "Porción", "Peso" }));

        lstComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstComidasActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAnadir.setText("Añadir");
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });

        radioBtnNoBebida.setText("No Bebida");
        radioBtnNoBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnNoBebidaActionPerformed(evt);
            }
        });

        radioBtnBebida.setText("Bebida");
        radioBtnBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnBebidaActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lstComidas, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAnadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioBtnNoBebida)
                                    .addComponent(radioBtnBebida))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnVolver)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lstComidas, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnadir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBtnNoBebida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioBtnBebida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void lstComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstComidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lstComidasActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String codigoPlatillo=lstComidas.getSelectedItem();
        for(Platillo pl:platillos){
            if(pl.toString().equals(codigoPlatillo)){
                VentanaModificar nueva = new VentanaModificar(pl);
                nueva.setVisible(true);
                while(nueva.isVisible()){//para que espere antes de guardar los cambios
                    try {
                        //esperar
                        this.wait(50);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(VentanaCatalogo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                pl.setCalorias(nueva.getPlatillo().getCalorias());
                pl.setDescripcion(nueva.getPlatillo().getDescripcion());
                pl.setNombre(nueva.getPlatillo().getNombre());
                pl.setPrecio(nueva.getPlatillo().getPrecio());
                pl.setTipoPorcion(nueva.getPlatillo().getTipoPorcion());
                pl.setHabilitado(nueva.getPlatillo().getHabilitado());
                pl.setImagen(nueva.getPlatillo().getImagen());
                //aca ya todos los cambios se guardaron
                nueva.dispose();
                break;
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String cPlatillo= lstComidas.getSelectedItem();
        for(Platillo p:platillos){
            if(p.toString().equals(cPlatillo)){
                platillos.remove(p);
                JOptionPane.showMessageDialog(this, "platillo eliminado exitosamente");
                break;
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
        ArrayList<String> nombres=new ArrayList<>();
        platillos.forEach((p) -> {
            nombres.add(p.getNombre());
        });
        if(radioBtnBebida.isSelected()){
            CreadorBebidas nuevo= new CreadorBebidas(nombres);
            nuevo.setVisible(true);
            while(nuevo.isVisible()){
                //esperar
            }
            if(nuevo.platoValido){
                platillos.add(nuevo.getPlatillo());
            }
        }else if(radioBtnNoBebida.isSelected()){
            CreadorNoBebidas nuevo= new CreadorNoBebidas(nombres);
            nuevo.setVisible(true);
            while(nuevo.isVisible()){
                //esperar
            }
            if(nuevo.platoValido){
                platillos.add(nuevo.getPlatillo());
            }
        }
    }//GEN-LAST:event_btnAnadirActionPerformed

    private void radioBtnNoBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnNoBebidaActionPerformed
       radioBtnBebida.setSelected(false);
       radioBtnNoBebida.setSelected(true);
    }//GEN-LAST:event_radioBtnNoBebidaActionPerformed

    private void radioBtnBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnBebidaActionPerformed
       radioBtnBebida.setSelected(true);
       radioBtnNoBebida.setSelected(false);
    }//GEN-LAST:event_radioBtnBebidaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxFiltro;
    private java.awt.List lstComidas;
    private javax.swing.JRadioButton radioBtnBebida;
    private javax.swing.JRadioButton radioBtnNoBebida;
    // End of variables declaration//GEN-END:variables
}
