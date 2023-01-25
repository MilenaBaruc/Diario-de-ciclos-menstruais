package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VerCiclo implements ActionListener{
	
	private static JFrame frame;
	
    public VerCiclo(){
		
		frame = new JFrame("Lótus");
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		ciclosPass();
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		
	}
	
	public static void main(String[] args) {
		
		new VerCiclo();
		
	}
	
	public void ciclosPass() {
		
		JLabel ciclosPass = new JLabel("Ciclos Passados:");
		ciclosPass.setBounds(20, 20, 250, 15);
		ciclosPass.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.add(ciclosPass);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
