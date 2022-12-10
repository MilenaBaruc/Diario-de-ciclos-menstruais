package Entidades;

public class Humor {
	
	private String gatilho; 
	private Humores humor;
	
	public Humor(String gatilho) {
		this.gatilho = gatilho;
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
