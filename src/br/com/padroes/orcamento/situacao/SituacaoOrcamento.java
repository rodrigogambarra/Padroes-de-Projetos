package br.com.padroes.orcamento.situacao;

import java.math.BigDecimal;

import br.com.padroes.DomainException;
import br.com.padroes.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

	/*
	 * Utilizado o padrão State - Também conhecido como: Estado
	 * Definidos os estados em cada situação onde dependendo da situação é executada uma regra de negócio e definada a transição entre cada situação ou estado
	 *
	 */
	private String nome;

	public String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	public abstract BigDecimal calcularDescontoExtra(Orcamento orcamento);
	
	public void aprovar(Orcamento orcamento) throws DomainException {
		throw new DomainException("Orcamento "+nome+" não pode ser aprovado!");
	}
	
	public void reprovar(Orcamento orcamento) throws DomainException {
		throw new DomainException("Orcamento "+nome+" não pode ser reprovado!");
	}
	
	public void finalizar(Orcamento orcamento) throws DomainException {
		throw new DomainException("Orcamento "+nome+" não pode ser finalizado!");
	}

}
