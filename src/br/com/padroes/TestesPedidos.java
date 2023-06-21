package br.com.padroes;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.padroes.pedido.GeraPedido;
import br.com.padroes.pedido.GeraPedidoHandler;
import br.com.padroes.pedido.acoes.CriarPedidoNoBanco;
import br.com.padroes.pedido.acoes.EnviarPedidoPorEmail;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("745.99");
		int quantidadeItens = 3;

		//Executando o padrão Command, onde a classe handler fará a distribuição das ações a serem executadas
		GeraPedido pedigoGerado = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
				new EnviarPedidoPorEmail(),
				new CriarPedidoNoBanco()));
		handler.executar(pedigoGerado);
	}

}
