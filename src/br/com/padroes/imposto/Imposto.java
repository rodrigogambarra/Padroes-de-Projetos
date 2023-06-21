package br.com.padroes.imposto;

import java.math.BigDecimal;

import br.com.padroes.orcamento.Orcamento;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);

}
