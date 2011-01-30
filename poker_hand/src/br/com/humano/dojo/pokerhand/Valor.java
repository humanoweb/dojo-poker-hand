package br.com.humano.dojo.pokerhand;

public enum Valor {

	DOIS(2),
	TRES(3),
	QUATRO(4),
	CINCO(5),
	SEIS(6),
	SETE(7),
	OITO(8),
	NOVE(9),
	DEZ(10),
	J(11),
	Q(12),
	K(13),
	A(14);
	
	private int valor;
	
	private Valor(int num) {
		this.valor = num;
	}
	
	public int getValor() {
		return this.valor;
	}
}
