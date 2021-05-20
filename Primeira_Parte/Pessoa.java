package Primeira_Parte;
public class Pessoa {

	private String nome;
	private static int codpes=1;
	private final int codigoDaPessoa;
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
		this.codigoDaPessoa = codpes;
		codpes++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoDaPessoa() {
		return codigoDaPessoa;
	}
}