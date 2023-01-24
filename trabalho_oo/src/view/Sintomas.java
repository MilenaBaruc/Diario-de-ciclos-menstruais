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

public class Sintomas implements ActionListener{
	
	private JFrame frame;
	public Border blackline = BorderFactory.createLineBorder(Color.black);
	public Border raisedbevel = BorderFactory.createRaisedBevelBorder();
	
	public Sintomas() {
		frame = new JFrame("Lótus");
		frame.setSize(800, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		background();
		painelCiclo();
		painelSintoma();
		//painelMenstruacao();
		btnSair();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Sintomas();

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
	
	public void painelCiclo() {
		JPanel painelCiclo = new JPanel();
		JLabel ciclo = new JLabel("Adicionar ao Ciclo:");
		JButton Cciclo = new JButton("Registrar ciclo");
		JButton Rciclo = new JButton("Ver ciclos");
		JButton Uciclo = new JButton("Editar ciclo");
		JButton Dciclo = new JButton("Excluir ciclos");
		
		painelCiclo.setBounds(30, 95, 725, 100);
		painelCiclo.setBackground(new Color(255, 215, 249));
		painelCiclo.setOpaque(true);
		painelCiclo.setBorder(raisedbevel);
		painelCiclo.setLayout(null);
		
		ciclo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		ciclo.setBounds(10, 10, 200, 20);
		
		Cciclo.setBounds(90, 60, 120, 20);
		Cciclo.setBackground(new Color(108, 70, 117));
		Cciclo.setForeground(new Color(255, 255, 255));
		Cciclo.setBorder(blackline);
		Cciclo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Cciclo.setActionCommand("registrarciclo");
		Cciclo.addActionListener(this);
		
		Rciclo.setBounds(230, 60, 120, 20);
		Rciclo.setBackground(new Color(108, 70, 117));
		Rciclo.setForeground(new Color(255, 255, 255));
		Rciclo.setBorder(blackline);
		Rciclo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		Uciclo.setBounds(370, 60, 120, 20);
		Uciclo.setBackground(new Color(108, 70, 117));
		Uciclo.setForeground(new Color(255, 255, 255));
		Uciclo.setBorder(blackline);
		Uciclo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		Dciclo.setBounds(510, 60, 120, 20);
		Dciclo.setBackground(new Color(108, 70, 117));
		Dciclo.setForeground(new Color(255, 255, 255));
		Dciclo.setBorder(blackline);
		Dciclo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		painelCiclo.add(ciclo); painelCiclo.add(Cciclo); painelCiclo.add(Rciclo); painelCiclo.add(Uciclo); painelCiclo.add(Dciclo);
		frame.add(painelCiclo);
	}
	
	public void painelSintoma() {
		JPanel painelSintoma = new JPanel();
		JLabel sintoma = new JLabel("Adicionar sintoma:");
		JButton Csintoma = new JButton("Registrar Sintoma");
		JButton Rsintoma = new JButton("Ver Sintoma");
		JButton Usintoma = new JButton("Editar Sintoma");
		JButton Dsintoma = new JButton("Excluir Sintoma");
		
		painelSintoma.setBounds(30, 225, 725, 100);
		painelSintoma.setBackground(new Color(255, 215, 249));
		painelSintoma.setOpaque(true);
		painelSintoma.setBorder(raisedbevel);
		painelSintoma.setLayout(null);
		
		sintoma.setFont(new Font("Times New Roman", Font.BOLD, 16));
		sintoma.setBounds(10, 10, 200, 20);
		
		Csintoma.setBounds(90, 60, 120, 20);
		Csintoma.setBackground(new Color(108, 70, 117));
		Csintoma.setForeground(new Color(255, 255, 255));
		Csintoma.setBorder(blackline);
		Csintoma.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		Rsintoma.setBounds(230, 60, 120, 20);
		Rsintoma.setBackground(new Color(108, 70, 117));
		Rsintoma.setForeground(new Color(255, 255, 255));
		Rsintoma.setBorder(blackline);
		Rsintoma.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		Usintoma.setBounds(370, 60, 120, 20);
		Usintoma.setBackground(new Color(108, 70, 117));
		Usintoma.setForeground(new Color(255, 255, 255));
		Usintoma.setBorder(blackline);
		Usintoma.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		Dsintoma.setBounds(510, 60, 120, 20);
		Dsintoma.setBackground(new Color(108, 70, 117));
		Dsintoma.setForeground(new Color(255, 255, 255));
		Dsintoma.setBorder(blackline);
		Dsintoma.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		painelSintoma.add(sintoma); painelSintoma.add(Csintoma); painelSintoma.add(Rsintoma); painelSintoma.add(Usintoma); painelSintoma.add(Dsintoma);
		frame.add(painelSintoma);
	}

	/*public void painelMenstruacao() {
		JPanel painelMenstruacao = new JPanel();
		JLabel menstruacao = new JLabel("Adicionar mestruação:");
		JButton Cmenstruacao = new JButton("Registrar mestruação");
		JButton Rmenstruacao = new JButton("Ver mestruação");
		JButton Umenstruacao = new JButton("Editar mestruação");
		JButton Dmenstruacao = new JButton("Excluir mestruação");
		
		painelMenstruacao.setBounds(30, 355, 725, 100);
		painelMenstruacao.setBackground(new Color(255, 215, 249));
		painelMenstruacao.setOpaque(true);
		painelMenstruacao.setBorder(raisedbevel);
		painelMenstruacao.setLayout(null);
		
		menstruacao.setFont(new Font("Times New Roman", Font.BOLD, 16));
		menstruacao.setBounds(10, 10, 200, 20);
		
		Cmenstruacao.setBounds(90, 60, 120, 20);
		Cmenstruacao.setBackground(new Color(108, 70, 117));
		Cmenstruacao.setForeground(new Color(255, 255, 255));
		Cmenstruacao.setBorder(blackline);
		Cmenstruacao.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		Rmenstruacao.setBounds(230, 60, 120, 20);
		Rmenstruacao.setBackground(new Color(108, 70, 117));
		Rmenstruacao.setForeground(new Color(255, 255, 255));
		Rmenstruacao.setBorder(blackline);
		Rmenstruacao.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		Umenstruacao.setBounds(370, 60, 120, 20);
		Umenstruacao.setBackground(new Color(108, 70, 117));
		Umenstruacao.setForeground(new Color(255, 255, 255));
		Umenstruacao.setBorder(blackline);
		Umenstruacao.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		Dmenstruacao.setBounds(510, 60, 120, 20);
		Dmenstruacao.setBackground(new Color(108, 70, 117));
		Dmenstruacao.setForeground(new Color(255, 255, 255));
		Dmenstruacao.setBorder(blackline);
		Dmenstruacao.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		painelMenstruacao.add(menstruacao); painelMenstruacao.add(Cmenstruacao); painelMenstruacao.add(Rmenstruacao); 
		painelMenstruacao.add(Umenstruacao); painelMenstruacao.add(Dmenstruacao);
		frame.add(painelMenstruacao);
	}*/

	public void btnSair() {
		JButton btnSair = new JButton("Voltar");
		btnSair.setBounds(20, 20, 80, 20);
		btnSair.setBackground(new Color(108, 70, 117));
		btnSair.setForeground(new Color(255, 255, 255));
		btnSair.setBorder(blackline);
		btnSair.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnSair.setActionCommand("voltar");
		btnSair.addActionListener(this);
		frame.add(btnSair);
	}

	public void actionPerformed(ActionEvent e) {
		if("voltar" == e.getActionCommand()) {
			new Principal();
			frame.dispose();
		}
		
		if(e.getActionCommand() == "registrarciclo") {
			new Registrar();
			frame.dispose();
		}
	}
	
	
}
