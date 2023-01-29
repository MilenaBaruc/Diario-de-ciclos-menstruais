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

public class PesquisarFisico implements ActionListener{
	
	private static JFrame frame;
	private static JButton btnBuscar;
	private static JLabel fisico;
	private JTextField fieldFisico;
	public Border raisedbevel = BorderFactory.createRaisedBevelBorder();
	
	PesquisarFisico(){
		
		frame = new JFrame("Pesquisa Fisico");
		frame.setSize(400,400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		
		fisico();
		fieldFisico();
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
	
	public void fisico() {
		
		fisico = new JLabel("Digite a data como: **/**/****");
		fisico.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.add(fisico);
		
	}
	
	public void fieldFisico() {
		
		fieldFisico = new JTextField("          ");
		fieldFisico.setSize(100,30);
		frame.add(fieldFisico);
		
	}
	
	public static void main(String[] args) {
		
		new PesquisarFisico();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
