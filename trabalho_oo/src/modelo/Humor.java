package modelo;


import enumeradores.Intensidade;

public class Humor extends Sintoma {
	private String gatilho;
	private String humor;

	public Humor(Intensidade intensidade, String descricao, String NomeSintoma, String gatilho, String humor, String data) {
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

	public String getHumor() {
		return humor;
	}

	public void setHumor(String humor) {
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
