package Fun;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Fruit extends GameObject{

	int width;
	int height;
	int x;
	int y;
	int speed;
	
	
	public Fruit(int locx, int locy,int sizex,int sizey) {
		super(locx, locy, sizex, sizey);
		
		speed=1;
	}
	 
	public void update() {
		
	}
	
	void draw(Graphics g) {
		 g.setColor(Color.YELLOW);
	     g.fillRect(x, y, width, height);
		}
	
	
	
}
