package br.com.padroes.orcamento.situacao;

import java.math.BigDecimal;

import br.com.padroes.DomainException;
import br.com.padroes.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

	public Reprovado() {
		super.setNome("REPROVADO");
	}
	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		throw new DomainException("Orcamento reprovado nao pode ter desconto extra!");
	}

	@Override
	public void finalizar(Orcamento orcamento) throws DomainException {
		orcamento.setSituacao(new Finalizado());
	}

}
