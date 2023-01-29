package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

import controller.*;

public class EscolherSint implements ActionListener {

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
	private int opcao = 0;

	public EscolherSint(ControlerDados dados) {

		frame = new JFrame("Escolha");
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

		sintedit();
		painel();
		btnSair();
		btnConfirmar();
		frame.setVisible(true);

	}

	public static void main(String[] args) {

		new EscolherSint(dados);

	}

	public void sintedit() {

		JLabel sintedit = new JLabel("Escolha um sintoma:");
		sintedit.setBounds(20, 20, 250, 15);
		sintedit.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.add(sintedit);

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
					opcao = 1;
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
					opcao = 2;
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
					opcao = 3;
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
					opcao = 4;
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

		if ("voltar" == e.getActionCommand()) {
			frame.dispose();
		}
		if ("confirmar" == e.getActionCommand()) {
			String descricaoCerta = "";
			String nomeCerto = "";
			String dataCerta = "";
			int idx = 0;
			if (opcao == 1) {
				idx = dadosSint.getIdxFisico(fisicoLido);
				descricaoCerta = dados.getFisico().get(idx).getDescricao();
				nomeCerto = dados.getFisico().get(idx).getNomeSintoma();
				dataCerta = dados.getFisico().get(idx).getData();
			} else if (opcao == 2) {
				idx = dadosSint.getIdxHumor(humorLido);
				descricaoCerta = dados.getHumor().get(idx).getDescricao();
				nomeCerto = dados.getHumor().get(idx).getNomeSintoma();
				dataCerta = dados.getHumor().get(idx).getData();

			} else if (opcao == 3) {
				idx = dadosSint.getIdxLibido(libidoLido);
				descricaoCerta = dados.getLibido().get(idx).getDescricao();
				nomeCerto = dados.getLibido().get(idx).getNomeSintoma();
				dataCerta = dados.getLibido().get(idx).getData();
			} else if (opcao == 4) {
				idx = dadosSint.getIdxSecrecao(secrecaoLido);
				descricaoCerta = dados.getSecrecao().get(idx).getDescricao();
				nomeCerto = dados.getSecrecao().get(idx).getNomeSintoma();
				dataCerta = dados.getSecrecao().get(idx).getData();
			}
			new EditarSint(dados, opcao, descricaoCerta, nomeCerto, dataCerta, dados.getFisico().get(idx).getPratica(),
					dados.getFisico().get(idx).getRemedioTomado(), dados.getHumor().get(idx).getGatilho(),
					dados.getHumor().get(idx).getHumor(), dados.getLibido().get(idx).isRelacoesComParceiro(),
					dados.getLibido().get(idx).isRelacoesSemParceiro(), dados.getSecrecao().get(idx).getTextura());
			frame.dispose();
		}

	}
}
