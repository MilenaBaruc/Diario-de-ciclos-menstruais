package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Begin {

	Begin(){
		JFrame jfrm = new JFrame("Lótus");
		JLabel label = new JLabel();
		//BufferedImage img = ImageIO.read(getClass().getResource("/imagens/fundodetelaentrada.jpg"));
		
		jfrm.setSize(1050, 650);
		jfrm.setResizable(false);
		jfrm.setBackground(Color.pink);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		jfrm.setVisible(true);	
		
		
		Container c = jfrm.getContentPane();
		c.setBackground(new java.awt.Color(254, 166, 166));
		;
	}
	
	
	public static void main(String[] args) {
		new Begin();
	}
}
