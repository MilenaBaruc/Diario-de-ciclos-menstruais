package view;

import java.awt.Color;
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

import controller.ControlerCiclo;
import controller.ControlerDados;

public class ExcluirCiclo implements ActionListener{
	
    private static JFrame frame;
    public Border blackline = BorderFactory.createLineBorder(Color.black);
    public Border raisedbevel = BorderFactory.createRaisedBevelBorder();
    private static ControlerDados dados;
    private ControlerCiclo dadosCiclo;
	private JList cicloData;
	private static int i;
	private String dataLida;
	
    public ExcluirCiclo(ControlerDados cd){
		
		frame = new JFrame("Excluir Ciclo");
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		frame.setLayout(null);
		
		this.dados = cd;
		dadosCiclo = new ControlerCiclo(dados);
		cicloData = new JList(dadosCiclo.getCicloData());
		
		sintedit();
		painel();
		btnSair();
		btnConfirmar();
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new ExcluirCiclo(dados);
		
	}
	
	public void sintedit() {
		
		JLabel sintedit = new JLabel("Excluir ciclos:");
		sintedit.setBounds(20, 20, 250, 15);
		sintedit.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.add(sintedit);
		
	}
	
	public void painel() {
		
		JPanel painel = new JPanel();
		
		cicloData.setBounds(0, 0, 350, 230);
		cicloData.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		cicloData.setLayoutOrientation(JList.VERTICAL);
		cicloData.setVisibleRowCount(-1);
		cicloData.setForeground(Color.black);
		cicloData.setOpaque(false);
		cicloData.setBackground(new Color(255, 255, 255, 0));
		cicloData.setFont(new Font("Times New Roman", Font.BOLD, 18));
		cicloData.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent arg0) {
                if (!arg0.getValueIsAdjusting()) {
                  dataLida = cicloData.getSelectedValue().toString();
                }
            }
        });
		
		
		
		
		painel.setBounds(20, 50, 350, 230);
		painel.setBackground(new Color(255, 215, 249));
		painel.setOpaque(true);
		painel.setBorder(raisedbevel);
		painel.setLayout(null);
		painel.setVisible(true);

		
		painel.add(cicloData);
		frame.add(painel);
	}
	
	public void valueChanged(ListSelectionEvent arg0) {
        if (!arg0.getValueIsAdjusting()) {
          dataLida = cicloData.getSelectedValue().toString();
        }
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
    		dados.remCiclo(dadosCiclo.getIdxCiclo(dataLida));
    		
			frame.dispose();
		}
		
	}
}
