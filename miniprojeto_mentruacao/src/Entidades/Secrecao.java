package Entidades;

public class Secrecao extends Sintoma {
	
	public Secrecao(String nota, String sintoma) {
		super(nota, sintoma);
	}

	private Textura textura;

	public Textura getTextura() {
		return textura;
	}

	public void setTextura(Textura textura) {
		this.textura = textura;
	}
	
	public void removerSecrecao() {
		
	}

}
