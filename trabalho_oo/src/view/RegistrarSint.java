package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

import controller.ControlerDados;

public class RegistrarSint implements ActionListener {
	
	public Border blackline = BorderFactory.createLineBorder(Color.black);
	private JFrame frame;
	private String sintoma;
	private int opcao = 0;
	private static ControlerDados dados;
	private JTextField nomeSint;
	private JTextField data;
	private JTextField descricao;
	private JRadioButton praticaTrue;
	private JRadioButton praticaFalse;
	private JTextField fisicoRemedio;

	public RegistrarSint(ControlerDados dados) {
		this.dados = dados;
		frame = new JFrame(sintoma);
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		frame.setLayout(null);
		dadosComum();
		conteudo();
		btnSair();
		btnConfirmar();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new RegistrarSint(dados);
	}
	
	public void dadosComum() {
		JLabel nome = new JLabel("Apelido p/ Sintoma:");
		JLabel dataLabel = new JLabel("Dia que sentiu:");
		JLabel descricaoLabel = new JLabel("Descrição: "); 
		
		nome.setFont(new Font("Times New Roman", Font.BOLD, 16));
		nome.setBounds(10, 50, 140, 30);
		
		dataLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		dataLabel.setBounds(10, 10, 140, 30);
		
		descricaoLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		descricaoLabel.setBounds(10, 90, 100, 30);
		
		nomeSint = new JTextField();
		nomeSint.setBounds(170, 50, 100, 20);
		
		data = new JTextField();
		data.setBounds(170, 10, 100, 20);
		
		descricao = new JTextField();
		descricao.setBounds(170, 90, 100, 20);
		
		frame.add(nome);
		frame.add(dataLabel);
		frame.add(descricaoLabel);
		frame.add(nomeSint);
		frame.add(data);
		frame.add(descricao);
		
	}
	public void conteudo() {
		if (opcao == 1) {
			sintoma = "Humor";
			JLabel pratica = new JLabel("Praticou alguma atividade?");
			JLabel remedio = new JLabel("Tomou algum remedio?");
			
			pratica.setFont(new Font("Times New Roman", Font.BOLD, 16));
			pratica.setBounds(10, 120, 140, 30);
			
			praticaTrue = new JRadioButton("Sim");
			praticaTrue.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			praticaTrue.setBounds(20, 70, 55, 15);
			praticaTrue.addActionListener(this);
			praticaTrue.setOpaque(false);
			
			praticaFalse = new JRadioButton("Sim");
			praticaFalse.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			praticaFalse.setBounds(20, 70, 55, 15);
			praticaFalse.addActionListener(this);
			praticaFalse.setOpaque(false);
			
			fisicoRemedio = new JTextField();
			
		} else if(opcao == 2) {
			sintoma = "Fisico";
			
		} else if(opcao == 3) {
			sintoma = "Libido";
		} else if(opcao == 4) {
			sintoma = "Secreção";
		}
	}

	public void btnSair() {
		JButton btnSair = new JButton("Voltar");
		btnSair.setBounds(80, 300, 80, 20);
		btnSair.setBackground(new Color(108, 70, 117));
		btnSair.setForeground(new Color(255, 255, 255));
		btnSair.setBorder(blackline);
		btnSair.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnSair.setActionCommand("voltar");
		btnSair.addActionListener(this);
		frame.add(btnSair);
	}

	public void btnConfirmar() {

		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(220, 300, 80, 20);
		btnConfirmar.setBackground(new Color(108, 70, 117));
		btnConfirmar.setForeground(new Color(255, 255, 255));
		btnConfirmar.setBorder(blackline);
		btnConfirmar.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnConfirmar.setActionCommand("confirmar");
		btnConfirmar.addActionListener(this);
		frame.add(btnConfirmar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
