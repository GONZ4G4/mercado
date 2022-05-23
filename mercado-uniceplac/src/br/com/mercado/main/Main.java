package br.com.mercado.main;

//importando as bibliotecas
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import br.com.mercado.model.Caixa;
import br.com.mercado.model.CaixaRegistradora;
import br.com.mercado.model.Funcionario;

public class Main {
    public static void main(String[] args) {
    	//utilizando o swing para criar um funcion�rio
    	int opcaoCaixa = JOptionPane.showConfirmDialog(null, "Deseja criar um Caixa?", "Criar um Caixa", JOptionPane.YES_NO_OPTION);
    	if (opcaoCaixa == JOptionPane.YES_OPTION) {
    		JOptionPane.showMessageDialog(null, "Insira as informa��es a seguir", "Criar um Caixa", JOptionPane.INFORMATION_MESSAGE);
    		String id = JOptionPane.showInputDialog("Insira o id:");
        	String nome = JOptionPane.showInputDialog("Insira o nome:");
        	String cpf = JOptionPane.showInputDialog("Insira o cpf:");
        	String idade = JOptionPane.showInputDialog("Insira a idade:");
    		String salario = JOptionPane.showInputDialog("Insira o salario:");
    		
    		//transformar o id em long e o salario em bigdecimal
    		Long idfinal = new Long(id);
    		BigDecimal salariofinal = new BigDecimal(salario);
    		
    		//criando um funcionario com os parametros certos
    		Funcionario FunCaixa01 = new Caixa(idfinal, nome, cpf, idade, salariofinal);
    		
    		//di�logo final
    		JOptionPane.showMessageDialog(null, "O Funcion�rio-Caixa, foi criado com sucesso", "Criar um Caixa", JOptionPane.INFORMATION_MESSAGE);
    		
    		//opera��o finalizada caso n�o queira criar o funcion�rio caixa
    	} else if (opcaoCaixa == JOptionPane.NO_OPTION) {
    		JOptionPane.showMessageDialog(null, "Opera��o Finalizada", "Criar um Caixa", JOptionPane.ERROR_MESSAGE);
    	}
    	
    	//utilizando o swing para criar a caixa reg.
    	int opcaoCaixaReg = JOptionPane.showConfirmDialog(null, "Deseja criar uma CaixaRegistradora?", "Criar uma Caixa Registradora", JOptionPane.YES_NO_OPTION);
    	if (opcaoCaixaReg == JOptionPane.YES_OPTION){
    		//inserindo 
    		JOptionPane.showMessageDialog(null, "Insira as informa��es a seguir", "Criar uma Caixa Registradora", JOptionPane.INFORMATION_MESSAGE);
    		String id = JOptionPane.showInputDialog("Insira o id da Caixa Registradora:");
    		Long idfinal = new Long(id);
    		
    		CaixaRegistradora CaixaReg01 = new CaixaRegistradora(idfinal);
    	} else if (opcaoCaixaReg == JOptionPane.NO_OPTION) {
    		JOptionPane.showMessageDialog(null, "Opera��o Finalizada", "Criar um Caixa", JOptionPane.ERROR_MESSAGE);
    	}
    }
}
