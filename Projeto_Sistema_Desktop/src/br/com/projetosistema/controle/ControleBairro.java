
package br.com.projetosistema.controle;

import br.com.projetosistema.modelo.ModeloBairro;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControleBairro {
    ConectaBanco conexaoBairro = new ConectaBanco();
    ConectaBanco conexaoPesqCidade= new ConectaBanco();
    ConectaBanco conexaoPesqEstado= new ConectaBanco();
    int codCid,codEst;
    String cidade, estado;
    
    
    public void inserirBairro(ModeloBairro modeloBairro){
        conexaoBairro.conecta();
        try {
            conexaoBairro.executaSQL("SELECT * FROM tb_cidades WHERE nome_cidade = '"+modeloBairro.getCidade()+"' AND uf= '"+modeloBairro.getEstado()+"'");
            conexaoBairro.rs.first();
            codCid = conexaoBairro.rs.getInt("id_cidade");
            PreparedStatement pst = conexaoBairro.conn.prepareStatement("INSERT INTO tb_bairros"
                                                                        + "(nome_bairro,id_cidade)"
                                                                        + "VALUES(?,?)");
            pst.setString(1, modeloBairro.getNomeBairro());
            pst.setInt(2, codCid);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Inseridos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Mostrar Dados\n Erro: " + ex.getMessage());
        }
        conexaoBairro.desconecta();
    }
     
    
    public ModeloBairro Primeiro(){
        ModeloBairro modeloBairro = new ModeloBairro();
        conexaoBairro.conecta();
        conexaoPesqCidade.conecta();
        conexaoBairro.executaSQL("SELECT * FROM tb_bairros");
        try {
            conexaoBairro.rs.first();
            conexaoPesqCidade.executaSQL("SELECT * FROM tb_cidades WHERE id_cidade="+conexaoBairro.rs.getInt("id_cidade"));
            conexaoPesqCidade.rs.first();
            cidade = conexaoPesqCidade.rs.getString("nome_cidade");
            
            conexaoPesqEstado.executaSQL("SELECT * FROM tb_estados WHERE id_estado="+conexaoPesqEstado.rs.getInt("id_estado"));
            conexaoPesqEstado.rs.first();
            estado = conexaoPesqEstado.rs.getString("sigla_estado");
            
            modeloBairro.setIdBairro(conexaoBairro.rs.getInt("id_bairro"));
            modeloBairro.setNomeBairro(conexaoBairro.rs.getString("nome_bairro"));
            modeloBairro.setCidade(cidade);
            modeloBairro.setEstado(estado);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Mostrar Dados\n Erro: " + ex.getMessage());
        }
        conexaoBairro.desconecta();
        conexaoPesqCidade.desconecta();
        return modeloBairro;
    }
    
      public ModeloBairro Anterior(){
        ModeloBairro modeloBairro = new ModeloBairro();
        conexaoBairro.conecta();
        conexaoPesqCidade.conecta();
        //conexaoBairro.executaSQL("SELECT * FROM tb_bairros");
        try {
            conexaoBairro.rs.previous();
            conexaoPesqCidade.executaSQL("SELECT * FROM tb_cidades "
                                   + "WHERE id_cidade="+conexaoBairro.rs.getInt("id_cidade"));
            conexaoPesqCidade.rs.first();
            cidade = conexaoPesqCidade.rs.getString("nome_cidade");
            modeloBairro.setIdBairro(conexaoBairro.rs.getInt("id_bairro"));
            modeloBairro.setNomeBairro(conexaoBairro.rs.getString("nome_bairro"));
            modeloBairro.setCidade(cidade);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Mostrar Dados\n Erro: " + ex.getMessage());
        }
        //conexaoBairro.desconecta();
        conexaoPesqCidade.desconecta();
        return modeloBairro;
    }
      
      public ModeloBairro Proximo(){
        ModeloBairro modeloBairro = new ModeloBairro();
        conexaoBairro.conecta();
        conexaoPesqCidade.conecta();
        //conexaoBairro.executaSQL("SELECT * FROM tb_bairros");
        try {
            conexaoBairro.rs.next();
            conexaoPesqCidade.executaSQL("SELECT * FROM tb_cidades "
                                   + "WHERE id_cidade="+conexaoBairro.rs.getInt("id_cidade"));
            conexaoPesqCidade.rs.first();
            cidade = conexaoPesqCidade.rs.getString("nome_cidade");
            modeloBairro.setIdBairro(conexaoBairro.rs.getInt("id_bairro"));
            modeloBairro.setNomeBairro(conexaoBairro.rs.getString("nome_bairro"));
            modeloBairro.setCidade(cidade);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Mostrar Dados\n Erro: " + ex.getMessage());
        }
        //conexaoBairro.desconecta();
        conexaoPesqCidade.desconecta();
        return modeloBairro;
    }
      
      public ModeloBairro Ultimo(){
        ModeloBairro modeloBairro = new ModeloBairro();
        conexaoBairro.conecta();
        conexaoPesqCidade.conecta();
        conexaoBairro.executaSQL("SELECT * FROM tb_bairros");
        try {
            conexaoBairro.rs.last();
            conexaoPesqCidade.executaSQL("SELECT * FROM tb_cidades "
                                    + "WHERE id_cidade="+conexaoBairro.rs.getInt("id_cidade"));
            conexaoPesqCidade.rs.first();
            cidade = conexaoPesqCidade.rs.getString("nome_cidade");
            modeloBairro.setIdBairro(conexaoBairro.rs.getInt("id_bairro"));
            modeloBairro.setNomeBairro(conexaoBairro.rs.getString("nome_bairro"));
            modeloBairro.setCidade(cidade);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Mostrar Dados\n Erro: " + ex.getMessage());
        }
        conexaoBairro.desconecta();
        conexaoPesqCidade.desconecta();
        return modeloBairro;
    }
    
     public void alterarBairro(ModeloBairro modeloBairro){
        conexaoBairro.conecta();
        conexaoPesqCidade.conecta();
        try {
            conexaoPesqCidade.executaSQL("SELECT * FROM tb_cidades WHERE nome_cidade = '"+modeloBairro.getNomeBairro()+"'");
            conexaoBairro.rs.first();
            codCid = conexaoBairro.rs.getInt("id_cidade");
            PreparedStatement pst = conexaoBairro.conn.prepareStatement("UPDATE tb_bairros SET"
                    + "nome_bairro = ?"
                    + "id_cidade = ?"
                    + "WHERE id_cidade = ?)"
                    );
            pst.setString(1, modeloBairro.getNomeBairro());
            pst.setInt(2, codCid);
            pst.setInt(3, modeloBairro.getIdBairro());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Atualizados com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Mostrar Dados\n Erro: " + ex.getMessage());
        }
        conexaoBairro.desconecta();
        conexaoPesqCidade.desconecta();
    }  
      
    
    public void deletarBairro(ModeloBairro modeloBairro){
        conexaoBairro.conecta();
        try {
            PreparedStatement pst = conexaoBairro.conn.prepareStatement("DELETE FROM tb_bairros WHERE id_bairro=?");
            pst.setInt(1, modeloBairro.getIdBairro());
            pst.execute(); 
            JOptionPane.showMessageDialog(null, "Dados Deletados com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Mostrar Dados\n Erro: " + ex.getMessage());
        }
        conexaoBairro.desconecta();
    }    
    
}
