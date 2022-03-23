package flappy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Flappy extends JFrame {
	JLabel heart2;
	JLabel heart3;
		JLabel heart1;
		ImageIcon play;
		ImageIcon icon;
		 JButton menuwroc;
		 JButton wyjscie;
		 Color c1;
		public Flappy(Color b) throws HeadlessException {
			// TODO Auto-generated constructor stub
			c1=b;
			this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
			this.setUndecorated(true);
			//this.setVisible(true);
	        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	        setLayout(new BorderLayout());
	        JPanel pasek = new JPanel();
	        JTextField punkty = new JTextField("Punkty");
	        JLabel punktacja = new JLabel("Punkty:");
	        add(BorderLayout.NORTH,pasek);
	        pasek.setLayout(new GridLayout(1,20));
	        pasek.add(punktacja);
	        pasek.add(punkty);
	        
	        JLabel zycko = new JLabel("¯ycia:");
	       pasek.add(zycko);
	        
	       	
	        heart1 = new JLabel("");
	        heart2 = new JLabel("");
	        heart3 = new JLabel("");
	       
	        icon = new ImageIcon(this.getClass().getResource("/heart3.png"));
	        heart1.setIcon(icon);
	        heart2.setIcon(icon);
	        heart3.setIcon(icon);
	        heart1.setSize(10,10);
	       this.getContentPane().add(heart1);
	        pasek.add(heart1);
	        pasek.add(heart2);
	        pasek.add(heart3);
	        
	        play = new ImageIcon(this.getClass().getResource("/play2.png"));
	        JButton playb = new JButton("");
	        playb.setIcon(play);
	        pasek.add(playb);
	        
	        menuwroc = new JButton("MENU");
	        wyjscie = new JButton("WYJŒCIE Z GRY");
	        pasek.add(menuwroc);
	        pasek.add(wyjscie);
	        ActionListener bb = new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	System.exit(0);
	             }
	        };
	        wyjscie.addActionListener(bb); 
	        JPanel gra = new JPanel();
	        add(BorderLayout.CENTER,gra);
	        gra.setBackground(c1);
	        
	        this.setVisible(true);
	        

}
		
		/*public static void main(String[] args) {
			// TODO Auto-generated method stub
			Flappy gra = new Flappy();
			
		}*/
		
}