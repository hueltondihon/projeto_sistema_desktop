package br.com.projetosistema.controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class ConectaBanco {
    
   public Statement stm ; // responsavel por preparar e e fazer pesquisas no banco de dados
   public ResultSet rs; // responsavel por armazenar o resultado de uma pesquisa passada para o statement
   private String driver = "com.mysql.jdbc.Driver"; // responsavel por identificar o servico de banco de dados
   private String caminho = "jdbc:mysql://localhost:3306/projeto_sistema_desktop";   //caminho para conexao do banco de dados
   private String usuario = "root";//usuario que ira conectar
   private String senha = "root";//senha do usuario
   public Connection conn; // responsavel por conectar ao banco de dados
   
   public void conecta(){   // metodo responsavel por conectar ao Banco   
       try {
           System.setProperty("jdbc.Drivers", driver);
           conn = DriverManager.getConnection(caminho, usuario, senha);
           //JOptionPane.showMessageDialog(null, "Conectado com Suceso!");
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Erro ao conectar com o Banco,\n Erro: "+ex.getMessage());
       }
   }
   
   public void executaSQL(String sql){
       try {
           stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
           rs =  stm.executeQuery(sql);           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro na execucao de SQL!\n Erro: "+ex.getMessage());
       }
       
   }
   
   public void desconecta(){ // metodo responsavel por desconectar do banco
       try {
           conn.close();
//         JOptionPane.showMessageDialog(null, "Desconectado do Banco!");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao fechar o Banco,\n Erro: "+ex.getMessage());
       }
   }
   
}
