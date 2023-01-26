package modelo;

import java.util.ArrayList;

import enumeradores.Humores;
import enumeradores.Intensidade;
import enumeradores.Textura;

public class Dados {
	private ArrayList<Usuario> user = new ArrayList<Usuario>();
	private ArrayList<Ciclo> ciclo = new ArrayList<Ciclo>();
	private ArrayList<Humor> humor = new ArrayList<Humor>();
	private ArrayList<Fisico> fisico = new ArrayList<Fisico>();
	private ArrayList<Libido> libido = new ArrayList<Libido>();
	private ArrayList<Secrecao> secrecao = new ArrayList<Secrecao>();
	private int qtdUser = 0;
	private int qtdCiclo = 0;
	private int qtdHumor = 0;
	private int qtdFisico = 0;
	private int qtdLibido = 0;
	private int qtdSecrecao = 0;
	
	
	public Dados() {
		preencherDados();
	}
	
	public void preencherDados() {
		for(int i = 0; i < 5; ++i) {
			Usuario usuario = new Usuario("usuario" + i, "22/12/1212", true, "22,1");
			Ciclo ciclo = new Ciclo(true, i, i, Intensidade.LEVE, "10/12/1202");
			Humor humor = new Humor(Intensidade.LEVE, "so felix" + i, "Felicidade", "chocolate", Humores.ALEGRE, "12/12/1222");
			Secrecao secrecao = new Secrecao(Intensidade.LEVE, "n sei o q" + i, "Ta saindo aqui meu", Textura.AQUOSA);
			Libido libido = new Libido(Intensidade.FORTE, "vontade de blau" + i, "libids", true, true);
			Fisico fisico = new Fisico(Intensidade.FORTE, "dor no u" + i, "dor", false, "dorflex", "12/12/1221");
		
		
			user.add(usuario);
			this.ciclo.add(ciclo);
			this.humor.add(humor);
			this.libido.add(libido);
			this.fisico.add(fisico);
			this.secrecao.add(secrecao);
			
			++qtdCiclo;
			++qtdFisico;
			++qtdHumor;
			++qtdLibido;
			++qtdSecrecao;
			++qtdUser;
		}
	}


	public ArrayList<Usuario> getUser() {
		return user;
	}

	public void setUser(ArrayList<Usuario> user) {
		this.user = user;
	}
	public void addUser(Usuario usuario) {
		user.add(usuario);
		++qtdUser;
	}
	
	public ArrayList<Ciclo> getCiclo() {
		return ciclo;
	}

	public void setCiclo(ArrayList<Ciclo> ciclo) {
		this.ciclo = ciclo;
	}
	public void addCiclo(Ciclo ciclo) {
		this.ciclo.add(ciclo);
		++qtdCiclo;
	}

	public ArrayList<Humor> getHumor() {
		return humor;
	}

	public void setHumor(ArrayList<Humor> humor) {
		this.humor = humor;
	}
	public void addHumor(Humor humor) {
		this.humor.add(humor);
		++qtdHumor;
	}

	public ArrayList<Fisico> getFisico() {
		return fisico;
	}

	public void setFisico(ArrayList<Fisico> fisico) {
		this.fisico = fisico;
	}
	public void addFisico(Fisico fisico) {
		this.fisico.add(fisico);
		++qtdFisico;
	}

	public ArrayList<Libido> getLibido() {
		return libido;
	}

	public void setLibido(ArrayList<Libido> libido) {
		this.libido = libido;
	}
	public void addLibido(Libido libido) {
		this.libido.add(libido);
		++qtdLibido;
	}

	public ArrayList<Secrecao> getSecrecao() {
		return secrecao;
	}

	public void setSecrecao(ArrayList<Secrecao> secrecao) {
		this.secrecao = secrecao;
	}
	public void addSecrecao(Secrecao secrecao) {
		this.secrecao.add(secrecao);
		++qtdSecrecao;
	}

	public int getQtdUser() {
		return qtdUser;
	}
	public void setQtdUser(int qtdUser) {
		this.qtdUser = qtdUser;
	}
	public int getQtdCiclo() {
		return qtdCiclo;
	}
	public void setQtdCiclo(int qtdCiclo) {
		this.qtdCiclo = qtdCiclo;
	}
	public int getQtdHumor() {
		return qtdHumor;
	}
	public void setQtdHumor(int qtdHumor) {
		this.qtdHumor = qtdHumor;
	}
	public int getQtdFisico() {
		return qtdFisico;
	}
	public void setQtdFisico(int qtdFisico) {
		this.qtdFisico = qtdFisico;
	}
	public int getQtdLibido() {
		return qtdLibido;
	}
	public void setQtdLibido(int qtdLibido) {
		this.qtdLibido = qtdLibido;
	}
	public int getQtdSecrecao() {
		return qtdSecrecao;
	}
	public void setQtdSecrecao(int qtdSecrecao) {
		this.qtdSecrecao = qtdSecrecao;
	}

	
	

}
