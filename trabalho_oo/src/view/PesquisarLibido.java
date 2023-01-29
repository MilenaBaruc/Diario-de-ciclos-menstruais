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

public class PesquisarLibido implements ActionListener {
	
	private static JFrame frame;
	private static JButton btnBuscar;
	private static JLabel libido;
	private JTextField fieldLibido;
	public Border raisedbevel = BorderFactory.createRaisedBevelBorder();
	
	PesquisarLibido(){
		
		frame = new JFrame("Pesquisa Libido");
		frame.setSize(400,400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		
		libido();
		fieldLibido();
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
	
	public void libido() {
		
		libido = new JLabel("Digite a data como: **/**/****");
		libido.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.add(libido);
		
	}
	
	public void fieldLibido() {
		
		fieldLibido = new JTextField("          ");
		fieldLibido.setSize(100,30);
		frame.add(fieldLibido);
		
	}
	
	public static void main(String[] args) {
		
		new PesquisarLibido();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
