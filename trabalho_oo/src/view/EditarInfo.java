package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class EditarInfo implements ActionListener{
	private static JFrame frame;
	private static JButton btnAtt;

	String[] Gravida = { "Sim", "Nao" };

	EditarInfo() {
		frame = new JFrame("Cadastre-se");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);
		peso();
		gravidez();
		nome();
		birth();
		btnAtt();
		frame.getContentPane().setBackground(new Color(206, 110, 199));
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
		labelPeso.setBounds(50, 120, 120, 20);
		peso.setBounds(200, 120, 50, 20);
		

		frame.add(peso);
		frame.add(labelPeso);
	}

	public void gravidez() {
		JLabel labelGravidez = new JLabel("Está grávida? ");
		JComboBox<String> gravidez = new JComboBox<>(Gravida);
		gravidez.setBounds(200, 160, 50, 20);
		labelGravidez.setBounds(50, 160, 120, 20);
		frame.add(gravidez);
		frame.add(labelGravidez);
	}

	public void nome() {
		JLabel labelNome = new JLabel("Nome: ");
		JTextField nome = new JTextField("");
		nome.setBounds(200, 80, 120, 20);
		labelNome.setBounds(50, 80, 120, 20);
		frame.add(nome);
		frame.add(labelNome);
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
		birth.setBounds(200, 200, 70, 20);
		labelBirth.setBounds(50, 200, 120, 20);
		frame.add(birth);
		frame.add(labelBirth);
	}

	public void btnAtt() {
		btnAtt = new JButton("Registrar");
		btnAtt.setBounds(150, 300, 100, 30);
		
		btnAtt.setActionCommand("att");
		btnAtt.addActionListener(this);
		
		btnAtt.setBackground(null);
		btnAtt.setOpaque(false);
		btnAtt.setContentAreaFilled(false);
		btnAtt.setBorderPainted(false);
		frame.add(btnAtt);
	}

	public static void main(String[] args) {
		new EditarInfo();
	}
	
	public void actionPerformed(ActionEvent ae) {
		if ("att" == ae.getActionCommand()) {
			 new Principal();
	         frame.dispose();
	}

}
}
