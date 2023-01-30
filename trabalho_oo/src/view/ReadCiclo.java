package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import enumeradores.Intensidade;

public class ReadCiclo {
	private JFrame frame;
	private JLabel diaMenstruada;
	private JLabel duracaoCiclo;
	private JLabel fluxoMenstrual;
	private JLabel duracaoMenstruacao;
	private JLabel data;
	private boolean diaMens;
	private int durCiclo;
	private int durMens;
	private Intensidade intensidade;
	private String dataCiclo;
	
	public ReadCiclo(boolean diaMens, int durCiclo, Intensidade intensidade, int durMens, String dataCiclo) {
		this.diaMens = diaMens;
		this.durCiclo = durCiclo;
		this.intensidade = intensidade;
		this.durMens = durMens;
		this.dataCiclo = dataCiclo;
		
		frame = new JFrame("R do crud");
		diaMenstruada = new JLabel("Você " + (diaMens ? " menstruou neste dia\n" : " não menstruou neste dia\n" ));
		duracaoMenstruacao = new JLabel("A menstruação durou " + durMens + " dia(s)\n");		
		duracaoCiclo = new JLabel("Este ciclo durou " + durCiclo + " dia(s)\n");
		fluxoMenstrual = new JLabel("Foi um ciclo menstrual " + intensidade + "\n");
		data = new JLabel("Registrado em " + dataCiclo + ".\n");
		
		diaMenstruada.setFont(new Font("Times New Roman", Font.BOLD, 17));
		duracaoMenstruacao.setFont(new Font("Times New Roman", Font.BOLD, 17));
		duracaoCiclo.setFont(new Font("Times New Roman", Font.BOLD, 17));
		fluxoMenstrual.setFont(new Font("Times New Roman", Font.BOLD, 17));
		data.setFont(new Font("Times New Roman", Font.BOLD, 17));
		
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		frame.setLayout(new FlowLayout());
		
		frame.add(diaMenstruada);
		frame.add(duracaoMenstruacao);
		frame.add(duracaoCiclo);
		frame.add(fluxoMenstrual);
		frame.add(data);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ReadCiclo(false, 10, Intensidade.FORTE, 10, "29/01/2023");
	}
}
