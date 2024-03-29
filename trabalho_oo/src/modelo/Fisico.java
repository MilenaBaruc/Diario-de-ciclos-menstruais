package modelo;

import enumeradores.Intensidade;

public class Fisico extends Sintoma {

	private boolean pratica;
	private String remedioTomado;
 

	public Fisico(Intensidade intensidade, String descricao, String Nomesintoma, boolean pratica, String remedioTomado, String data) {
		super(intensidade, descricao, Nomesintoma, data);
		this.pratica = pratica;
		this.remedioTomado = remedioTomado;
	}

	
	public Fisico() {
		// TODO Auto-generated constructor stub
	}


	public boolean getPratica() {
		return pratica;
	}

	public void setPratica(boolean pratica) {
		this.pratica = pratica;
	}

	public String getRemedioTomado() {
		return remedioTomado;
	}

	public void setRemedioTomado(String remedioTomado) {
		this.remedioTomado = remedioTomado;
	}

	@Override
	public String toString() {
		return "FISICO\n" 
				+ "   pratica = " + pratica + "\n" 
				+ "   remedioTomado = " + remedioTomado + "\n" 
				+ "   intensidade = " + getIntensidade() + "\n"
				+ "   descricao = " + getDescricao() + "\n" 
				+ "   sintoma = " + getNomeSintoma() + "\n"
				+ "   data = " + getData();
	}
}
