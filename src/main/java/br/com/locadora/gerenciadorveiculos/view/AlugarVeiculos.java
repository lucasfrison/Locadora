/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.view;

import br.com.locadora.gerenciadorveiculos.components.AlugarVeiculosTableModel;

/**
 *
 * @author lucfg
 */
public class AlugarVeiculos extends javax.swing.JFrame {

    /**
     * Creates new form AlugarVeiculos
     */
    public AlugarVeiculos() {
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

        dConfirmarLocacao = new javax.swing.JDialog();
        bEfetivarLocacao = new javax.swing.JButton();
        lPeriodo = new javax.swing.JLabel();
        tFPeriodo = new javax.swing.JTextField();
        lPeriodo1 = new javax.swing.JLabel();
        tFData = new javax.swing.JFormattedTextField();
        pVeiculosDisponiveis = new javax.swing.JPanel();
        sPVeiculosDisponiveis = new javax.swing.JScrollPane();
        tVeiculosDisponiveis = new javax.swing.JTable();
        bVoltar = new javax.swing.JButton();
        bLocar = new javax.swing.JButton();
        pCliente = new javax.swing.JPanel();
        lCPF = new javax.swing.JLabel();
        tFNomeCliente = new javax.swing.JTextField();
        lCliente = new javax.swing.JLabel();
        bPesquisarCliente = new javax.swing.JButton();
        tFSobrenome = new javax.swing.JTextField();
        lNome = new javax.swing.JLabel();
        lSobrenome = new javax.swing.JLabel();
        tFCPF = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        bFiltrar = new javax.swing.JButton();
        cBMarca = new javax.swing.JComboBox<>();
        lMarca = new javax.swing.JLabel();
        pFiltroTipoVeiculo5 = new javax.swing.JPanel();
        rBMoto5 = new javax.swing.JRadioButton();
        rBAutomovel5 = new javax.swing.JRadioButton();
        rBVan5 = new javax.swing.JRadioButton();
        lFiltroTipo5 = new javax.swing.JLabel();
        pFiltroCategoria = new javax.swing.JPanel();
        rBIntermediario = new javax.swing.JRadioButton();
        rBPopular = new javax.swing.JRadioButton();
        rBLuxo = new javax.swing.JRadioButton();
        lFiltroCategoria = new javax.swing.JLabel();
        lVeiculo = new javax.swing.JLabel();

        dConfirmarLocacao.setTitle("Confirmar Locação");
        dConfirmarLocacao.setLocation(new java.awt.Point(0, 0));
        dConfirmarLocacao.setModal(true);
        dConfirmarLocacao.setSize(new java.awt.Dimension(367, 200));

        bEfetivarLocacao.setText("Confirmar");

        lPeriodo.setText("Tempo de Locação");

        lPeriodo1.setText("Data de Devolução");

        try {
            tFData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout dConfirmarLocacaoLayout = new javax.swing.GroupLayout(dConfirmarLocacao.getContentPane());
        dConfirmarLocacao.getContentPane().setLayout(dConfirmarLocacaoLayout);
        dConfirmarLocacaoLayout.setHorizontalGroup(
            dConfirmarLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dConfirmarLocacaoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(dConfirmarLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bEfetivarLocacao)
                    .addGroup(dConfirmarLocacaoLayout.createSequentialGroup()
                        .addGroup(dConfirmarLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tFPeriodo))
                        .addGap(60, 60, 60)
                        .addGroup(dConfirmarLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lPeriodo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tFData))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        dConfirmarLocacaoLayout.setVerticalGroup(
            dConfirmarLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dConfirmarLocacaoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(dConfirmarLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPeriodo)
                    .addComponent(lPeriodo1))
                .addGap(10, 10, 10)
                .addGroup(dConfirmarLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tFPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(bEfetivarLocacao)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        dConfirmarLocacao.getAccessibleContext().setAccessibleParent(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alugar Veículos");

        tVeiculosDisponiveis.setModel(new AlugarVeiculosTableModel());
        sPVeiculosDisponiveis.setViewportView(tVeiculosDisponiveis);

        javax.swing.GroupLayout pVeiculosDisponiveisLayout = new javax.swing.GroupLayout(pVeiculosDisponiveis);
        pVeiculosDisponiveis.setLayout(pVeiculosDisponiveisLayout);
        pVeiculosDisponiveisLayout.setHorizontalGroup(
            pVeiculosDisponiveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pVeiculosDisponiveisLayout.createSequentialGroup()
                .addComponent(sPVeiculosDisponiveis)
                .addContainerGap())
        );
        pVeiculosDisponiveisLayout.setVerticalGroup(
            pVeiculosDisponiveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pVeiculosDisponiveisLayout.createSequentialGroup()
                .addComponent(sPVeiculosDisponiveis, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        bLocar.setText("Locar Veículo");
        bLocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLocarActionPerformed(evt);
            }
        });

        lCPF.setText("CPF");

        tFNomeCliente.setEnabled(false);
        tFNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFNomeClienteActionPerformed(evt);
            }
        });

        lCliente.setText("Informações do Cliente:");

        bPesquisarCliente.setText("Pesquisar");

        tFSobrenome.setEnabled(false);
        tFSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFSobrenomeActionPerformed(evt);
            }
        });

        lNome.setText("Nome");

        lSobrenome.setText("Sobrenome");

        try {
            tFCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pClienteLayout = new javax.swing.GroupLayout(pCliente);
        pCliente.setLayout(pClienteLayout);
        pClienteLayout.setHorizontalGroup(
            pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pClienteLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pClienteLayout.createSequentialGroup()
                        .addComponent(tFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bPesquisarCliente))
                    .addComponent(lSobrenome)
                    .addComponent(lCliente)
                    .addComponent(lCPF)
                    .addComponent(lNome)
                    .addComponent(tFNomeCliente)
                    .addComponent(tFSobrenome))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pClienteLayout.setVerticalGroup(
            pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pClienteLayout.createSequentialGroup()
                .addComponent(lCliente)
                .addGap(18, 18, 18)
                .addComponent(lCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPesquisarCliente)
                    .addComponent(tFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tFNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lSobrenome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tFSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bFiltrar.setText("Aplicar Filtro");
        bFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFiltrarActionPerformed(evt);
            }
        });

        cBMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lMarca.setText("Marca");

        pFiltroTipoVeiculo5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        rBMoto5.setText("Motocicleta");

        rBAutomovel5.setText("Automóvel");
        rBAutomovel5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBAutomovelActionPerformed(evt);
            }
        });

        rBVan5.setText("Van");

        lFiltroTipo5.setText("Tipo do Veículo");

        javax.swing.GroupLayout pFiltroTipoVeiculo5Layout = new javax.swing.GroupLayout(pFiltroTipoVeiculo5);
        pFiltroTipoVeiculo5.setLayout(pFiltroTipoVeiculo5Layout);
        pFiltroTipoVeiculo5Layout.setHorizontalGroup(
            pFiltroTipoVeiculo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFiltroTipoVeiculo5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pFiltroTipoVeiculo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rBAutomovel5)
                    .addComponent(rBMoto5)
                    .addComponent(rBVan5))
                .addGap(164, 164, 164))
            .addGroup(pFiltroTipoVeiculo5Layout.createSequentialGroup()
                .addComponent(lFiltroTipo5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pFiltroTipoVeiculo5Layout.setVerticalGroup(
            pFiltroTipoVeiculo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFiltroTipoVeiculo5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lFiltroTipo5)
                .addGap(18, 18, 18)
                .addComponent(rBAutomovel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rBMoto5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rBVan5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pFiltroCategoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        rBIntermediario.setText("Intermediário");
        rBIntermediario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBIntermediarioActionPerformed(evt);
            }
        });

        rBPopular.setText("Popular");
        rBPopular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBPopularActionPerformed(evt);
            }
        });

        rBLuxo.setText("Luxo");
        rBLuxo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBLuxoActionPerformed(evt);
            }
        });

        lFiltroCategoria.setText("Categoria");

        javax.swing.GroupLayout pFiltroCategoriaLayout = new javax.swing.GroupLayout(pFiltroCategoria);
        pFiltroCategoria.setLayout(pFiltroCategoriaLayout);
        pFiltroCategoriaLayout.setHorizontalGroup(
            pFiltroCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFiltroCategoriaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pFiltroCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rBPopular)
                    .addComponent(rBIntermediario)
                    .addComponent(rBLuxo))
                .addGap(164, 164, 164))
            .addGroup(pFiltroCategoriaLayout.createSequentialGroup()
                .addComponent(lFiltroCategoria)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pFiltroCategoriaLayout.setVerticalGroup(
            pFiltroCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFiltroCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lFiltroCategoria)
                .addGap(18, 18, 18)
                .addComponent(rBPopular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rBIntermediario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rBLuxo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lVeiculo.setText("Informações do Veículo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lMarca)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cBMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bFiltrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pFiltroTipoVeiculo5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(pFiltroCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lVeiculo))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lVeiculo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pFiltroCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pFiltroTipoVeiculo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bFiltrar))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pVeiculosDisponiveis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bLocar)
                                .addGap(18, 18, 18)
                                .addComponent(bVoltar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pVeiculosDisponiveis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bVoltar)
                    .addComponent(bLocar))
                .addGap(16, 16, 16))
        );

        setSize(new java.awt.Dimension(788, 629));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bLocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLocarActionPerformed
        dConfirmarLocacao.setLocationRelativeTo(this);
        dConfirmarLocacao.setVisible(true);
    }//GEN-LAST:event_bLocarActionPerformed

    private void tFNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFNomeClienteActionPerformed

    private void tFSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFSobrenomeActionPerformed

    private void bFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFiltrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bFiltrarActionPerformed

    private void rBLuxoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBLuxoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBLuxoActionPerformed

    private void rBPopularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBPopularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBPopularActionPerformed

    private void rBIntermediarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBIntermediarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBIntermediarioActionPerformed

    private void rBAutomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBAutomovelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBAutomovelActionPerformed

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
            java.util.logging.Logger.getLogger(AlugarVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlugarVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlugarVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlugarVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AlugarVeiculos alugarVeiculos = new AlugarVeiculos();
                alugarVeiculos.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEfetivarLocacao;
    private javax.swing.JButton bFiltrar;
    private javax.swing.JButton bLocar;
    private javax.swing.JButton bPesquisarCliente;
    private javax.swing.JButton bVoltar;
    private javax.swing.JComboBox<String> cBMarca;
    private javax.swing.JDialog dConfirmarLocacao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lCPF;
    private javax.swing.JLabel lCliente;
    private javax.swing.JLabel lFiltroCategoria;
    private javax.swing.JLabel lFiltroTipo5;
    private javax.swing.JLabel lMarca;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lPeriodo;
    private javax.swing.JLabel lPeriodo1;
    private javax.swing.JLabel lSobrenome;
    private javax.swing.JLabel lVeiculo;
    private javax.swing.JPanel pCliente;
    private javax.swing.JPanel pFiltroCategoria;
    private javax.swing.JPanel pFiltroTipoVeiculo5;
    private javax.swing.JPanel pVeiculosDisponiveis;
    private javax.swing.JRadioButton rBAutomovel5;
    private javax.swing.JRadioButton rBIntermediario;
    private javax.swing.JRadioButton rBLuxo;
    private javax.swing.JRadioButton rBMoto5;
    private javax.swing.JRadioButton rBPopular;
    private javax.swing.JRadioButton rBVan5;
    private javax.swing.JScrollPane sPVeiculosDisponiveis;
    private javax.swing.JFormattedTextField tFCPF;
    private javax.swing.JFormattedTextField tFData;
    private javax.swing.JTextField tFNomeCliente;
    private javax.swing.JTextField tFPeriodo;
    private javax.swing.JTextField tFSobrenome;
    private javax.swing.JTable tVeiculosDisponiveis;
    // End of variables declaration//GEN-END:variables
}
