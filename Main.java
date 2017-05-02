package com.giovani.base;

import com.giovani.util.Util;

public class Main {

	public static void main(String[] args) {
		Baralho deck = new Baralho();
		BaralhoArrayList deckArray = new BaralhoArrayList();
		CartaLacaio lac1 = new CartaLacaio(1, "Severo Snape",5, 7, 8);
		CartaLacaio lac2 = new CartaLacaio(2, "Aragorn", 5, 7, 6);
		CartaLacaio lac3 = new CartaLacaio(3, "Legolas", 8, 4, 6);
		CartaLacaio lac4 = new CartaLacaio(4, "Chewbaca",5, 7, 8);
		CartaLacaio lac5 = new CartaLacaio(5, "Ranger Vermelho", 5, 7, 6);
		CartaLacaio lac6 = new CartaLacaio(6, "Naruto", 8, 4, 6);
		CartaLacaio lac7;
		
		
		deck.adicionarCarta(lac1);
		deck.adicionarCarta(lac2);
		deck.adicionarCarta(lac3);
		deck.embaralhar();
		
		deckArray.adicionarCarta(lac4);
		deckArray.adicionarCarta(lac5);
		deckArray.adicionarCarta(lac6);
		deckArray.embaralhar();
		deckArray.embaralhar();
		
		lac7 = deckArray.comprarCarta();
		
		System.out.println("Comprado "+lac7+"\n");
		
		Util.buffar(lac1,5);
		Util.buffar(lac2,5,7);
		System.out.println("Primeiro Fortalecido "+lac1+"\n");
		System.out.println("Segundo Fortalecido "+lac2+"\n");
	}

}
