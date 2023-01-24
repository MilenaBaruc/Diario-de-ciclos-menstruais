package modelo;

import enumeradores.Humores;
import enumeradores.Intensidade;
import enumeradores.Textura;

public class Dados {
	private Usuario[] user = new Usuario[10];
	private Ciclo[] ciclo = new Ciclo[10];
	private Humor[] humor = new Humor[10];
	private Fisico[] fisico = new Fisico[10];
	private Libido[] libido = new Libido[10];
	private Secrecao[] secrecao = new Secrecao[10];
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
			Ciclo ciclo = new Ciclo(true, i, i, Intensidade.LEVE);
			Humor humor = new Humor(Intensidade.LEVE, "so felix" + i, "Felicidade", "chocolate", Humores.ALEGRE);
			Secrecao secrecao = new Secrecao(Intensidade.LEVE, "n sei o q" + i, "Ta saindo aqui meu", Textura.AQUOSA);
			Libido libido = new Libido(Intensidade.FORTE, "vontade de blau" + i, "libids", true, true);
			Fisico fisico = new Fisico(Intensidade.FORTE, "dor no u" + i, "dor", false, "dorflex");
		
		
			user[i] = usuario;
			this.ciclo[i] = ciclo;
			this.humor[i] = humor;
			this.libido[i] = libido;
			this.fisico[i] = fisico;
			this.secrecao[i] = secrecao;
			
			++qtdCiclo;
			++qtdFisico;
			++qtdHumor;
			++qtdLibido;
			++qtdSecrecao;
			++qtdUser;
		}
	}

	public Usuario[] getUser() {
		return user;
	}

	public void setUser(Usuario[] user) {
		this.user = user;
	}
	public void addUser(Usuario usuario) {
		user[qtdUser] = usuario;
		++qtdUser;
	}
	public void remUser(int i) {
		user[i] = null;
	}
	
	public Ciclo[] getCiclo() {
		return ciclo;
	}

	public void setCiclo(Ciclo[] ciclo) {
		this.ciclo = ciclo;
	}
	public void addCilo(Ciclo ciclo) {
		this.ciclo[qtdCiclo] = ciclo;
		++qtdCiclo;
	}
	public void remCiclo(int i) {
		ciclo[i] = null;
	}
	public Humor[] getHumor() {
		return humor;
	}

	public void setHumor(Humor[] humor) {
		this.humor = humor;
	}
	
	public void addHumor(Humor humor) {
		this.humor[qtdHumor] = humor;
		++qtdHumor;
	}
	public void remHumor(int i) {
		humor[i] = null;
	}

	public Fisico[] getFisico() {
		return fisico;
	}

	public void setFisico(Fisico[] fisico) {
		this.fisico = fisico;
	}
	public void addFisico(Fisico fisico) {
		this.fisico[qtdFisico] = fisico;
		++qtdFisico;
	}
	public void remFisico(int i) {
		fisico[i] = null;
	}

	public Libido[] getLibido() {
		return libido;
	}

	public void setLibido(Libido[] libido) {
		this.libido = libido;
	}
	public void addLibido(Libido libido) {
		this.libido[qtdLibido] = libido;
		++qtdLibido;
	}

	public Secrecao[] getSecrecao() {
		return secrecao;
	}

	public void setSecrecao(Secrecao[] secrecao) {
		this.secrecao = secrecao;
	}
	public void addSecrecao(Secrecao secrecao) {
		this.secrecao[qtdSecrecao] = secrecao;
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
