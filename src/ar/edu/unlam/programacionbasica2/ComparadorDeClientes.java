package ar.edu.unlam.programacionbasica2;

import java.util.Comparator;

public class ComparadorDeClientes implements Comparator<Cliente> {

	@Override
	public int compare(Cliente Cl1, Cliente Cl2) {
		return Cl2.getEdad()-Cl1.getEdad();
	}

	
}
