package controller;

import java.util.ArrayList;

import enumeradores.Intensidade;
import enumeradores.Textura;
import modelo.Secrecao;

public class ControlerSecrecao {
	private ArrayList<Secrecao> secrecao;
	private int qtdSecrecao;

	public ControlerSecrecao(ControlerDados cd) {
		this.secrecao = cd.getSecrecao();
		this.qtdSecrecao = cd.getQtdSecrecao();
	}

	public ArrayList<Secrecao> getSecrecao() {
		return secrecao;
	}

	public void setSecrecao(ArrayList<Secrecao> secrecao) {
		this.secrecao = secrecao;
	}

	public int getQtdSecrecao() {
		return qtdSecrecao;
	}

	public void setQtdSecrecao(int qtdSecrecao) {
		this.qtdSecrecao = qtdSecrecao;
	}

	public Intensidade getIntensidade(int i) {
		return secrecao.get(i).getIntensidade();
	}

	public String getDescricao(int i) {
		return secrecao.get(i).getDescricao();
	}

	public String getNomeSint(int i) {
		return secrecao.get(i).getNomeSintoma();
	}

	public Textura getTextura(int i) {
		return secrecao.get(i).getTextura();
	}

}
