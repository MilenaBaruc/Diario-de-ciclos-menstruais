package controller;

import java.util.*;

import enumeradores.Intensidade;
import modelo.*;

public class ControleDados {
	private Dados dados = new Dados();
	
	ControleDados(){
		dados.preencherDados();
	}

	public Dados getDados() {
		return dados;
	}

	public void setDados(Dados dados) {
		this.dados = dados;
	}
	
	public ArrayList<Usuario> getUsuario() {
		return dados.getUser();
	}
	public ArrayList<Ciclo> getCiclo() {
		return dados.getCiclo();
	}
	public ArrayList<Humor> getHumor() {
		return dados.getHumor();
	}
	public ArrayList<Fisico> getFisico() {
		return dados.getFisico();
	}
	public ArrayList<Libido> getLibido() {
		return dados.getLibido();
	}
	public ArrayList<Secrecao> getSecrecao() {
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
	/** 
	 * crud de ciclo
	 * @param dia
	 * @param duracao
	 * @param menstruacao
	 * @param fluxo
	 * @param data
	 * @return
	 */
	
	public boolean addCiclo(Boolean dia, int duracao, int menstruacao, Intensidade fluxo, String data) {
		int count = 0;
		for(int i = 0; i < dados.getQtdCiclo(); ++i) {
			if(data == dados.getCiclo().get(i).getData()) {
				++count;
			}
		}
		if(count == 1) {
			return false;
		} else {
			Ciclo novo = new Ciclo(dia, duracao, menstruacao, fluxo, data);
			dados.addCiclo(novo);
			return true;
		}
	}
	
	
	public boolean remCiclo(int i) {
		String dia = dados.getCiclo().get(i).getData();
		for(int j = 0; j < dados.getQtdCiclo(); ++j) {
			if(dados.getCiclo().get(j).getData().equals(dia)) {
				dados.getCiclo().remove(i);
				dados.setQtdCiclo(getQtdCiclo()-1);
				return true;
			}
		}
		return false;
	}
	
	public boolean editarCiclo(int i, Boolean dia, int duracaoC, int duracaoM, Intensidade intensidade, String data) {
		String dataN = dados.getCiclo().get(i).getData();
		for(int j = 0; j < dados.getQtdCiclo(); ++j) {
			if(dados.getCiclo().get(j).getData().equals(dataN)) {
				
				dados.getCiclo().get(j).setDiaMenstruada(dia);
				dados.getCiclo().get(j).setDuracaoCiclo(duracaoC);
				dados.getCiclo().get(j).setDuracaoMesntruacao(duracaoM);
				dados.getCiclo().get(j).setFluxoMenstrual(intensidade);
			
				return true;
			}
		}
		return false;
	}
	
	/** crud sintomas
	 * 
	 */
	
	public boolean addHumor() {
		
		return false;
	}
}
