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
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controller.ControlerDados;
import controller.ControlerSintomas;

public class VerSintoma implements ActionListener{
	
    private static JFrame frame;
    public Border blackline = BorderFactory.createLineBorder(Color.black);
    public Border raisedbevel = BorderFactory.createRaisedBevelBorder();
	private static ControlerDados dados;
	private ControlerSintomas dadosSint;
	private JList humorNome;
    private JList fisicoNome;
    private JList libidoNome;
    private JList secrecaoNome;
    private String humorLido;
    private String fisicoLido;
    private String libidoLido;
    private String secrecaoLido;
    
    public VerSintoma(ControlerDados dados){
		
		frame = new JFrame("Lótus");
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.getContentPane().setBackground(new Color(206, 110, 199));
	
		this.dados = dados;
		dadosSint = new ControlerSintomas(dados);
		humorNome = new JList(dadosSint.getHumorNome());
		fisicoNome = new JList(dadosSint.getFisicoNome());
		libidoNome = new JList(dadosSint.getLibidoNome());
		secrecaoNome = new JList(dadosSint.getSecrecaoNome());
		
		sintomasPass();
		painel();
		btnSair();
		btnConfirmar();
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new VerSintoma(dados);
		
	}
	
	public void sintomasPass() {
		
		JLabel sintomasPass = new JLabel("Sintomas Passados:");
		sintomasPass.setBounds(20, 20, 250, 15);
		sintomasPass.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.add(sintomasPass);
		
	}
	
    public void painel() {
		
		JPanel painel = new JPanel();
		
		fisicoNome.setBounds(0, 0, 350, 230);
		fisicoNome.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		fisicoNome.setLayoutOrientation(JList.VERTICAL);
		fisicoNome.setVisibleRowCount(10);
		fisicoNome.setForeground(Color.black);
		fisicoNome.setOpaque(false);
		fisicoNome.setBackground(new Color(255, 255, 255, 0));
		fisicoNome.setFont(new Font("Times New Roman", Font.BOLD, 18));
		fisicoNome.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				if (!arg0.getValueIsAdjusting()) {
					fisicoLido = fisicoNome.getSelectedValue().toString();
				}
			}
		});

		humorNome.setBounds(0, 0, 350, 230);
		humorNome.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		humorNome.setLayoutOrientation(JList.VERTICAL);
		humorNome.setVisibleRowCount(10);
		humorNome.setForeground(Color.black);
		humorNome.setOpaque(false);
		humorNome.setBackground(new Color(255, 255, 255, 0));
		humorNome.setFont(new Font("Times New Roman", Font.BOLD, 18));
		humorNome.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				if (!arg0.getValueIsAdjusting()) {
					humorLido = humorNome.getSelectedValue().toString();
				}
			}
		});
		
		
		libidoNome.setBounds(0, 0, 350, 230);
		libidoNome.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		libidoNome.setLayoutOrientation(JList.VERTICAL);
		libidoNome.setVisibleRowCount(10);
		libidoNome.setForeground(Color.black);
		libidoNome.setOpaque(false);
		libidoNome.setBackground(new Color(255, 255, 255, 0));
		libidoNome.setFont(new Font("Times New Roman", Font.BOLD, 18));
		libidoNome.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				if (!arg0.getValueIsAdjusting()) {
					libidoLido = libidoNome.getSelectedValue().toString();
				}
			}
		});
		
		secrecaoNome.setBounds(0, 0, 350, 230);
		secrecaoNome.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		secrecaoNome.setLayoutOrientation(JList.VERTICAL);
		secrecaoNome.setVisibleRowCount(10);
		secrecaoNome.setForeground(Color.black);
		secrecaoNome.setOpaque(false);
		secrecaoNome.setBackground(new Color(255, 255, 255, 0));
		secrecaoNome.setFont(new Font("Times New Roman", Font.BOLD, 18));
		secrecaoNome.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				if (!arg0.getValueIsAdjusting()) {
					secrecaoLido = secrecaoNome.getSelectedValue().toString();
				}
			}
		});
		
		
		painel.setBounds(20, 50, 350, 230);
		painel.setBackground(new Color(255, 215, 249));
		painel.setOpaque(true);
		painel.setBorder(raisedbevel);
		
		painel.setLayout(new FlowLayout());
		painel.add(fisicoNome);
		painel.add(humorNome);
		painel.add(libidoNome);
		painel.add(secrecaoNome);
		
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
			new AdicionarInfo(dados);
			frame.dispose();
		}
    	if("confirmar" == e.getActionCommand()) {
			frame.dispose();
		}
		
	}


}
