/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.projetosistema.visao;

import br.com.projetosistema.controle.ConectaBanco;
import java.awt.Image;
import java.awt.Toolkit;


/**
 *
 * @author Huelton
 */
public class JfrmPrincipal extends javax.swing.JFrame {
     
    ConectaBanco conexao  = new ConectaBanco();
    /**
     * Creates new form JfrmPrincipal
     */
    
    public JfrmPrincipal() {
        initComponents();
        conexao.conecta();      
    }    
    
   @Override
   public Image getIconImage(){
   Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("icones/media-eject-7.png"));
     return retValue;
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMCadastro = new javax.swing.JMenu();
        jMItemEstado = new javax.swing.JMenuItem();
        jMItemCidade = new javax.swing.JMenuItem();
        jMItemBairro = new javax.swing.JMenuItem();
        jMItemTelefone = new javax.swing.JMenuItem();
        jMItemClientes = new javax.swing.JMenuItem();
        jMItemFornecedores = new javax.swing.JMenuItem();
        jMItemProdutos = new javax.swing.JMenuItem();
        jMCompra = new javax.swing.JMenu();
        jMVenda = new javax.swing.JMenu();
        jMRelatorio = new javax.swing.JMenu();
        jMSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vendas");
        setBackground(new java.awt.Color(227, 227, 243));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setIconImages(null);

        jMCadastro.setText("Cadastro");
        jMCadastro.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        jMItemEstado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMItemEstado.setText("Estado");
        jMItemEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemEstadoActionPerformed(evt);
            }
        });
        jMCadastro.add(jMItemEstado);

        jMItemCidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMItemCidade.setText("Cidade");
        jMItemCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemCidadeActionPerformed(evt);
            }
        });
        jMCadastro.add(jMItemCidade);

        jMItemBairro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMItemBairro.setText("Bairro");
        jMItemBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemBairroActionPerformed(evt);
            }
        });
        jMCadastro.add(jMItemBairro);

        jMItemTelefone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMItemTelefone.setText("Telefone");
        jMCadastro.add(jMItemTelefone);

        jMItemClientes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMItemClientes.setText("Clientes");
        jMCadastro.add(jMItemClientes);

        jMItemFornecedores.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMItemFornecedores.setText("Fornecedores");
        jMCadastro.add(jMItemFornecedores);

        jMItemProdutos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMItemProdutos.setText("Produtos");
        jMCadastro.add(jMItemProdutos);

        jMenuBar1.add(jMCadastro);

        jMCompra.setText("Compra");
        jMCompra.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jMenuBar1.add(jMCompra);

        jMVenda.setText("Venda");
        jMVenda.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jMenuBar1.add(jMVenda);

        jMRelatorio.setText("Relatorio");
        jMRelatorio.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jMenuBar1.add(jMRelatorio);

        jMSair.setText("Sair");
        jMSair.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jMSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMSairMouseClicked
        // TODO add your handling code here:
        conexao.desconecta();
        System.exit(0);
    }//GEN-LAST:event_jMSairMouseClicked

    private void jMItemEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemEstadoActionPerformed
        FrmEstado frmEstado = new FrmEstado(); 
        frmEstado.setVisible(true);
    }//GEN-LAST:event_jMItemEstadoActionPerformed

    private void jMItemCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemCidadeActionPerformed
        FrmCidade frmCidade = new FrmCidade(); 
        frmCidade.setVisible(true);
    }//GEN-LAST:event_jMItemCidadeActionPerformed

    private void jMItemBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemBairroActionPerformed
        FrmBairro frmBairro = new FrmBairro();  
        frmBairro.setVisible(true);
    }//GEN-LAST:event_jMItemBairroActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(JfrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(JfrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(JfrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(JfrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new JfrmPrincipal().setVisible(true);
//            }
//        });
//    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMCadastro;
    private javax.swing.JMenu jMCompra;
    private javax.swing.JMenuItem jMItemBairro;
    private javax.swing.JMenuItem jMItemCidade;
    private javax.swing.JMenuItem jMItemClientes;
    private javax.swing.JMenuItem jMItemEstado;
    private javax.swing.JMenuItem jMItemFornecedores;
    private javax.swing.JMenuItem jMItemProdutos;
    private javax.swing.JMenuItem jMItemTelefone;
    private javax.swing.JMenu jMRelatorio;
    private javax.swing.JMenu jMSair;
    private javax.swing.JMenu jMVenda;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
