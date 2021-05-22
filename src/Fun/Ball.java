package Fun;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends GameObject{
	
	int speedx;
	int speedy;
	
	public Ball(int x, int y, int width, int height) {
		super(x,y,width,height);
		
		speedx=5;
		speedy=5;
	}
	
	public void update() {
		x+=speedx;
		y+=speedy;
		
		if(y>=470) {
			speedy *= -1;
		}
		
		if(y<=0) {
			speedy *= -1;
		}
		
		super.update();
	}
	
	public void checkCollision(GameObject p) {
		if(collisionBox.intersects(p.collisionBox)) {
			speedx = speedx*-1;
			GamePanel.score++;
			System.out.println(GamePanel.score + "");
		}
	}
	
	void draw(Graphics g) {
		 g.setColor(Color.WHITE);
	     g.fillRect(x, y, width, height);
		}
}
