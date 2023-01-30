package program;

import enumeradores.*;
import modelo.*;

public class Application {
	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		Ciclo ciclo = new Ciclo();
		Fisico fisico = new Fisico();
		Humor humor = new Humor();
		Secrecao secrecao = new Secrecao();
		Libido libido = new Libido();
		
		System.out.println(usuario);
		System.out.println(ciclo);
		System.out.println(fisico);
		System.out.println(humor);
		System.out.println(secrecao);
		System.out.println(libido);
		
		usuario.setDataNascimento("30/12/2003");
		usuario.setGravidez(true);
		usuario.setNome("Victoria Huga");
		usuario.setPeso("63.00");
		
		ciclo.setDiaMenstruada(true);
		ciclo.setDuracaoCiclo(25);
		ciclo.setDuracaoMesntruacao(7);
		ciclo.setFluxoMenstrual(Intensidade.NORMAL);
		
		fisico.setDescricao("Muitas dores abdominais");
		fisico.setIntensidade(Intensidade.FORTE);
		fisico.setNomeSintoma("Dor muscular");
		fisico.setPratica(true);
		fisico.setRemedioTomado("dorflex");
		
		humor.setDescricao("Um vazio muito grande, dor e mais dor. Perdi o sentido da vida");
		humor.setIntensidade(Intensidade.FORTE);
		humor.setNomeSintoma("depressao");
		humor.setGatilho("Tite ser o tecnico da selecao brasileira");
		humor.setHumor("Triste");
		libido.setNomeSintoma(null);
		libido.setRelacoesComParceiro(false);
		libido.setRelacoesSemParceiro(false);
		
		secrecao.setDescricao("Tem um trem esquisto aqui, bicho");
		secrecao.setIntensidade(Intensidade.LEVE);
		secrecao.setNomeSintoma("Se alguem souber, me conta");
		secrecao.setTextura("incomum");
		
		System.out.println();
		System.out.println("Com os valores alterados: ");
		System.out.println();
		
		System.out.println(usuario);
		System.out.println(ciclo);
		System.out.println(fisico);
		System.out.println(humor);
		System.out.println(secrecao);
		System.out.println(libido);
		
	}
}
