package controller;

import java.util.ArrayList;


import enumeradores.Intensidade;
import modelo.Ciclo;
import modelo.Dados;
import modelo.Fisico;
import modelo.Humor;
import modelo.Libido;
import modelo.Secrecao;
import modelo.Usuario;

public class ControlerDados {
	private Dados dados = new Dados();

	public ControlerDados() {
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

	public boolean addCiclo(boolean dia, int duracao, int menstruacao, Intensidade fluxo, String data) {
		int count = 0;
		for (int i = 0; i < dados.getCiclo().size(); ++i) {
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
		for (int j = 0; j < dados.getCiclo().size(); ++j) {
			if (dados.getCiclo().get(j).getData().equals(dia)) {
				dados.getCiclo().remove(i);
				return true;
			}
		}
		return false;
	}

	public boolean editarCiclo(int i, boolean dia, int duracaoC, int duracaoM, Intensidade intensidade, String data) {
		String dataN = dados.getCiclo().get(i).getData();
		for (int j = 0; j < dados.getCiclo().size(); ++j) {
			if (dados.getCiclo().get(j).getData().equals(dataN)) {
				dados.getCiclo().get(j).setData(data);
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
	public boolean addHumor(Intensidade intensidade, String descricao, String nomeS, String gatilho,
			String humor, String data) {
		int count = 0;
		for (int j = 0; j < dados.getHumor().size(); ++j) {
			if (dados.getHumor().get(j).getData().equals(data)) {
				++count;
			}
		}
		if (count >= 1) {
			return false;
		} else {
			Humor novoHumor = new Humor(intensidade, descricao, nomeS, gatilho, humor, data);
			dados.addHumor(novoHumor);
			return true;
		}
	}

	public boolean remHumor(int i) {
		String dataN = dados.getHumor().get(i).getData();
		for (int j = 0; j < dados.getHumor().size(); ++j) {
			if (dados.getHumor().get(j).getData().equals(dataN)) {
				dados.getHumor().remove(i);
				return true;
			}
		}
		return false;
	}

	public boolean editarHumor(int i, Intensidade intensidade, String descricao, String nomeS, String gatilho,
			String humor) {
		String nome = dados.getHumor().get(i).getNomeSintoma();

		for (int j = 0; j < dados.getHumor().size(); ++j) {
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

	public boolean addFisico(Intensidade intensidade, String descricao, String Nomesintoma, boolean pratica,
			String remedioTomado, String data) {
		int count = 0;
		for (int j = 0; j < dados.getFisico().size(); ++j) {
			if (dados.getFisico().get(j).getData().equals(data)) {
				++count;
			}
		}
		if (count >= 1) {
			return false;
		} else {
			Fisico novoFisico = new Fisico(intensidade, descricao, Nomesintoma, pratica, remedioTomado, data);
			dados.addFisico(novoFisico);
			return true;
		}
	}

	public boolean remFisico(int i) {
		String dataN = dados.getFisico().get(i).getData();
		for (int j = 0; j < dados.getFisico().size(); ++j) {
			if (dados.getFisico().get(j).getData().equals(dataN)) {
				dados.getFisico().remove(j);

				return true;
			}
		}
		return false;
	}

	public boolean editarFisico(int i, Intensidade intensidade, String descricao, String Nomesintoma, boolean pratica,
			String remedioTomado, String data) {

		String nomeSint = dados.getFisico().get(i).getNomeSintoma();
		for (int j = 0; j < dados.getFisico().size(); ++j) {
			if (dados.getFisico().get(j).getNomeSintoma().equals(nomeSint)) {
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

	/*
	 * crud sintomas 3° Libido
	 * 
	 */

	public boolean addLibido(Intensidade intensidade, String descricao, String NomeSintoma,
			boolean relacoesComParceiro, boolean relacoesSemParceiro, String data) {
		int count = 0;
		for (int j = 0; j < dados.getLibido().size(); ++j) {
			if (dados.getLibido().get(j).getData().equals(data)) {
				count++;
			}
		}
		if (count >= 1) {
			return false;
		} else {
			Libido libido = new Libido(intensidade, descricao, NomeSintoma, relacoesComParceiro, relacoesSemParceiro,
					data);
			dados.addLibido(libido);
				return true;
		}

	}

	public boolean remLibido(int i) {
		String data = dados.getLibido().get(i).getData();
		for (int j = 0; j < dados.getFisico().size(); ++j) {
			if (dados.getLibido().get(j).getData().equals(data)) {
				dados.getLibido().remove(j);
				return true;
			}
		}
		return false;
	}

	public boolean editarLibido(int i, Intensidade intensidade, String descricao, String NomeSintoma,
			boolean relacoesComParceiro, boolean relacoesSemParceiro, String data) {
		String nomeS = dados.getLibido().get(i).getNomeSintoma();
		for (int j = 0; j < dados.getFisico().size(); ++j) {
			if (dados.getLibido().get(j).getNomeSintoma().equals(nomeS)) {
				dados.getLibido().get(j).setIntensidade(intensidade);
				dados.getLibido().get(j).setData(data);
				dados.getLibido().get(j).setDescricao(descricao);
				dados.getLibido().get(j).setNomeSintoma(NomeSintoma);
				dados.getLibido().get(j).setRelacoesComParceiro(relacoesComParceiro);
				dados.getLibido().get(j).setRelacoesSemParceiro(relacoesSemParceiro);
				return true;
			}
		}
		return false;
	}
	/*
	 * crud Sintomas 4° Secrecao
	 * 
	 */

	public boolean addSecrecao(Intensidade intensidade, String descricao, String Nomesintoma, String textura,
			String data) {
			int count = 0;
			for(int j = 0; j < dados.getSecrecao().size(); ++j) {
				if(dados.getSecrecao().get(j).getData().equals(data)) {
					++count;
				}
			}
			if(count >= 1) {
				return false;
			} else {
				Secrecao secrecao = new Secrecao(intensidade, descricao, Nomesintoma, textura, data);
				dados.addSecrecao(secrecao);
				return true;
			}
	}

	public boolean remSecrecao(int i) {
		String dataN = dados.getSecrecao().get(i).getData();
		for (int j = 0; j < dados.getSecrecao().size(); ++j) {
			if (dados.getSecrecao().get(j).getData().equals(dataN)) {
				dados.getSecrecao().remove(j);
			}
		}
		return false;
	}

	public boolean editarSecrecao(int i, Intensidade intensidade, String descricao, String Nomesintoma, String textura,
			String data) {
		String nomeS = dados.getSecrecao().get(i).getNomeSintoma();
		for (int j = 0; j < dados.getSecrecao().size(); ++j) {
			if (dados.getSecrecao().get(j).getNomeSintoma().equals(nomeS)) {
				dados.getSecrecao().get(j).setData(data);
				dados.getSecrecao().get(j).setDescricao(descricao);
				dados.getSecrecao().get(j).setIntensidade(intensidade);
				dados.getSecrecao().get(j).setNomeSintoma(Nomesintoma);
				dados.getSecrecao().get(j).setTextura(textura);
			}
		}
		return false;
	}

}
