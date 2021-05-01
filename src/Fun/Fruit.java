package Fun;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Fruit extends GameObject{

	public boolean up = false;
	public boolean down = false;
	
	public Fruit(int x,int y,int width,int height) {
		super(x,y,width,height);
		
		speed=10;
	}
	 
	public void update() {
		if(up) {
			y-=speed;
		}
		if (down) {
			y+=speed;
		}
	}
	
	void draw(Graphics g) {
		 g.setColor(Color.WHITE);
	     g.fillRect(x, y, width, height);
		}
} 
