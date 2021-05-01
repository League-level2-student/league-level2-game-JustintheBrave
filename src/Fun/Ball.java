package Fun;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends GameObject{
	
	int speed;
	
	public Ball(int x, int y, int width, int height) {
		super(x,y,width,height);
		
		speed=5;
	}
	
	public void update() {
		
	}
	
	void draw(Graphics g) {
		 g.setColor(Color.WHITE);
	     g.fillRect(x, y, width, height);
		}
}
