package Segunda_Parte;

import java.util.*;


import Primeira_Parte.*;

public class Registrodefilme {
	
	private final ArrayList<Filme> codfilme;

	public Registrodefilme() {
		codfilme = new ArrayList<>();
	}
	
	public void adicionarfilme (Filme filme) {
		codfilme.add(filme);
	}

	public Filme getFilme (int indice) {
		return codfilme.get(indice);
	}
	
	public void removeFilme(Filme filme) {
		codfilme.remove(filme);
	}
	
	public void removeFilme (int indice) {
		codfilme.remove(indice);
	}
	
	public int size() {
		return codfilme.size();
	}
}


