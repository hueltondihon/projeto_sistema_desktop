/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.projetosistema.controle;

import br.com.projetosistema.modelo.ModeloBairro;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControleBairro {
    ConectaBanco conexaoBairro = new ConectaBanco();
    
    public void inserirBairro(ModeloBairro modeloBairro){
        try {
            PreparedStatement pst = conexaoBairro.conn.prepareStatement("INSERT INTO tb_bairros(nome_bairro,id_cidade)VALUES(?,?)");
            pst.setString(1, modeloBairro.getNomeBairro());
            pst.setInt(2, modeloBairro.getIdCidade());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControleBairro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void alterarBairro(ModeloBairro modeloBairro){
        try {
            PreparedStatement pst = conexaoBairro.conn.prepareStatement("");
        } catch (SQLException ex) {
            Logger.getLogger(ControleBairro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deletarBairro(ModeloBairro modeloBairro){
        try {
            PreparedStatement pst = conexaoBairro.conn.prepareStatement("DELETE FROM tb_bairros WHERE id_bairro=?");
            pst.setInt(1, modeloBairro.getIdBairro());
            pst.execute();            
        } catch (SQLException ex) {
            Logger.getLogger(ControleBairro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
