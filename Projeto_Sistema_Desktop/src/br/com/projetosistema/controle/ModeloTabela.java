package br.com.projetosistema.controle;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ModeloTabela extends AbstractTableModel{
    private ArrayList linhas = null; // armazena as linhas que vem do banco de dados
    private String[] colunas = null; // armazena as colunas do banco
    
    public ModeloTabela(ArrayList lin, String[] col){
       setLinhas(lin);
       setColunas(col);
    }

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList dados) {
        this.linhas = dados;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] nomes) {
        this.colunas = nomes;
    }
    
    public int getColumnCount(){ //faz a contagem da quantidade de colunas
     return colunas.length;
    }
    
    public int getRowCount(){ //faz contagem da quatidade de linhas
      return linhas.size();
    }
    
    public String getColumnName(int numCol){ //retorna a quantidade de colunas que foi passado
     return colunas[numCol];
    }
    
    
    public Object getValueAt(int numLin, int numCol){ // meu objet vai receber a quantidades de linhas que for passado por parametro
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];      
    }
    
}
