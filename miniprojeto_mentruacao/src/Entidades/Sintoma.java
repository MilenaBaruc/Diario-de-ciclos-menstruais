package Entidades;

public class Sintomas {
	
	private boolean sentiuSintoma;
	private TipoSintoma tipoSintoma;
	private Intensidade intensidade;
	private String descricao;
	private String sintoma;
	
	
	
	public Sintomas(boolean sentiuSintoma, String nota, String sintoma){
		this.sentiuSintoma = sentiuSintoma;
		this.descricao = nota;
		this.sintoma = sintoma;
		
	}

	
	
	public boolean isSentiuSintoma() {
		return sentiuSintoma;
	}



	public void setSentiuSintoma(boolean sentiuSintoma) {
		this.sentiuSintoma = sentiuSintoma;
	}



	public TipoSintoma getTipoSintoma() {
		return tipoSintoma;
	}



	public void setTipoSintoma(TipoSintoma tipoSintoma) {
		this.tipoSintoma = tipoSintoma;
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
