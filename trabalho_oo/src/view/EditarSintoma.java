package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class EditarSintoma implements ActionListener{
	
    private static JFrame frame;
    public Border blackline = BorderFactory.createLineBorder(Color.black);
    public Border raisedbevel = BorderFactory.createRaisedBevelBorder();
	
    public EditarSintoma(){
		
		frame = new JFrame("Lótus");
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		sintedit();
		painel();
		btnSair();
		btnConfirmar();
		
	}
	
	public static void main(String[] args) {
		
		new EditarSintoma();
		
	}
	
	public void sintedit() {
		
		JLabel sintedit = new JLabel("Excluir sintomas:");
		sintedit.setBounds(20, 20, 250, 15);
		sintedit.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.add(sintedit);
		
	}

	public void painel() {
		
		JPanel painel = new JPanel();
		
		painel.setBounds(20, 50, 350, 230);
		painel.setBackground(new Color(255, 215, 249));
		painel.setOpaque(true);
		painel.setBorder(raisedbevel);
		painel.setLayout(null);
		
		frame.add(painel);
		
	}
	
	public void btnSair() {
		JButton btnSair = new JButton("Voltar");
		btnSair.setBounds(80, 300, 80, 20);
		btnSair.setBackground(new Color(108, 70, 117));
		btnSair.setForeground(new Color(255, 255, 255));
		btnSair.setBorder(blackline);
		btnSair.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnSair.setActionCommand("voltar");
		btnSair.addActionListener(this);
		frame.add(btnSair);
	}
	
	public void btnConfirmar() {
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(220, 300, 80, 20);
		btnConfirmar.setBackground(new Color(108, 70, 117));
		btnConfirmar.setForeground(new Color(255, 255, 255));
		btnConfirmar.setBorder(blackline);
		btnConfirmar.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnConfirmar.setActionCommand("confirmar");
		btnConfirmar.addActionListener(this);
		frame.add(btnConfirmar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if("voltar" == e.getActionCommand()) {
			new Sintomas();
			frame.dispose();
		}
    	if("confirmar" == e.getActionCommand()) {
			frame.dispose();
		}
		
	}
}
