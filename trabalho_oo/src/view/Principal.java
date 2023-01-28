package view;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.*;
import javax.swing.*;
import javax.swing.border.*;

import modelo.*;
import controller.*;

public class Principal implements ActionListener{
	
	private JButton btnAddSint;
	private static JFrame frame;
	private JPanel painelSint;
	private JButton btnConfig;
	private JLabel nomeLabel;
	public Border blackline = BorderFactory.createLineBorder(Color.black);
	private JList cicloData;
	private static ControlerDados dados;
	private ControlerCiclo dadosCiclo;
	private JPanel painelCiclo;
	public Border raisedbevel = BorderFactory.createRaisedBevelBorder();
	
	Principal(){
		frame = new JFrame("Lótus");
		frame.setSize(800, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		dados = new ControlerDados();
		dadosCiclo = new ControlerCiclo(dados);
		cicloData = new JList(dadosCiclo.getCicloData());
		
		background();
		painelSint();
		painelCiclo();
		btnAddSint();
		btnConfig();
		btnSair();
		frame.setVisible(true);
	}
	
	Principal(ControlerDados dados){
		frame = new JFrame("Lótus");
		frame.setSize(800, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		this.dados = dados;
		dadosCiclo = new ControlerCiclo(dados);
		cicloData = new JList(dadosCiclo.getCicloData());
		
		background();
		painelSint();
		painelCiclo();
		btnAddSint();
		btnConfig();
		btnSair();
		frame.setVisible(true);
	}
	
	public void background() {
		try {
			BufferedImage img = ImageIO.read(getClass().getResource("/images/fundoP3.jpg"));
			Image dimg = img.getScaledInstance(800, 550, Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(dimg);
			JLabel label = new JLabel();
			label.setIcon(icon);
			frame.getContentPane().add(label, BorderLayout.CENTER);
			frame.setContentPane(label);
			frame.pack();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public void btnAddSint() {
		
		btnAddSint = new JButton("Adicionar Sintomas do Dia");
		btnAddSint.setActionCommand("Add Sintoma");
		btnAddSint.setBounds(492, 500, 190, 30);
		btnAddSint.setBackground(new Color(108, 70, 117));
		btnAddSint.setForeground(new Color(255, 255, 255));
		btnAddSint.setBorder(blackline);
		btnAddSint.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnAddSint.addActionListener(this);
		frame.add(btnAddSint);
		
	}
	
	public void btnConfig() {
		btnConfig = new JButton("Configurações");
		btnConfig.setBounds(152, 500, 120, 30);
		btnConfig.setBackground(new Color(108, 70, 117));
		btnConfig.setForeground(new Color(255, 255, 255));
		btnConfig.setBorder(blackline);
		btnConfig.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnConfig.setActionCommand("configurar");
		btnConfig.addActionListener(this);
		frame.add(btnConfig);
	}
	
	public void painelCiclo() {
		painelCiclo = new JPanel();
		JLabel ciclo = new JLabel("Ciclo:");
		ciclo.setBounds(10, 0, 80, 30);
		ciclo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		painelCiclo.setBackground(new Color(255, 215, 249));
		painelCiclo.setBounds(50, 65, 325, 400);
		painelCiclo.setLayout(null);
		painelCiclo.setVisible(true);
		painelCiclo.setBorder(raisedbevel);
		painelCiclo.add(ciclo);

		cicloData.setBounds(0, 30, 320, 395);
		cicloData.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		cicloData.setOpaque(false);
		cicloData.setLayoutOrientation(JList.VERTICAL);
		cicloData.setVisibleRowCount(-1);
		cicloData.setForeground(Color.black);
		cicloData.setBackground(new Color(255, 255, 255, 0));
		cicloData.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		painelCiclo.add(cicloData);
		frame.add(painelCiclo);
	}
	public void painelSint() {
		painelSint = new JPanel();
		JLabel sintomas = new JLabel("Sintomas:");
		sintomas.setBounds(10, 0, 100, 30);
		sintomas.setFont(new Font("Times New Roman", Font.BOLD, 20));
		painelSint.setBackground(new Color(255, 215, 249));
		painelSint.setBounds(425, 65, 325, 400);
		painelSint.setLayout(null);
		painelSint.setBorder(raisedbevel);
		painelSint.setVisible(true);
		painelSint.add(sintomas);
		frame.add(painelSint);
	}
	
	public void btnSair() {
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(20, 20, 80, 20);
		btnSair.setBackground(new Color(108, 70, 117));
		btnSair.setForeground(new Color(255, 255, 255));
		btnSair.setBorder(blackline);
		btnSair.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnSair.setActionCommand("sair");
		btnSair.addActionListener(this);
		frame.add(btnSair);
	}
	
	public void nomeLabel() {
		nomeLabel = new JLabel();
	}

	public static void main(String[] args) {
		new Principal(dados);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if("configurar" == e.getActionCommand()) {
			new Configuracoes(dados);
		}
		if("Add Sintoma" == e.getActionCommand()) {
			new AdicionarInfo(dados);
			frame.dispose();
		}
		if("sair" == e.getActionCommand()) {
			new Begin();
			frame.dispose();
		}
	}

}
