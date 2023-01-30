package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

import controller.ControlerDados;
import controller.ControlerSintomas;

public class ResultadoLibido {
	JFrame frame;
	private JList libidoData;
	private ControlerSintomas dadosSint;
	private ControlerDados dados;
	
	ResultadoLibido(ControlerDados dados){
		frame = new JFrame("Pesquisa Libido");
		frame.setSize(400,400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		
		dados = new ControlerDados();
		dadosSint = new ControlerSintomas(dados);
		
		libidoData = new JList(dadosSint.getLibidoData());
		libidoData.setBounds(0, 0, 350, 230);
		libidoData.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		libidoData.setLayoutOrientation(JList.VERTICAL);
		libidoData.setVisibleRowCount(10);
		libidoData.setForeground(Color.black);
		libidoData.setOpaque(false);
		libidoData.setBackground(new Color(255, 255, 255, 0));
		libidoData.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		frame.add(libidoData);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	
	
}
