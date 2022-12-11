package enumeradores;

public enum Intensidade {
	FORTE(0),
	NORMAL(1),
	LEVE(2);
	
	private final int valor;
	
	Intensidade(int opcao){
		valor = opcao;
	}
	
	public int getValor() {
		return valor;
	}
}
