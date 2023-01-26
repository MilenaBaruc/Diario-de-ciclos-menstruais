package modelo;

public class Usuario {
	private String nome;
	private String dataNascimento;
	private boolean gravidez;
	private String peso;
	
	public Usuario() {}

	public Usuario(String nome, String dataNascimento, boolean gravidez, String peso) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.gravidez = gravidez;
		this.peso = peso;
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public boolean isGravidez() {
		return gravidez;
	}

	public void setGravidez(boolean gravidez) {
		this.gravidez = gravidez;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String toString() {
		return "Usuario\n"
				+ "   nome = " + nome + "\n"
				+ "   dataNascimento = " + dataNascimento + "\n" 
				+ "   gravidez = " + gravidez + "\n" 
				+ "   peso = "+ peso;
	}

	
	
	
}
