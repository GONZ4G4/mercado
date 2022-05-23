package br.com.mercado.service;

import br.com.mercado.model.Produto;

import java.math.BigDecimal;
import java.util.List;

public class ListaDeCompras {
    public BigDecimal registraProdutoNaCompra(List<Produto> produtos, Produto produto, Integer quantidade){
        BigDecimal precoDaCompra = BigDecimal.ZERO;
        if (quantidade > 1) {
            for (int i = 0; i < quantidade; i++) {
                produtos.add(produto);
            }
        } else {
            produtos.add(produto);
        }
        for(Produto produtoDaLista : produtos){
            precoDaCompra = produtoDaLista.getPreco().add(precoDaCompra);
        }
        return precoDaCompra;
    }

}