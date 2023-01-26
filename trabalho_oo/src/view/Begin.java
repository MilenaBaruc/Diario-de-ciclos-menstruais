package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Begin implements ActionListener{
	
	private static JFrame frame;
	private static JButton btnEntrar;
	private static JButton btnRegister;

	Begin(){
		frame = new JFrame("Lótus");
		frame.setSize(800, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
			
		background();
		btnEntrar();
		btnRegister();
	
		
		frame.setVisible(true);
	}
		public void background() {
			try {
				BufferedImage img = ImageIO.read(getClass().getResource("/images/lotus.jpg"));
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
		
		public void btnEntrar() {
			btnEntrar = new JButton("Entrar");
			btnEntrar.setBounds(500, 400, 100, 100);
			btnEntrar.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			
			
			btnEntrar.setActionCommand("entrar");
			btnEntrar.addActionListener(this);
			
			btnEntrar.setBackground(null);
			btnEntrar.setOpaque(false);
			btnEntrar.setContentAreaFilled(false);
			btnEntrar.setBorderPainted(false);
			frame.add(btnEntrar);
			
		}
		
		public void btnRegister() {
			btnRegister = new JButton("Registrar");
			btnRegister.setBounds(600, 400, 150, 100);
			btnRegister.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			
			
			btnRegister.setActionCommand("registrar");
			btnRegister.addActionListener(this);
			
			btnRegister.setBackground(null);
			btnRegister.setOpaque(false);
			btnRegister.setContentAreaFilled(false);
			btnRegister.setBorderPainted(false);
			frame.add(btnRegister);
			
		}
		

	
	public static void main(String[] args) {
		new Begin();
	}
	
	public void actionPerformed(ActionEvent ae) {
		if ("entrar" == ae.getActionCommand()) {
			 new Login();
			 frame.dispose();
	}
		if("registrar" == ae.getActionCommand()) {
			new Cadastro();
			frame.dispose();
		}
}
}
