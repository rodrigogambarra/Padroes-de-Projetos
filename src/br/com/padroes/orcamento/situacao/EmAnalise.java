package br.com.padroes.orcamento.situacao;

import java.math.BigDecimal;

import br.com.padroes.DomainException;
import br.com.padroes.orcamento.Orcamento;

public class EmAnalise extends SituacaoOrcamento {

	public EmAnalise() {
		super.setNome("EM ANALISE");
	}

	@Override
	protected void setNome(String nome) {
		super.setNome("EM ANALISE");
	}
	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public void aprovar(Orcamento orcamento) throws DomainException {
		orcamento.setSituacao(new Aprovado());
	}
	
	@Override
	public void reprovar(Orcamento orcamento) throws DomainException {
		orcamento.setSituacao(new Reprovado());
	}

}
