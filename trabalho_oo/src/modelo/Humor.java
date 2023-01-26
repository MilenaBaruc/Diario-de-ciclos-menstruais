package modelo;

import enumeradores.Humores;
import enumeradores.Intensidade;

public class Humor extends Sintoma {
	private String gatilho;
	private Humores humor;
	private String data;

	public Humor(Intensidade intensidade, String descricao, String NomeSintoma, String gatilho, Humores humor, String data) {
		super(intensidade, descricao, NomeSintoma);
		this.gatilho = gatilho;
		this.humor = humor;
	}
	
	public Humor() {
	}
	
	public String getGatilho() {
		return gatilho;
	}

	public void setGatilho(String gatilho) {
		this.gatilho = gatilho;
	}

	public Humores getHumor() {
		return humor;
	}

	public void setHumor(Humores humor) {
		this.humor = humor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "HUMOR\n" 
				+ "   gatilho = " + gatilho + "\n"
				+ "   humor = " + humor + "\n"
				+ "   intensidade = " + getIntensidade() + "\n" 
				+ "   descricao = " + getDescricao() + "\n"
				+ "   sintoma = " + getNomeSintoma();
	}
	
	

}
