package java60.bank;

import java.util.Scanner;

public class Bank {
	
public static void main(String[] args) {
		
		Conto librettoBancario;	
		String nomeIntestatario, exit = "";
		double versamentoDenaro;
		double prelievoDenaro;
		
		

		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Inserisci il tuo nome: ");
		nomeIntestatario = s.nextLine();
		
		librettoBancario = new Conto(nomeIntestatario);
		
		System.out.println("Nome: " + nomeIntestatario);
		System.out.println("Numeroconto: " + librettoBancario.numeroContoGenerato());
		System.out.println("Saldo: " + librettoBancario.saldo);
		
		while (!exit.equals("esci")) {
			System.out.println("Versare, prelevare o uscire?");
			exit = s.nextLine();
			
			if(exit.equals("versare")) {
				
				System.out.println("Ammontare della somma da versare: ");
				versamentoDenaro = s.nextDouble();
				s.nextLine();
				librettoBancario.versamento(versamentoDenaro);
				System.out.println("il suo conto è di: " + librettoBancario.saldo);
			 } else if(exit.equals("prelevare")) {
				
				System.out.println("Ammontare della somma da prelevare: ");
				prelievoDenaro = s.nextDouble();
				s.nextLine();
				
				if (prelievoDenaro >  librettoBancario.saldo) {
					System.out.println("Operazione fallita, non dispone di questa somma");
					System.out.println("Il suo saldo è di: " + librettoBancario.saldo);
				} else {
					librettoBancario.prelievo(prelievoDenaro);
					System.out.println("Operazione riuscita");
					System.out.println("Il suo saldo è di: " + librettoBancario.saldo );
				}
				
			 }
			
		  }
			
		  if(exit.equals("uscire")) {
		 	
			System.out.println("Arrivederci!");		
		
		  }
		  
		  s.close();
	}

}
