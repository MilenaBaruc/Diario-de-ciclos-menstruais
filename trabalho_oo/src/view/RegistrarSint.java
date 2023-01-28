package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

import controller.ControlerDados;

public class RegistrarSint implements ActionListener {

	private static JFrame frame;
	public Border blackline = BorderFactory.createLineBorder(Color.black);
	private static JRadioButton relcompar;
	private static JRadioButton relsempar;
	private static JRadioButton sim;
	private static JRadioButton nao;
	private static JRadioButton simrem;
	private static JRadioButton naorem;
	private static JLabel qualrem;
	private static JTextField boxqualrem;
	private static ControlerDados dados;

	public RegistrarSint(ControlerDados dados) {

		frame = new JFrame("Registrar Sintoma");
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		frame.setLayout(null);
		this.dados = dados;
		humor();
		libido();
		fisico();
		secrecao();
		remedio();
		qualrem();
		btnSair();
		btnConfirmar();
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new RegistrarSint(dados);

	}

	public void humor() {

		JLabel humor = new JLabel("Como está seu humor hoje?");
		humor.setBounds(20, 20, 250, 15);
		humor.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.add(humor);

		frame.setLayout(null);
		String humores[] = { "Calma", "Feliz", "Energetica", "Alegre", "Mudanças", "Irritada", "Triste", "Ansiosa",
				"Desanimada", "Culpada", "Obsessividade", "Apática", "Confusa", "Autocrítica" };
		JComboBox<String> humor1 = new JComboBox<>(humores);
		humor1.setBounds(20, 40, 250, 20);
		humor1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.add(humor1);

	}

	public void libido() {

		JLabel libido = new JLabel("Teve relações sexuais?");
		libido.setBounds(20, 70, 250, 15);
		libido.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.add(libido);

		relcompar = new JRadioButton("Relações com parceiro");
		relsempar = new JRadioButton("Relações sem parceiro");
		relcompar.setBounds(20, 90, 150, 15);
		relsempar.setBounds(150, 90, 150, 15);
		relcompar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		relsempar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frame.add(relcompar);
		frame.add(relsempar);

		relcompar.addActionListener(this);
		relcompar.setOpaque(false);
		relsempar.addActionListener(this);
		relsempar.setOpaque(false);

		ButtonGroup opcoes = new ButtonGroup();
		opcoes.add(relsempar);
		opcoes.add(relcompar);
	}

	public void fisico() {

		JLabel fisico = new JLabel("Fez alguma atividade fisica?");
		fisico.setBounds(20, 120, 250, 17);
		fisico.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.add(fisico);

		sim = new JRadioButton("Sim");
		nao = new JRadioButton("Não");
		sim.setBounds(20, 140, 55, 15);
		nao.setBounds(70, 140, 55, 15);
		sim.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		nao.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frame.add(sim);
		frame.add(nao);

		sim.addActionListener(this);
		sim.setOpaque(false);
		nao.addActionListener(this);
		nao.setOpaque(false);

		ButtonGroup opcoes = new ButtonGroup();
		opcoes.add(nao);
		opcoes.add(sim);

	}

	public void secrecao() {

		JLabel secrecao = new JLabel("Secreção");
		secrecao.setBounds(20, 170, 250, 17);
		secrecao.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.add(secrecao);

		frame.setLayout(null);
		String secrecoes[] = { "Viscosa", "Pastosa", "Clara", "Aquosa", "Incomum", "Sangramento" };
		JComboBox<String> secrecao1 = new JComboBox<>(secrecoes);
		secrecao1.setBounds(20, 190, 250, 20);
		secrecao1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.add(secrecao1);

	}

	public void remedio() {

		JLabel fisico = new JLabel("Tomou algum remedio?");
		fisico.setBounds(20, 220, 250, 17);
		fisico.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.add(fisico);

		simrem = new JRadioButton("Sim");
		naorem = new JRadioButton("Não");
		simrem.setBounds(20, 240, 55, 15);
		naorem.setBounds(70, 240, 55, 15);
		simrem.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		naorem.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frame.add(simrem);
		frame.add(naorem);

		simrem.addActionListener(this);
		simrem.setOpaque(false);
		naorem.addActionListener(this);
		naorem.setOpaque(false);

		ButtonGroup opcoes = new ButtonGroup();
		opcoes.add(naorem);
		opcoes.add(simrem);

	}

	public void qualrem() {

		qualrem = new JLabel("Qual?");
		qualrem.setBounds(20, 260, 250, 17);
		qualrem.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.add(qualrem);

		boxqualrem = new JTextField();
		boxqualrem.setBounds(70, 260, 100, 15);
		boxqualrem.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frame.add(boxqualrem);

		qualrem.setVisible(false);
		boxqualrem.setVisible(false);

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
		if ("voltar" == e.getActionCommand()) {
			new AdicionarInfo(dados);
			frame.dispose();
		}
		if ("confirmar" == e.getActionCommand()) {
			frame.dispose();
		}
		if (simrem.isSelected() == true) {
			qualrem.setVisible(true);
			boxqualrem.setVisible(true);
		}
		if (simrem.isSelected() == false) {
			qualrem.setVisible(false);
			boxqualrem.setVisible(false);
		}

	}

}
