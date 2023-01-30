package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

import controller.ControlerDados;
import controller.ControlerSintomas;

public class ResultadoSecrecao {
	JFrame frame;
	private JList secrecaoData;
	private ControlerSintomas dadosSint;
	private ControlerDados dados;
	
	ResultadoSecrecao(ControlerDados dados){
		frame = new JFrame("Pesquisa Secreção");
		frame.setSize(400,400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		
		dados = new ControlerDados();
		dadosSint = new ControlerSintomas(dados);
		
		secrecaoData = new JList(dadosSint.getSecrecaoData());
		secrecaoData.setBounds(0, 0, 350, 230);
		secrecaoData.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		secrecaoData.setLayoutOrientation(JList.VERTICAL);
		secrecaoData.setVisibleRowCount(10);
		secrecaoData.setForeground(Color.black);
		secrecaoData.setOpaque(false);
		secrecaoData.setBackground(new Color(255, 255, 255, 0));
		secrecaoData.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		frame.add(secrecaoData);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	
}
