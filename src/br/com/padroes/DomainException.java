package br.com.padroes;

public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DomainException(String mensagem) {
		super(mensagem);
	}

}
