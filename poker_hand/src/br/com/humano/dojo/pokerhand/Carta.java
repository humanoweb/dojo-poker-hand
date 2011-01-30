package br.com.humano.dojo.pokerhand;

public class Carta implements Comparable<Carta> {
	
	private Naipe naipe;
	private Valor valor;
	
	
	
	public Carta(Naipe naipe, Valor valor) {
		this.naipe = naipe;
		this.valor = valor;
	}
	public Naipe getNaipe() {
		return naipe;
	}
	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}
	public Valor getValor() {
		return valor;
	}
	public void setValor(Valor valor) {
		this.valor = valor;
	}
	
	@Override
	public int compareTo(Carta outra) {
		return this.getValor().getValor() - outra.getValor().getValor();
	}
	
	
	@Override
	public String toString() {
		return this.getValor().getValor() + "/" +this.getNaipe().toString();
	}
	
	
	
}
