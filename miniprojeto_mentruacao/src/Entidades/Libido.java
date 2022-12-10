package Entidades;

public class Libido extends Sintoma {
	
	private boolean relacoesComParceiro;
	private boolean relacoesSemParceiro;
	
	public Libido(String nota, String sintoma, boolean relacoesComParceiro, boolean relacoesSemParceiro) {
		super(nota, sintoma);
		this.relacoesComParceiro = relacoesComParceiro;
		this.relacoesSemParceiro = relacoesSemParceiro;
	}

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
	
	public void removerLibido() {
		
	}

}
