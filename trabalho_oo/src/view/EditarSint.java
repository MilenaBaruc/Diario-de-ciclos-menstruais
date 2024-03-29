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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

import controller.ControlerDados;
import controller.ControlerSintomas;
import enumeradores.Intensidade;

public class EditarSint implements ActionListener {

	public Border blackline = BorderFactory.createLineBorder(Color.black);
	private JFrame frame;
	private String sintoma;
	private ControlerDados dados;
	private ControlerSintomas dadosSint;
	private JTextField nomeSint;
	private JFormattedTextField data;
	private JTextField descricaoField;
	private JRadioButton praticaTrue;
	private JRadioButton praticaFalse;
	private JTextField fisicoRemedio;
	private JTextField tipoHumor;
	private JTextField gatilho;
	private JRadioButton relacaoComTrue;
	private JRadioButton relacaoSemTrue;
	private JRadioButton relacaoFalse;
	private JTextField secrecaoField;
	private Intensidade intensidade;
	private String descricaoLida;
	private String nomeSintLido;
	private String dataLida;
	private String texturaLida;
	private boolean praticaLida;
	private String remedioLido;
	private String gatilhoLido;
	private String humorLido;
	private boolean relacoesComLido;
	private boolean relacoesSemLido;

	private int opcao = 0;
	private String descricaoA;
	private String sintomaA;
	private String dataA;
	private boolean praticaA;
	private String remedioTomadoA;
	private String gatilhoA;
	private String humorA;
	private boolean relacoesComParceiroA;
	private boolean relacoesSemParceiroA;
	private String texturaA;

	public EditarSint(ControlerDados dados, int opcao, String descricao, String sintoma, String data, boolean pratica,
			String remedioTomado, String gatilho, String humor, boolean relacoesComParceiro,
			boolean relacoesSemParceiro, String textura) {

		frame = new JFrame(sintoma);
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		frame.setLayout(null);

		this.dados = dados;
		dadosSint = new ControlerSintomas(dados);
		this.opcao = opcao;
		this.descricaoA = descricao;
		this.sintomaA = sintoma;
		this.dataA = data;
		this.praticaA = pratica;
		this.remedioTomadoA = remedioTomado;
		this.gatilhoA = gatilho;
		this.humorA = humor;
		this.relacoesComParceiroA = relacoesComParceiro;
		this.relacoesSemParceiroA = relacoesSemParceiro;
		this.texturaA = textura;

		dadosComum();
		conteudo();
		btnSair();
		btnConfirmar();
		frame.setVisible(true);

	}

	public void dadosComum() {
		JLabel nome = new JLabel("Apelido p/ Sintoma:");
		JLabel dataLabel = new JLabel("Dia que sentiu:");
		JLabel descricaoLabel = new JLabel("Descrição: ");

		nome.setFont(new Font("Times New Roman", Font.BOLD, 16));
		nome.setBounds(10, 50, 140, 30);

		dataLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		dataLabel.setBounds(10, 10, 140, 30);

		descricaoLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		descricaoLabel.setBounds(10, 90, 100, 30);

		nomeSint = new JTextField(sintomaA);
		nomeSint.setBounds(170, 50, 100, 20);
		nomeSint.setBorder(blackline);

		MaskFormatter maskData = null;
		try {
			maskData = new MaskFormatter("##/##/####");
			maskData.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();
		}
		data = new JFormattedTextField(maskData);
		data.setBounds(170, 10, 68, 20);
		data.setBorder(blackline);
		data.setText(dataA);

		descricaoField = new JTextField(descricaoA);
		descricaoField.setBounds(170, 90, 100, 20);
		descricaoField.setBorder(blackline);

		frame.add(nome);
		frame.add(dataLabel);
		frame.add(descricaoLabel);
		frame.add(nomeSint);
		frame.add(data);
		frame.add(descricaoField);

	}

	public void conteudo() {
		if (opcao == 1) {
			sintoma = "Fisico";
			frame.setTitle(sintoma);
			JLabel pratica = new JLabel("Praticou alguma atividade fisica?");
			JLabel remedio = new JLabel("Tomou algum remedio?");

			pratica.setBounds(10, 130, 300, 30);
			pratica.setFont(new Font("Times New Roman", Font.BOLD, 16));

			remedio.setBounds(10, 190, 170, 30);
			remedio.setFont(new Font("Times New Roman", Font.BOLD, 16));

			praticaTrue = new JRadioButton("Sim");
			praticaTrue.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			praticaTrue.setBounds(10, 160, 55, 15);
			praticaTrue.addActionListener(this);
			praticaTrue.setOpaque(false);

			praticaFalse = new JRadioButton("Não");
			praticaFalse.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			praticaFalse.setBounds(60, 160, 55, 15);
			praticaFalse.addActionListener(this);
			praticaFalse.setOpaque(false);

			fisicoRemedio = new JTextField(remedioTomadoA);
			fisicoRemedio.setBounds(10, 220, 80, 20);
			fisicoRemedio.setBorder(blackline);

			ButtonGroup opcoes = new ButtonGroup();
			opcoes.add(praticaFalse);
			opcoes.add(praticaTrue);

			if (praticaA) {
				praticaTrue.setSelected(true);
			} else {
				praticaFalse.setSelected(true);
			}
			frame.add(praticaFalse);
			frame.add(praticaTrue);
			frame.add(fisicoRemedio);
			frame.add(remedio);
			frame.add(pratica);

		} else if (opcao == 2) {
			sintoma = "Humor";
			frame.setTitle(sintoma);

			JLabel qualHumor = new JLabel("Qual seu humor?");
			JLabel qualGatilho = new JLabel("Houve gatilho?");

			qualHumor.setBounds(10, 130, 200, 30);
			qualHumor.setFont(new Font("Times New Roman", Font.BOLD, 16));
			qualGatilho.setBounds(10, 170, 200, 30);
			qualGatilho.setFont(new Font("Times New Roman", Font.BOLD, 16));

			tipoHumor = new JTextField(humorA);
			tipoHumor.setBounds(170, 130, 90, 20);
			tipoHumor.setBorder(blackline);

			gatilho = new JTextField(gatilhoA);
			gatilho.setBounds(170, 170, 90, 20);
			gatilho.setBorder(blackline);

			frame.add(qualHumor);
			frame.add(tipoHumor);
			frame.add(qualGatilho);
			frame.add(gatilho);

		} else if (opcao == 3) {
			sintoma = "Libido";
			frame.setTitle(sintoma);

			JLabel relacoesLabel = new JLabel("Houve relação Sexual?");
			relacoesLabel.setBounds(10, 130, 300, 30);
			relacoesLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));

			relacaoComTrue = new JRadioButton("Com parceire");
			relacaoComTrue.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			relacaoComTrue.setBounds(10, 160, 100, 15);
			relacaoComTrue.addActionListener(this);
			relacaoComTrue.setOpaque(false);

			relacaoSemTrue = new JRadioButton("Sem parceire");
			relacaoSemTrue.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			relacaoSemTrue.setBounds(110, 160, 100, 15);
			relacaoSemTrue.addActionListener(this);
			relacaoSemTrue.setOpaque(false);

			relacaoFalse = new JRadioButton("Não houve");
			relacaoFalse.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			relacaoFalse.setBounds(210, 160, 100, 15);
			relacaoFalse.addActionListener(this);
			relacaoFalse.setOpaque(false);

			ButtonGroup opcoes = new ButtonGroup();
			opcoes.add(relacaoComTrue);
			opcoes.add(relacaoSemTrue);
			opcoes.add(relacaoFalse);

			if (relacoesComParceiroA) {
				relacaoComTrue.setSelected(true);
			} else if (relacoesSemParceiroA) {
				relacaoSemTrue.setSelected(true);
			} else {
				relacaoFalse.setSelected(true);
			}

			frame.add(relacoesLabel);
			frame.add(relacaoComTrue);
			frame.add(relacaoSemTrue);
			frame.add(relacaoFalse);

		} else if (opcao == 4) {
			sintoma = "Secreção";
			frame.setTitle(sintoma);
			JLabel textura = new JLabel("Qual a textura?");

			textura.setFont(new Font("Times New Roman", Font.BOLD, 16));
			textura.setBounds(10, 160, 120, 30);

			secrecaoField = new JTextField(texturaA);
			secrecaoField.setBorder(blackline);
			secrecaoField.setBounds(170, 160, 120, 20);

			frame.add(textura);
			frame.add(secrecaoField);
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
		if ("voltar" == e.getActionCommand()) {
			new TipoSint(dados);
			frame.dispose();
		}
		if ("confirmar" == e.getActionCommand()) {
			intensidade = null;
			descricaoLida = descricaoField.getText();
			nomeSintLido = nomeSint.getText();
			dataLida = data.getText();
			if (opcao == 1) {
				remedioLido = fisicoRemedio.getText();
				if (praticaTrue.isSelected()) {
					praticaLida = true;
				} else {
					praticaLida = false;
				}
				dados.editarFisico(dadosSint.getIdxFisico(sintomaA), intensidade, dataLida, nomeSintLido, praticaLida,
						remedioLido, dataLida);
			} else if (opcao == 2) {
				gatilhoLido = gatilho.getText();
				humorLido = tipoHumor.getText();
				dados.editarHumor(dadosSint.getIdxHumor(sintomaA), intensidade, descricaoLida, nomeSintLido,
						gatilhoLido, humorLido);
			} else if (opcao == 3) {
				if (relacaoComTrue.isSelected()) {
					relacoesComLido = true;
					relacoesSemLido = false;
				} else if (relacaoSemTrue.isSelected()) {
					relacoesComLido = false;
					relacoesSemLido = true;
				} else if (relacaoFalse.isSelected()) {
					relacoesComLido = false;
					relacoesSemLido = false;
				}
				dados.editarLibido(dadosSint.getIdxLibido(sintomaA), intensidade, descricaoLida, nomeSintLido,
						relacoesComLido, relacoesSemLido, dataLida);
			} else if (opcao == 4) {
				texturaLida = secrecaoField.getText();
				dados.editarSecrecao(dadosSint.getIdxSecrecao(sintomaA), intensidade, descricaoLida, nomeSintLido, texturaLida, dataLida);
			}

			frame.dispose();
		}

	}
}
