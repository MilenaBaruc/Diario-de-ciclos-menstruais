package controller;

import java.util.*;

import modelo.*;

public class ControleDados {
	private Dados dados = new Dados();

	public Dados getDados() {
		return dados;
	}

	public void setDados(Dados dados) {
		this.dados = dados;
	}
	
	public Usuario[] getUsuario() {
		return dados.getUser();
	}
	public Ciclo[] getCiclo() {
		return dados.getCiclo();
	}
	public Humor[] getHumor() {
		return dados.getHumor();
	}
	public Fisico[] getFisico() {
		return dados.getFisico();
	}
	public Libido[] getLibido() {
		return dados.getLibido();
	}
	public Secrecao[] getSecrecao() {
		return dados.getSecrecao();
	}
	public int getQtdUsuario() {
		return dados.getQtdUser();
	}
	public int getQtdCiclo() {
		return dados.getQtdCiclo();
	}
	public int getQtdHumor() {
		return dados.getQtdHumor();
	}
	public int getQtdFisico() {
		return dados.getQtdFisico();
	}
	public int getQtdLibido() {
		return dados.getQtdLibido();
	}
	public int getQtdSecrecao() {
		return dados.getQtdSecrecao();
	}

}
