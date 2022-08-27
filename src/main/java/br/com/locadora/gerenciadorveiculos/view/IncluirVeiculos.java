/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.view;

import br.com.locadora.gerenciadorveiculos.model.Categoria;
import br.com.locadora.gerenciadorveiculos.model.Estado;
import br.com.locadora.gerenciadorveiculos.model.Marca;
import br.com.locadora.gerenciadorveiculos.model.ModeloAutomovel;
import br.com.locadora.gerenciadorveiculos.model.ModeloMotocicleta;
import br.com.locadora.gerenciadorveiculos.model.ModeloVan;
import br.com.locadora.gerenciadorveiculos.model.TipoVeiculo;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author lucfg
 */
public class IncluirVeiculos extends javax.swing.JFrame {

    /**
     * Creates new form IncluirVeiculos
     */
    public IncluirVeiculos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pIncluirVeiculos = new javax.swing.JPanel();
        lEstado = new javax.swing.JLabel();
        lMarca = new javax.swing.JLabel();
        cBEstado = new javax.swing.JComboBox(Estado.values());
        cBMarca = new javax.swing.JComboBox(Marca.values());
        bSalvar = new javax.swing.JButton();
        bVoltar = new javax.swing.JButton();
        lCategoria = new javax.swing.JLabel();
        lModelo = new javax.swing.JLabel();
        cBCategoria = new javax.swing.JComboBox(Categoria.values());
        cBModelo = new javax.swing.JComboBox(ModeloAutomovel.values());
        tFValorCompra = new javax.swing.JFormattedTextField();
        tFPlaca = new javax.swing.JFormattedTextField();
        lValorCompra = new javax.swing.JLabel();
        lPlaca = new javax.swing.JLabel();
        lAno = new javax.swing.JLabel();
        lTipo = new javax.swing.JLabel();
        cBTipo = new javax.swing.JComboBox(TipoVeiculo.values());
        tFAno = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Incluir Veículos");
        setBounds(new java.awt.Rectangle(0, 0, 655, 300));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 655, 300));

        pIncluirVeiculos.setMaximumSize(new java.awt.Dimension(650, 300));

        lEstado.setText("Estado");

        lMarca.setText("Marca");

        cBEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBEstadoActionPerformed(evt);
            }
        });

        cBMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pIncluirVeiculosLayout = new javax.swing.GroupLayout(pIncluirVeiculos);
        pIncluirVeiculos.setLayout(pIncluirVeiculosLayout);
        pIncluirVeiculosLayout.setHorizontalGroup(
            pIncluirVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIncluirVeiculosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pIncluirVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lMarca)
                    .addComponent(cBMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(pIncluirVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lEstado)
                    .addComponent(cBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pIncluirVeiculosLayout.setVerticalGroup(
            pIncluirVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIncluirVeiculosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pIncluirVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEstado)
                    .addComponent(lMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pIncluirVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bSalvar.setText("Salvar");
        bSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarActionPerformed(evt);
            }
        });

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        lCategoria.setText("Categoria");

        lModelo.setText("Modelo");

        cBCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBCategoriaActionPerformed(evt);
            }
        });

        cBModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBModeloActionPerformed(evt);
            }
        });

        try {
            tFValorCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tFPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lValorCompra.setText("Valor de Compra");

        lPlaca.setText("Placa");

        lAno.setText("Ano");

        lTipo.setText("Tipo de Veículo");

        cBTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBTipoActionPerformed(evt);
            }
        });

        try {
            tFAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pIncluirVeiculos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(bVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tFValorCompra)
                            .addComponent(cBCategoria, 0, 281, Short.MAX_VALUE)
                            .addComponent(lCategoria)
                            .addComponent(lValorCompra)
                            .addComponent(lAno)
                            .addComponent(tFAno))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lTipo)
                            .addComponent(lModelo)
                            .addComponent(cBModelo, 0, 289, Short.MAX_VALUE)
                            .addComponent(lPlaca)
                            .addComponent(tFPlaca)
                            .addComponent(cBTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pIncluirVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAno)
                    .addComponent(lTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cBModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lValorCompra)
                    .addComponent(lPlaca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tFValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bVoltar)
                    .addComponent(bSalvar))
                .addGap(32, 32, 32))
        );

        setSize(new java.awt.Dimension(668, 399));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cBEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBEstadoActionPerformed

    private void cBMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBMarcaActionPerformed

    private void cBCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBCategoriaActionPerformed

    private void cBModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBModeloActionPerformed

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bSalvarActionPerformed

    private void cBTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBTipoActionPerformed
        if (TipoVeiculo.AUTOMÓVEL.equals(cBTipo.getSelectedItem())) {
            cBModelo.setModel(new DefaultComboBoxModel(ModeloAutomovel.enumsToStringArray()));
        } else if (TipoVeiculo.MOTOCICLETA.equals(cBTipo.getSelectedItem())) {
            cBModelo.setModel(new DefaultComboBoxModel(ModeloMotocicleta.enumsToStringArray()));
        } else {
            cBModelo.setModel(new DefaultComboBoxModel(ModeloVan.enumsToStringArray()));
        } 
    }//GEN-LAST:event_cBTipoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IncluirVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IncluirVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IncluirVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IncluirVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IncluirVeiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSalvar;
    private javax.swing.JButton bVoltar;
    private javax.swing.JComboBox<String> cBCategoria;
    private javax.swing.JComboBox<String> cBEstado;
    private javax.swing.JComboBox<String> cBMarca;
    private javax.swing.JComboBox<String> cBModelo;
    private javax.swing.JComboBox<String> cBTipo;
    private javax.swing.JLabel lAno;
    private javax.swing.JLabel lCategoria;
    private javax.swing.JLabel lEstado;
    private javax.swing.JLabel lMarca;
    private javax.swing.JLabel lModelo;
    private javax.swing.JLabel lPlaca;
    private javax.swing.JLabel lTipo;
    private javax.swing.JLabel lValorCompra;
    private javax.swing.JPanel pIncluirVeiculos;
    private javax.swing.JFormattedTextField tFAno;
    private javax.swing.JFormattedTextField tFPlaca;
    private javax.swing.JFormattedTextField tFValorCompra;
    // End of variables declaration//GEN-END:variables
}
