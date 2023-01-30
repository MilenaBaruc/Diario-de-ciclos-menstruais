package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.Border;

import controller.ControlerCiclo;
import controller.ControlerDados;

public class AdicionarInfo implements ActionListener{
	
	private JFrame frame;
	public Border blackline = BorderFactory.createLineBorder(Color.black);
	public Border raisedbevel = BorderFactory.createRaisedBevelBorder();
	private JList cicloData;
	private ControlerDados dados;
	private ControlerCiclo dadosCiclo;
	
	public AdicionarInfo(ControlerDados dados) {
		frame = new JFrame("Adicionar");
		frame.setSize(800, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		this.dados = dados;
		dadosCiclo = new ControlerCiclo(dados);
		cicloData = new JList(dadosCiclo.getCicloData());
		
		
		background();
		painelCiclo();
		painelSintoma();
		painelPesquisa();
		painelListagem();
		//painelMenstruacao();
		btnSair();
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
	
	public void painelCiclo() {
		JPanel painelCiclo = new JPanel();
		JLabel ciclo = new JLabel("Adicionar ao Ciclo:");
		JButton Cciclo = new JButton("Registrar ciclo");
		JButton Rciclo = new JButton("Ver ciclos");
		JButton Uciclo = new JButton("Editar ciclo");
		JButton Dciclo = new JButton("Excluir ciclos");
		
		painelCiclo.setBounds(30, 95, 725, 100);
		painelCiclo.setBackground(new Color(255, 215, 249));
		painelCiclo.setOpaque(true);
		painelCiclo.setBorder(raisedbevel);
		painelCiclo.setLayout(null);
		
		ciclo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		ciclo.setBounds(10, 10, 200, 20);
		
		Cciclo.setBounds(90, 60, 120, 20);
		Cciclo.setBackground(new Color(108, 70, 117));
		Cciclo.setForeground(new Color(255, 255, 255));
		Cciclo.setBorder(blackline);
		Cciclo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Cciclo.setActionCommand("registrarciclo");
		Cciclo.addActionListener(this);
		
		Rciclo.setBounds(230, 60, 120, 20);
		Rciclo.setBackground(new Color(108, 70, 117));
		Rciclo.setForeground(new Color(255, 255, 255));
		Rciclo.setBorder(blackline);
		Rciclo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Rciclo.setActionCommand("verciclo");
		Rciclo.addActionListener(this);
		
		Uciclo.setBounds(370, 60, 120, 20);
		Uciclo.setBackground(new Color(108, 70, 117));
		Uciclo.setForeground(new Color(255, 255, 255));
		Uciclo.setBorder(blackline);
		Uciclo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Uciclo.setActionCommand("editarciclo");
		Uciclo.addActionListener(this);
		
		Dciclo.setBounds(510, 60, 120, 20);
		Dciclo.setBackground(new Color(108, 70, 117));
		Dciclo.setForeground(new Color(255, 255, 255));
		Dciclo.setBorder(blackline);
		Dciclo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Dciclo.setActionCommand("excluirciclo");
		Dciclo.addActionListener(this);
		
		painelCiclo.add(ciclo); painelCiclo.add(Cciclo); painelCiclo.add(Rciclo); painelCiclo.add(Uciclo); painelCiclo.add(Dciclo);
		frame.add(painelCiclo);
	}
	
	public void painelSintoma() {
		JPanel painelSintoma = new JPanel();
		JLabel sintoma = new JLabel("Adicionar sintoma:");
		JButton Csintoma = new JButton("Registrar Sintoma");
		JButton Rsintoma = new JButton("Ver Sintoma");
		JButton Usintoma = new JButton("Editar Sintoma");
		JButton Dsintoma = new JButton("Excluir Sintoma");
		
		painelSintoma.setBounds(30, 225, 725, 100);
		painelSintoma.setBackground(new Color(255, 215, 249));
		painelSintoma.setOpaque(true);
		painelSintoma.setBorder(raisedbevel);
		painelSintoma.setLayout(null);
		
		sintoma.setFont(new Font("Times New Roman", Font.BOLD, 16));
		sintoma.setBounds(10, 10, 200, 20);
		
		Csintoma.setBounds(90, 60, 120, 20);
		Csintoma.setBackground(new Color(108, 70, 117));
		Csintoma.setForeground(new Color(255, 255, 255));
		Csintoma.setBorder(blackline);
		Csintoma.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Csintoma.setActionCommand("registrarsintoma");
		Csintoma.addActionListener(this);
		
		Rsintoma.setBounds(230, 60, 120, 20);
		Rsintoma.setBackground(new Color(108, 70, 117));
		Rsintoma.setForeground(new Color(255, 255, 255));
		Rsintoma.setBorder(blackline);
		Rsintoma.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Rsintoma.setActionCommand("versintoma");
		Rsintoma.addActionListener(this);
		
		Usintoma.setBounds(370, 60, 120, 20);
		Usintoma.setBackground(new Color(108, 70, 117));
		Usintoma.setForeground(new Color(255, 255, 255));
		Usintoma.setBorder(blackline);
		Usintoma.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Usintoma.setActionCommand("editarsintoma");
		Usintoma.addActionListener(this);
		
		Dsintoma.setBounds(510, 60, 120, 20);
		Dsintoma.setBackground(new Color(108, 70, 117));
		Dsintoma.setForeground(new Color(255, 255, 255));
		Dsintoma.setBorder(blackline);
		Dsintoma.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Dsintoma.setActionCommand("excluirsintoma");
		Dsintoma.addActionListener(this);
		
		painelSintoma.add(sintoma); painelSintoma.add(Csintoma); painelSintoma.add(Rsintoma); painelSintoma.add(Usintoma); painelSintoma.add(Dsintoma);
		frame.add(painelSintoma);
	}
	
	public void painelPesquisa() {
		JPanel painelPesquisa = new JPanel();
		JLabel pesquisa = new JLabel("Listagem:");
		JButton pFisico = new JButton("Fisico");
		JButton pHumor = new JButton("Humor");
		JButton pLibido = new JButton("Libido");
		JButton pSecrecao = new JButton("Secreção");
		
		painelPesquisa.setBounds(30, 355, 725, 100);
		painelPesquisa.setBackground(new Color(255, 215, 249));
		painelPesquisa.setOpaque(true);
		painelPesquisa.setBorder(raisedbevel);
		painelPesquisa.setLayout(null);
		
		pesquisa.setFont(new Font("Times New Roman", Font.BOLD, 16));
		pesquisa.setBounds(10, 10, 200, 20);
		
		pFisico.setBounds(90, 60, 120, 20);
		pFisico.setBackground(new Color(108, 70, 117));
		pFisico.setForeground(new Color(255, 255, 255));
		pFisico.setBorder(blackline);
		pFisico.setFont(new Font("Times New Roman", Font.BOLD, 16));
		pFisico.setActionCommand("listarfisico");
		pFisico.addActionListener(this);
		
		pHumor.setBounds(230, 60, 120, 20);
		pHumor.setBackground(new Color(108, 70, 117));
		pHumor.setForeground(new Color(255, 255, 255));
		pHumor.setBorder(blackline);
		pHumor.setFont(new Font("Times New Roman", Font.BOLD, 16));
		pHumor.setActionCommand("listarhumor");
		pHumor.addActionListener(this);
		
		pLibido.setBounds(370, 60, 120, 20);
		pLibido.setBackground(new Color(108, 70, 117));
		pLibido.setForeground(new Color(255, 255, 255));
		pLibido.setBorder(blackline);
		pLibido.setFont(new Font("Times New Roman", Font.BOLD, 16));
		pLibido.setActionCommand("listarlibido");
		pLibido.addActionListener(this);
		
		pSecrecao.setBounds(510, 60, 120, 20);
		pSecrecao.setBackground(new Color(108, 70, 117));
		pSecrecao.setForeground(new Color(255, 255, 255));
		pSecrecao.setBorder(blackline);
		pSecrecao.setFont(new Font("Times New Roman", Font.BOLD, 16));
		pSecrecao.setActionCommand("listarsecrecao");
		pSecrecao.addActionListener(this);
		
		painelPesquisa.add(pesquisa); painelPesquisa.add(pFisico); painelPesquisa.add(pHumor); painelPesquisa.add(pLibido); painelPesquisa.add(pSecrecao);
		frame.add(painelPesquisa);
	}
	
	public void painelListagem() {

		JButton btnPesquisa = new JButton("Pesquisar");
		
		btnPesquisa.setBounds(600, 20, 120, 20);
		btnPesquisa.setBackground(new Color(108, 70, 117));
		btnPesquisa.setForeground(new Color(255, 255, 255));
		btnPesquisa.setBorder(blackline);
		btnPesquisa.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnPesquisa.setActionCommand("pesquisar");
		btnPesquisa.addActionListener(this);
		
		frame.add(btnPesquisa);
	
	}

	public void btnSair() {
		JButton btnSair = new JButton("Voltar");
		btnSair.setBounds(20, 20, 80, 20);
		btnSair.setBackground(new Color(108, 70, 117));
		btnSair.setForeground(new Color(255, 255, 255));
		btnSair.setBorder(blackline);
		btnSair.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnSair.setActionCommand("voltar");
		btnSair.addActionListener(this);
		frame.add(btnSair);
	}

	
	public void actionPerformed(ActionEvent e) {
		if("voltar" == e.getActionCommand()) {
			new Principal(dados);
			frame.dispose();
		}
		
		if(e.getActionCommand() == "registrarciclo") {
			new RegistrarCiclo(dados);
			//frame.dispose();
		}
		
		if(e.getActionCommand() == "registrarsintoma") {
			new TipoSint(dados);
		}
		
		if(e.getActionCommand() == "verciclo") {
			new VerCiclo(dados);
			//frame.dispose();
		}
		
		if(e.getActionCommand() == "versintoma") {
			new VerSintoma(dados);
			//frame.dispose();
		}
		
		if(e.getActionCommand() == "editarciclo") {
			new EscolherCiclo(dados);
			//frame.dispose();
		}
		
		if(e.getActionCommand() == "editarsintoma") {
			new EscolherSint(dados);
		}
		
		if(e.getActionCommand() == "excluirciclo") {
			new ExcluirCiclo(dados);
		}
		
		if(e.getActionCommand() == "excluirsintoma") {
			new ExcluirSint(dados);
		}
		
		if(e.getActionCommand() == "listarfisico") {
			new ResultadoFisico(dados);
		}
		
		if(e.getActionCommand() == "listarhumor") {
			new ResultadoHumor(dados);
		}
		
		if(e.getActionCommand() == "listarsecrecao") {
			new ResultadoSecrecao(dados);
		}
		
		if(e.getActionCommand() == "listarlibido") {
			new ResultadoLibido(dados);
		}
		if(e.getActionCommand() == "pesquisar") {
			new Pesquisar(dados);
		}
	}
	
}
