package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EditarCiclo implements ActionListener{
	
private static JFrame frame;
	
    public EditarCiclo(){
		
		frame = new JFrame("Lótus");
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		sintedit();
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		
	}
	
	public static void main(String[] args) {
		
		new EditarCiclo();
		
	}
	
	public void sintedit() {
		
		JLabel sintedit = new JLabel("Excluir ciclos:");
		sintedit.setBounds(20, 20, 250, 15);
		sintedit.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.add(sintedit);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}