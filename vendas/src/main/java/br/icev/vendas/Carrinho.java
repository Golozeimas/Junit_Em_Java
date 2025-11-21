package vendas.src.main.java.br.icev.vendas;


import vendas.src.main.java.br.icev.vendas.Produto;
import vendas.src.main.java.br.icev.vendas.excecoes.QuantidadeInvalidaException;

import java.math.BigDecimal;

public class Carrinho {
    public void adicionar(Produto produto, int quantidade) throws QuantidadeInvalidaException {
        throw new UnsupportedOperationException("TODO");
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
