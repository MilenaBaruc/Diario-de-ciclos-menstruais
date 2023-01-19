package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import modelo.Sintoma;

public class Principal implements ActionListener{
	private JButton btnAddSint;
	private static JFrame frame;
	private JPanel painelSint;
	private JButton btnConfig;
	public Border blackline = BorderFactory.createLineBorder(Color.black);
	
	
	Principal(){
		frame = new JFrame("Lótus");
		frame.setSize(800, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		background();
		painelSint();
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
		btnAddSint.setBounds(550, 500, 190, 30);
		btnAddSint.setBackground(new Color(108, 70, 117));
		btnAddSint.setForeground(new Color(255, 255, 255));
		btnAddSint.setBorder(blackline);
		btnAddSint.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnAddSint.addActionListener(this);
		frame.add(btnAddSint);
		
	}
	
	public void btnConfig() {
		btnConfig = new JButton("Configurações");
		btnConfig.setBounds(140, 500, 120, 30);
		btnConfig.setBackground(new Color(108, 70, 117));
		btnConfig.setForeground(new Color(255, 255, 255));
		btnConfig.setBorder(blackline);
		btnConfig.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnConfig.setActionCommand("configurar");
		btnConfig.addActionListener(this);
		frame.add(btnConfig);
	}
	
	public void painelSint() {
		painelSint = new JPanel();
		painelSint.setBackground(new Color(0, 0, 0));
		painelSint.setBounds(25, 65, 750, 400);
		painelSint.setVisible(true);
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

	public static void main(String[] args) {
		new Principal();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if("configurar" == e.getActionCommand()) {
			new Configuracoes();
		}
		if("Add Sintoma" == e.getActionCommand()) {
			new Sintomas();
			frame.dispose();
		}
		if("sair" == e.getActionCommand()) {
			new Begin();
			frame.dispose();
		}
	}

}
