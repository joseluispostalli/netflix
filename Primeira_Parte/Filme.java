package Primeira_Parte;


public class Filme implements Comparable<Filme>{

	private String titulo, produtora;
	private static int codfilme=1;
	private final int codigonanetflix;
	
	public Filme(String titulo, String produtora) {
		super();
		this.titulo = titulo;
		this.produtora = produtora;
		this.codigonanetflix = codfilme;
		codfilme++;
	}
	@Override
    public String toString() {
		return "titulo" + "," + "produtora";
    }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setPordutora(String produtora) {
		this.produtora = produtora;
	}

	public int get() {
		return codigonanetflix;
        }
        @Override
        public int compareTo(Filme l) {
		return this.produtora.compareToIgnoreCase(l.getProdutora());
	}
}



	

