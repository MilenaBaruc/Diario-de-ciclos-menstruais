package controller;

import java.util.ArrayList;

import enumeradores.Humores;
import enumeradores.Intensidade;
import modelo.Ciclo;
import modelo.Dados;
import modelo.Fisico;
import modelo.Humor;
import modelo.Libido;
import modelo.Secrecao;
import modelo.Usuario;

public class ControleDados {
	private Dados dados = new Dados();

	ControleDados() {
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
	 * 
	 * @param dia
	 * @param duracao
	 * @param menstruacao
	 * @param fluxo
	 * @param data
	 * @return
	 */

	public boolean addCiclo(Boolean dia, int duracao, int menstruacao, Intensidade fluxo, String data) {
		int count = 0;
		for (int i = 0; i < dados.getQtdCiclo(); ++i) {
			if (data == dados.getCiclo().get(i).getData()) {
				++count;
			}
		}
		if (count == 1) {
			return false;
		} else {
			Ciclo novo = new Ciclo(dia, duracao, menstruacao, fluxo, data);
			dados.addCiclo(novo);
			return true;
		}
	}

	public boolean remCiclo(int i) {
		String dia = dados.getCiclo().get(i).getData();
		for (int j = 0; j < dados.getQtdCiclo(); ++j) {
			if (dados.getCiclo().get(j).getData().equals(dia)) {
				dados.getCiclo().remove(i);
				dados.setQtdCiclo(getQtdCiclo() - 1);
				return true;
			}
		}
		return false;
	}

	public boolean editarCiclo(int i, Boolean dia, int duracaoC, int duracaoM, Intensidade intensidade, String data) {
		String dataN = dados.getCiclo().get(i).getData();
		for (int j = 0; j < dados.getQtdCiclo(); ++j) {
			if (dados.getCiclo().get(j).getData().equals(dataN)) {

				dados.getCiclo().get(j).setDiaMenstruada(dia);
				dados.getCiclo().get(j).setDuracaoCiclo(duracaoC);
				dados.getCiclo().get(j).setDuracaoMesntruacao(duracaoM);
				dados.getCiclo().get(j).setFluxoMenstrual(intensidade);

				return true;
			}
		}
		return false;
	}

	/**
	 * crud Sintomas 1° Humor
	 * 
	 * @param i
	 * @param intensidade
	 * @param descricao
	 * @param nomeS
	 * @param gatilho
	 * @param humor
	 * @param data
	 * @return
	 */
	public boolean addHumor(int i, Intensidade intensidade, String descricao, String nomeS, String gatilho,
			Humores humor, String data) {
		int count = 0;
		for (int j = 0; j < dados.getQtdHumor(); ++j) {
			if (dados.getHumor().get(j).getData().equals(data)) {
				++count;
			}
		}
		if (count == 1) {
			return false;
		} else {
			Humor novoHumor = new Humor(intensidade, descricao, nomeS, gatilho, humor, data);
			dados.addHumor(novoHumor);
			return true;
		}
	}

	public boolean remHumor(int i) {
		String dataN = dados.getHumor().get(i).getData();
		for (int j = 0; j < dados.getQtdHumor(); ++j) {
			if (dados.getHumor().get(j).getData().equals(dataN)) {
				dados.getHumor().remove(i);
				return true;
			}
		}
		return false;
	}

	public boolean editarHumor(int i, Intensidade intensidade, String descricao, String nomeS, String gatilho,
			Humores humor) {
		String nome = dados.getHumor().get(i).getNomeSintoma();

		for (int j = 0; j < getQtdHumor(); ++j) {
			if (dados.getHumor().get(j).getNomeSintoma().equals(nome)) {
				dados.getHumor().get(j).setNomeSintoma(nome);
				dados.getHumor().get(j).setDescricao(descricao);
				dados.getHumor().get(j).setGatilho(gatilho);
				dados.getHumor().get(j).setIntensidade(intensidade);
				dados.getHumor().get(j).setHumor(humor);

				return true;
			}
		}
		return false;
	}

	/*
	 * crud Sintomas 2° Fisico
	 * 
	 */

	public boolean addFisico(int i, Intensidade intensidade, String descricao, String Nomesintoma, boolean pratica,
			String remedioTomado, String data) {
		int count = 0;
		for (int j = 0; j < dados.getQtdFisico(); ++j) {
			if (dados.getFisico().get(j).getData().equals(data)) {
				++count;
			}
		}
		if (count == 1) {
			return false;
		} else {
			Fisico novoFisico = new Fisico(intensidade, descricao, Nomesintoma, pratica, remedioTomado, data);
			dados.addFisico(novoFisico);
			return true;
		}
	}

	public boolean remFisico(int i) {
		String dataN = dados.getFisico().get(i).getData();
		for(int j = 0; j < dados.getQtdFisico(); ++j) {
			if(dados.getFisico().get(j).getData().equals(dataN)) {
				dados.getFisico().remove(j);
				return true;
			}
		}
		return false;
	}

	public boolean editarFisico(int i, Intensidade intensidade, String descricao, String Nomesintoma, boolean pratica,
			String remedioTomado, String data) {
		
		String nomeSint = dados.getFisico().get(i).getNomeSintoma();
		for(int j = 0; j < dados.getQtdFisico(); ++j) {
			if(dados.getFisico().get(j).getNomeSintoma().equals(nomeSint)) {
				dados.getFisico().get(j).setData(data);
				dados.getFisico().get(j).setDescricao(descricao);
				dados.getFisico().get(j).setIntensidade(intensidade);
				dados.getFisico().get(j).setNomeSintoma(Nomesintoma);
				dados.getFisico().get(j).setPratica(pratica);
				dados.getFisico().get(j).setRemedioTomado(remedioTomado);
				return true;
			}
		}
		return false;
	}

}
