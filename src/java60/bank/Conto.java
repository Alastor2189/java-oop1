package java60.bank;

import java.util.Random;

public class Conto {
	int numeroConto;
	String nomeIntestatario;
	double saldo;

	public Conto (String nomeIntestatario) {
		this.numeroConto = numeroContoGenerato();
		this.nomeIntestatario= nomeIntestatario;
		saldo = 0;
		
	}
	
	int numeroContoGenerato() {
		Random r = new Random();
		return r.nextInt(1000)+1;
		
	}
	
	void versamento(double versamentoDenaro) {
		saldo = saldo + versamentoDenaro;
	}
	
	
	Boolean prelievo(double prelievoDenaro) {
		if(saldo < prelievoDenaro) {
			return false;
		} else {
			saldo = saldo - prelievoDenaro;
			return true;
		}	
	}
	
	
}