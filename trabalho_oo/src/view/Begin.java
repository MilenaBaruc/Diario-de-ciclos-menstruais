package view;

import javax.swing.*;

public class Begin {

	Begin(){
		JFrame jfrm = new JFrame("Nome da aplicação");
		JButton btn1 = new JButton("Entrar");
		btn1.setBounds(100, 100, 100, 30);
		jfrm.setSize(750, 500);
		jfrm.add(btn1);
		jfrm.setLayout(null);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		jfrm.setVisible(true);		
	}
	
	public static void main(String[] args) {
		new Begin();
	}
}
