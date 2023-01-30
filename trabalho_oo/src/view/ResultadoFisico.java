package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

import controller.ControlerDados;
import controller.ControlerSintomas;

public class ResultadoFisico {
	JFrame frame;
	private JList fisicoData;
	private ControlerSintomas dadosSint;
	private ControlerDados dados;
	
	ResultadoFisico(ControlerDados dados){
		frame = new JFrame("Pesquisa Fisico");
		frame.setSize(400,400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		
		dados = new ControlerDados();
		dadosSint = new ControlerSintomas(dados);
		
		fisicoData = new JList(dadosSint.getFisicoData());
		fisicoData.setBounds(0, 0, 350, 230);
		fisicoData.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		fisicoData.setLayoutOrientation(JList.VERTICAL);
		fisicoData.setVisibleRowCount(10);
		fisicoData.setForeground(Color.black);
		fisicoData.setOpaque(false);
		fisicoData.setBackground(new Color(255, 255, 255, 0));
		fisicoData.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		frame.add(fisicoData);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	
	
}
