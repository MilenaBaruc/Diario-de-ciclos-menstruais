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

public class PesquisarSecrecao implements ActionListener {
	
	private static JFrame frame;
	private static JButton btnBuscar;
	private static JLabel secrecao;
	private JTextField fieldSecrecao;
	public Border raisedbevel = BorderFactory.createRaisedBevelBorder();
	
	PesquisarSecrecao(){
		
		frame = new JFrame("Pesquisa Secrecao");
		frame.setSize(400,400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		
		secrecao();
		fieldSecrecao();
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
	
	public void secrecao() {
		
		secrecao = new JLabel("Digite a data como: **/**/****");
		secrecao.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.add(secrecao);
		
	}
	
	public void fieldSecrecao() {
		
		fieldSecrecao = new JTextField("          ");
		fieldSecrecao.setSize(100,30);
		frame.add(fieldSecrecao);
		
	}
	
	public static void main(String[] args) {
		
		new PesquisarSecrecao();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
