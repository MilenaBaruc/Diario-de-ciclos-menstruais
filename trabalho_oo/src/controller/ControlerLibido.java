package controller;

import java.util.ArrayList;

import enumeradores.Intensidade;
import modelo.Libido;

public class ControlerLibido {
	private ArrayList<Libido> libido;
	private int qtdLibido;
	
	public ControlerLibido(ControlerDados cd) {
	this.libido = cd.getLibido();
	this.setQtdLibido(cd.getLibido().size());
	}
	
	public Intensidade getIntensidade(int i) {
		return libido.get(i).getIntensidade();
	}
	public String getDescricao(int i) {
		return libido.get(i).getDescricao();
	}
	public String getNomeSint(int i) {
		return libido.get(i).getNomeSintoma();
	}
	public boolean getRelComPar(int i) {
		return libido.get(i).isRelacoesComParceiro();
	}
	public boolean getRelSemPar(int i) {
		return libido.get(i).isRelacoesSemParceiro();
	}
	public String getData(int i) {
		return libido.get(i).getData();
	}

	public int getQtdLibido() {
		return qtdLibido;
	}

	public void setQtdLibido(int qtdLibido) {
		this.qtdLibido = qtdLibido;
	}

}
