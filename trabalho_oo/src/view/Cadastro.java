package view;

import java.awt.Color;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Cadastro {
	private static JFrame frame;

	String[] Gravida = { "Sim", "Nao" };

	Cadastro() {
		frame = new JFrame("Cadastre-se");
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.pink);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

		peso();
		gravidez();
		nome();
		birth();
		btnCadastro();
	};

	public void peso() {
		MaskFormatter maskPeso = null;
		try {
			maskPeso = new MaskFormatter("##,#");
			maskPeso.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();
		}

		JLabel labelPeso = new JLabel("Peso: ");
		JFormattedTextField peso = new JFormattedTextField(maskPeso);
		peso.setBounds(200, 120, 50, 20);
		labelPeso.setBounds(50, 120, 120, 20);

		frame.add(peso);
	}

	public void gravidez() {
		JLabel labelGravidez = new JLabel("Está grávida? ");
		JComboBox<String> gravidez = new JComboBox<>(Gravida);
		gravidez.setBounds(200, 160, 50, 20);
		labelGravidez.setBounds(50, 160, 120, 20);
		frame.add(gravidez);
	}

	public void nome() {
		JLabel labelNome = new JLabel("Nome: ");
		JTextField nome = new JTextField("");
		nome.setBounds(200, 200, 120, 20);
		labelNome.setBounds(50, 200, 120, 20);
		frame.add(nome);
	}

	public void birth() {
		MaskFormatter maskBirth = null;
		try {
			maskBirth = new MaskFormatter("##/##/####");
			maskBirth.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();
		}
		JLabel labelBirth = new JLabel("Data de Nascimento: ");
		JFormattedTextField birth = new JFormattedTextField(maskBirth);
		birth.setBounds(200, 80, 70, 20);
		labelBirth.setBounds(50, 80, 120, 20);
		frame.add(birth);
	}

	public void btnCadastro() {
		JButton btnCadastro = new JButton("cadastrar");
		btnCadastro.setBounds(150, 300, 100, 30);
		frame.add(btnCadastro);
	}

	public static void main(String[] args) {
		new Cadastro();
	}

}
