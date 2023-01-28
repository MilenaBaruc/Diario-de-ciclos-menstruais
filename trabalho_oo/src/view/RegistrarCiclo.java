package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

import controller.ControlerCiclo;
import controller.ControlerDados;
import enumeradores.Intensidade;

public class RegistrarCiclo implements ActionListener {

	private static JFrame frame;
	public Border blackline = BorderFactory.createLineBorder(Color.black);
	private static JRadioButton sim;
	private static JRadioButton nao;
	private static JRadioButton leve;
	private static JRadioButton normal;
	private static JRadioButton forte;
	private static JTextField boxMens;
	
	private static JTextField boxCiclo;
	private static ControlerDados dados;
    private ControlerCiclo dadosCiclo;
	private JList cicloData;
	
	private JFormattedTextField dataField;
	String data;
	boolean mens;
	int durCiclo;
	int durMens;
	Intensidade intensidade;

	public RegistrarCiclo(ControlerDados dados) {

		frame = new JFrame("Registrar Ciclo");
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		
		this.dados = dados;
		dadosCiclo = new ControlerCiclo(dados);
		cicloData = new JList(dadosCiclo.getCicloData());
		
		dataCiclo();
		diaMens();
		durCiclo();
		durMens();
		fluxoMens();
		btnConfirmar();
		btnSair();
		frame.setVisible(true);

	}

	public void dataCiclo() {
		JLabel data = new JLabel("Data de inicio:");

		MaskFormatter maskData = null;
		try {
			maskData = new MaskFormatter("##/##/####");
			maskData.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();
		}
		dataField = new JFormattedTextField(maskData);

		data.setBounds(20, 10, 90, 20);
		dataField.setBounds(110, 10, 60, 20);

		frame.add(dataField);
		frame.add(data);

	}

	public void diaMens() {

		JLabel diaMens = new JLabel("Está menstruada?");
		diaMens.setBounds(20, 45, 250, 15);
		diaMens.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.add(diaMens);

		sim = new JRadioButton("Sim");
		sim.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		sim.setBounds(20, 70, 55, 15);
		sim.addActionListener(this);
		sim.setOpaque(false);

		nao = new JRadioButton("Não");
		nao.setBounds(70, 70, 55, 15);
		nao.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		nao.addActionListener(this);
		nao.setOpaque(false);

		frame.add(sim);
		frame.add(nao);

		ButtonGroup opcoes = new ButtonGroup();
		opcoes.add(nao);
		opcoes.add(sim);

	}

	public void durCiclo() {

		JLabel durCiclo = new JLabel("Qual a duração do seu Ciclo?");
		boxCiclo = new JTextField();

		durCiclo.setBounds(20, 105, 250, 15);
		durCiclo.setFont(new Font("Times New Roman", Font.BOLD, 15));

		boxCiclo.setBounds(217, 105, 30, 15);
		boxCiclo.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		frame.add(durCiclo);
		frame.add(boxCiclo);

	}

	public void durMens() {

		JLabel durMens = new JLabel("Qual a duração da sua Menstruação?");
		boxMens = new JTextField();

		durMens.setBounds(20, 135, 300, 15);
		durMens.setFont(new Font("Times New Roman", Font.BOLD, 15));

		boxMens.setBounds(277, 135, 30, 15);
		boxMens.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		frame.add(boxMens);
		frame.add(durMens);

	}

	public void fluxoMens() {

		JLabel fluxoMens = new JLabel("Como está seu fluxo menstrual?");
		fluxoMens.setBounds(20, 165, 300, 15);
		fluxoMens.setFont(new Font("Times New Roman", Font.BOLD, 15));

		leve = new JRadioButton("Leve");
		leve.setBounds(20, 185, 100, 15);
		leve.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		leve.addActionListener(this);
		leve.setOpaque(false);

		normal = new JRadioButton("Normal");
		normal.setBounds(20, 205, 100, 15);
		normal.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		normal.addActionListener(this);
		normal.setOpaque(false);

		forte = new JRadioButton("Forte");
		forte.setBounds(20, 225, 100, 15);
		forte.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		forte.addActionListener(this);
		forte.setOpaque(false);

		frame.add(leve);
		frame.add(normal);
		frame.add(forte);
		frame.add(fluxoMens);

		ButtonGroup opcoes = new ButtonGroup();
		opcoes.add(leve);
		opcoes.add(forte);
		opcoes.add(normal);
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

	public static void main(String[] args) {

		new RegistrarCiclo(dados);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if ("voltar" == e.getActionCommand()) {
			new AdicionarInfo(dados);
			frame.dispose();
		}
		if ("confirmar" == e.getActionCommand()) {
			if (leve.isSelected()) {
				intensidade = Intensidade.LEVE;
			} else if (normal.isSelected()) {
				intensidade = Intensidade.NORMAL;
			} else {
				intensidade = Intensidade.FORTE;
			}

			if (sim.isSelected()) {
				mens = true;
			} else {
				mens = false;
			}

			data = dataField.getText();
			durCiclo = Integer.parseInt(boxCiclo.getText());
			durMens = Integer.parseInt(boxMens.getText());
			dados.addCiclo(mens, durCiclo, durMens, intensidade, data);
			frame.dispose();
		}

	}

}
