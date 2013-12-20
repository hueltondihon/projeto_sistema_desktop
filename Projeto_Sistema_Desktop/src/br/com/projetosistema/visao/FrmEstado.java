/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetosistema.visao;

import br.com.projetosistema.controle.ConectaBanco;
import br.com.projetosistema.controle.ControleEstado;
import br.com.projetosistema.controle.ModeloTabela;
import br.com.projetosistema.modelo.ModeloEstado;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Huelton
 */
public class FrmEstado extends javax.swing.JFrame {

    ConectaBanco conexaoEstado = new ConectaBanco(); // instancia a classe de conexao do banco
    ModeloEstado modeloEstado = new ModeloEstado();
    ControleEstado controleEstado = new ControleEstado();

    /**
     * Creates new form FrmEstado
     */
    public FrmEstado() {
        initComponents();
        conexaoEstado.conecta(); // abre a conexao do banco dentro da janela
        preencherTabela("SELECT * FROM tb_estados ORDER BY id_estado");

        jTFCodigoEstado.setEnabled(false); // campo desabilitados quando a janela e aberta
        jTFNomeEstado.setEnabled(false);
        jTFSigla.setEnabled(false);

        jBCadastroEstadoSalvar.setEnabled(false);    // DESABILITA OS BOTOES  quando a janela e aberta
        jBCadastroEstadoAlterar.setEnabled(false);
        jBCadastroEstadoExcluir.setEnabled(false);
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
        jLCodigoEstado = new javax.swing.JLabel();
        jLNomeEstado = new javax.swing.JLabel();
        jLSigla = new javax.swing.JLabel();
        jTFCodigoEstado = new javax.swing.JTextField();
        jTFNomeEstado = new javax.swing.JTextField();
        jTFSigla = new javax.swing.JTextField();
        jBCadastroEstadoNovo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstado = new javax.swing.JTable();
        jBCadastroEstadoSalvar = new javax.swing.JButton();
        jBCadastroEstadoAlterar = new javax.swing.JButton();
        jBCadastroEstadoExcluir = new javax.swing.JButton();
        jBCadastroEstadoSair = new javax.swing.JButton();
        jBPrimeiro = new javax.swing.JButton();
        jBUltimo = new javax.swing.JButton();
        jBAnterior = new javax.swing.JButton();
        jBProximo = new javax.swing.JButton();
        jBCadastroEstadoLimpar = new javax.swing.JButton();
        titulo_cadastro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Estados");
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(227, 227, 243));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLCodigoEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLCodigoEstado.setText("Codigo:");

        jLNomeEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLNomeEstado.setText("Nome Estado:");

        jLSigla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLSigla.setText("Sigla:");

        jTFCodigoEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFCodigoEstado.setToolTipText("Codigo do Estado");

        jTFNomeEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFNomeEstado.setToolTipText("Nome do Estado");

        jTFSigla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFSigla.setToolTipText("Sigla do Estado");

        jBCadastroEstadoNovo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huelton\\Documents\\GitHub\\projeto_sistema_desktop\\Projeto_Sistema_Desktop\\src\\imagem_projeto\\cadastro_inserir1.png")); // NOI18N
        jBCadastroEstadoNovo.setToolTipText("Novo Cadastro");
        jBCadastroEstadoNovo.setPreferredSize(new java.awt.Dimension(70, 48));
        jBCadastroEstadoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroEstadoNovoActionPerformed(evt);
            }
        });

        jTableEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableEstado);

        jBCadastroEstadoSalvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huelton\\Documents\\GitHub\\projeto_sistema_desktop\\Projeto_Sistema_Desktop\\src\\imagem_projeto\\cadastro_salvar2.png")); // NOI18N
        jBCadastroEstadoSalvar.setToolTipText("Salvar Cadastro");
        jBCadastroEstadoSalvar.setPreferredSize(new java.awt.Dimension(70, 48));
        jBCadastroEstadoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroEstadoSalvarActionPerformed(evt);
            }
        });

        jBCadastroEstadoAlterar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huelton\\Documents\\GitHub\\projeto_sistema_desktop\\Projeto_Sistema_Desktop\\src\\imagem_projeto\\cadastro_atualizar3.png")); // NOI18N
        jBCadastroEstadoAlterar.setToolTipText("Alterar Cadastro");
        jBCadastroEstadoAlterar.setPreferredSize(new java.awt.Dimension(60, 40));
        jBCadastroEstadoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroEstadoAlterarActionPerformed(evt);
            }
        });

        jBCadastroEstadoExcluir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huelton\\Documents\\GitHub\\projeto_sistema_desktop\\Projeto_Sistema_Desktop\\src\\imagem_projeto\\cadastro_deletar4.png")); // NOI18N
        jBCadastroEstadoExcluir.setToolTipText("Excluir Cadastro");
        jBCadastroEstadoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroEstadoExcluirActionPerformed(evt);
            }
        });

        jBCadastroEstadoSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huelton\\Documents\\GitHub\\projeto_sistema_desktop\\Projeto_Sistema_Desktop\\src\\imagem_projeto\\cadastro_sair6.png")); // NOI18N
        jBCadastroEstadoSair.setToolTipText("Sair da Pagina");
        jBCadastroEstadoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroEstadoSairActionPerformed(evt);
            }
        });

        jBPrimeiro.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huelton\\Documents\\GitHub\\projeto_sistema_desktop\\Projeto_Sistema_Desktop\\src\\imagem_projeto\\primeiro.png")); // NOI18N
        jBPrimeiro.setToolTipText("Primeiro");
        jBPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPrimeiroActionPerformed(evt);
            }
        });

        jBUltimo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huelton\\Documents\\GitHub\\projeto_sistema_desktop\\Projeto_Sistema_Desktop\\src\\imagem_projeto\\ultimo.png")); // NOI18N
        jBUltimo.setToolTipText("Ultimo");
        jBUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUltimoActionPerformed(evt);
            }
        });

        jBAnterior.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huelton\\Documents\\GitHub\\projeto_sistema_desktop\\Projeto_Sistema_Desktop\\src\\imagem_projeto\\anterior.png")); // NOI18N
        jBAnterior.setToolTipText("Anterior");
        jBAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnteriorActionPerformed(evt);
            }
        });

        jBProximo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huelton\\Documents\\GitHub\\projeto_sistema_desktop\\Projeto_Sistema_Desktop\\src\\imagem_projeto\\proximo.png")); // NOI18N
        jBProximo.setToolTipText("Proximo");
        jBProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProximoActionPerformed(evt);
            }
        });

        jBCadastroEstadoLimpar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huelton\\Documents\\GitHub\\projeto_sistema_desktop\\Projeto_Sistema_Desktop\\src\\imagem_projeto\\cadastro_limpar5.png")); // NOI18N
        jBCadastroEstadoLimpar.setToolTipText("Limpar Cadastro");
        jBCadastroEstadoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroEstadoLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLCodigoEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFCodigoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLNomeEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFNomeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addComponent(jLSigla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBCadastroEstadoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCadastroEstadoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCadastroEstadoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCadastroEstadoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCadastroEstadoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCadastroEstadoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigoEstado)
                    .addComponent(jTFCodigoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNomeEstado)
                    .addComponent(jTFNomeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLSigla)
                    .addComponent(jTFSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBProximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBPrimeiro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastroEstadoExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastroEstadoAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastroEstadoSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(jBCadastroEstadoNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBAnterior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastroEstadoSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastroEstadoLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(325, 325, 325))
        );

        titulo_cadastro.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        titulo_cadastro.setForeground(new java.awt.Color(36, 127, 194));
        titulo_cadastro.setText("Formulário Cadastro de Estado ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(titulo_cadastro)
                .addContainerGap(333, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo_cadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastroEstadoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroEstadoSalvarActionPerformed
        if (jTFNomeEstado.getText().equals("") && jTFSigla.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Estado ou Sigla estao em branco, por favor preencha todos os campos!");
        } else {
            modeloEstado.setNomeEstado(jTFNomeEstado.getText());//pega o nome de estado do textfield
            modeloEstado.setSiglaEstado(jTFSigla.getText()); //pega a sigla de estado dotextfield
            controleEstado.inserirEstado(modeloEstado);
            JOptionPane.showMessageDialog(null, "Inserido com sucesso ao Banco!");

            jTFCodigoEstado.setEnabled(false);
            jTFCodigoEstado.setText("");
            jTFNomeEstado.setText("");
            jTFSigla.setText("");

            jBCadastroEstadoSalvar.setEnabled(false);     // DESABILITA OS BOTOES
            jBCadastroEstadoAlterar.setEnabled(false);
            jBCadastroEstadoExcluir.setEnabled(false);
            jBCadastroEstadoNovo.setEnabled(true);
        }
        preencherTabela("SELECT * FROM tb_estados ORDER BY id_estado");
    }//GEN-LAST:event_jBCadastroEstadoSalvarActionPerformed

    private void jBCadastroEstadoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroEstadoExcluirActionPerformed
        jTFCodigoEstado.setEnabled(false);

        modeloEstado.setIdEstado(Integer.parseInt(jTFCodigoEstado.getText()));
        modeloEstado.setNomeEstado(jTFNomeEstado.getText());
        modeloEstado.setSiglaEstado(jTFSigla.getText());
        if (jTFSigla.getText().equals("") && jTFNomeEstado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "o campo esta em branco!");
        } else {
            int response = JOptionPane.showConfirmDialog(
                    this, " Voce quer deletar esse arquivo?", null,
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                controleEstado.deletarEstado(modeloEstado);
                JOptionPane.showMessageDialog(null, "Deletado com sucesso do Banco!");

                jTFCodigoEstado.setEnabled(true);
                jTFCodigoEstado.setText("");
                jTFNomeEstado.setText("");
                jTFSigla.setText("");

                jBCadastroEstadoSalvar.setEnabled(false);    // DESABILITA OS BOTOES  
                jBCadastroEstadoAlterar.setEnabled(false);
                jBCadastroEstadoExcluir.setEnabled(false);
                jBCadastroEstadoNovo.setEnabled(true);
            }

        }
        preencherTabela("SELECT * FROM tb_estados ORDER BY id_estado");
    }//GEN-LAST:event_jBCadastroEstadoExcluirActionPerformed

    private void jBCadastroEstadoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroEstadoNovoActionPerformed

        jTFCodigoEstado.setEnabled(false);
        jTFNomeEstado.setEnabled(true);
        jTFSigla.setEnabled(true);

        jTFCodigoEstado.setText("");
        jTFNomeEstado.setText("");
        jTFSigla.setText("");

        jBCadastroEstadoSalvar.setEnabled(true);     // DESABILITA OS BOTOES      
        jBCadastroEstadoAlterar.setEnabled(true);
        jBCadastroEstadoExcluir.setEnabled(true);
        jBCadastroEstadoNovo.setEnabled(false);
    }//GEN-LAST:event_jBCadastroEstadoNovoActionPerformed

    private void jBCadastroEstadoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroEstadoSairActionPerformed
        // TODO add your handling code here:
        dispose();

    }//GEN-LAST:event_jBCadastroEstadoSairActionPerformed


    private void jBPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPrimeiroActionPerformed
        jBCadastroEstadoAlterar.setEnabled(true);
        jBCadastroEstadoExcluir.setEnabled(true);
        jBCadastroEstadoLimpar.setEnabled(true);
        jBCadastroEstadoNovo.setEnabled(false);
        try {
            conexaoEstado.executaSQL("SELECT * FROM tb_estados");
            conexaoEstado.rs.first();

            jTFCodigoEstado.setEnabled(true); // campo habilitados quando a janela e aberta
            jTFNomeEstado.setEnabled(true);
            jTFSigla.setEnabled(true);

            jTFCodigoEstado.setText(String.valueOf(conexaoEstado.rs.getInt("id_estado")));
            jTFNomeEstado.setText(conexaoEstado.rs.getString("nome_estado"));//mostra o nome de estado do textfield
            jTFSigla.setText(conexaoEstado.rs.getString("sigla_estado")); //mostra a sigla de estado dotextfield         

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado no Banco\n Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_jBPrimeiroActionPerformed

    private void jBUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUltimoActionPerformed
        jBCadastroEstadoAlterar.setEnabled(true);
        jBCadastroEstadoExcluir.setEnabled(true);
        jBCadastroEstadoLimpar.setEnabled(true);
        jBCadastroEstadoNovo.setEnabled(false);
        try {
            conexaoEstado.executaSQL("SELECT * FROM tb_estados ");
            conexaoEstado.rs.last();

            jTFCodigoEstado.setEnabled(true); // campo habilitados quando a janela e aberta
            jTFNomeEstado.setEnabled(true);
            jTFSigla.setEnabled(true);

            jTFCodigoEstado.setText(String.valueOf(conexaoEstado.rs.getInt("id_estado")));
            jTFNomeEstado.setText(conexaoEstado.rs.getString("nome_estado"));//mostra o nome de estado do textfield
            jTFSigla.setText(conexaoEstado.rs.getString("sigla_estado")); //mostra a sigla de estado dotextfield

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado no Banco\n Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_jBUltimoActionPerformed

    private void jBAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnteriorActionPerformed
        jBCadastroEstadoAlterar.setEnabled(true);
        jBCadastroEstadoExcluir.setEnabled(true);
        jBCadastroEstadoLimpar.setEnabled(true);
        jBCadastroEstadoNovo.setEnabled(false);
        try {
            //conexao.executaSQL("SELECT * FROM estado ");            
            conexaoEstado.rs.previous();

            jTFCodigoEstado.setEnabled(true); // campo habilitados quando a janela e aberta
            jTFNomeEstado.setEnabled(true);
            jTFSigla.setEnabled(true);

            jTFCodigoEstado.setText(String.valueOf(conexaoEstado.rs.getInt("id_estado")));
            jTFNomeEstado.setText(conexaoEstado.rs.getString("nome_estado"));//mostra o nome de estado do textfield
            jTFSigla.setText(conexaoEstado.rs.getString("sigla_estado")); //mostra a sigla de estado dotextfield

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado no Banco\n Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_jBAnteriorActionPerformed

    private void jBProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProximoActionPerformed
        jBCadastroEstadoAlterar.setEnabled(true);
        jBCadastroEstadoExcluir.setEnabled(true);
        jBCadastroEstadoLimpar.setEnabled(true);
        jBCadastroEstadoNovo.setEnabled(false);
        try {
            //conexao.executaSQL("select * from estado ");            
            conexaoEstado.rs.next();

            jTFCodigoEstado.setEnabled(true); // campo habilitados quando a janela e aberta
            jTFNomeEstado.setEnabled(true);
            jTFSigla.setEnabled(true);

            jTFCodigoEstado.setText(String.valueOf(conexaoEstado.rs.getInt("id_estado")));
            jTFNomeEstado.setText(conexaoEstado.rs.getString("nome_estado"));//mostra o nome de estado do textfield
            jTFSigla.setText(conexaoEstado.rs.getString("sigla_estado")); //mostra a sigla de estado dotextfield

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado no Banco\n Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_jBProximoActionPerformed

    private void jBCadastroEstadoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroEstadoAlterarActionPerformed

        if (jTFNomeEstado.getText().equals("") && jTFSigla.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Estado ou Sigla estao em branco, por favor preencha todos os campos!");
        } else {
            modeloEstado.setNomeEstado(jTFNomeEstado.getText());//pega o nome de estado do textfield
            modeloEstado.setSiglaEstado(jTFSigla.getText()); //pega a sigla de estado dotextfield
            modeloEstado.setIdEstado(Integer.parseInt(jTFCodigoEstado.getText())); //pega a sigla de estado do textfield TRANSFORMA EM UM INTEIRO
            controleEstado.alterarEstado(modeloEstado);
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso ao Banco!");

            jTFCodigoEstado.setEnabled(false);
            jTFCodigoEstado.setText("");
            jTFNomeEstado.setText("");
            jTFSigla.setText("");

            jBCadastroEstadoSalvar.setEnabled(false);     // DESABILITA OS BOTOES
            jBCadastroEstadoAlterar.setEnabled(false);
            jBCadastroEstadoExcluir.setEnabled(false);
            jBCadastroEstadoNovo.setEnabled(true);
        }
        preencherTabela("SELECT * FROM tb_estados ORDER BY id_estado");
    }//GEN-LAST:event_jBCadastroEstadoAlterarActionPerformed

    private void jBCadastroEstadoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroEstadoLimparActionPerformed
        // TODO add your handling code here:
        jTFCodigoEstado.setEnabled(false);
        jTFNomeEstado.setEnabled(false);
        jTFSigla.setEnabled(false);

        jTFCodigoEstado.setText("");
        jTFNomeEstado.setText("");
        jTFSigla.setText("");

        jBCadastroEstadoSalvar.setEnabled(false);     // DESABILITA OS BOTOES      
        jBCadastroEstadoAlterar.setEnabled(false);
        jBCadastroEstadoExcluir.setEnabled(false);
        jBCadastroEstadoNovo.setEnabled(true);
    }//GEN-LAST:event_jBCadastroEstadoLimparActionPerformed

    public void preencherTabela(String sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Nome", "Sigla"};

        conexaoEstado.executaSQL(sql);
        try {
            conexaoEstado.rs.first();
            do {
                dados.add(new Object[]{conexaoEstado.rs.getInt("id_estado"),
                    conexaoEstado.rs.getString("nome_estado"),
                    conexaoEstado.rs.getString("sigla_estado")});
            } while (conexaoEstado.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Preencher dados na Tabela com o Banco de dados\n Erro: " + ex.getMessage());
        }

        ModeloTabela modeloTabela = new ModeloTabela(dados, colunas);
        jTableEstado.setModel(modeloTabela);
        jTableEstado.getColumnModel().getColumn(0).setPreferredWidth(100); // configuracao de tamanho do campo
        jTableEstado.getColumnModel().getColumn(0).setResizable(false); // redimensionamento da tabela nesse caso e falso

        jTableEstado.getColumnModel().getColumn(1).setPreferredWidth(505); // configuracao de tamanho do campo
        jTableEstado.getColumnModel().getColumn(1).setResizable(true); // redimensionamento da tabela nesse caso e true

        jTableEstado.getColumnModel().getColumn(2).setPreferredWidth(100); // configuracao de tamanho do campo
        jTableEstado.getColumnModel().getColumn(2).setResizable(false); // redimensionamento da tabela nesse caso e true

        jTableEstado.getTableHeader().setReorderingAllowed(false); // nao faz reordenacao
        jTableEstado.setAutoResizeMode(jTableEstado.AUTO_RESIZE_OFF);//nao e redimensionavel
        jTableEstado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // posso selecionar somente um campo
    }

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
            java.util.logging.Logger.getLogger(FrmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEstado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAnterior;
    private javax.swing.JButton jBCadastroEstadoAlterar;
    private javax.swing.JButton jBCadastroEstadoExcluir;
    private javax.swing.JButton jBCadastroEstadoLimpar;
    private javax.swing.JButton jBCadastroEstadoNovo;
    private javax.swing.JButton jBCadastroEstadoSair;
    private javax.swing.JButton jBCadastroEstadoSalvar;
    private javax.swing.JButton jBPrimeiro;
    private javax.swing.JButton jBProximo;
    private javax.swing.JButton jBUltimo;
    private javax.swing.JLabel jLCodigoEstado;
    private javax.swing.JLabel jLNomeEstado;
    private javax.swing.JLabel jLSigla;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCodigoEstado;
    private javax.swing.JTextField jTFNomeEstado;
    private javax.swing.JTextField jTFSigla;
    private javax.swing.JTable jTableEstado;
    private javax.swing.JLabel titulo_cadastro;
    // End of variables declaration//GEN-END:variables
}
