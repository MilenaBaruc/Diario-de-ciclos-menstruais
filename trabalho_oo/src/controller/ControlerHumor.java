package controller;

import java.util.ArrayList;

import enumeradores.Humores;
import enumeradores.Intensidade;
import modelo.Humor;

public class ControlerHumor {
	private ArrayList<Humor> humor;
	private int qtdHumor;
	
	public ControlerHumor(ControlerDados cd) {
		this.humor = cd.getHumor();
		this.setQtdHumor(cd.getHumor().size());
	}
	
	public Intensidade getIntendisidade(int i) {
		return humor.get(i).getIntensidade();
	}
	public String getDescricao(int i) {
		return humor.get(i).getDescricao();
	}
	public String getNomeSint(int i) {
		return humor.get(i).getNomeSintoma();
	}
	public String getGatilho(int i) {
		return humor.get(i).getGatilho();
	}
	public String getData(int i) {
		return humor.get(i).getData();
	}
	public Humores getSenHumor(int i) {
		return humor.get(i).getHumor();
	}

	public ArrayList<Humor> getHumor() {
		return humor;
	}

	public void setHumor(ArrayList<Humor> humor) {
		this.humor = humor;
	}

	public int getQtdHumor() {
		return qtdHumor;
	}

	public void setQtdHumor(int qtdHumor) {
		this.qtdHumor = qtdHumor;
	}
}
