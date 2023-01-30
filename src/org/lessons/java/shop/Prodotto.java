package org.lessons.java.shop;
import java.util.Random;

public class Prodotto {
	int codice;
	String nome;
	String descrizione;
	float prezzo;
	float iva = 22;
	
	public Prodotto(String nome, String descrizione, float prezzo) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		
		Random rand = new Random();
		this.codice = rand.nextInt(100000000);
	}
	
	public float prezzoImponibile() {
		return this.prezzo;
	}
	
	public float prezzoFinale() {
		return this.prezzo * ( this.iva/100 + this.prezzo );
	}
	
	public String nomeCompletoProdotto() {
		return this.codiceIdentificativo() + "-" + this.nome;
	}
	
	public String descrizioneProdotto() {
		return this.descrizione;
	}
	
	public String codiceIdentificativo() {
		return String.format("%08d", this.codice);
	}
}
