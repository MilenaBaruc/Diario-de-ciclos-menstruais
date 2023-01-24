package controller;

import java.util.*;

import modelo.Ciclo;

public class ControlerCiclo {
	private Ciclo[] ciclo;
	private int qtdCiclo;
	
	public void ControleCiclo(ControleDados cd) {
        this.ciclo = cd.getCiclo();
        this.qtdCiclo = cd.getQtdCiclo();
    }
	
	
}
