package modelo;

import enumeradores.Intensidade;


public class Secrecao extends Sintoma {
	private String textura;

	public Secrecao(Intensidade intensidade, String descricao, String Nomesintoma, String textura, String data) {
		super(intensidade, descricao, Nomesintoma, data);
		this.textura = textura;
	}
	
	public Secrecao() {}

	public String getTextura() {
		return textura;
	}

	public void setTextura(String textura) {
		this.textura = textura;
	}

	@Override
	public String toString() {
		return "Secrecao\n"
				+ "   textura = " + textura + "\n"
				+ "   intensidade = " + getIntensidade() + "\n" 
				+ "   descricao = " + getDescricao() + "\n"
				+ "   sintoma = " + getNomeSintoma()+ "\n"
						+ "   data = " + getData();
	}
	
	

}
