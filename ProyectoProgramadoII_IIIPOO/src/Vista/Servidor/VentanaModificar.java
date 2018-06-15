/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Servidor;

import Clases.Platillo;
import Clases.TipoPlatillo;
import Clases.imgHandler;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author retr0
 */
public class VentanaModificar extends javax.swing.JFrame {

    public Platillo platillo;
    private File Archivo;
    private byte[] bytesIMG;
    private imgHandler gestion=new imgHandler();
    private javax.swing.JFileChooser selected = new javax.swing.JFileChooser();
    public VentanaCatalogo dad;
    

    public Platillo getPlatillo() {
        return platillo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txfNombre = new javax.swing.JTextField();
        txfDescripcion = new javax.swing.JTextField();
        txtTipoPorcion = new javax.swing.JTextField();
        txfCaloriasPorcion = new javax.swing.JTextField();
        txfPrecio = new javax.swing.JTextField();
        btnAplicar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        togleHabilitado = new javax.swing.JToggleButton();
        btnVerImagen = new javax.swing.JButton();
        btnCambiarImg = new javax.swing.JButton();
        lblCantPorcion = new javax.swing.JLabel();
        lblCalUnid = new javax.swing.JLabel();
        txtUnidXporc = new javax.swing.JTextField();
        txtKcalPorc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Nombre:");

        jLabel3.setText("Descripción:");

        jLabel4.setText("Tipo de porción:");

        jLabel5.setText("Calorías por porción:");

        jLabel7.setText("Precio:");

        txfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreActionPerformed(evt);
            }
        });

        btnAplicar.setText("Aplicar");
        btnAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        togleHabilitado.setText("Habilitado");
        togleHabilitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togleHabilitadoActionPerformed(evt);
            }
        });

        btnVerImagen.setText("Ver Imagen");
        btnVerImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerImagenActionPerformed(evt);
            }
        });

        btnCambiarImg.setText("CambiarImagen");
        btnCambiarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarImgActionPerformed(evt);
            }
        });

        txtUnidXporc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidXporcActionPerformed(evt);
            }
        });

        txtKcalPorc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKcalPorcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(togleHabilitado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerImagen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCambiarImg))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCalUnid)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnAplicar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addComponent(lblCantPorcion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                        .addComponent(txfDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                        .addComponent(txtTipoPorcion, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                        .addComponent(txfCaloriasPorcion, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                                    .addComponent(txfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUnidXporc, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKcalPorc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTipoPorcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txfCaloriasPorcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUnidXporc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantPorcion))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCalUnid)
                    .addComponent(txtKcalPorc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(togleHabilitado)
                    .addComponent(btnVerImagen)
                    .addComponent(btnCambiarImg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAplicar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        dad.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarActionPerformed
        platillo.setCalorias(Integer.parseInt(txfCaloriasPorcion.getText()));
        platillo.setDescripcion(txfDescripcion.getText());
        platillo.setNombre(txfNombre.getText());
        platillo.setPrecio(Double.parseDouble(txfPrecio.getText()));
        platillo.setTipoPorcion(txtTipoPorcion.getText());
        platillo.setHabilitado(togleHabilitado.isSelected());
        platillo.setGramosPorPorcion(Double.valueOf(txtUnidXporc.getText()));
        platillo.setKilokcalPorGramo(Double.valueOf(txtKcalPorc.getText()));
        JOptionPane.showMessageDialog(this, "Cambios guardados exitosamente");
        this.setVisible(false);
        dad.setVisible();
        dispose();
        
    }//GEN-LAST:event_btnAplicarActionPerformed

    
    private void togleHabilitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togleHabilitadoActionPerformed
        
    }//GEN-LAST:event_togleHabilitadoActionPerformed

    private void btnVerImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerImagenActionPerformed
        javax.swing.JLabel img= new javax.swing.JLabel();
        img.setText("");
        img.setLocation(0, 0);
        img.setIcon(new ImageIcon(platillo.getImagen()));
        img.setVisible(true);
    }//GEN-LAST:event_btnVerImagenActionPerformed

    private void btnCambiarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarImgActionPerformed
        if(selected.showDialog(this, "Abrir Archivo")== JFileChooser.APPROVE_OPTION){
            Archivo= selected.getSelectedFile();
            if(Archivo.canRead()){
                if(Archivo.getName().endsWith(".jpg")||Archivo.getName().endsWith(".gif")||Archivo.getName().endsWith(".png")){
                    bytesIMG = gestion.AbrirIMG(Archivo);
                    platillo.setImagen(bytesIMG);
                }else{
                    JOptionPane.showMessageDialog(null, "Selecione un archivo valido");
                }
            }
        }
    }//GEN-LAST:event_btnCambiarImgActionPerformed

    private void txfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreActionPerformed

    private void txtUnidXporcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidXporcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidXporcActionPerformed

    private void txtKcalPorcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKcalPorcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKcalPorcActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicar;
    private javax.swing.JButton btnCambiarImg;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnVerImagen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblCalUnid;
    private javax.swing.JLabel lblCantPorcion;
    private javax.swing.JToggleButton togleHabilitado;
    private javax.swing.JTextField txfCaloriasPorcion;
    private javax.swing.JTextField txfDescripcion;
    private javax.swing.JTextField txfNombre;
    private javax.swing.JTextField txfPrecio;
    private javax.swing.JTextField txtKcalPorc;
    private javax.swing.JTextField txtTipoPorcion;
    private javax.swing.JTextField txtUnidXporc;
    // End of variables declaration//GEN-END:variables


    public VentanaModificar(Platillo platillo, VentanaCatalogo cat) {//se le pasa los datos del platillo que va a modificar
        this.platillo=platillo;
        initComponents();
        togleHabilitado.setSelected(platillo.getHabilitado());
        txfCaloriasPorcion.setText(String.valueOf(platillo.getCalorias()));
        txfDescripcion.setText(platillo.getDescripcion());
        txfNombre.setText(platillo.getNombre());
        txfPrecio.setText(String.valueOf(platillo.getPrecio()));
        txtTipoPorcion.setText(platillo.getTipoPorcion());
        txtKcalPorc.setText(String.valueOf(platillo.getKilokcalPorGramo()));
        txtUnidXporc.setText(String.valueOf(platillo.getGramosPorPorcion()));
        if(platillo.getTipoPlatillo().equals(TipoPlatillo.BEB)){
            lblCalUnid.setText("Calorias por miniLitros");
            lblCantPorcion.setText("MiniLitros por porcion");
        }else{
            lblCalUnid.setText("Calorias por gramos");
            lblCantPorcion.setText("Gramos por porcion");
        }
        dad=cat;
    }


}
