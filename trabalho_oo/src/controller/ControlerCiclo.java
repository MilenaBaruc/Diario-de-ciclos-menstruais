package controller;

import java.util.*;

import modelo.Ciclo;

public class ControlerCiclo {
	private ArrayList<Ciclo> ciclo;
	private int qtdCiclo;
	
	public void ControleCiclo(ControleDados cd) {
        this.ciclo = cd.getCiclo();
        this.qtdCiclo = cd.getQtdCiclo();
    }
	
	public boolean getMens(int i) {
		return ciclo.get(i).getDiaMenstruada();
	}
	
	public boolean getSint(int i) {
		return ciclo.get(i).getSentiuSintoma();
	}
	
	
}
