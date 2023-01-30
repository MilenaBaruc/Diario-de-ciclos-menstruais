package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

import controller.ControlerDados;
import controller.ControlerSintomas;

public class Pesquisar implements ActionListener {

	private static JFrame frame;
	private static JButton btnBuscar;

	private JFormattedTextField field;
	public Border raisedbevel = BorderFactory.createRaisedBevelBorder();
	private ControlerDados dados;
	private ControlerSintomas dadosSint;
	private String dataLida;
	private JList<String> datasFisico;
	private JList<String> datasHumor;
	private JList<String> datasLibido;
	private JList<String> datasSecrecao;

	private String[] dataListFisico;
	private String[] dataListHumor;
	private String[] dataListLibido;
	private String[] dataListSecrecao;

	private int[] indexFisico;
	private int[] indexHumor;
	private int[] indexLibido;
	private int[] indexSecrecao;

	Pesquisar(ControlerDados dados) {

		this.dados = dados;
		dadosSint = new ControlerSintomas(dados);

		frame = new JFrame("Pesquisa");
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(206, 110, 199));
		field();
		btnBuscar();
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}

	public void btnBuscar() {

		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(100, 100, 100, 30);
		btnBuscar.setActionCommand("buscar");
		btnBuscar.addActionListener(this);
		frame.add(btnBuscar);
	}

	public void field() {
		MaskFormatter maskData = null;
		try {
			maskData = new MaskFormatter("##/##/####");
			maskData.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();
		}
		field = new JFormattedTextField(maskData);
		field.setSize(100, 70);
		frame.add(field);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "buscar") {
			dataLida = field.getText();
			if (opcao == 1) {
				int j = 0;
				for (int i = 0; i < dados.getFisico().size(); i++) {
					if (dados.getFisico().get(i).getData().equals(dataLida)) {
						dataListFisico[j] = dados.getFisico().get(i).getData();
						++j;
					}
				}
				datasFisico = new JList(dataListFisico);
				frame.add(datasFisico);
			} else if (opcao == 2) {
				int j = 0;
				for (int i = 0; i < dados.getHumor().size(); i++) {
					if (dados.getHumor().get(i).getData().equals(dataLida)) {
						dataListHumor[j] = dados.getFisico().get(i).getData();
						++j;
					}
				}
				datasHumor = new JList(dataListHumor);
				frame.add(datasHumor);

			}else if(opcao == 3) {
				int j = 0;
			for (int i = 0; i < dados.getLibido().size(); i++) {
				if (dados.getLibido().get(i).getData().equals(dataLida)) {
					dataListLibido[j] = dados.getFisico().get(i).getData();
					++j;
				}
			}
			}
			datasLibido = new JList(dataListLibido);
			frame.add(datasLibido);
		}
			for (int i = 0; i < dados.getSecrecao().size(); i++) {
				if (dados.getSecrecao().get(i).getData().equals(dataLida)) {
					dataList[j] = dados.getFisico().get(i).getData();
					++j;
				}
			}

		}

	}

}
