package br.com.padroes.desconto;

import java.math.BigDecimal;

import br.com.padroes.orcamento.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}


	//Padrão Template Method - Também conhecido como: Método padrão
	//Método concreto que chama métodos abstratos implementados pelas classes filhas, delegando a elas a responsabilidade da regra de negócio
	public BigDecimal calcular(Orcamento orcamento) {
		if (deveAplicar(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		return proximo.calcular(orcamento);
	}

	//Padrão Template Method - Também conhecido como: Método padrão
	//Métodos implementados pelas classes filhas, as quais apenas executam a regra atribuída a elas respondendo para esta classe mãe
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	protected abstract boolean deveAplicar(Orcamento orcamento);

}
