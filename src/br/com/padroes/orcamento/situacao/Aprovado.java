package br.com.padroes.orcamento.situacao;

import java.math.BigDecimal;

import br.com.padroes.DomainException;
import br.com.padroes.orcamento.Orcamento;

public class Aprovado extends SituacaoOrcamento {

	public Aprovado() {
		super.setNome("APROVADO");
	}

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.02"));
	}

	@Override
	public void finalizar(Orcamento orcamento) throws DomainException {
		orcamento.setSituacao(new Finalizado());
	}

}
