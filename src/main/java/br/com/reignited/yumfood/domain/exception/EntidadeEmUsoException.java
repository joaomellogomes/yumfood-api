package br.com.reignited.yumfood.domain.exception;

public class EntidadeEmUsoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EntidadeEmUsoException(String menssagem) {
		super(menssagem);
	}

}
