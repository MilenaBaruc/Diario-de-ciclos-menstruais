package controller;

import java.util.ArrayList;

import enumeradores.Intensidade;
import modelo.Ciclo;

public class ControlerCiclo {
	private ArrayList<Ciclo> ciclo;
	private int qtdCiclo;
	
	public void ControleCiclo(ControlerDados cd) {
        this.ciclo = cd.getCiclo();
        this.setQtdCiclo(cd.getQtdCiclo());
    }
	
	public boolean getMens(int i) {
		return ciclo.get(i).getDiaMenstruada();
	}
	
	public boolean getSint(int i) {
		return ciclo.get(i).getSentiuSintoma();
	}
	public boolean getDiaMens(int i) {
		return ciclo.get(i).getDiaMenstruada();
	}
	public int getDuracaoCiclo(int i) {
		return ciclo.get(i).getDuracaoCiclo();
	}
	public int getDuracaoMens(int i) {
		return ciclo.get(i).getDuracaoMesntruacao();
	}
	public Intensidade getIntensidade(int i) {
		return ciclo.get(i).getFluxoMenstrual();
	}
	public String getData(int i) {
		return ciclo.get(i).getData();
	}

	public int getQtdCiclo() {
		return qtdCiclo;
	}

	public void setQtdCiclo(int qtdCiclo) {
		this.qtdCiclo = qtdCiclo;
	}
	
}
