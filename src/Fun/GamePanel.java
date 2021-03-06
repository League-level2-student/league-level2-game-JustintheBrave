package Fun;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;

	

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	
	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	final int INS = 3;
	int currentState = MENU;
	
	Timer frameDraw;
	
	Font titleFont;
	Font menuFont;
	Font textFont;
	
	Fruit fruit = new Fruit(50,250,10,50);
	Fruit paddle = new Fruit(750, 250, 10, 50);
	Ball ball = new Ball(400,250,10,10);

	static int score = 0;
	static int score2 = 0;
	
	
	public GamePanel() {
		titleFont = new Font("Arial", Font.PLAIN, 48);
		menuFont = new Font("Arial", Font.PLAIN, 24);
		textFont = new Font ("Arial", Font.PLAIN, 12);
		
		Timer frameDraw = new Timer(1000/30,this);
		frameDraw.start();
		
	}
	
	@Override
	public void paintComponent(Graphics g){
		if(currentState == MENU){
		    drawMenuState(g);
		}else if(currentState == GAME){
		    drawGameState(g);
		}else if(currentState == END){
		    drawEndState(g);
		}else if (currentState == INS) {
			drawInstructionState(g);
		}
	}
	
	public void updateMenuState() { 

	}
	public void updateGameState() { 
	
	 paddle.update();
	 fruit.update();
	 ball.update();
	 ball.checkCollision(paddle);
	 ball.checkCollision(fruit);
	 
	 if(ball.x>=800 || ball.x<=0) {
			currentState=END;
			ball.x=400;
			ball.y=250;
			ball.speedy=5;
			ball.speedx=5;
			paddle.y=250;
			fruit.y=250;
			score=0;
		}
	 if(score2>=4) {
			ball.speedx*=2;
			ball.speedy*=2;
			
			score2=0;
	 }
	
	}
	public void updateEndState()  {  
		 
	}
	
	public void drawMenuState(Graphics g) {  
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, Runner.WIDTH, Runner.HEIGHT);
		
		g.setFont(titleFont);
		g.setColor(Color.WHITE);
		g.drawString("LEAGUE PONG", 220, 100);
		 
		g.setFont(menuFont);
		g.drawString("Press ENTER to begin", 250, 250);
		g.drawString("Press SPACE for instructions", 230, 400);
	}
	public void drawGameState(Graphics g) {  
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Runner.WIDTH, Runner.HEIGHT);
		
		g.setFont(menuFont);
		g.setColor(Color.WHITE);
		g.drawString(score + "", 395, 50);
		
		fruit.draw(g);
		paddle.draw(g);
		ball.draw(g);
		
	}
	public void drawEndState(Graphics g)  {  
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, Runner.WIDTH, Runner.HEIGHT);
		
		g.setFont(titleFont);
		g.setColor(Color.GRAY);
		g.drawString("LEAGUE PONG", 220, 100);
		 
		g.setFont(menuFont);
		g.drawString("YOU WON", 340, 170);
		g.drawString("Press ENTER to restart", 270, 330);
		 
	}
	
	public void drawInstructionState (Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, Runner.WIDTH, Runner.HEIGHT);
		
		g.setFont(titleFont);
		g.setColor(Color.GRAY);
		g.drawString("INSTRUCTIONS", 210, 100);
		 
		g.setFont(menuFont);
		g.drawString("Use W and S to control the left paddle and the up and down arrow keys to", 0, 150);
		g.drawString("control the right paddle", 0, 190);
		
		g.setFont(menuFont);
		g.drawString("Press SPACE to go back to menu", 200, 400);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(currentState == MENU){
		    updateMenuState();
		}else if(currentState == GAME){
		    updateGameState();
		}else if(currentState == END) {
			updateEndState();
		}
		
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
		    if (currentState == END) {
		        currentState = MENU;
		    } else {
		        currentState++;
		    }
		}
		
		if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			if(currentState==MENU) {
				currentState = INS;
			}
			else {
				currentState=MENU;
			}
		}
		
		if (e.getKeyCode()==KeyEvent.VK_UP) {
			  if(currentState==GAME) {
				  if(paddle.y>=10)
				  	paddle.up=true;
		}
	}
		
		if (e.getKeyCode()==KeyEvent.VK_DOWN) {
			  if(currentState==GAME) {
				  if(paddle.y<=420)
					  paddle.down=true;
		}
	}if (e.getKeyCode()==KeyEvent.VK_W) {
		  if(currentState==GAME) {
			  if(fruit.y>=10)
			  	fruit.up=true;
	}
}
	
	if (e.getKeyCode()==KeyEvent.VK_S) {
		  if(currentState==GAME) {
			  if(fruit.y<=420)
			  	fruit.down=true;
	}
}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getKeyCode()==KeyEvent.VK_UP) {
			if(currentState==GAME) {
				paddle.up=false;
		}
	}
		
	if (e.getKeyCode()==KeyEvent.VK_DOWN) {
		if(currentState==GAME) {
			paddle.down=false;
	}
}
	
	if (e.getKeyCode()==KeyEvent.VK_W) {
		if(currentState==GAME) {
			fruit.up=false;
	}
}
	
	if (e.getKeyCode()==KeyEvent.VK_S) {
		if(currentState==GAME) {
			fruit.down=false;
	}
}
}
}

