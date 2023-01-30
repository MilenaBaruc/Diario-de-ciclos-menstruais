package controller;

import java.util.ArrayList;

import enumeradores.Intensidade;
import modelo.Ciclo;

public class ControlerCiclo {
	private ArrayList<Ciclo> ciclo;
	private int qtdCiclo;
	
	public ControlerCiclo(ControlerDados cd) {
        this.ciclo = cd.getCiclo();
    }
	
	public String[] getCicloData() {
        String[] data = new String[ciclo.size()];
        for (int i = 0; i < ciclo.size(); ++i) {
            if (ciclo.get(i).getData() == null) {
                return data;
            } else {
                data[i] = ciclo.get(i).getData();
            }
        }
        return data;
    }
	
	public int getIdxCiclo(String data) {
		int idx = 0;
		for(int i = 0; i < ciclo.size(); ++i) {
			if(ciclo.get(i).getData().equals(data)) {
				idx = i;
			}
		}
		return idx;
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
