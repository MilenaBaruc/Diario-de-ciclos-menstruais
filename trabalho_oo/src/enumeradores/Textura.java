package enumeradores;

public enum Textura {
	VISCOSA(0),
	PASTOSA(1),
	CLARA(2),
	AQUOSA(3),
	INCOMUM(4),
	SANGRAMENTO(5);
	
	private final int valor;
	
	Textura(int opcao){
		valor = opcao;
	}
	
	public int getValor() {
		return valor;
	}
	}
