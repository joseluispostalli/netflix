package Segunda_Parte;

import Primeira_Parte.Pessoa;
import java.util.ArrayList;


public class Registrodepessoa {
	
	private final ArrayList<Pessoa> codpes ;

	public Registrodepessoa() {
		codpes = new ArrayList<>();
	}
	
	public void adicionarpessoa (Pessoa pessoa) {
		codpes.add(pessoa);
	}

	public Pessoa getPessoa (int indice) {
		return codpes.get(indice);
	}
	
	public void removePessoa (Pessoa pessoa) {
		codpes.remove(pessoa);
	}
	
	public void removeContato (int indice) {
		codpes.remove(indice);
	}
	
}