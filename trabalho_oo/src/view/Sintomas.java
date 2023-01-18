package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Sintomas{

    private JFrame frame;
    private JPanel telaPainel;
    private JButton addBtn;

    public Sintomas() {
    	frame = new JFrame("Lótus");
		frame.setSize(800, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
    	
    	telaPainel();
    	background();
    	frame.setVisible(true);
    }
    
    public void background() {
		try {
			BufferedImage img = ImageIO.read(getClass().getResource("/images/fundoP3.jpg"));
			Image dimg = img.getScaledInstance(790, 510, Image.SCALE_SMOOTH);
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
    
    public static void main(String[] args) {
       new Sintomas();
    }


    public void telaPainel() {
        telaPainel = new JPanel();
        JPanel painel2 = new JPanel();
        JScrollPane srcPainel = new JScrollPane(painel2);
        
        srcPainel.setPreferredSize(new Dimension(790, 510));
        telaPainel.add(srcPainel);
        frame.add(telaPainel);
    }
    
    public void addBtn() {
        }
    
}
