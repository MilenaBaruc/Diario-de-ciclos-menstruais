package enumeradores;

public enum Humores {
	CALMA(0),
	FELIZ(1),
	ENERGETICA(2),
	ALEGRE(3),
	MUDANCAS(4),
	IRRITADA(5),
	TRISTE(6),
	ANSIOSA(7),
	DESANIMADA(8),
	CULPADA(9),
	OBSESSIVIDADE(10),
	APATICA(11),
	CONFUSA(12),
	AUTOCRITICA(13);
	
	private final int valor;
	
	Humores(int opcao){
		valor = opcao;
	}
	
	public int getValor() {
		return valor;
	}
}
