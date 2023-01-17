package view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Btn {
	private static JFrame frame;
	private static JButton btnRegisterMens;
	private static JButton btnRemoveMens;
	private static JButton btnEditMens;
	private static JButton btnSeeMens;
	
	private static JButton btnRegisterSint;
	private static JButton btnRemoveSint;
	private static JButton btnEditSint;
	private static JButton btnSeeSint;
	
	private static JButton btnRegisterCiclo;
	private static JButton btnRemoveCiclo;
	private static JButton btnEditCiclo;
	private static JButton btnSeeCiclo;
	
	public void btnRegisterMens() {
		 btnRegisterMens = new JButton("Registrar Menstruação");
		 btnRegisterMens.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		 frame.add(btnRegisterMens);
	}
	public void btnRemoveMens() {
		btnRemoveMens = new JButton("Remover Menstruação");
		btnRemoveMens.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		frame.add(btnRemoveMens);
	}
	public void btnEditMens() {
		btnEditMens = new JButton("Editar Menstruação");
		btnEditMens.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		frame.add(btnEditMens);
	}
	public void btnSeeMens() {
		btnSeeMens = new JButton("Ver Menstruação");
		btnSeeMens.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		frame.add(btnSeeMens);
	}
	
	
	
	
	
	
	public void btnRegisterSint() {
		btnRegisterSint = new JButton("Registrar Sintoma");
		btnRegisterSint.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		 frame.add(btnRegisterSint);
	}
	public void btnRemoveSint() {
		btnRemoveSint = new JButton("Remover Sintoma");
		btnRemoveSint.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		 frame.add(btnRemoveSint);
	}
	public void btnEditSint() {
		btnEditSint = new JButton("Editar Sintoma");
		btnEditSint.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		 frame.add(btnEditSint);
	}
	public void btnSeeSint() {
		btnSeeSint = new JButton("Ver Sintoma");
		btnSeeSint.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		 frame.add(btnSeeSint);
	}
	
	
	public void btnRegisterCiclo() {
		btnRegisterCiclo = new JButton("Registrar Ciclo");
		btnRegisterCiclo.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		 frame.add(btnRegisterCiclo);
	}
	public void btnRemoveCiclo() {
		btnRemoveCiclo = new JButton("Remover Ciclo");
		btnRemoveCiclo.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		 frame.add(btnRemoveCiclo);
	}
	public void btnEditCiclo() {
		btnEditCiclo = new JButton("Editar Ciclo");
		btnEditCiclo.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		 frame.add(btnEditCiclo);
	}
	public void btnSeeCiclo() {
		btnSeeCiclo = new JButton("Ver Ciclo");
		btnSeeCiclo.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		 frame.add(btnSeeCiclo);
	}
}
