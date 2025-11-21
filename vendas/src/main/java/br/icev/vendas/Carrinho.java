package vendas.src.main.java.br.icev.vendas;


import vendas.src.main.java.br.icev.vendas.excecoes.QuantidadeInvalidaException;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Carrinho {

    private Map<String, Produto> produtos;
    private Map<String, Integer> quantidades;

    public Carrinho() {
        this.produtos = new HashMap<>();
        this.quantidades = new HashMap<>();
    }

    public void adicionar(Produto produto, int quantidade) throws QuantidadeInvalidaException {
        if (quantidade <= 0) {
            throw new QuantidadeInvalidaException("Quantidade deve ser maior que zero");
        }

        String codigo = produto.getCodigo();
        produtos.put(codigo, produto);
        quantidades.put(codigo, quantidades.getOrDefault(codigo, 0) + quantidade);
    }

    public BigDecimal getSubtotal() {
        throw new UnsupportedOperationException("TODO");
    }

    public BigDecimal getTotalCom(PoliticaDesconto politica) {
        throw new UnsupportedOperationException("TODO");
    }

    public int getTotalItens() {
        throw new UnsupportedOperationException("TODO");
    }
}
