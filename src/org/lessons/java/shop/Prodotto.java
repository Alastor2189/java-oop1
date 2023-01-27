package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	int codice;
	String nome;
	String descrizione;
	float prezzo;
	float iva = 0.22F;
	
	
	public Prodotto(String nome, String descrizione, float prezzo, float iva) {
		super();
		this.codice = generateRandomId();
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
	}
	
	
	private int generateRandomId() {
		Random r = new Random();
		int randomId = r.nextInt(90000);
		return randomId;
	}
	
	public float prezzoImponibile() {
		return prezzo;
	}
	
	public float prezzoTotale() {
		float prezzoFinale = prezzo + (prezzo * iva);
		return prezzoFinale;
	}
}
