package Entidades;

public class Sintoma {
	
	private Intensidade intensidade;
	private String descricao;
	private String sintoma;
	
	public Sintoma(String nota, String sintoma){
	
		this.descricao = nota;
		this.sintoma = sintoma;
		
	}

	public Intensidade getIntensidade() {
		return intensidade;
	}

	public void setIntensidade(Intensidade intensidade) {
		this.intensidade = intensidade;
	}

	public String getNota() {
		return descricao;
	}

	public void setNota(String nota) {
		this.descricao = nota;
	}

	public String getSintoma() {
		return sintoma;
	}

	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}

	public void removerSintoma() {
		
	}

}
