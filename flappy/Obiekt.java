package flappy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Obiekt {
	int Velx = 1;
	int Vely = 100;
	int y = 0;
	public Obiekt() {
		// TODO Auto-generated constructor stub
	}
	 public void paint(Graphics g){
			g.setColor(Color.RED);
	        g.fillRect(300,Vely,25,25);
	
}
}
