package Entidades;

public class Libido {
	
	private boolean relacoesComParceiro;
	private boolean relacoesSemParceiro;
	
	private Libido(boolean rcp, boolean rsp) {
		rcp = relacoesComParceiro;
		rsp = relacoesSemParceiro;
		
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
