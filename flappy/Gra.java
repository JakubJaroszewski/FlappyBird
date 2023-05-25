package flappy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.sound.sampled.Clip;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Gra extends JPanel implements Runnable, ActionListener,MouseListener{
	List<Prostokat> prostakat = new ArrayList<Prostokat>();
	List<Prostokat2> prostakat2 = new ArrayList<Prostokat2>();
	Prostokat p;
	Prostokat2 p1;
	Obiekt obiekt;
	boolean a;
	SoundEffect sound;
	String muzyczka;
	int punkty;
	Timer t = new Timer(1,this);
	boolean one,two,three;
	public Gra() {
		punkty = 0;
		a = false;
		one = false;
		two=false;
		three =false;
		sound = new SoundEffect();
		addMouseListener(new MouseAdapter() {
           		public void mousePressed(MouseEvent e) {
				Random weee = new Random();
				int we = weee.nextInt(3);

				if (we==0)
					muzyczka=".//music//wee1.wav";
				else if (we==1)
					muzyczka=".//music//wee2.wav";
				else if (we==2)
					muzyczka=".//music//wee3.wav";
				else if (we==3)
					muzyczka=".//music//wee4.wav";


				   sound.setFile(muzyczka);     
				   sound.play();
				}
			  });

		
	}
	public void dodajLosowyProstokat(){
		Random r = new Random();
		int x = r.nextInt(550);
		int h;
		obiekt = new Obiekt();
	for (int i =0 ; i < 20 ; i++) {
		p = new Prostokat();
		p1 = new Prostokat2();
		p.SetX(x);
		p1.SetX(x);
		do
		{
		 h=r.nextInt(500);
		}while(h<300);
		p.SetH(h);
		p1.SetH(h-100);
		prostakat.add(p);
		prostakat2.add(p1);
		x +=500;
	}
	
			
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		obiekt.paint(g);
		for (Prostokat pr : prostakat) {
			pr.paint(g);
		}
		for (Prostokat2 pr : prostakat2) {
			pr.paint(g);
		}
		t.start();
		if ( one = true) {
			g.drawString("3",400,500);
			one = false;
		}
		if ( two = true) {
			g.drawString("2",400,500);
			two = false;
		}
		if ( three = true) {
			g.drawString("1",400,500);
			three = false;
		}
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	for (Prostokat pr : prostakat) {
		pr.x -= pr.Velx;
	}
	for (Prostokat2 pr : prostakat2) {
		pr.x -= pr.Velx;
	}
	obiekt.Vely+=1;
	if(a) {
			obiekt.Vely-=2;
	}
	for (Prostokat pr : prostakat) {
		for(Prostokat2 pr2 : prostakat2) {
			if(pr.x==300) {
				System.out.println(pr.h);
				System.out.println(obiekt.Vely);
				if(obiekt.Vely > pr.h && obiekt.Vely < 600 ) { // wiekszy od górnego prostokata i mniejsze od minmalnej wyskosci drugiego prostokata
					punkty+=1;
					System.out.println(punkty);
					
				}
				else {
					obiekt.Vely = (pr.h+600)/2;
					int o = 0;
					int q = 3;
					while(o<=q) { // tutaj chodzi o to ze chce wyswietalc te wartosci 1 2 3 na ekranie wyzej masz funkcje ktore maja to robic drawString 
						pr.x = 0;
						pr2.x=0;
						try {
							one = true;
							Thread.sleep(1000);
							o++;
							one = false;
							two = true;
							Thread.sleep(1000);
							o++;
							two = false;
							three = true;
							Thread.sleep(1000);
							three = false;
							o++;
							System.out.println("isdbcib");
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			}
		}
	}
	repaint();
	}
	@Override
	public void run() {
		addMouseListener(new MouseAdapter() {
	        public void mousePressed  (MouseEvent e) {	        	
	        		a =true;
	       	}
	        
		});
		addMouseListener(new MouseAdapter() {
	        public void mouseReleased (MouseEvent e) {        	
	        		a =false;
	       	}
	        
		});
			
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
class MyObj {
    private final long createdMillis = System.currentTimeMillis();
	    public int getAgeInSeconds() {
		long nowMillis = System.currentTimeMillis();
		return (int)((nowMillis - this.createdMillis) / 1000);
	    }
}
