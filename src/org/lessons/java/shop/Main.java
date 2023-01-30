package org.lessons.java.shop;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Nome Prodotto:");
		String nome = s.nextLine().trim().toLowerCase();
		
		System.out.println("Descrizione del prodotto:");
		String descrizione = s.nextLine().trim();
		
		System.out.println("Prezzo imponibile:");
		float prezzo = Float.parseFloat(s.nextLine());
		
		Prodotto prodotto = new Prodotto(nome, descrizione, prezzo);
		
		System.out.println("Nome Prodotto Completo: " + prodotto.nomeCompletoProdotto());
		System.out.println("Descrizione del prodotto: " + prodotto.descrizioneProdotto());
		System.out.println("Prezzo Base (iva escl.): " + prodotto.prezzoImponibile());
		System.out.println("Prezzo con Iva: " + prodotto.prezzoFinale());
	}
}
