package br.com.projetosistema.controle;

import br.com.projetosistema.modelo.ModeloCidade;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControleCidade {

    ConectaBanco conexaoCidade = new ConectaBanco();

    public void inserirCidade(ModeloCidade modeloCidade) {

        try {
            conexaoCidade.conecta();
            PreparedStatement pst = conexaoCidade.conn.prepareStatement("INSERT INTO tb_cidades(nome_cidade,id_estado) VALUES(?,?)");
            pst.setString(1, modeloCidade.getNomeCidade());
            pst.setInt(2, modeloCidade.getIdEstado());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar no Banco\n Erro: " + ex.getMessage());
        }
        conexaoCidade.desconecta();
    }

    public void alterarCidade(ModeloCidade modeloCidade) {

        try {
            conexaoCidade.conecta();
            PreparedStatement pst = conexaoCidade.conn.prepareStatement("UPDATE tb_cidades SET nome_cidade = ?, id_estado = ? WHERE id_cidade = ?");
            pst.setString(1, modeloCidade.getNomeCidade());
            pst.setInt(2, modeloCidade.getIdEstado());
            pst.setInt(3, modeloCidade.getIdCidade());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Alteração dos dados.\n Erro: " + ex.getMessage());
        }
        conexaoCidade.desconecta();
    }

    public void deletarCidade(ModeloCidade modeloCidade) {
        
        try {
            conexaoCidade.conecta();
            PreparedStatement pst = conexaoCidade.conn.prepareStatement("DELETE FROM tb_cidades WHERE id_cidade=?");
            pst.setInt(1, modeloCidade.getIdCidade());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Deletar os dados.\n Erro:  " + ex.getMessage());
        }
        conexaoCidade.desconecta();
    }

}
