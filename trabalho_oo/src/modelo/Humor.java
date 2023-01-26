package modelo;

import enumeradores.Humores;
import enumeradores.Intensidade;

public class Humor extends Sintoma {
	private String gatilho;
	private Humores humor;

	public Humor(Intensidade intensidade, String descricao, String NomeSintoma, String gatilho, Humores humor, String data) {
		super(intensidade, descricao, NomeSintoma, data);
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


	@Override
	public String toString() {
		return "HUMOR\n" 
				+ "   gatilho = " + gatilho + "\n"
				+ "   humor = " + humor + "\n"
				+ "   intensidade = " + getIntensidade() + "\n" 
				+ "   descricao = " + getDescricao() + "\n"
				+ "   sintoma = " + getNomeSintoma()+ "\n"
				+ "   data = " + getData();
	}
	
	

}
