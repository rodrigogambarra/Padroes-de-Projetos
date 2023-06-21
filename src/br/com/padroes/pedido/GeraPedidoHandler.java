package br.com.padroes.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.padroes.orcamento.Orcamento;
import br.com.padroes.pedido.acoes.AcaoAposGerarPedido;

//Essa classe foi implementada para fazer uso do padrão de projeto Command, onde ela fica responsável por distribuir as ações a serem executadas
public class GeraPedidoHandler {

	//Para implementação do padrão Observer, criamos uma lista de ações em comum com cada classe que executa uma determinada ação
	private List<AcaoAposGerarPedido> acoesAposGerarPedido;
	
	// Recebemos uma lista de ações a serem executadas pelo construtor
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoesAposGerarPedidos) {
		acoesAposGerarPedido = acoesAposGerarPedidos;
	}

	public void executar(GeraPedido geraPedido) {
		Orcamento orcamento = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQuantidadeItens());
		Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

		//Utilizando o conceito do padrão Observer: dada uma ação, pega-se essa acção e a executa
		this.acoesAposGerarPedido.forEach(acao -> acao.executarAcao(pedido));
	}
}
