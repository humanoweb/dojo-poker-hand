package br.com.humano.dojo.pokerhand;

import java.util.Collections;
import java.util.List;

public class Poker {

	public String valor(List<Carta> mao){
		if (possuiStraightFlush(mao)) {
			return "straight flush";
		}
		if (possuiUmPar(mao)) {
			return "um par";
		}
		return "";
	}

	private boolean possuiStraightFlush(List<Carta> mao) {
		Naipe naipe = mao.get(0).getNaipe();
		for (Carta carta : mao) {
			if (!carta.getNaipe().equals(naipe)) {
				return false;
			}
		}
		Collections.sort(mao);
		for (int j=1; j<mao.size() ;j++) {
			if (mao.get(j).getValor().getValor() - mao.get(0).getValor().getValor() != j) {
				return false;
			}
		}
		return true;
	}

	private boolean possuiUmPar(List<Carta> mao) {
		for (int i=0 ; i<mao.size(); i++) {
			for (int j=1; j<mao.size() ;j++) {
				if (mao.get(i).getValor().equals(mao.get(j).getValor())) {
					return true;
				}
			}
		}
		return false;
	}
	
}