package Entidades;

public class Ciclo {
	
	private boolean diaMenstruada;
	private int duracaoCiclo;
	private int duracaoMenstruacao;
	private Intensidade fluxoMenstrual;
	private boolean sentiuSintoma;
	
	public Ciclo(boolean diaM, int dCiclo, int dMens, boolean sentiuSintoma) {
		diaM = diaMenstruada;
		dCiclo = duracaoCiclo;
		dMens = duracaoMenstruacao;
		this.sentiuSintoma = sentiuSintoma;
	}
	
	public boolean isDiaMenstruada() {
		return diaMenstruada;
	}

	public void setDiaMenstruada(boolean diaMenstruada) {
		this.diaMenstruada = diaMenstruada;
	}

	public int getDuracaoCiclo() {
		return duracaoCiclo;
	}

	public void setDuracaoCiclo(int duracaoCiclo) {
		this.duracaoCiclo = duracaoCiclo;
	}

	public int getDuracaoMenstruacao() {
		return duracaoMenstruacao;
	}

	public void setDuracaoMenstruacao(int duracaoMenstruacao) {
		this.duracaoMenstruacao = duracaoMenstruacao;
	}

	public Intensidade getFluxoMenstrual() {
		return fluxoMenstrual;
	}

	public void setFluxoMenstrual(Intensidade fluxoMenstrual) {
		this.fluxoMenstrual = fluxoMenstrual;
	}
	
	public boolean isSentiuSintoma() {
		return sentiuSintoma;
	}

	public void setSentiuSintoma(boolean sentiuSintoma) {
		this.sentiuSintoma = sentiuSintoma;
	}

	public void removerCiclo() {
		
	}

}
