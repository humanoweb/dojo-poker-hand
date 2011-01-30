package br.com.humano.dojo.pokerhand;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class PokerHandTest {

	@Test
	public void maoDeveTerUmPar() {
		List<Carta> mao = new ArrayList<Carta>();
		mao.add(new Carta(Naipe.COPAS, Valor.CINCO));
		mao.add(new Carta(Naipe.ESPADA, Valor.CINCO));
		mao.add(new Carta(Naipe.OUROS, Valor.DEZ));
		mao.add(new Carta(Naipe.OUROS, Valor.SEIS));
		mao.add(new Carta(Naipe.OUROS, Valor.NOVE));
		
		Assert.assertEquals("um par", new Poker().valor(mao));			
	}
	
	@Test
	public void maoTemStraightFlush(){
		List<Carta> mao = new ArrayList<Carta>();
		
		mao.add(new Carta(Naipe.OUROS, Valor.J));
		mao.add(new Carta(Naipe.OUROS, Valor.OITO));
		mao.add(new Carta(Naipe.OUROS, Valor.DEZ));
		mao.add(new Carta(Naipe.OUROS, Valor.NOVE));
		mao.add(new Carta(Naipe.OUROS, Valor.Q));
		
		Assert.assertEquals("straight flush", new Poker().valor(mao));
	}
	
	
}
