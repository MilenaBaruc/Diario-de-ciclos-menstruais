package modelo;

import enumeradores.Intensidade;

public class Libido extends Sintoma{
	private boolean relacoesComParceiro;
	private boolean relacoesSemParceiro;
	
	public Libido(Intensidade intensidade, String descricao, String NomeSintoma, boolean relacoesComParceiro, boolean relacoesSemParceiro, String data) {
		super(intensidade, descricao, NomeSintoma, data);
		this.relacoesComParceiro = relacoesComParceiro;
		this.relacoesSemParceiro = relacoesSemParceiro;
	}
	
	public Libido() {}

	public boolean isRelacoesComParceiro() {
		return relacoesComParceiro;
	}
	
	public void setRelacoesComParceiro(boolean relacoesComParceiro) {
		this.relacoesComParceiro = relacoesComParceiro;
	}
	
	public boolean isRelacoesSemParceiro() {
		return relacoesSemParceiro;
	}
	
	public void setRelacoesSemParceiro(boolean relacoesSemParceiro) {
		this.relacoesSemParceiro = relacoesSemParceiro;
	}

	@Override
	public String toString() {
		return "LIBIDO\n" 
				+"   relacoesComParceiro = " + relacoesComParceiro + "\n"
				+"   relacoesSemParceiro = " + relacoesSemParceiro + "\n"
				+"   intensidade = " + getIntensidade() + "\n"
				+"   descricao = " + getDescricao() + "\n" 
				+"   sintoma = " + getNomeSintoma()+ "\n"
				+ "   data = " + getData();
	}
	
	
}
