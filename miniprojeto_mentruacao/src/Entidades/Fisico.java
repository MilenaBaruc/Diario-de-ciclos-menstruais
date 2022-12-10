package Entidades;

public class Fisico extends Sintoma {
	
	private boolean pratica;
	private String remedioTomado;

	public Fisico(String nota, String sintoma, boolean pratica, String remedioTomado) {
		super(nota, sintoma);
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
