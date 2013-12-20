package br.com.projetosistema.controle;

import br.com.projetosistema.modelo.ModeloEstado;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class ControleEstado {
    
    ConectaBanco conectaEstado = new ConectaBanco();
    
    public void inserirEstado(ModeloEstado modeloEstado){
        try {
            conectaEstado.conecta();
            PreparedStatement pst = conectaEstado.conn.prepareStatement("INSERT INTO tb_estados(nome_estdado,sigla_estado) VALUES(?,?)");
            pst.setString(1, modeloEstado.getNomeEstado());
            pst.setString(2, modeloEstado.getSiglaEstado());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar no Banco\n Erro: "+ex.getMessage());
        }
        conectaEstado.desconecta();
    }
         
    
    public void deletarEstado(ModeloEstado modeloEstado){
        try {
            conectaEstado.conecta();
            PreparedStatement pst = conectaEstado.conn.prepareStatement("DELETE FROM tb_estados WHERE id_estado=?");
            pst.setInt(1, modeloEstado.getIdEstado());
            pst.execute();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar no Banco\n Erro: "+ex.getMessage());
        }
        conectaEstado.desconecta();
    }
    
}
