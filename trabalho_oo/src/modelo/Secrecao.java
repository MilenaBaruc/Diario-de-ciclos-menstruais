package modelo;

import enumeradores.Intensidade;
import enumeradores.Textura;

public class Secrecao extends Sintoma {
	private Textura textura;

	public Secrecao(Intensidade intensidade, String descricao, String Nomesintoma, Textura textura) {
		super(intensidade, descricao, Nomesintoma);
		this.textura = textura;
	}
	
	public Secrecao() {}

	public Textura getTextura() {
		return textura;
	}

	public void setTextura(Textura textura) {
		this.textura = textura;
	}

	@Override
	public String toString() {
		return "Secrecao\n"
				+ "   textura = " + textura + "\n"
				+ "   intensidade = " + getIntensidade() + "\n" 
				+ "   descricao = " + getDescricao() + "\n"
				+ "   sintoma = " + getNomeSintoma();
	}
	
	

}
