package cenarioOrcamento.orcamento;

import java.math.BigDecimal;

public class OrcamentoProxy {
    BigDecimal valor;
    Orcamento orcamento;

    public OrcamentoProxy( Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public BigDecimal getValor() {
        if(this.valor ==null) {
            this.valor = orcamento.getValor();
        }
        return this.valor;
    }
}
