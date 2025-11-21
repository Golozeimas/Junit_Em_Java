package vendas.src.main.java.br.icev.vendas;


import vendas.src.main.java.br.icev.vendas.excecoes.ErroPagamentoException;
import java.math.BigDecimal;

public interface GatewayPagamento {
    String cobrar(BigDecimal valor) throws ErroPagamentoException;
}
