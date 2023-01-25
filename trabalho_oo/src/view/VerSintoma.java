package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class VerSintoma implements ActionListener{
	
private static JFrame frame;
	
    public VerSintoma(){
		
		frame = new JFrame("Lótus");
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		sintomasPass();
		
	}
	
	public static void main(String[] args) {
		
		new VerSintoma();
		
	}
	
	public void sintomasPass() {
		
		JLabel sintomasPass = new JLabel("Sintomas Passados:");
		sintomasPass.setBounds(20, 20, 250, 15);
		sintomasPass.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.add(sintomasPass);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
