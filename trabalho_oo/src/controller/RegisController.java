package controller;

import modelo.*;
import view.*;

public class RegisController {
	
	private Usuario user = new Usuario();
	
	
	public void setNome(String nome) {
		this.user.setNome(nome);
	}


	public void setDataNascimento(String dataNascimento) {
		this.user.setDataNascimento(dataNascimento);
	}


	public void setGravidez(boolean gravidez) {
		this.user.setGravidez(gravidez);
	}


	public void setPeso(String peso) {
		this.user.setPeso(peso);
	}
}
