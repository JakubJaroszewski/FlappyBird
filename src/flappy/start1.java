package flappy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;


public class start1 extends JFrame {
	private static final long serialVersionUID = 1L;
	JPanel panel1;
	JPanel panel2;
	JComboBox combo1;
	JComboBox combo2;
	JComboBox combo3;
	JComboBox combo4;
	JLabel label;
	JMenuBar menuBar;
	JMenu menu, submenu;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JButton button1;
	ImageIcon icon;
	Image icon1;
	Image icon2;
	Image icon3;
	Image myImage;
	JLabel background;
	Color color1;
	Color color2;
	Color color3;
	Color color4;
	Color color5;
	JButton heart1;
	JLabel przerwa;
	 Flappy gra;
	 JMenuItem menuItem;
		JMenuItem menuItem1;
		JMenuItem menuItem2;
		JMenuItem menuItem3;
	public start1() throws HeadlessException{
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1550,900);
		panel1 = new JPanel();
		panel2 = new JPanel();
		przerwa = new JLabel("           						 ");
		GridBagConstraints c = new GridBagConstraints();
		GridBagConstraints d = new GridBagConstraints();
		//setLayout(new BorderLayout(10,10));
		panel2.setLayout(new GridLayout(10,1));
		//panel1.setLayout(new GridLayout(1,30));
		panel1.setLayout(new BorderLayout(3,1));
		add(BorderLayout.NORTH,panel1);
		add(BorderLayout.CENTER,panel2);
		label2 = new JLabel("Flappy Bird");
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		panel2.add(label2);
		panel2.add(new JLabel("Wybierz poziom trudności:"));
		panel2.setBorder(BorderFactory.createEmptyBorder(100, 500, 100, 500));
		combo1 = new JComboBox();
		combo2 = new JComboBox();
		combo3 = new JComboBox();
		combo4 = new JComboBox();
		panel2.add(combo1);
		icon = new ImageIcon(this.getClass().getResource("/volume48.png"));
		heart1 = new JButton();
		heart1.setIcon(icon);
		panel1.add(heart1, BorderLayout.LINE_END);
		heart1.setBackground(Color.white);
		combo1.addItem("łatwy");
		combo1.addItem("Średni");
		combo1.addItem("Trudny");
		label3 = new JLabel("Wybierz tło:");
		//JLabel label4 =  new JLabel ("Brak możliwości wyboru tła");
		//panel2.add(label4);
		panel2.add(label3);
		//label4.setVisible(false);
		panel2.add(combo2);
		combo2.addItem("Różowy");
		combo2.addItem("Fioletowy");
		combo2.addItem("Turkusowy");
		combo2.addItem("Żółty");
		icon = new ImageIcon(this.getClass().getResource("/gradient.png"));
		icon1 = Toolkit.getDefaultToolkit().getImage("/night.png");
		icon2 = Toolkit.getDefaultToolkit().getImage(("/clouds.png"));
		icon3 = Toolkit.getDefaultToolkit().getImage(("/trees.png"));
		ActionListener cbActionListener = new ActionListener() {//add actionlistner to listen for change
            
            public void actionPerformed(ActionEvent e) {
                String s = (String) combo2.getSelectedItem();//get the selected item

                switch (s) {//check for a match
                    case "Różowy":
                    	color1 = new Color(253, 228, 243);
                    	
                    	panel2.setBackground(color1);
                    	//background = new JLabel("",icon,JLabel.CENTER);
                    	//background.setBounds(0, 0, 1550,900);
                    	//panel2.add(background);
                    	panel1.setBackground(color1);
                    	//gra.setColor(color1);
                    	
                        break;
                    case "Fioletowy":
                    	color2 = new Color (191, 178, 230);
                    	panel2.setBackground(color2);
                    	panel1.setBackground(color2);
                    	//gra.setColor(color2);
                        break;
                    case "Turkusowy":
                    	color3 = new Color (186, 230, 222);
                    	panel2.setBackground(color3);
                    	panel1.setBackground(color3);
                    	//gra.setColor(color3);
                        break;
                    case "Żółty":
                    	color4 = new Color (249, 232, 150);
                    	panel2.setBackground(color4);
                    	panel1.setBackground(color4);
                    	//gra.setColor(color4);
                    	break;
                }
            }
        };
        combo2.addActionListener(cbActionListener);
		panel2.add(new JLabel("Wybierz postać:"));
		panel2.add(combo3);
		String x = "中国人";
		combo3.addItem("cos1");
		combo3.addItem("cos2");
		combo3.addItem("cos3");
		button1= new JButton("Start");
		panel2.add(button1);
		menuBar = new JMenuBar();
		   setJMenuBar(menuBar);
		menu = new JMenu("Wybierz język");
		   menuBar.add(menu);
		   menuItem = new JMenuItem("polski");
		   menuItem1 = new JMenuItem("angielski");
		   menuItem2 = new JMenuItem("русский");
		   menuItem3 = new JMenuItem(x);
		   menu.add(menuItem);
		   menu.add(menuItem1);
		   menu.add(menuItem2);
		   menu.add(menuItem3);
		
		//label1.setHorizontalAlignment(JLabel.EAST);
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		start1 a = new start1();
        a.setVisible(true);
        Color color = UIManager.getColor ( "Panel.background" );
        while(a.panel1.getBackground() == color) {
        	a.button1.setVisible(false);
        	Thread.sleep(1000);
        }
        if( a.panel1.getBackground() != color )
        	a.button1.setVisible(true);
       if( a.panel1.getBackground() != color )
       {
    	   System.out.println("oo");
        Flappy gra = new Flappy(a.panel1.getBackground());
       // gra.setColor(Color.Bl);
		gra.setVisible(false);
		ActionListener b = new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	           a.setVisible(false);
	           gra.setVisible(true);}
	      };
	a.button1.addActionListener(b);
	ActionListener bb = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
         a.setVisible(true);
      	  gra.setVisible(false);
      	  a.combo2.setVisible(false);
      	  a.label3.setVisible(false);
      	 // a.label4.setVisible(true);
         }
    };
    gra.menuwroc.addActionListener(bb);  } 
	}

}
