package modelo;

import java.util.ArrayList;


import enumeradores.Intensidade;

public class Dados {
	private ArrayList<Usuario> user = new ArrayList<Usuario>();
	private ArrayList<Ciclo> ciclo = new ArrayList<Ciclo>();
	private ArrayList<Humor> humor = new ArrayList<Humor>();
	private ArrayList<Fisico> fisico = new ArrayList<Fisico>();
	private ArrayList<Libido> libido = new ArrayList<Libido>();
	private ArrayList<Secrecao> secrecao = new ArrayList<Secrecao>();

	
	
	public Dados() {
		//preencherDados();
	}
	
	public void preencherDados() {
		for(int i = 0; i < 1; ++i) {
			Usuario usuario = new Usuario("usuario" + i, "22/12/1212", true, "22,1");
			Humor humor = new Humor(Intensidade.LEVE, "so felix" + i, "Felicidade", "chocolate", "alegre", "12/12/1222");
			Secrecao secrecao = new Secrecao(Intensidade.LEVE, "n sei o q" + i, "Ta saindo aqui meu", "aquosa", "12/12/1222");
			Libido libido = new Libido(Intensidade.FORTE, "vontade de blau" + i, "libids", true, true, "12/12/1222");
			Fisico fisico = new Fisico(Intensidade.FORTE, "dor no u" + i, "dor", false, "dorflex", "12/12/1221");
		
		
			user.add(usuario);
			this.humor.add(humor);
			this.libido.add(libido);
			this.fisico.add(fisico);
			this.secrecao.add(secrecao);
			
		}
		for(int i = 0; i < 5; ++i) {
		Ciclo ciclo = new Ciclo(true, i, i, Intensidade.LEVE, "10/12/200" + i);
		this.ciclo.add(ciclo);
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
		
	}
	
	public ArrayList<Ciclo> getCiclo() {
		return ciclo;
	}

	public void setCiclo(ArrayList<Ciclo> ciclo) {
		this.ciclo = ciclo;
	}
	public void addCiclo(Ciclo ciclo) {
		this.ciclo.add(ciclo);
		
	}

	public ArrayList<Humor> getHumor() {
		return humor;
	}

	public void setHumor(ArrayList<Humor> humor) {
		this.humor = humor;
	}
	public void addHumor(Humor humor) {
		this.humor.add(humor);
		
	}

	public ArrayList<Fisico> getFisico() {
		return fisico;
	}

	public void setFisico(ArrayList<Fisico> fisico) {
		this.fisico = fisico;
	}
	public void addFisico(Fisico fisico) {
		this.fisico.add(fisico);
		
	}

	public ArrayList<Libido> getLibido() {
		return libido;
	}

	public void setLibido(ArrayList<Libido> libido) {
		this.libido = libido;
	}
	public void addLibido(Libido libido) {
		this.libido.add(libido);
	
	} 
	
	public ArrayList<Secrecao> getSecrecao() {
		return secrecao;
	}

	public void setSecrecao(ArrayList<Secrecao> secrecao) {
		this.secrecao = secrecao;
	}
	public void addSecrecao(Secrecao secrecao) {
		this.secrecao.add(secrecao);
	}


	
	

}
