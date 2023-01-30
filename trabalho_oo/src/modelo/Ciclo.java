package modelo;

import enumeradores.Intensidade;

public class Ciclo {
	private boolean diaMenstruada;
	private int duracaoCiclo;
	private int duracaoMesntruacao;
	private Intensidade fluxoMenstrual;
	private String data;
	
	public Ciclo(){};

	public Ciclo(boolean diaMenstruada, int duracaoCiclo, int duracaoMenstruacao, Intensidade fluxoMenstrual, String data) {
		this.diaMenstruada = diaMenstruada;
		this.duracaoCiclo = duracaoCiclo;
		this.duracaoMesntruacao = duracaoMenstruacao;
		this.fluxoMenstrual = fluxoMenstrual;
		this.data = data;
	}

	public boolean getDiaMenstruada() {
		return diaMenstruada;
	}

	public void setDiaMenstruada(boolean diaMenstruado) {
		this.diaMenstruada = diaMenstruado;
	}

	public int getDuracaoCiclo() {
		return duracaoCiclo;
	}

	public void setDuracaoCiclo(int duracaoCiclo) {
		this.duracaoCiclo = duracaoCiclo;
	}

	public int getDuracaoMesntruacao() {
		return duracaoMesntruacao;
	}

	public void setDuracaoMesntruacao(int duracaoMesntruacao) {
		this.duracaoMesntruacao = duracaoMesntruacao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Intensidade getFluxoMenstrual() {
		return fluxoMenstrual;
	}

	public void setFluxoMenstrual(Intensidade fluxoMenstrual) {
		this.fluxoMenstrual = fluxoMenstrual;
	}

	public String toString() {
		return "CICLO\n" 
				+ "   diaMenstruada = " + diaMenstruada + "\n" 
				+ "   duracaoCiclo = " + duracaoCiclo + "\n" 
				+ "   duracaoMesntruacao = " + duracaoMesntruacao + "\n" 
				+ "   fluxoMenstrual = " + fluxoMenstrual + "\n" 
				+ "   data = " + data + "\n\n";
	}
}
