package Fun;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Paddle extends GameObject{

	public Paddle(int x,int y,int width,int height) {
		super(x,y,width,height);
		
		speed=10;
	}/*
	 
	public void update() {
		
	}
	
	void draw(Graphics g) {
		 g.setColor(Color.YELLOW);
	     g.fillRect(750, y, 10, 50);
		}
	
	public void up() {
        y-=speed;
        super.update();
    }
 public void down() {
        y+=speed;
        super.update();
    }	*/
} 
