package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class PesquisarHumor implements ActionListener{
	
	private static JFrame frame;
	private static JButton btnBuscar;
	private static JLabel humor;
	private JTextField fieldHumor;
	public Border raisedbevel = BorderFactory.createRaisedBevelBorder();
	
	PesquisarHumor(){
		
		frame = new JFrame("Pesquisa Humor");
		frame.setSize(400,400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		
		humor();
		fieldHumor();
		btnBuscar();
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	
	public void btnBuscar() {
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(100,100,100,30);
		//btnBuscar.setActionCommand(null);
		btnBuscar.addActionListener(this);
		frame.add(btnBuscar);
	}
	
	public void humor() {
		
		humor = new JLabel("Digite a data como: **/**/****");
		humor.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.add(humor);
		
	}
	
	public void fieldHumor() {
		
		fieldHumor = new JTextField("          ");
		fieldHumor.setSize(100,30);
		frame.add(fieldHumor);
		
	}
	
	public static void main(String[] args) {
		
		new PesquisarHumor();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
