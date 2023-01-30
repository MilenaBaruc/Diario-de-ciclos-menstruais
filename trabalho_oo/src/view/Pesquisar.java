package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

import controller.ControlerDados;

public class Pesquisar implements ActionListener{
	
	private static JFrame frame;
	private static JButton btnBuscar;

	private JFormattedTextField field;
	public Border raisedbevel = BorderFactory.createRaisedBevelBorder();
	private static ControlerDados dados;
	Pesquisar(ControlerDados dados){
		
		this.dados = dados;
		
		frame = new JFrame("Pesquisa");
		frame.setSize(400,400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		field();
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
	

	
	public void field() {
		MaskFormatter maskData = null;
		try {
			maskData = new MaskFormatter("##/##/####");
			maskData.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();
		}
		field = new JFormattedTextField(maskData);
		field.setSize(100,70);
		frame.add(field);
		
	}
	
	public static void main(String[] args) {
		new Pesquisar(dados);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
