package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Principal implements ActionListener{
	private JPanel painelRegistrar;
	private JPanel painelRemover;
	private JPanel painelEditar;
	private JPanel painelVer;
	private static JFrame frame;
	private static JPanel painelBtn;
	private static JButton btnRegister;
	private static JButton btnRemove;
	private static JButton btnEdit;
	private static JButton btnSee;
	private JButton btnSair;
	private JButton regisMens;

	
	
	Principal(){
		frame = new JFrame("Lótus");
		frame.setSize(800, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		background();
		painelBtn();
		painelRegistrar();
		painelRemover();
		painelEditar();
		painelVer();
		

		frame.setVisible(true);
	}
	
	public void background() {
		try {
			BufferedImage img = ImageIO.read(getClass().getResource("/images/fundoP3.jpg"));
			Image dimg = img.getScaledInstance(800, 550, Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(dimg);
			JLabel label = new JLabel();
			label.setIcon(icon);
			frame.getContentPane().add(label, BorderLayout.CENTER);
			frame.setContentPane(label);
			frame.pack();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public void painelBtn() {
		painelBtn = new JPanel();
		painelBtn.setBounds(0, 0, 800, 35);
		painelBtn.setBackground(new Color(0, 0, 0, 0));
		btnRegister();
		btnRemove();
		btnEdit();
		btnSee();
		btnSair();
		frame.add(painelBtn);
	}
	
	public void btnRegister() {
		btnRegister = new JButton("Registrar");
		btnRegister.setBackground(Color.cyan);
		btnRegister.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnRegister.setActionCommand("registrarDado");
		btnRegister.addActionListener(this);
		painelBtn.add(btnRegister);
	}
	public void btnRemove() {
		btnRemove = new JButton("Remover");
		btnRemove.setBackground(Color.cyan);
		btnRemove.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnRegister.setActionCommand("removerDado");
		btnRegister.addActionListener(this);
		painelBtn.add(btnRemove);
	}
	public void btnEdit() {
		btnEdit = new JButton("Editar");
		btnEdit.setBackground(Color.cyan);
		btnEdit.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnRegister.setActionCommand("editarDado");
		btnRegister.addActionListener(this);
		painelBtn.add(btnEdit);
	}
	public void btnSee() {
		btnSee = new JButton("Ver");
		btnSee.setBackground(Color.cyan);
		btnSee.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnRegister.setActionCommand("verDado");
		btnRegister.addActionListener(this);
		painelBtn.add(btnSee);
	}
	public void btnSair() {
		btnSair = new JButton("Sair");
		btnSair.setBackground(Color.cyan);
		btnSair.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnSair.setActionCommand("sair");
		btnSair.addActionListener(this);
		painelBtn.add(btnSair);
	}
	
	public void painelRegistrar(){
		painelRegistrar = new JPanel();
		painelRegistrar.setBackground(new Color(0, 0, 0));
		painelRegistrar.setLocation(100, 300);
		painelRegistrar.setSize(600, 250);
		painelRegistrar.setVisible(false);
		frame.add(painelRegistrar);
		regisMens();
	}
	public void painelRemover(){
		painelRemover = new JPanel();
		painelRemover.setBackground(new Color(0, 0, 0));
		painelRemover.setLocation(100, 300);
		painelRemover.setSize(600, 250);
		painelRemover.setVisible(false);
		frame.add(painelRemover);
		regisMens();
	}
	public void painelEditar(){
		painelEditar = new JPanel();
		painelEditar.setBackground(new Color(0, 0, 0));
		painelEditar.setLocation(100, 300);
		painelEditar.setSize(600, 250);
		painelEditar.setVisible(false);
		frame.add(painelEditar);
		regisMens();
	}
	public void painelVer(){
		painelVer = new JPanel();
		painelVer.setBackground(new Color(0, 0, 0));
		painelVer.setLocation(100, 300);
		painelVer.setSize(600, 250);
		painelVer.setVisible(false);
		frame.add(painelVer);
		regisMens();
	}
	public void regisMens() {
		regisMens = new JButton("cancelar");
		regisMens.setSize(120, 60);
		regisMens.setActionCommand("cancel");
		regisMens.addActionListener(this);
		painelRegistrar.add(regisMens);
		painelRemover.add(regisMens);
		painelEditar.add(regisMens);
		painelVer.add(regisMens);
	}
	
	
	public static void main(String[] args) {
		new Principal();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if("sair" == e.getActionCommand()) {
			new Begin();
			frame.dispose();
		}
		if("registrarDado" == e.getActionCommand()) {
			painelRegistrar.setVisible(true);
		}
		if("removerDado" == e.getActionCommand()) {
			painelRemover.setVisible(true);
		}
		if("editarDado" == e.getActionCommand()) {
			painelEditar.setVisible(true);
		}
		if("verDado" == e.getActionCommand()) {
			painelVer.setVisible(true);
		}
		if("cancel" == e.getActionCommand()) {
			painelRegistrar.setVisible(false);
			painelRemover.setVisible(false);
			painelEditar.setVisible(false);
			painelVer.setVisible(false);
		}
		
	}

}
