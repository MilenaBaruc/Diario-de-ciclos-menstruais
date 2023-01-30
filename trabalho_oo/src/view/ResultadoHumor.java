package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

import controller.ControlerDados;
import controller.ControlerSintomas;

public class ResultadoHumor {
	JFrame frame;
	private JList HumorData;
	private ControlerSintomas dadosSint;
	private ControlerDados dados;
	
	ResultadoHumor(ControlerDados dados){
		frame = new JFrame("Pesquisa Humor");
		frame.setSize(400,400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		
		dados = new ControlerDados();
		dadosSint = new ControlerSintomas(dados);
		
		HumorData = new JList(dadosSint.getHumorData());
		HumorData.setBounds(0, 0, 350, 230);
		HumorData.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		HumorData.setLayoutOrientation(JList.VERTICAL);
		HumorData.setVisibleRowCount(10);
		HumorData.setForeground(Color.black);
		HumorData.setOpaque(false);
		HumorData.setBackground(new Color(255, 255, 255, 0));
		HumorData.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		frame.add(HumorData);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	
	
	
	
}
