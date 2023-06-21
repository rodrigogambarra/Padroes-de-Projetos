package br.com.padroes.orcamento.situacao;

import java.math.BigDecimal;

import br.com.padroes.DomainException;
import br.com.padroes.orcamento.Orcamento;

public class Finalizado extends SituacaoOrcamento {

	public Finalizado() {
		super.setNome("FINALIZADO");
	}
	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
	}

}
