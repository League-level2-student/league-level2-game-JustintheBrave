package Fun;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;

	

public class GamePanel extends JPanel {
	
	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	int currentState = MENU;
	
	Font titleFont;
	Font menuFont;
	
	public GamePanel() {
		titleFont = new Font("Arial", Font.PLAIN, 48);
		menuFont = new Font("Arial", Font.PLAIN, 24);
	}
	
	@Override
	public void paintComponent(Graphics g){
		if(currentState == MENU){
		    drawMenuState(g);
		}else if(currentState == GAME){
		    drawGameState(g);
		}else if(currentState == END){
		    drawEndState(g);
		}
	}
	
	public void updateMenuState() { 

	}
	public void updateGameState() { 
	 
	}
	public void updateEndState()  {  
		 
	}
	
	public void drawMenuState(Graphics g) {  
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, Runner.WIDTH, Runner.HEIGHT);
		
		g.setFont(titleFont);
		g.setColor(Color.WHITE);
		g.drawString("LEAGUE NINJA", 220, 100);
		 
		g.setFont(menuFont);
		g.drawString("Press ENTER to begin", 250, 250);
		g.drawString("Press SPACE for instructions", 230, 400);
	}
	public void drawGameState(Graphics g) {  
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Runner.WIDTH, Runner.HEIGHT);
	}
	public void drawEndState(Graphics g)  {  
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, Runner.WIDTH, Runner.HEIGHT);
		
		g.setFont(titleFont);
		g.setColor(Color.GRAY);
		g.drawString("LEAGUE NINJA", 220, 100);
		 
		g.setFont(menuFont);
		 g.drawString("YOU WERE KILLED", 120, 350);
		 g.drawString("Press ENTER to restart", 100, 600);
		 
	}
}

