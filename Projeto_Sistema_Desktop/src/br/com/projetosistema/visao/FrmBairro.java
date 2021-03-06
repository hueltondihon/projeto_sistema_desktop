/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetosistema.visao;

import br.com.projetosistema.controle.ConectaBanco;
import br.com.projetosistema.controle.ControleBairro;
import br.com.projetosistema.controle.ModeloTabela;
import br.com.projetosistema.modelo.ModeloBairro;
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
public class FrmBairro extends javax.swing.JFrame {

    ConectaBanco conexaoEstado = new ConectaBanco(); // instancia a classe de conexao do banco com entidade Estado
    ConectaBanco conexaoCidade = new ConectaBanco(); // instancia a classe de conexao do banco com entidade cidade
    ConectaBanco conexaoBairro = new ConectaBanco();  // instancia a classe de conexao do banco com entidade Bairro
    ModeloBairro modeloBairro = new ModeloBairro();  //Meu objeto de modelo
    ControleBairro controleBairro = new ControleBairro(); //o controlador do objeto modelo
    
    int flag = 1;

    /**
     * Creates new form FrmCidade
     */
    public FrmBairro() {
        initComponents();

       
        conexaoCidade.conecta(); // abre a conexao do banco dentro da janela
        conexaoBairro.conecta(); // abre a conexao do banco dentro da janela       
        conexaoCidade.executaSQL("SELECT * FROM tb_cidades ORDER BY nome_cidade ");
        //conexaoEstado.executaSQL("SELECT * FROM tb_estados ORDER BY id_estado");
        jCBoxCidade.removeAllItems(); //remove todos os itens ue nao sao ligados ao banco de dados 
        jCBSiglaEstado.removeAllItems();
         atualizaComboBox();
         preencherTabela("SELECT * FROM tb_bairros INNER JOIN tb_cidades ON tb_bairros.id_cidade = tb_cidades.id_cidade");
         
        jTFCodigoBairro.setEnabled(false); // campo desabilitados quando a janela e aberta
        jTFNomeBairro.setEnabled(false);

        jBCadastroBairroSalvar.setEnabled(false);    // DESABILITA OS BOTOES  quando a janela e aberta
        jBCadastroBairroAlterar.setEnabled(false);
        jBCadastroBairroExcluir.setEnabled(false);
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
        jTFCodigoBairro = new javax.swing.JTextField();
        jTFNomeBairro = new javax.swing.JTextField();
        jBCadastroBairroNovo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCidade = new javax.swing.JTable();
        jBCadastroBairroSalvar = new javax.swing.JButton();
        jBCadastroBairroAlterar = new javax.swing.JButton();
        jBCadastroBairroExcluir = new javax.swing.JButton();
        jBCadastroBairroSair = new javax.swing.JButton();
        jBPrimeiro = new javax.swing.JButton();
        jBUltimo = new javax.swing.JButton();
        jBAnterior = new javax.swing.JButton();
        jBProximo = new javax.swing.JButton();
        jCBoxCidade = new javax.swing.JComboBox();
        jBCadastroBairroLimpar = new javax.swing.JButton();
        jBAdicionarCidade = new javax.swing.JButton();
        jCBSiglaEstado = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        titulo_cadastro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Bairro");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(227, 227, 243));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLCodigoCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCodigoCidade.setText("Codigo:");

        jLNomeCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNomeCidade.setText("Nome Bairro:");

        jLEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEstado.setText("Cidade:");

        jTFCodigoBairro.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTFCodigoBairro.setToolTipText("Codigo do Bairro");

        jTFNomeBairro.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTFNomeBairro.setToolTipText("Nome do Bairro");

        jBCadastroBairroNovo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huelton\\Documents\\GitHub\\projeto_sistema_desktop\\Projeto_Sistema_Desktop\\src\\imagem_projeto\\cadastro_inserir1.png")); // NOI18N
        jBCadastroBairroNovo.setToolTipText("Novo Cadastro");
        jBCadastroBairroNovo.setPreferredSize(new java.awt.Dimension(70, 48));
        jBCadastroBairroNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroBairroNovoActionPerformed(evt);
            }
        });

        jTableCidade.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
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

        jBCadastroBairroSalvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huelton\\Documents\\GitHub\\projeto_sistema_desktop\\Projeto_Sistema_Desktop\\src\\imagem_projeto\\cadastro_salvar2.png")); // NOI18N
        jBCadastroBairroSalvar.setToolTipText("Salvar Cadastro");
        jBCadastroBairroSalvar.setPreferredSize(new java.awt.Dimension(70, 48));
        jBCadastroBairroSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroBairroSalvarActionPerformed(evt);
            }
        });

        jBCadastroBairroAlterar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huelton\\Documents\\GitHub\\projeto_sistema_desktop\\Projeto_Sistema_Desktop\\src\\imagem_projeto\\cadastro_atualizar3.png")); // NOI18N
        jBCadastroBairroAlterar.setToolTipText("Alterar Cadastro");
        jBCadastroBairroAlterar.setPreferredSize(new java.awt.Dimension(60, 40));
        jBCadastroBairroAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroBairroAlterarActionPerformed(evt);
            }
        });

        jBCadastroBairroExcluir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huelton\\Documents\\GitHub\\projeto_sistema_desktop\\Projeto_Sistema_Desktop\\src\\imagem_projeto\\cadastro_deletar4.png")); // NOI18N
        jBCadastroBairroExcluir.setToolTipText("Excluir Cadastro");
        jBCadastroBairroExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroBairroExcluirActionPerformed(evt);
            }
        });

        jBCadastroBairroSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huelton\\Documents\\GitHub\\projeto_sistema_desktop\\Projeto_Sistema_Desktop\\src\\imagem_projeto\\cadastro_sair6.png")); // NOI18N
        jBCadastroBairroSair.setToolTipText("Sair da Pagina");
        jBCadastroBairroSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroBairroSairActionPerformed(evt);
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

        jCBoxCidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jCBoxCidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBoxCidade.setToolTipText("Lista das Cidades");
        jCBoxCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBoxCidadeActionPerformed(evt);
            }
        });

        jBCadastroBairroLimpar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Huelton\\Documents\\GitHub\\projeto_sistema_desktop\\Projeto_Sistema_Desktop\\src\\imagem_projeto\\cadastro_limpar5.png")); // NOI18N
        jBCadastroBairroLimpar.setToolTipText("Limpa os Campos");
        jBCadastroBairroLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroBairroLimparActionPerformed(evt);
            }
        });

        jBAdicionarCidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jBAdicionarCidade.setText("Adicionar");
        jBAdicionarCidade.setToolTipText("Adicionar Cidade");

        jCBSiglaEstado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jCBSiglaEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBSiglaEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSiglaEstadoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("UF:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLCodigoCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFCodigoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBCadastroBairroNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBCadastroBairroSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBCadastroBairroAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBCadastroBairroExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBCadastroBairroLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLNomeCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFNomeBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBoxCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBSiglaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBCadastroBairroSair, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBAdicionarCidade))))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigoCidade)
                    .addComponent(jTFCodigoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAdicionarCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLNomeCidade)
                        .addComponent(jTFNomeBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLEstado)
                        .addComponent(jCBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCBSiglaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBProximo, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(jBUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBPrimeiro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastroBairroExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastroBairroAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastroBairroSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastroBairroNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBAnterior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastroBairroSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastroBairroLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        titulo_cadastro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titulo_cadastro.setForeground(new java.awt.Color(36, 127, 194));
        titulo_cadastro.setText("Formulário Cadastro de Bairro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(titulo_cadastro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_cadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastroBairroSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroBairroSalvarActionPerformed
          
        if(flag == 1 ) {
            
            modeloBairro.setNomeBairro(jTFNomeBairro.getText());
            modeloBairro.setCidade("" + jCBoxCidade.getSelectedItem());
            conexaoCidade.executaSQL("SELECT * FROM tb_cidades WHERE uf = '" + jCBSiglaEstado.getSelectedItem() + "'");
            try {
                modeloBairro.setCidade(conexaoCidade.rs.getString("uf"));
            } catch (SQLException ex) {
                Logger.getLogger(FrmBairro.class.getName()).log(Level.SEVERE, null, ex);
            }
            controleBairro.inserirBairro(modeloBairro);
            preencherTabela("SELECT * FROM tb_bairros INNER JOIN tb_cidades ON tb_bairros.id_cidade = tb_cidades.id_cidade");

        } else{
            modeloBairro.setNomeBairro(jTFNomeBairro.getText());
            modeloBairro.setCidade("" + jCBoxCidade.getSelectedItem());
            conexaoCidade.executaSQL("SELECT * FROM tb_cidades WHERE uf = '" + jCBSiglaEstado.getSelectedItem() + "'");
            try {
                modeloBairro.setCidade(conexaoCidade.rs.getString("uf"));
            } catch (SQLException ex) {
                Logger.getLogger(FrmBairro.class.getName()).log(Level.SEVERE, null, ex);
            }
            controleBairro.alterarBairro(modeloBairro);
            preencherTabela("SELECT * FROM tb_bairros INNER JOIN tb_cidades ON tb_bairros.id_cidade = tb_cidades.id_cidade");
        }
        jTFCodigoBairro.setEnabled(false);
        jTFNomeBairro.setEnabled(!true);
        jCBoxCidade.setEnabled(false);

        jTFNomeBairro.setText("");
        jCBoxCidade.addItem("");

        jBCadastroBairroSalvar.setEnabled(true);     // DESABILITA OS BOTOES      
        jBCadastroBairroAlterar.setEnabled(false);
        jBCadastroBairroExcluir.setEnabled(false);
        jBCadastroBairroLimpar.setEnabled(true);
        jBCadastroBairroNovo.setEnabled(!false);
        preencherTabela("SELECT * FROM tb_bairros INNER JOIN tb_cidades ON tb_bairros.id_cidade = tb_cidades.id_cidade");
    }//GEN-LAST:event_jBCadastroBairroSalvarActionPerformed

    private void jBCadastroBairroExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroBairroExcluirActionPerformed
        
        modeloBairro.setIdBairro(Integer.parseInt(jTFCodigoBairro.getText()));
        controleBairro.deletarBairro(modeloBairro);
        
        jTFCodigoBairro.setEnabled(false);
        jTFNomeBairro.setEnabled(false);
        jCBoxCidade.setEnabled(false);

        jTFCodigoBairro.setText("");
        jTFNomeBairro.setText("");
        jCBoxCidade.addItem("");

        jBCadastroBairroSalvar.setEnabled(false);     // DESABILITA OS BOTOES      
        jBCadastroBairroAlterar.setEnabled(false);
        jBCadastroBairroExcluir.setEnabled(false);
        jBCadastroBairroLimpar.setEnabled(false);
        jBCadastroBairroNovo.setEnabled(true);

        preencherTabela("SELECT * FROM tb_bairros INNER JOIN tb_cidades ON tb_bairros.id_cidade = tb_cidades.id_cidade");
    }//GEN-LAST:event_jBCadastroBairroExcluirActionPerformed

    private void jBCadastroBairroNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroBairroNovoActionPerformed

        jTFCodigoBairro.setEnabled(false);
        jTFNomeBairro.setEnabled(true);
        jCBoxCidade.setEnabled(true);

        jTFCodigoBairro.setText("");
        jTFNomeBairro.setText("");        

        jBCadastroBairroSalvar.setEnabled(true);     // DESABILITA OS BOTOES      
        jBCadastroBairroAlterar.setEnabled(true);
        jBCadastroBairroExcluir.setEnabled(false);
        jBCadastroBairroLimpar.setEnabled(true);
        jBCadastroBairroNovo.setEnabled(false);
    }//GEN-LAST:event_jBCadastroBairroNovoActionPerformed

    private void jBCadastroBairroSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroBairroSairActionPerformed
        // TODO add your handling code here:
        dispose();

    }//GEN-LAST:event_jBCadastroBairroSairActionPerformed


    private void jBPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPrimeiroActionPerformed
        
        modeloBairro = controleBairro.Primeiro();
        jTFCodigoBairro.setText(String.valueOf(modeloBairro.getIdBairro()));
        jTFNomeBairro.setText(modeloBairro.getNomeBairro());
        jCBoxCidade.setSelectedItem(modeloBairro.getCidade());
        try {
            conexaoCidade.executaSQL("SELECT * FROM tb_cidades WHERE uf = '" + jCBSiglaEstado.getSelectedItem() + "'");
            jCBSiglaEstado.setSelectedItem(conexaoCidade.rs.getString("uf"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar o Primeiro\n Erro: " + ex.getMessage());
        }
        
        jBCadastroBairroAlterar.setEnabled(true);
        jBCadastroBairroExcluir.setEnabled(true);
        jBCadastroBairroLimpar.setEnabled(true);  

    }//GEN-LAST:event_jBPrimeiroActionPerformed

    private void jBUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUltimoActionPerformed
        
        modeloBairro = controleBairro.Ultimo();
        jTFCodigoBairro.setText(String.valueOf(modeloBairro.getIdBairro()));
        jTFNomeBairro.setText(modeloBairro.getNomeBairro());
        jCBoxCidade.setSelectedItem(modeloBairro.getCidade());
        try {
            conexaoCidade.executaSQL("SELECT * FROM tb_cidades WHERE uf = '" + jCBSiglaEstado.getSelectedItem() + "'");
            jCBSiglaEstado.setSelectedItem(conexaoCidade.rs.getString("uf"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar o Ultimo\n Erro: " + ex.getMessage());
        }
        
        jBCadastroBairroAlterar.setEnabled(true);
        jBCadastroBairroExcluir.setEnabled(true);
        jBCadastroBairroLimpar.setEnabled(true);
        
    }//GEN-LAST:event_jBUltimoActionPerformed

    private void jBAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnteriorActionPerformed
         modeloBairro = controleBairro.Anterior();
        jTFCodigoBairro.setText(String.valueOf(modeloBairro.getIdBairro()));
        jTFNomeBairro.setText(modeloBairro.getNomeBairro());
        jCBoxCidade.setSelectedItem(modeloBairro.getCidade());
        try {
            conexaoCidade.executaSQL("SELECT * FROM tb_cidades WHERE uf = '" + jCBSiglaEstado.getSelectedItem() + "'");
            jCBSiglaEstado.setSelectedItem(conexaoCidade.rs.getString("uf"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar o Anterior\n Erro: " + ex.getMessage());
        }
        
        jBCadastroBairroAlterar.setEnabled(true);
        jBCadastroBairroExcluir.setEnabled(true);
        jBCadastroBairroLimpar.setEnabled(true);
        
    }//GEN-LAST:event_jBAnteriorActionPerformed

    private void jBProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProximoActionPerformed
         modeloBairro = controleBairro.Proximo();
        jTFCodigoBairro.setText(String.valueOf(modeloBairro.getIdBairro()));
        jTFNomeBairro.setText(modeloBairro.getNomeBairro());
        jCBoxCidade.setSelectedItem(modeloBairro.getCidade());
        try {
            conexaoCidade.executaSQL("SELECT * FROM tb_cidades WHERE uf = '" + jCBSiglaEstado.getSelectedItem() + "'");
            jCBSiglaEstado.setSelectedItem(conexaoCidade.rs.getString("uf"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar o Proximo\n Erro: " + ex.getMessage());
        }
        
        jBCadastroBairroAlterar.setEnabled(true);
        jBCadastroBairroExcluir.setEnabled(true);
        jBCadastroBairroLimpar.setEnabled(true);
        
    }//GEN-LAST:event_jBProximoActionPerformed

    private void jBCadastroBairroAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroBairroAlterarActionPerformed
        
         flag = 2;
         
        jTFNomeBairro.setEnabled(true);
        jBCadastroBairroSalvar.setEnabled(true);     // DESABILITA OS BOTOES      
        jBCadastroBairroAlterar.setEnabled(false);
        jBCadastroBairroNovo.setEnabled(false);

        preencherTabela("SELECT * FROM tb_bairros INNER JOIN tb_cidades ON tb_bairros.id_cidade = tb_cidades.id_cidade");
    }//GEN-LAST:event_jBCadastroBairroAlterarActionPerformed

    private void jBCadastroBairroLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroBairroLimparActionPerformed
        // TODO add your handling code here:
        jTFCodigoBairro.setEnabled(false);
        jTFNomeBairro.setEnabled(false);
        jCBoxCidade.setEnabled(false);

        jTFCodigoBairro.setText("");
        jTFNomeBairro.setText("");
        jCBoxCidade.addItem("");

        jBCadastroBairroSalvar.setEnabled(false);     // DESABILITA OS BOTOES      
        jBCadastroBairroAlterar.setEnabled(false);
        jBCadastroBairroExcluir.setEnabled(false);
        jBCadastroBairroNovo.setEnabled(true);
        
    }//GEN-LAST:event_jBCadastroBairroLimparActionPerformed

    private void jCBoxCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBoxCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBoxCidadeActionPerformed

    private void jCBSiglaEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSiglaEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBSiglaEstadoActionPerformed

    public void preencherTabela(String sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Bairro", "Cidade"};

        conexaoBairro.executaSQL(sql);
        try {
            conexaoBairro.rs.first();
            do {
                dados.add(new Object[]{conexaoBairro.rs.getInt("id_bairro"),
                    conexaoBairro.rs.getString("nome_bairro"),
                    conexaoBairro.rs.getString("nome_cidade")});
            } while (conexaoBairro.rs.next());
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
            java.util.logging.Logger.getLogger(FrmBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBairro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmPrincipal().setVisible(true);
            }
        });
    }
    
    public void atualizaComboBox(){
      jCBoxCidade.removeAllItems();
      jCBSiglaEstado.removeAllItems();      
     
        try {
            conexaoCidade.executaSQL("SELECT * FROM tb_cidades ORDER BY nome_cidade");
           
            conexaoCidade.rs.first();
           do {                
                jCBoxCidade.addItem(conexaoCidade.rs.getString("nome_cidade"));
                jCBSiglaEstado.addItem(conexaoCidade.rs.getString("uf"));
            } while (conexaoCidade.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Preencher as Cidades e Estados\n Erro: " + ex.getMessage());
        }
              
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdicionarCidade;
    private javax.swing.JButton jBAnterior;
    private javax.swing.JButton jBCadastroBairroAlterar;
    private javax.swing.JButton jBCadastroBairroExcluir;
    private javax.swing.JButton jBCadastroBairroLimpar;
    private javax.swing.JButton jBCadastroBairroNovo;
    private javax.swing.JButton jBCadastroBairroSair;
    private javax.swing.JButton jBCadastroBairroSalvar;
    private javax.swing.JButton jBPrimeiro;
    private javax.swing.JButton jBProximo;
    private javax.swing.JButton jBUltimo;
    private javax.swing.JComboBox jCBSiglaEstado;
    private javax.swing.JComboBox jCBoxCidade;
    private javax.swing.JLabel jLCodigoCidade;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLNomeCidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCodigoBairro;
    private javax.swing.JTextField jTFNomeBairro;
    private javax.swing.JTable jTableCidade;
    private javax.swing.JLabel titulo_cadastro;
    // End of variables declaration//GEN-END:variables
}
