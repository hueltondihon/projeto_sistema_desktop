/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetosistema.visao;

import br.com.projetosistema.controle.ConectaBanco;
import br.com.projetosistema.controle.ControleCidade;
import br.com.projetosistema.controle.ModeloTabela;
import br.com.projetosistema.modelo.ModeloCidade;
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
public class FrmCidade extends javax.swing.JFrame {

    ConectaBanco conexaoEstado = new ConectaBanco(); // instancia a classe de conexao do banco com entidade Estado
    ConectaBanco conexaoCidade = new ConectaBanco();  // instancia a classe de conexao do banco com entidade Cidade
    ModeloCidade modeloCidade = new ModeloCidade();  //Meu objeto de modelo
    ControleCidade controleCidade = new ControleCidade(); //o controlador do objeto modelo

    /**
     * Creates new form FrmCidade
     */
    public FrmCidade() {
        initComponents();

        conexaoEstado.conecta(); // abre a conexao do banco dentro da janela
        conexaoCidade.conecta(); // abre a conexao do banco dentro da janela
        preencherTabela("SELECT * FROM tb_cidades INNER JOIN tb_estados ON tb_cidades.id_estado = tb_estados.id_estado");
        conexaoEstado.executaSQL("SELECT * FROM tb_estados ORDER BY nome_estado ");
        jCBoxEstado.removeAllItems(); //remove todos os itens ue nao sao ligados ao banco de dados          

        try {

            conexaoEstado.rs.first();
            do {
                jCBoxEstado.addItem(conexaoEstado.rs.getString("nome_estado"));
            } while (conexaoEstado.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inerir o comboBox:\n Erro: !" + ex.getMessage());
        }

        jTFCodigoCidade.setEnabled(false); // campo desabilitados quando a janela e aberta
        jTFNomeCidade.setEnabled(false);

        jBCadastroCidadeSalvar.setEnabled(false);    // DESABILITA OS BOTOES  quando a janela e aberta
        jBCadastroCidadeAlterar.setEnabled(false);
        jBCadastroCidadeExcluir.setEnabled(false);
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
        jLCodigoCidade = new javax.swing.JLabel();
        jLNomeCidade = new javax.swing.JLabel();
        jLEstado = new javax.swing.JLabel();
        jTFCodigoCidade = new javax.swing.JTextField();
        jTFNomeCidade = new javax.swing.JTextField();
        jBCadastroCidadeNovo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCidade = new javax.swing.JTable();
        jBCadastroCidadeSalvar = new javax.swing.JButton();
        jBCadastroCidadeAlterar = new javax.swing.JButton();
        jBCadastroCidadeExcluir = new javax.swing.JButton();
        jBCadastroCidadeSair = new javax.swing.JButton();
        jBPrimeiro = new javax.swing.JButton();
        jBUltimo = new javax.swing.JButton();
        jBAnterior = new javax.swing.JButton();
        jBProximo = new javax.swing.JButton();
        jCBoxEstado = new javax.swing.JComboBox();
        jBCadastroCidadeLimpar = new javax.swing.JButton();
        titulo_cadastro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cidade");
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(227, 227, 243));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLCodigoCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLCodigoCidade.setText("Codigo:");

        jLNomeCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLNomeCidade.setText("Nome Cidade:");

        jLEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLEstado.setText("Estado");

        jTFCodigoCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFCodigoCidade.setToolTipText("Codigo da Cidade");

        jTFNomeCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFNomeCidade.setToolTipText("Nome do Cidade");

        jBCadastroCidadeNovo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huelton\\Documents\\GitHub\\projeto_sistema_desktop\\Projeto_Sistema_Desktop\\src\\imagem_projeto\\cadastro_inserir1.png")); // NOI18N
        jBCadastroCidadeNovo.setToolTipText("Novo Cadastro");
        jBCadastroCidadeNovo.setPreferredSize(new java.awt.Dimension(70, 48));
        jBCadastroCidadeNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroCidadeNovoActionPerformed(evt);
            }
        });

        jTableCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableCidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableCidade);

        jBCadastroCidadeSalvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huelton\\Documents\\GitHub\\projeto_sistema_desktop\\Projeto_Sistema_Desktop\\src\\imagem_projeto\\cadastro_salvar2.png")); // NOI18N
        jBCadastroCidadeSalvar.setToolTipText("Salvar Cadastro");
        jBCadastroCidadeSalvar.setPreferredSize(new java.awt.Dimension(70, 48));
        jBCadastroCidadeSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroCidadeSalvarActionPerformed(evt);
            }
        });

        jBCadastroCidadeAlterar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huelton\\Documents\\GitHub\\projeto_sistema_desktop\\Projeto_Sistema_Desktop\\src\\imagem_projeto\\cadastro_atualizar3.png")); // NOI18N
        jBCadastroCidadeAlterar.setToolTipText("Alterar Cadastro");
        jBCadastroCidadeAlterar.setPreferredSize(new java.awt.Dimension(60, 40));
        jBCadastroCidadeAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroCidadeAlterarActionPerformed(evt);
            }
        });

        jBCadastroCidadeExcluir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huelton\\Documents\\GitHub\\projeto_sistema_desktop\\Projeto_Sistema_Desktop\\src\\imagem_projeto\\cadastro_deletar4.png")); // NOI18N
        jBCadastroCidadeExcluir.setToolTipText("Excluir Cadastro");
        jBCadastroCidadeExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroCidadeExcluirActionPerformed(evt);
            }
        });

        jBCadastroCidadeSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huelton\\Documents\\GitHub\\projeto_sistema_desktop\\Projeto_Sistema_Desktop\\src\\imagem_projeto\\cadastro_sair6.png")); // NOI18N
        jBCadastroCidadeSair.setToolTipText("Sair da Pagina");
        jBCadastroCidadeSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroCidadeSairActionPerformed(evt);
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

        jCBoxEstado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCBoxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBoxEstado.setToolTipText("Lista das Estados");

        jBCadastroCidadeLimpar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huelton\\Documents\\GitHub\\projeto_sistema_desktop\\Projeto_Sistema_Desktop\\src\\imagem_projeto\\cadastro_limpar5.png")); // NOI18N
        jBCadastroCidadeLimpar.setToolTipText("Limpa os Campos");
        jBCadastroCidadeLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroCidadeLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLCodigoCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFCodigoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLNomeCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFNomeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addComponent(jLEstado)
                        .addGap(18, 18, 18)
                        .addComponent(jCBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBCadastroCidadeNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBCadastroCidadeSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBCadastroCidadeAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBCadastroCidadeExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBCadastroCidadeLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jBPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBCadastroCidadeSair, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigoCidade)
                    .addComponent(jTFCodigoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNomeCidade)
                    .addComponent(jTFNomeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEstado)
                    .addComponent(jCBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBProximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBPrimeiro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastroCidadeExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastroCidadeAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastroCidadeSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(jBCadastroCidadeNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBAnterior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastroCidadeSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastroCidadeLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        titulo_cadastro.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        titulo_cadastro.setForeground(new java.awt.Color(36, 127, 194));
        titulo_cadastro.setText("Formulário Cadastro de Cidade ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(titulo_cadastro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo_cadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(420, 420, 420))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastroCidadeSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroCidadeSalvarActionPerformed
        try {
            modeloCidade.setNomeCidade(jTFNomeCidade.getText());
            conexaoEstado.executaSQL("SELECT * FROM tb_estados WHERE nome_estado = '" + jCBoxEstado.getSelectedItem() + "'");
            conexaoEstado.rs.first();
            modeloCidade.setIdEstado(conexaoEstado.rs.getInt("id_estado"));
            controleCidade.inserirCidade(modeloCidade);
            JOptionPane.showMessageDialog(null, "Dados Gravados com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar no Banco\n Erro: " + ex.getMessage());
        }
        jTFCodigoCidade.setEnabled(false);
        jTFNomeCidade.setEnabled(false);
        jCBoxEstado.setEnabled(false);

        jTFCodigoCidade.setText("");
        jTFNomeCidade.setText("");
        jCBoxEstado.addItem("");

        jBCadastroCidadeSalvar.setEnabled(false);     // DESABILITA OS BOTOES      
        jBCadastroCidadeAlterar.setEnabled(false);
        jBCadastroCidadeExcluir.setEnabled(false);
        jBCadastroCidadeLimpar.setEnabled(false);
        jBCadastroCidadeNovo.setEnabled(true);
        preencherTabela("SELECT * FROM tb_cidades INNER JOIN tb_estados ON tb_cidades.id_estado = tb_estados.id_estado");
    }//GEN-LAST:event_jBCadastroCidadeSalvarActionPerformed

    private void jBCadastroCidadeExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroCidadeExcluirActionPerformed
        try {
            modeloCidade.setIdCidade(Integer.parseInt(jTFCodigoCidade.getText()));
            modeloCidade.setNomeCidade(jTFNomeCidade.getText());
            modeloCidade.setIdEstado(conexaoCidade.rs.getInt("id_estado"));
            if (jTFCodigoCidade.getText().equals("") && jTFNomeCidade.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "o campo esta em branco!");
                jCBoxEstado.setEnabled(false);
            } else {
                int response = JOptionPane.showConfirmDialog(
                        this, " Voce quer deletar esse arquivo?", null,
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE);
                if (response == JOptionPane.YES_OPTION) {
                    controleCidade.deletarCidade(modeloCidade);
                    JOptionPane.showMessageDialog(null, "Dados Deletados com Sucesso!");
                    conexaoCidade.rs.next();
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar no Banco\n Erro: " + ex.getMessage());
        }

        jTFCodigoCidade.setEnabled(false);
        jTFNomeCidade.setEnabled(false);
        jCBoxEstado.setEnabled(false);

        jTFCodigoCidade.setText("");
        jTFNomeCidade.setText("");
        jCBoxEstado.addItem("");

        jBCadastroCidadeSalvar.setEnabled(false);     // DESABILITA OS BOTOES      
        jBCadastroCidadeAlterar.setEnabled(false);
        jBCadastroCidadeExcluir.setEnabled(false);
        jBCadastroCidadeLimpar.setEnabled(false);
        jBCadastroCidadeNovo.setEnabled(true);

        preencherTabela("SELECT * FROM tb_cidades INNER JOIN tb_estados ON tb_cidades.id_estado = tb_estados.id_estado");
    }//GEN-LAST:event_jBCadastroCidadeExcluirActionPerformed

    private void jBCadastroCidadeNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroCidadeNovoActionPerformed

        jTFCodigoCidade.setEnabled(false);
        jTFNomeCidade.setEnabled(true);
        jCBoxEstado.setEnabled(true);

        jTFCodigoCidade.setText("");
        jTFNomeCidade.setText("");
        jCBoxEstado.addItem("");

        jBCadastroCidadeSalvar.setEnabled(true);     // DESABILITA OS BOTOES      
        jBCadastroCidadeAlterar.setEnabled(true);
        jBCadastroCidadeExcluir.setEnabled(true);
        jBCadastroCidadeNovo.setEnabled(false);
    }//GEN-LAST:event_jBCadastroCidadeNovoActionPerformed

    private void jBCadastroCidadeSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroCidadeSairActionPerformed
        // TODO add your handling code here:
        dispose();

    }//GEN-LAST:event_jBCadastroCidadeSairActionPerformed


    private void jBPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPrimeiroActionPerformed
        jBCadastroCidadeAlterar.setEnabled(true);
        jBCadastroCidadeExcluir.setEnabled(true);
        jBCadastroCidadeLimpar.setEnabled(true);
        jBCadastroCidadeNovo.setEnabled(false);
        jTFNomeCidade.setEnabled(true);
        try {
            conexaoCidade.executaSQL("SELECT * FROM tb_cidades INNER JOIN tb_estados ON tb_cidades.id_estado = tb_estados.id_estado");
            conexaoCidade.rs.first();
            jTFCodigoCidade.setText(String.valueOf(conexaoCidade.rs.getInt("id_cidade")));
            jTFNomeCidade.setText(conexaoCidade.rs.getString("nome_cidade"));            
            
           // conexaoEstado.executaSQL("SELECT * FROM tb_estados WHERE id_estado=" +conexaoCidade.rs.getInt("id_estado"));
            //conexaoEstado.rs.first();
            jCBoxEstado.setSelectedItem(conexaoCidade.rs.getString("nome_estado"));//comboBox para mostrando o Estado referente

            jTFCodigoCidade.setEnabled(true); // campo habilitados quando a janela e aberta
            jTFNomeCidade.setEnabled(true);
            jCBoxEstado.setEnabled(true);

                    

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado no Banco\n Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_jBPrimeiroActionPerformed

    private void jBUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUltimoActionPerformed
        jBCadastroCidadeAlterar.setEnabled(true);
        jBCadastroCidadeExcluir.setEnabled(true);
        jBCadastroCidadeLimpar.setEnabled(true);
        jBCadastroCidadeNovo.setEnabled(false);
        jTFNomeCidade.setEnabled(true);
        try {
            conexaoCidade.executaSQL("SELECT * FROM tb_cidades INNER JOIN tb_estados ON tb_cidades.id_estado = tb_estados.id_estado");
            conexaoCidade.rs.last();
            jTFCodigoCidade.setText(String.valueOf(conexaoCidade.rs.getInt("id_cidade")));
            jTFNomeCidade.setText(conexaoCidade.rs.getString("nome_cidade"));

           // conexaoEstado.executaSQL("SELECT * FROM tb_estados WHERE id_estado=" +conexaoCidade.rs.getInt("id_estado"));
            //conexaoEstado.rs.last();
            jCBoxEstado.setSelectedItem(conexaoCidade.rs.getString("nome_estado"));//comboBox para mostrando o Estado referente
            
            jTFCodigoCidade.setEnabled(true); // campo habilitados quando a janela e aberta
            jTFNomeCidade.setEnabled(true);
            jCBoxEstado.setEnabled(true);                     

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado no Banco\n Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_jBUltimoActionPerformed

    private void jBAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnteriorActionPerformed
        jBCadastroCidadeAlterar.setEnabled(true);
        jBCadastroCidadeExcluir.setEnabled(true);
        jBCadastroCidadeLimpar.setEnabled(true);
        jBCadastroCidadeNovo.setEnabled(false);
        jTFNomeCidade.setEnabled(true);
        try {
            //conexaoCidade.executaSQL("SELECT * FROM tb_cidades ORDER BY id_cidade");            
            conexaoCidade.rs.previous();
            
            jTFCodigoCidade.setEnabled(true); // campo habilitados quando a janela e aberta
            jTFNomeCidade.setEnabled(true);
            jCBoxEstado.setEnabled(true); 
            
            jTFCodigoCidade.setText(String.valueOf(conexaoCidade.rs.getInt("id_cidade")));
            jTFNomeCidade.setText(conexaoCidade.rs.getString("nome_cidade"));

           // conexaoEstado.executaSQL("SELECT * FROM tb_estados WHERE id_estado=" +conexaoCidade.rs.getInt("id_estado"));
            //conexaoEstado.rs.previous();
            jCBoxEstado.setSelectedItem(conexaoCidade.rs.getString("nome_estado"));//comboBox para mostrando o Estado referente                             

        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_jBAnteriorActionPerformed

    private void jBProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProximoActionPerformed
        jBCadastroCidadeAlterar.setEnabled(true);
        jBCadastroCidadeExcluir.setEnabled(true);
        jBCadastroCidadeLimpar.setEnabled(true);
        jBCadastroCidadeNovo.setEnabled(false);
        jTFNomeCidade.setEnabled(true);
        try {
            //conexaoCidade.executaSQL("SELECT * FROM cidade ORDER BY id_cidade");            
            conexaoCidade.rs.next();
            jTFCodigoCidade.setText(String.valueOf(conexaoCidade.rs.getInt("id_cidade")));
            jTFNomeCidade.setText(conexaoCidade.rs.getString("nome_cidade"));

            //conexaoEstado.executaSQL("SELECT * FROM tb_estados WHERE id_estado=" +conexaoCidade.rs.getInt("id_estado"));
            //conexaoEstado.rs.next();
            jCBoxEstado.setSelectedItem(conexaoCidade.rs.getString("nome_estado"));//comboBox para mostrando o Estado referente
            
            jTFCodigoCidade.setEnabled(true); // campo habilitados quando a janela e aberta
            jTFNomeCidade.setEnabled(true);
            jCBoxEstado.setEnabled(true);                  

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado no Banco\n Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_jBProximoActionPerformed

    private void jBCadastroCidadeAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroCidadeAlterarActionPerformed
        // TODO add your handling code here:

        try {
            modeloCidade.setIdCidade(Integer.parseInt(jTFCodigoCidade.getText()));
            modeloCidade.setNomeCidade(jTFNomeCidade.getText());
            conexaoEstado.executaSQL("SELECT * FROM tb_estados WHERE nome_estado ='" + jCBoxEstado.getSelectedItem() + "'");
            conexaoEstado.rs.first();
            modeloCidade.setIdEstado(conexaoEstado.rs.getInt("id_estado"));
            controleCidade.alterarCidade(modeloCidade);
            JOptionPane.showMessageDialog(null, "Dados Atualizados com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar no Banco\n Erro: " + ex.getMessage());
        }

        jTFCodigoCidade.setEnabled(false);
        jTFNomeCidade.setEnabled(false);
        jCBoxEstado.setEnabled(false);

        jTFCodigoCidade.setText("");
        jTFNomeCidade.setText("");
        jCBoxEstado.addItem("");

        jBCadastroCidadeSalvar.setEnabled(false);     // DESABILITA OS BOTOES      
        jBCadastroCidadeAlterar.setEnabled(false);
        jBCadastroCidadeExcluir.setEnabled(false);
        jBCadastroCidadeLimpar.setEnabled(false);
        jBCadastroCidadeNovo.setEnabled(true);

        preencherTabela("SELECT * FROM tb_cidades INNER JOIN tb_estados ON tb_cidades.id_estado = tb_estados.id_estado");
    }//GEN-LAST:event_jBCadastroCidadeAlterarActionPerformed

    private void jBCadastroCidadeLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroCidadeLimparActionPerformed
        // TODO add your handling code here:
        jTFCodigoCidade.setEnabled(false);
        jTFNomeCidade.setEnabled(false);
        jCBoxEstado.setEnabled(false);

        jTFCodigoCidade.setText("");
        jTFNomeCidade.setText("");
        jCBoxEstado.addItem("");

        jBCadastroCidadeSalvar.setEnabled(false);     // DESABILITA OS BOTOES      
        jBCadastroCidadeAlterar.setEnabled(false);
        jBCadastroCidadeExcluir.setEnabled(false);
        jBCadastroCidadeNovo.setEnabled(true);
    }//GEN-LAST:event_jBCadastroCidadeLimparActionPerformed

    public void preencherTabela(String sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Cidade", "Estado", "UF"};

        conexaoCidade.executaSQL(sql);
        try {
            conexaoCidade.rs.first();
            do {
                dados.add(new Object[]{conexaoCidade.rs.getInt("id_cidade"),
                    conexaoCidade.rs.getString("nome_cidade"),
                    conexaoCidade.rs.getString("nome_estado"),
                    conexaoCidade.rs.getString("uf")});
            } while (conexaoCidade.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Preencher dados na Tabela com o Banco de dados\n Erro: " + ex.getMessage());
        }

        ModeloTabela modeloTabela = new ModeloTabela(dados, colunas);
        jTableCidade.setModel(modeloTabela);
        jTableCidade.getColumnModel().getColumn(0).setPreferredWidth(100); // configuracao de tamanho do campo
        jTableCidade.getColumnModel().getColumn(0).setResizable(false); // redimensionamento da tabela nesse caso e falso

        jTableCidade.getColumnModel().getColumn(1).setPreferredWidth(350); // configuracao de tamanho do campo
        jTableCidade.getColumnModel().getColumn(1).setResizable(false); // redimensionamento da tabela nesse caso e true

        jTableCidade.getColumnModel().getColumn(2).setPreferredWidth(190); // configuracao de tamanho do campo
        jTableCidade.getColumnModel().getColumn(2).setResizable(true); // redimensionamento da tabela nesse caso e true

        jTableCidade.getColumnModel().getColumn(3).setPreferredWidth(100); // configuracao de tamanho do campo
        jTableCidade.getColumnModel().getColumn(3).setResizable(true); // redimensionamento da tabela nesse caso e true

        jTableCidade.getTableHeader().setReorderingAllowed(false); // nao faz reordenacao
        jTableCidade.setAutoResizeMode(jTableCidade.AUTO_RESIZE_OFF);//nao e redimensionavel
        jTableCidade.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // posso selecionar somente um campo
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
            java.util.logging.Logger.getLogger(FrmCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAnterior;
    private javax.swing.JButton jBCadastroCidadeAlterar;
    private javax.swing.JButton jBCadastroCidadeExcluir;
    private javax.swing.JButton jBCadastroCidadeLimpar;
    private javax.swing.JButton jBCadastroCidadeNovo;
    private javax.swing.JButton jBCadastroCidadeSair;
    private javax.swing.JButton jBCadastroCidadeSalvar;
    private javax.swing.JButton jBPrimeiro;
    private javax.swing.JButton jBProximo;
    private javax.swing.JButton jBUltimo;
    private javax.swing.JComboBox jCBoxEstado;
    private javax.swing.JLabel jLCodigoCidade;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLNomeCidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCodigoCidade;
    private javax.swing.JTextField jTFNomeCidade;
    private javax.swing.JTable jTableCidade;
    private javax.swing.JLabel titulo_cadastro;
    // End of variables declaration//GEN-END:variables
}
