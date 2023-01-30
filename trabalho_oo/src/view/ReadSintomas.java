package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.ControlerDados;

public class ReadSintomas {
	private int opcao = 0;
	private String descricao; 
	private String sintoma;
	private String data;
	private boolean pratica;
	private String remedioTomado; 
	private String gatilho;
	private String humor;
	private boolean relacoesComParceiro;
	private boolean relacoesSemParceiro; 
	private String textura;
	private JFrame frame;
	private JLabel labelDescricao;
	private JLabel labelSintoma;
	private JLabel labelData;
	private JLabel labelPratica;
	private JLabel labelRemedio;
	private JLabel labelGatilho;
	private JLabel labelHumor;
	private JLabel labelRelacoesCom;
	private JLabel labelRelacoesSem;
	private JLabel labelTextura;
	
	ReadSintomas(int opcao, String descricao, String sintoma, String data, boolean pratica,
			String remedioTomado, String gatilho, String humor, boolean relacoesComParceiro,
			boolean relacoesSemParceiro, String textura){
		
		frame = new JFrame("R do crud");
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		frame.setLayout(new FlowLayout());
		
		labelDescricao = new JLabel("Detalhando, " + descricao);
		labelDescricao.setFont(new Font("Times New Roman", Font.BOLD, 17));
		labelSintoma = new JLabel("Voce sentiu " + sintoma);
		labelSintoma.setFont(new Font("Times New Roman", Font.BOLD, 17));
		labelData = new JLabel("Registrado em: " + data + ".");
		labelData.setFont(new Font("Times New Roman", Font.BOLD, 17));
		
		frame.add(labelSintoma);
		frame.add(labelDescricao);
		
		
		labelPratica = new JLabel((pratica ? "você praticou " : "você não praticou ") + "alguma atividade fisica");
		labelPratica.setFont(new Font("Times New Roman", Font.BOLD, 17));
		labelRemedio = new JLabel("você tomou " + remedioTomado);
		labelRemedio.setFont(new Font("Times New Roman", Font.BOLD, 17));
		
		
		labelGatilho = new JLabel("o gatilho foi" + gatilho);
		labelGatilho.setFont(new Font("Times New Roman", Font.BOLD, 17));
		labelHumor = new JLabel("Seu humor do dia foi" + humor);
		labelHumor.setFont(new Font("Times New Roman", Font.BOLD, 17));
		
		
		labelRelacoesCom = new JLabel((relacoesComParceiro ? "houve" : "nao houve") + " relacao sexual com parceiro");
		labelRelacoesCom.setFont(new Font("Times New Roman", Font.BOLD, 17));
		labelRelacoesSem = new JLabel((relacoesSemParceiro ? "houve" : "nao houve") + " relacao sexual sem parceiro");
		labelRelacoesSem.setFont(new Font("Times New Roman", Font.BOLD, 17));
		
		 
		labelTextura = new JLabel("A textura foi" + textura);
		labelTextura.setFont(new Font("Times New Roman", Font.BOLD, 17));
	
		if(opcao == 1) {
			frame.add(labelPratica);
			frame.add(labelRemedio);
		}else if (opcao == 2) {
			frame.add(labelHumor);
			frame.add(labelGatilho);
		}else if (opcao == 3) {
			frame.add(labelRelacoesCom);
			frame.add(labelRelacoesSem);
		}else if (opcao == 4) {
			frame.add(labelTextura);
		}
		
		frame.add(labelData);
		frame.setVisible(true);
	
	}
	

}
