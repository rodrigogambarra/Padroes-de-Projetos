package br.com.padroes.desconto;

import java.math.BigDecimal;

import br.com.padroes.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	/*
	* Utilizado o padrão Chain of Responsibility - Também conhecido como: Corrente de responsabilidade
	* Cada desconto tem sua condição para ser aplicado, caso um desconto não seja aplicado ele passa para o próximo analisar
	* Também foi aplicado o padrão Template Method - Também conhecido como: Método padrão
	*/
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
						new SemDesconto()));
		return desconto.calcular(orcamento);
	}

}
