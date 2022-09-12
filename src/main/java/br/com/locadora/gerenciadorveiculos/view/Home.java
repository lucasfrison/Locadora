/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.locadora.gerenciadorveiculos.view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author lucfg
 */
public class Home extends javax.swing.JFrame {
    
    private GerenciarClientes gerenciarClientes = new GerenciarClientes();
    private AlugarVeiculos alugarVeiculos = new AlugarVeiculos();
    private DevolverVeiculos devolverVeiculos = new DevolverVeiculos();
    private IncluirVeiculos incluirVeiculos = new IncluirVeiculos();
    private VenderVeiculos venderVeiculos = new VenderVeiculos();

    /**
     * Creates new form Home
     */
    public Home() {
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

        jPanel1 = new javax.swing.JPanel();
        lBemVindo = new javax.swing.JLabel();
        lDica = new javax.swing.JLabel();
        mBSelecionarTela = new javax.swing.JMenuBar();
        mSelecionarTela = new javax.swing.JMenu();
        mIGerenciarClientes = new javax.swing.JMenuItem();
        mIIncluirVeiculos = new javax.swing.JMenuItem();
        mIAlugarVeiculos = new javax.swing.JMenuItem();
        mIDevolverVeiculos = new javax.swing.JMenuItem();
        mIVenderVeiculos = new javax.swing.JMenuItem();
        mISair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Página Inicial");
        setMaximumSize(new java.awt.Dimension(840, 275));
        setResizable(false);

        lBemVindo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lBemVindo.setText("Bem Vindo(a)!");

        lDica.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lDica.setText("Selecione uma opção pelo menu \"Navegar\".");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(lDica))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(lBemVindo)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lBemVindo)
                .addGap(18, 18, 18)
                .addComponent(lDica)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        mSelecionarTela.setText("Navegar");

        mIGerenciarClientes.setText("Gerenciar Clientes");
        mIGerenciarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIGerenciarClientesActionPerformed(evt);
            }
        });
        mSelecionarTela.add(mIGerenciarClientes);

        mIIncluirVeiculos.setText("Cadastrar Veiculos");
        mIIncluirVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIIncluirVeiculosActionPerformed(evt);
            }
        });
        mSelecionarTela.add(mIIncluirVeiculos);

        mIAlugarVeiculos.setText("Registrar Locação de Veículo");
        mIAlugarVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIAlugarVeiculosActionPerformed(evt);
            }
        });
        mSelecionarTela.add(mIAlugarVeiculos);

        mIDevolverVeiculos.setText("Registrar Devolução de Veículos");
        mIDevolverVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIDevolverVeiculosActionPerformed(evt);
            }
        });
        mSelecionarTela.add(mIDevolverVeiculos);

        mIVenderVeiculos.setText("Vender Veículos");
        mIVenderVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIVenderVeiculosActionPerformed(evt);
            }
        });
        mSelecionarTela.add(mIVenderVeiculos);

        mISair.setText("Encerrar");
        mISair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mISairActionPerformed(evt);
            }
        });
        mSelecionarTela.add(mISair);

        mBSelecionarTela.add(mSelecionarTela);

        setJMenuBar(mBSelecionarTela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(849, 238));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void mIGerenciarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIGerenciarClientesActionPerformed
        gerenciarClientes.setVisible(true);
    }//GEN-LAST:event_mIGerenciarClientesActionPerformed

    private void mIIncluirVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIIncluirVeiculosActionPerformed
        incluirVeiculos.setVisible(true);
    }//GEN-LAST:event_mIIncluirVeiculosActionPerformed

    private void mIAlugarVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIAlugarVeiculosActionPerformed
        alugarVeiculos.setVisible(true);
    }//GEN-LAST:event_mIAlugarVeiculosActionPerformed

    private void mIDevolverVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIDevolverVeiculosActionPerformed
        devolverVeiculos.setVisible(true);
    }//GEN-LAST:event_mIDevolverVeiculosActionPerformed

    private void mIVenderVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIVenderVeiculosActionPerformed
        venderVeiculos.setVisible(true);
    }//GEN-LAST:event_mIVenderVeiculosActionPerformed

    private void mISairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mISairActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_mISairActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lBemVindo;
    private javax.swing.JLabel lDica;
    private javax.swing.JMenuBar mBSelecionarTela;
    private javax.swing.JMenuItem mIAlugarVeiculos;
    private javax.swing.JMenuItem mIDevolverVeiculos;
    private javax.swing.JMenuItem mIGerenciarClientes;
    private javax.swing.JMenuItem mIIncluirVeiculos;
    private javax.swing.JMenuItem mISair;
    private javax.swing.JMenuItem mIVenderVeiculos;
    private javax.swing.JMenu mSelecionarTela;
    // End of variables declaration//GEN-END:variables

    
}
