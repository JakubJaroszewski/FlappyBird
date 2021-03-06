package flappy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


import javax.sound.sampled.Clip;
public class start1 extends JFrame {
	private static final long serialVersionUID = 1L;
	JPanel panel1;
	JPanel panel2;
	JComboBox<String> combo1;
	JComboBox<String> combo2;
	JComboBox<String> combo3;
	JComboBox<?> combo4;
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
		JMenuItem menuItem4;
		String clickSound;

		Clip clip;
	 boolean r;
	
		SoundEffect se = new SoundEffect();
		
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
		JLabel trudnosc = new JLabel("Wybierz poziom trudno??ci:");
		panel2.add(trudnosc);
		panel2.setBorder(BorderFactory.createEmptyBorder(100, 500, 100, 500));
		combo1 = new JComboBox<String>();
		combo2 = new JComboBox<String>();
		combo3 = new JComboBox<String>();
		combo4 = new JComboBox<Object>();
		panel2.add(combo1);
		icon = new ImageIcon(this.getClass().getResource("/volume48.png"));
		heart1 = new JButton();
		heart1.setIcon(icon);
		
		clickSound = ".//music//jb.wav";
		
		ActionListener a = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				se.setFile(clickSound);
				se.play();		
			}
			
		};
		heart1.addActionListener(a);
		
		
		
		
		
		
		
		
		panel1.add(heart1, BorderLayout.LINE_END);
		heart1.setBackground(Color.white);
		combo1.addItem("??atwy");
		combo1.addItem("??redni");
		combo1.addItem("Trudny");
		label3 = new JLabel("Wybierz t??o:");
		//JLabel label4 =  new JLabel ("Brak mo??liwo??ci wyboru t??a");
		//panel2.add(label4);
		panel2.add(label3);
		
		/*String[] engcolors = {"Pink", "Purple", "Blue", "Yellow"};
		String[] plcolors = {"R????owy", "Fioletowy", "Turkusowy", "??????ty"};*/
	
		
		//label4.setVisible(false);
		panel2.add(combo2);
		
		
		
		combo2.addItem("R????owy");
		//ComboBoxITem 
		combo2.addItem("Fioletowy");
		combo2.addItem("Turkusowy");
		combo2.addItem("??????ty");
		icon = new ImageIcon(this.getClass().getResource("/gradient.png"));
		icon1 = Toolkit.getDefaultToolkit().getImage("/night.png");
		icon2 = Toolkit.getDefaultToolkit().getImage(("/clouds.png"));
		icon3 = Toolkit.getDefaultToolkit().getImage(("/trees.png"));
		ActionListener cbActionListener = new ActionListener() {//add actionlistner to listen for change
            
            public void actionPerformed(ActionEvent e) {
            	r =true;
                String s = (String) combo2.getSelectedItem();//get the selected item

                switch (s) {//check for a match
                    case "R????owy", "Pink", "Rouge" :
                    	color1 = new Color(253, 228, 243);
                    	
                    	panel2.setBackground(color1);
                    	//background = new JLabel("",icon,JLabel.CENTER);
                    	//background.setBounds(0, 0, 1550,900);
                    	//panel2.add(background);
                    	panel1.setBackground(color1);
                    	//gra.setColor(color1);
                    	
                        break;
                 /*   case "Pink" :
                    	color1 = new Color(253, 228, 243);
                    	
                    	panel2.setBackground(color1);
                    	//background = new JLabel("",icon,JLabel.CENTER);
                    	//background.setBounds(0, 0, 1550,900);
                    	//panel2.add(background);
                    	panel1.setBackground(color1);
                    	//gra.setColor(color1);
                    	
                        break;*/
                    case "Fioletowy", "Purple", "Violet":
                    	color2 = new Color (191, 178, 230);
                    	panel2.setBackground(color2);
                    	panel1.setBackground(color2);
                    	//gra.setColor(color2);
                    	r =true;
                        break;
                    case "Turkusowy", "Blue", "Bleu":
                    	color3 = new Color (186, 230, 222);
                    	panel2.setBackground(color3);
                    	panel1.setBackground(color3);
                    	//gra.setColor(color3);
                    	r =true;
                        break;
                    case "??????ty", "Yellow", "Jaune":
                    	color4 = new Color (249, 232, 150);
                    	panel2.setBackground(color4);
                    	panel1.setBackground(color4);
                    	//gra.setColor(color4);
                    	r =true;
                    	break;
                }
            }
        };
        combo2.addActionListener(cbActionListener);
        JLabel label4 = new JLabel("Wybierz posta??:");
		panel2.add(label4);
		panel2.add(combo3);
		String x = "?????????";
		combo3.addItem("cos1");
		combo3.addItem("cos2");
		combo3.addItem("cos3");
		button1= new JButton("Start");
		panel2.add(button1);
		menuBar = new JMenuBar();
		   setJMenuBar(menuBar);
		menu = new JMenu("Wybierz j??zyk");
		   menuBar.add(menu);
		   menuItem = new JMenuItem("polski");
		   menuItem1 = new JMenuItem("angielski");
		   menuItem2 = new JMenuItem("rosyjski");
		  // menuItem3 = new JMenuItem("hiszpa??ski");
		   menuItem4 = new JMenuItem(x);
		   
		   menuItem1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				menu.setText("choose language");
				menuItem.setText("polish");
				menuItem1.setText("english");
				menuItem2.setText("french");
				label3.setText("Choose backgrond:");
				trudnosc.setText("Choose level:");
				label4.setText("Choose your fighter");
				
				combo2.addItem("Pink");
				combo2.addItem("Purple");
				combo2.addItem("Blue");
				combo2.addItem("Yellow");
				combo2.removeItem("R????owy");
				combo2.removeItem("Fioletowy");
				combo2.removeItem("Turkusowy");
				combo2.removeItem("??????ty");
				combo2.removeItem("Rouge");
				combo2.removeItem("Violet");
				combo2.removeItem("Bleu");
				combo2.removeItem("Jaune");
				
				combo1.addItem("Easy");
				combo1.addItem("Medium");
				combo1.addItem("Hard");
				combo1.removeItem("??atwy");
				combo1.removeItem("??redni");
				combo1.removeItem("Trudny");
				combo1.removeItem("facile");
				combo1.removeItem("mediocre");
				combo1.removeItem("difficile");
				//gra.etykieta("Exit");
			}
			   
		   });
		   
		   menuItem.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					menu.setText("Wybierz j??zyk");
					menuItem.setText("polski");
					menuItem1.setText("angielski");
					menuItem2.setText("francuski");
					label3.setText("wybierz t??o:");
					trudnosc.setText("poziom trudno??ci:");
					label4.setText("wybierz posta??:");
					combo2.addItem("R????owy");
					combo2.addItem("Fioletowy");
					combo2.addItem("Turkusowy");
					combo2.addItem("??????ty");
					combo2.removeItem("Pink");
					combo2.removeItem("Purple");
					combo2.removeItem("Blue");
					combo2.removeItem("Yellow");
					combo2.removeItem("Rouge");
					combo2.removeItem("Violet");
					combo2.removeItem("Bleu");
					combo2.removeItem("Jaune");
				
					combo1.addItem("??atwy");
					combo1.addItem("??redni");
					combo1.addItem("Trudny");
					combo1.removeItem("facile");
					combo1.removeItem("mediocre");
					combo1.removeItem("difficile");
					combo1.removeItem("Easy");
					combo1.removeItem("Medium");
					combo1.removeItem("Hard");
					
					//gra.etykieta("Exit");
				}
				   
			   });
		   
		   menuItem2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					menu.setText("Choisissez la langue");
					menuItem.setText("Polonais");
					menuItem1.setText("Anglais");
					menuItem2.setText("Fran??ais");
					label3.setText("choisir un arri??re-plan:");
					trudnosc.setText("niveau de difficult??:");
					label4.setText("choisir un personnage:");
					combo2.addItem("Rouge");
					combo2.addItem("Violet");
					combo2.addItem("Bleu");
					combo2.addItem("Jaune");
					combo2.removeItem("Pink");
					combo2.removeItem("Purple");
					combo2.removeItem("Blue");
					combo2.removeItem("Yellow");
					combo2.removeItem("R????owy");
					combo2.removeItem("Fioletowy");
					combo2.removeItem("Turkusowy");
					combo2.removeItem("??????ty");
				
					combo1.addItem("facile");
					combo1.addItem("mediocre");
					combo1.addItem("difficile");
					combo1.removeItem("Easy");
					combo1.removeItem("Medium");
					combo1.removeItem("Hard");
					combo1.removeItem("??atwy");
					combo1.removeItem("??redni");
					combo1.removeItem("Trudny");
					
					//gra.etykieta("Exit");
				}
				   
			   });
		
		   
		   menu.add(menuItem);
		   menu.add(menuItem1);
		   menu.add(menuItem2);
		//   menu.add(menuItem3);
		   menu.add(menuItem4);
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
