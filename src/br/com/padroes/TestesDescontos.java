package br.com.padroes;

import java.math.BigDecimal;
import br.com.padroes.desconto.CalculadoraDeDescontos;
import br.com.padroes.imposto.CalculadoraDeImpostos;
import br.com.padroes.imposto.ICMS;
import br.com.padroes.imposto.ISS;
import br.com.padroes.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
		Orcamento segundo = new Orcamento(new BigDecimal("1000"), 2);
		Orcamento terceiro = new Orcamento(new BigDecimal("500"), 1);

		primeiro.reprovar();
		System.out.println(primeiro.getSituacao());

		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(primeiro));
		System.out.println(calculadora.calcular(segundo));
		System.out.println(calculadora.calcular(terceiro));

		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
		System.out.println(calculadoraDeImpostos.calcular(primeiro, new ICMS()));
		System.out.println(calculadoraDeImpostos.calcular(segundo, new ISS()));

	}

}
