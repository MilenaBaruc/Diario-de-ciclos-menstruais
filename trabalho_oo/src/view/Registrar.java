package view;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Registrar implements ActionListener{
	
	private static JFrame frame;
	private static JRadioButton sim;
	private static JRadioButton nao;
	private static JRadioButton inexistente;
	private static JRadioButton leve;
	private static JRadioButton normal;
	private static JRadioButton forte;
	
	public Registrar(){
		
		frame = new JFrame("Lótus");
		frame.setSize(800, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		background();
		frame.setVisible(true);
		fluxoMens();
		durMens();
		durCiclo();
		diaMens();
		
	}
	
	public static void main(String[] args) {
		
		new Registrar();
		
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
	
	public void diaMens() {
		
		JLabel diaMens = new JLabel("Está menstruada?");
		diaMens.setBounds(70, 50, 250, 40);
		diaMens.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		frame.add(diaMens);
		
		sim = new JRadioButton("Sim");
		nao = new JRadioButton("Não");
		sim.setBounds(70, 90, 55, 20);
		nao.setBounds(120, 90, 57, 20);
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
	
	public void durCiclo() {
		
		JLabel durCiclo = new JLabel("Qual a duração do seu Ciclo?: ");
		durCiclo.setBounds(70, 120, 250, 20);
		durCiclo.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		frame.add(durCiclo);
		
		JTextField boxCiclo = new JTextField();
		boxCiclo.setBounds(72, 120, 200, 20);
		boxCiclo.setBounds(72, 150, 200, 20);
		frame.add(boxCiclo);
		
	}
	
    public void durMens() {
		
		JLabel durMens = new JLabel("Qual a duração da sua Menstruação?");
		durMens.setBounds(70, 180, 300, 20);
		durMens.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		frame.add(durMens);
		
		JTextField boxMens = new JTextField();
		boxMens.setBounds(72, 180, 200, 20);
		boxMens.setBounds(72, 210, 200, 20);
		frame.add(boxMens);
		
	}
    
    public void fluxoMens() {
    	
    	JLabel fluxoMens = new JLabel("Como está seu fluxo menstrual?");
    	fluxoMens.setBounds(70, 240, 300, 20);
    	fluxoMens.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		frame.add(fluxoMens);
		
		inexistente = new JRadioButton("Inexistente");
		leve = new JRadioButton("Leve");
		normal = new JRadioButton("Normal");
		forte = new JRadioButton("Forte");
		inexistente.setBounds(70, 270, 100, 20);
		leve.setBounds(70, 310, 100, 20);
		normal.setBounds(70, 350, 100, 20);
		forte.setBounds(70, 390, 100, 20);
		frame.add(inexistente);
		frame.add(leve);
		frame.add(normal);
		frame.add(forte);
		
		inexistente.addActionListener(this);
		inexistente.setOpaque(false);
		leve.addActionListener(this);
		leve.setOpaque(false);
		normal.addActionListener(this);
		normal.setOpaque(false);
		forte.addActionListener(this);
		forte.setOpaque(false);
		
		ButtonGroup opcoes = new ButtonGroup();
		opcoes.add(leve);
		opcoes.add(inexistente);
		opcoes.add(forte);
		opcoes.add(normal);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
