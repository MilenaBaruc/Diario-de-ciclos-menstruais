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

public class TipoSint implements ActionListener {

	private static JFrame frame;
	public Border blackline = BorderFactory.createLineBorder(Color.black);
	private static ControlerDados dados;

	public TipoSint(ControlerDados dados) {

		frame = new JFrame("Registrar Sintoma");
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		frame.setLayout(null);
		this.dados = dados;
		labelSint();
		btnHumor();
		btnFisico();
		btnLibido();
		btnSecrecao();
		btnSair();
		btnConfirmar();
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new TipoSint(dados);
	}
	
	public void labelSint() {
		JLabel sintoma = new JLabel("Escolha um:");
		sintoma.setBounds(20, 20, 250, 15);
		sintoma.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		frame.add(sintoma);
	}
	
	public void btnHumor() {
		JButton btnHumor = new JButton("Humor");
		btnHumor.setBounds(102, 130, 80, 20);
		btnHumor.setBackground(new Color(108, 70, 117));
		btnHumor.setForeground(new Color(255, 255, 255));
		btnHumor.setBorder(blackline);
		btnHumor.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnHumor.setActionCommand("humor");
		btnHumor.addActionListener(this);
		frame.add(btnHumor);
	}
	
	public void btnFisico() {
		JButton btnFisico = new JButton("Fisico");
		btnFisico.setBounds(202, 130, 80, 20);
		btnFisico.setBackground(new Color(108, 70, 117));
		btnFisico.setForeground(new Color(255, 255, 255));
		btnFisico.setBorder(blackline);
		btnFisico.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnFisico.setActionCommand("fisico");
		btnFisico.addActionListener(this);
		frame.add(btnFisico);
	}
	
	public void btnLibido() {
		JButton btnLibido = new JButton("Libido");
		btnLibido.setBounds(102, 170, 80, 20);
		btnLibido.setBackground(new Color(108, 70, 117));
		btnLibido.setForeground(new Color(255, 255, 255));
		btnLibido.setBorder(blackline);
		btnLibido.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnLibido.setActionCommand("libido");
		btnLibido.addActionListener(this);
		frame.add(btnLibido);
	}

	public void btnSecrecao() {
		JButton btnSecrecao = new JButton("Secreção");
		btnSecrecao.setBounds(202, 170, 80, 20);
		btnSecrecao.setBackground(new Color(108, 70, 117));
		btnSecrecao.setForeground(new Color(255, 255, 255));
		btnSecrecao.setBorder(blackline);
		btnSecrecao.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnSecrecao.setActionCommand("secrecao");
		btnSecrecao.addActionListener(this);
		frame.add(btnSecrecao);
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
	}

}
