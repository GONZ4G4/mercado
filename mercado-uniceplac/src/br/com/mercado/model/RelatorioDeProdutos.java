package br.com.mercado.model;

public class RelatorioDeProdutos {
	private Produto produto;
	private int quantidade;
	
	//construtor com param�tros
	public RelatorioDeProdutos(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	//getters e setters
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	//m�todo toString para exibir o relat�rio
	@Override
	public String toString() {
		return " Relat�rio De Produtos \n" +
				" \n " + produto +
				"\n Quantidade: " + quantidade
				;
	}
}
