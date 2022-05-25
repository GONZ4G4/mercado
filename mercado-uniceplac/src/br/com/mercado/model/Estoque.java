package br.com.mercado.model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	
	//Cria uma lista de array do tipo relat�rio de produtos
	List<RelatorioDoProduto> estoqueProdutos = new ArrayList<>();

	//Getters e setters
	public List<RelatorioDoProduto> getEstoqueProdutos() {
		return estoqueProdutos;
	}

	public void setEstoqueProdutos(List<RelatorioDoProduto> estoqueProdutos) {
		this.estoqueProdutos = estoqueProdutos;
	}

	//M�todo toString para exibir o estoque
	@Override
	public String toString() {
		return " " + estoqueProdutos
				;
	}
}
