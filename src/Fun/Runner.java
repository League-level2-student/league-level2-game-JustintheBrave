package Fun;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Graphics;

public class Runner {

	JFrame frame;
	public static final int WIDTH = 800;
	public static final int HEIGHT = 500;
	GamePanel panel;
	
	public Runner() {
		frame = new JFrame();
		panel = new GamePanel();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner run = new Runner();
		run.setup();
	}

	public void setup() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(WIDTH, HEIGHT);
		frame.addKeyListener(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
