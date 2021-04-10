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
	int currentState = MENU;
	
	Timer frameDraw;
	
	Font titleFont;
	Font menuFont;
	
	public GamePanel() {
		titleFont = new Font("Arial", Font.PLAIN, 48);
		menuFont = new Font("Arial", Font.PLAIN, 24);
		
		Timer frameDraw = new Timer(1000/60,this);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(currentState == MENU){
		    updateMenuState();
		}else if(currentState == GAME){
		    updateGameState();
		}else if(currentState == END){
		    updateEndState();
		}
		
		System.out.println("action");
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
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

