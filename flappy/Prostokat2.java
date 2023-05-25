package flappy;

import java.awt.Color;
import java.awt.Graphics;

public class Prostokat2 {
	int Velx = 1;
	int Vely = 1;
	int y = 0;
	int x,h;
	public Prostokat2() {}
	 public void paint(Graphics g){
		g.setColor(Color.GREEN);
	        g.fillRect(x,600,50,h);
	
	}
	 void SetX(int d) {
		 x=d;
	}
	 void SetH(int d) {
		 h=d;
	}
}
