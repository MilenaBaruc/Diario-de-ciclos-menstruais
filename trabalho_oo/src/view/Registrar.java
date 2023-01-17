package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Registrar implements ActionListener{
	private JPanel painel;
	private JButton regisMens;
	private JButton	regisCiclo;
	private JButton regisSint;
	private JButton Cancelar;

	public Registrar(){
		painel = new JPanel();
		painel.setBackground(new Color(0, 0, 0));
		painel.setLocation(200, 200);
		painel.setSize(200, 200);
		painel.setLayout(new FlowLayout());
		painel.setVisible(true);
		
	}
	public void regisMens() {
		regisMens = new JButton();
		regisMens.setSize(120, 60);
		painel.add(regisMens);
	}
	public static void main(String[] args) {
		new Registrar();
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
