package controller;

import java.util.ArrayList;

import enumeradores.Intensidade;
import modelo.Fisico;

public class ControlerFisico {
	private ArrayList<Fisico> fisico;
	private int qtdFisico;
	
	public ControlerFisico(ControlerDados cd) {
		this.fisico = cd.getFisico();
		this.qtdFisico = cd.getHumor().size();
	}
	
	public String[] getFisicoData() {
        String[] data = new String[fisico.size()];
        for (int i = 0; i < fisico.size(); ++i) {
            if (fisico.get(i).getData() == null) {
                return data;
            } else {
                data[i] = fisico.get(i).getData();
            }
        }
        return data;
    }

	public ArrayList<Fisico> getFisico() {
		return fisico;
	}

	public void setFisico(ArrayList<Fisico> fisico) {
		this.fisico = fisico;
	}

	public int getQtdFisico() {
		return qtdFisico;
	}

	public void setQtdFisico(int qtdFisico) {
		this.qtdFisico = qtdFisico;
	}
	
	public Intensidade getIntensidade(int i) {
		return fisico.get(i).getIntensidade();
	}
	public String getDescricao(int i) {
		return fisico.get(i).getDescricao();
	}
	public String getNomeSint(int i) {
		return fisico.get(i).getNomeSintoma();
	}
	public boolean getPratica(int i) {
		return fisico.get(i).getPratica();
	}
	public String getRemedio(int i) {
		return fisico.get(i).getRemedioTomado();
	}
	public String getData(int i) {
		return fisico.get(i).getData();
	}

}
