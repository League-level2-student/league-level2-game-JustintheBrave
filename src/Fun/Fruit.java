package Fun;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Fruit extends GameObject{

	public Fruit(int x,int y,int width,int height) {
		super(x,y,width,height);
		
		speed=10;
	}
	 
	public void update() {
		
	}
	
	void draw(Graphics g) {
		 g.setColor(Color.YELLOW);
	     g.fillRect(x, y, width, height);
		}
	
	
	
}
