package flappy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Prostokat{

	int Velx = 1;
	int Vely = 1;
	int y = 0;
	int x,h; //h  okolo 400
	
	 public void paint(Graphics g){
			g.setColor(Color.GREEN);
	        g.fillRect(x,y,50,h);
}
	 void SetX(int d) {
		 x=d;
	 }
	 void SetH(int d) {
		 h=d;
	 }

}
