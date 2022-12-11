package modelo;

import enumeradores.Intensidade;

public abstract class Sintoma {
	private Intensidade intensidade;
	private String descricao;
	private String nomeSintoma;
	
	public Sintoma() {}
	
	public Sintoma(Intensidade intensidade, String descricao, String sintoma) {
		this.intensidade = intensidade;
		this.descricao = descricao;
		this.nomeSintoma = sintoma;
	}

	public Intensidade getIntensidade() {
		return intensidade;
	}

	public void setIntensidade(Intensidade intensidade) {
		this.intensidade = intensidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNomeSintoma() {
		return nomeSintoma;
	}

	public void setNomeSintoma(String sintoma) {
		this.nomeSintoma = sintoma;
	}

	@Override
	public String toString() {
		return "Sintoma [intensidade=" + intensidade + ", descricao=" + descricao + ", nomeSintoma=" + nomeSintoma + "]";
	}

}
