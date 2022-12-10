package Entidades;

public class Humor extends Sintoma{
	
    private String gatilho; 
	private Humores humor;

	public Humor(String nota, String sintoma, String gatilho, Humores humor) {
		super(nota, sintoma);
		this.gatilho = gatilho;
		this.humor = humor;
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
	
	public void removerHumor() {
		
	}

}
