/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.view;

import br.com.locadora.gerenciadorveiculos.uicomponents.DevolverVeiculosTableModel;

/**
 *
 * @author lucfg
 */
public class DevolverVeiculos extends javax.swing.JDialog {

    /**
     * Creates new form DevolverVeiculos
     */
    public DevolverVeiculos() {
        initComponents();
        this.setTitle("Devolver Veículos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pContainerTop = new javax.swing.JPanel();
        bListarVeiculosLocados = new javax.swing.JButton();
        lVeiculosLocados = new javax.swing.JLabel();
        pContainerTable = new javax.swing.JPanel();
        sPVeiculos = new javax.swing.JScrollPane();
        tVeiculosLocados = new javax.swing.JTable();
        pContainerBottom = new javax.swing.JPanel();
        bDevolverVeiculo = new javax.swing.JButton();
        bVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);

        bListarVeiculosLocados.setText("Listar");
        bListarVeiculosLocados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarVeiculosLocadosActionPerformed(evt);
            }
        });

        lVeiculosLocados.setText(" Veículos Locados:");

        javax.swing.GroupLayout pContainerTopLayout = new javax.swing.GroupLayout(pContainerTop);
        pContainerTop.setLayout(pContainerTopLayout);
        pContainerTopLayout.setHorizontalGroup(
            pContainerTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pContainerTopLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pContainerTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lVeiculosLocados)
                    .addComponent(bListarVeiculosLocados))
                .addContainerGap(359, Short.MAX_VALUE))
        );
        pContainerTopLayout.setVerticalGroup(
            pContainerTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pContainerTopLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(bListarVeiculosLocados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lVeiculosLocados))
        );

        DevolverVeiculosTableModel veiculosTabela = new DevolverVeiculosTableModel();
        tVeiculosLocados.setModel(veiculosTabela);
        sPVeiculos.setViewportView(tVeiculosLocados);

        bDevolverVeiculo.setText("Devolver Veículo");
        bDevolverVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDevolverVeiculoActionPerformed(evt);
            }
        });

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pContainerBottomLayout = new javax.swing.GroupLayout(pContainerBottom);
        pContainerBottom.setLayout(pContainerBottomLayout);
        pContainerBottomLayout.setHorizontalGroup(
            pContainerBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pContainerBottomLayout.createSequentialGroup()
                .addGap(0, 60, Short.MAX_VALUE)
                .addComponent(bDevolverVeiculo)
                .addGap(18, 18, 18)
                .addComponent(bVoltar))
        );
        pContainerBottomLayout.setVerticalGroup(
            pContainerBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pContainerBottomLayout.createSequentialGroup()
                .addGroup(pContainerBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDevolverVeiculo)
                    .addComponent(bVoltar))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pContainerTableLayout = new javax.swing.GroupLayout(pContainerTable);
        pContainerTable.setLayout(pContainerTableLayout);
        pContainerTableLayout.setHorizontalGroup(
            pContainerTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pContainerTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pContainerTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sPVeiculos, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pContainerTableLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pContainerBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pContainerTableLayout.setVerticalGroup(
            pContainerTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pContainerTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sPVeiculos, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pContainerBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pContainerTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pContainerTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pContainerTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pContainerTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(808, 497));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bListarVeiculosLocadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarVeiculosLocadosActionPerformed
         System.out.println("Listar clicado!");
    }//GEN-LAST:event_bListarVeiculosLocadosActionPerformed

    private void bDevolverVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDevolverVeiculoActionPerformed
         System.out.println("Devolver clicado!");
    }//GEN-LAST:event_bDevolverVeiculoActionPerformed

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
            java.util.logging.Logger.getLogger(DevolverVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DevolverVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DevolverVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DevolverVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DevolverVeiculos().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDevolverVeiculo;
    private javax.swing.JButton bListarVeiculosLocados;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel lVeiculosLocados;
    private javax.swing.JPanel pContainerBottom;
    private javax.swing.JPanel pContainerTable;
    private javax.swing.JPanel pContainerTop;
    private javax.swing.JScrollPane sPVeiculos;
    private javax.swing.JTable tVeiculosLocados;
    // End of variables declaration//GEN-END:variables

}
