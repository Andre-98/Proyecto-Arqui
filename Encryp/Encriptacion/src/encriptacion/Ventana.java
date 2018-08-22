/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptacion;

import static com.sun.webkit.perf.WCFontPerfLogger.reset;

/**
 *
 * @author JoelSVM
 */
public class Ventana extends javax.swing.JFrame {
    
    Datos data= new Datos();

    public Ventana() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LEncriptado = new javax.swing.JLabel();
        LEDesencriptado = new javax.swing.JLabel();
        BEncriptar = new javax.swing.JButton();
        BDesencriptar = new javax.swing.JButton();
        TextIngresar = new javax.swing.JTextField();
        LTexto = new javax.swing.JLabel();
        BIngresar = new javax.swing.JButton();
        jTxtCampo1 = new javax.swing.JTextField();
        jTxtCampo2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        TimeE = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TimeD = new javax.swing.JTextField();
        Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LEncriptado.setText("Texto Encriptado");

        LEDesencriptado.setText("Texto Desencriptado");

        BEncriptar.setText("Encriptar");
        BEncriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEncriptarActionPerformed(evt);
            }
        });

        BDesencriptar.setText("Desencriptar");
        BDesencriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDesencriptarActionPerformed(evt);
            }
        });

        TextIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIngresarActionPerformed(evt);
            }
        });

        LTexto.setText("Ingresar la Direccion del Archivo Texto");

        BIngresar.setText("Ingresar");
        BIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIngresarActionPerformed(evt);
            }
        });

        jTxtCampo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCampo1ActionPerformed(evt);
            }
        });

        jTxtCampo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCampo2ActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Tiempo de Encripcion");

        jLabel2.setText("Tiempo de Desencripcion");

        Reset.setText("RESET");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jTxtCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Reset)
                .addGap(39, 39, 39)
                .addComponent(jTxtCampo2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(LEncriptado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LEDesencriptado)
                .addGap(165, 165, 165))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(BEncriptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BDesencriptar)
                .addGap(128, 128, 128))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(TextIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(LTexto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(443, 443, 443)
                        .addComponent(BIngresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(TimeE, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(329, 329, 329)
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(TimeD, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BIngresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LEDesencriptado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LEncriptado))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtCampo2, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                            .addComponent(jTxtCampo1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TimeE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(TimeD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BDesencriptar)
                    .addComponent(BEncriptar))
                .addGap(91, 91, 91)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BEncriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEncriptarActionPerformed
        jTxtCampo1.setEditable(false);
        jTxtCampo1.setText(""+data.Encriptar());
        TimeE.setEditable(false);
        TimeE.setText(""+data.difE+"S");
    }//GEN-LAST:event_BEncriptarActionPerformed

    private void TextIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIngresarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TextIngresarActionPerformed

    private void BDesencriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDesencriptarActionPerformed
        // TODO add your handling code here:
         jTxtCampo2.setEditable(false);
         jTxtCampo2.setText(""+data.Desencriptar());
         TimeD.setEditable(false);
         TimeD.setText(""+data.difD+"S");
    }//GEN-LAST:event_BDesencriptarActionPerformed

    private void BIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIngresarActionPerformed
        // TODO add your handling code here:
       String direccion="";
        data.leerTxt(direccion);
        
    }//GEN-LAST:event_BIngresarActionPerformed

    private void jTxtCampo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCampo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCampo1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTxtCampo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCampo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCampo2ActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        jTxtCampo1.setText("");
        jTxtCampo2.setText("");
        TimeD.setText("0");
        TimeE.setText("0");
        
    }//GEN-LAST:event_ResetActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BDesencriptar;
    private javax.swing.JButton BEncriptar;
    private javax.swing.JButton BIngresar;
    private javax.swing.JLabel LEDesencriptado;
    private javax.swing.JLabel LEncriptado;
    private javax.swing.JLabel LTexto;
    private javax.swing.JButton Reset;
    public static javax.swing.JTextField TextIngresar;
    private javax.swing.JTextField TimeD;
    private javax.swing.JTextField TimeE;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTxtCampo1;
    private javax.swing.JTextField jTxtCampo2;
    // End of variables declaration//GEN-END:variables
}
