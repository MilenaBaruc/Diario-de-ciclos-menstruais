package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login implements ActionListener{
	private static JFrame frame;
	private static JButton btnEntrar;
	private static JLabel nome;
	private static JTextField fieldNome;
	
	Login(){
		frame = new JFrame();
		frame.setSize(400, 300);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		nome();
		fieldNome();
		btnEntrar();
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	
	public void btnEntrar() {
		btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(100, 100, 100, 30);
		btnEntrar.setActionCommand("entrar");
		btnEntrar.addActionListener(this);
		frame.add(btnEntrar);

	}
	
	public void nome() {
		nome = new JLabel("Digite seu nome: ");
		nome.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		frame.add(nome);
	}
	
	public void fieldNome() {
		fieldNome = new JTextField("          ");
		fieldNome.setSize(100, 30);
		frame.add(fieldNome);
		
	}
	public static void main(String[] args) {
		new Login();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if( "entrar" == e.getActionCommand()) {
			 new Principal();
	         frame.dispose();
	}

}
}
