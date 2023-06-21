package br.com.padroes.imposto;

import java.math.BigDecimal;

import br.com.padroes.orcamento.Orcamento;

public class CalculadoraDeImpostos {
	/*
	 * Utilizado o padrão Strategy - Também conhecido como: Estratégia
	 *
	 */
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}
