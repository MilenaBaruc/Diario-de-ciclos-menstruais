package view;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

public class Registrar implements ActionListener{
	
	private static JFrame frame;
	public Border blackline = BorderFactory.createLineBorder(Color.black);
	private static JRadioButton sim;
	private static JRadioButton nao;
	private static JRadioButton leve;
	private static JRadioButton normal;
	private static JRadioButton forte;
	
	public Registrar(){
		
		frame = new JFrame("Lótus");
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		frame.setVisible(true);
		diaMens();
		durCiclo();
//		durMens();
//		fluxoMens();
//		btnConfirmar();
//		btnSair();
		
	}
	
	
	public void diaMens() {
		
		JLabel diaMens = new JLabel("Está menstruada?");
		diaMens.setBounds(20, 10, 250, 15);
		diaMens.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.add(diaMens);
		
		sim = new JRadioButton("Sim");
		nao = new JRadioButton("Não");
		sim.setBounds(20, 30, 55, 15);
		nao.setBounds(70, 30, 55, 15);
		sim.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		nao.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		sim.addActionListener(this);
		sim.setOpaque(false);
		nao.addActionListener(this);
		nao.setOpaque(false);
		
		ButtonGroup opcoes = new ButtonGroup();
		opcoes.add(nao);
		opcoes.add(sim);
		
		frame.add(sim);
		frame.add(nao);
	}
	
	public void durCiclo() {
		
		JLabel durCiclo = new JLabel("Qual a duração do seu Ciclo?");
		durCiclo.setBounds(20, 70, 250, 15);
		durCiclo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.add(durCiclo);
		
		JTextField boxCiclo = new JTextField();
		boxCiclo.setBounds(217, 70, 20, 15);
		boxCiclo.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frame.add(boxCiclo);
		
	}
	
    public void durMens() {
		
		JLabel durMens = new JLabel("Qual a duração da sua Menstruação?");
		durMens.setBounds(20, 90, 300, 15);
		durMens.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.add(durMens);
		
		JTextField boxMens = new JTextField();
		boxMens.setBounds(277, 90, 20, 15);
		boxMens.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frame.add(boxMens);
		
	}
    
    public void fluxoMens() {
    	
    	JLabel fluxoMens = new JLabel("Como está seu fluxo menstrual?");
    	fluxoMens.setBounds(20, 120, 300, 15);
    	fluxoMens.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.add(fluxoMens);
		
		leve = new JRadioButton("Leve");
		normal = new JRadioButton("Normal");
		forte = new JRadioButton("Forte");
		leve.setBounds(20, 140, 100, 15);
		normal.setBounds(20, 160, 100, 15);
		forte.setBounds(20, 180, 100, 15);
		leve.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		normal.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		forte.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frame.add(leve);
		frame.add(normal);
		frame.add(forte);
		
		leve.addActionListener(this);
		leve.setOpaque(false);
		normal.addActionListener(this);
		normal.setOpaque(false);
		forte.addActionListener(this);
		forte.setOpaque(false);
		
		ButtonGroup opcoes = new ButtonGroup();
		opcoes.add(leve);
		opcoes.add(forte);
		opcoes.add(normal);
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
		JButton btnSair = new JButton("Confirmar");
		btnSair.setBounds(220, 300, 80, 20);
		btnSair.setBackground(new Color(108, 70, 117));
		btnSair.setForeground(new Color(255, 255, 255));
		btnSair.setBorder(blackline);
		btnSair.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnSair.setActionCommand("confirmar");
		btnSair.addActionListener(this);
		frame.add(btnSair);
	}
	
	public static void main(String[] args) {
		
		new Registrar();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if("voltar" == e.getActionCommand()) {
			new Sintomas();
			frame.dispose();
		}
    	if("confirmar" == e.getActionCommand()) {
			frame.dispose();
		}
    	
	}
	
	
}
