package Entidades;

public class Fisico {
	
	private boolean pratica;
	private String remedioTomado;
	
	public Fisico(boolean pratica, String remedioTomado) {
		this.pratica = pratica;
		this.remedioTomado = remedioTomado;
	}

	public boolean isPratica() {
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
	
	public void removerFisico() {
		
	}

}
