package oo2;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;


class Ball {
	
	
	public static int worldW = 500, worldH = 500;
				
				
		
	
	public int x, y, w, h, dirX, dirY;

	public Ball(int x, int y, int w, int h, int dirX, int dirY) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.dirX = dirX;
		this.dirY = dirY;
		
	}

	public void move() {
		x += dirX;
		y += dirY;

		if (x < 0) {
			x = 0;
			dirX = -dirX;
		}

		if (y < 0) {
			y = 0;
			dirY = -dirY;
		}
		
		if (x >Ball.worldW-w) {
			x = Ball.worldW-w;
			dirX = -dirX;
		}
		
		if (y >Ball.worldH-h) {
			y = Ball.worldH-h;
			dirY = -dirY;
		}
	
	
	    }

	    

		
	}




public class Game extends Canvas {
	public static void main (String [] args) {
		
		new Game();
		
	}

	// create an array of 3 balls
	Ball[] balls = new Ball[3];
	// call this array balls

	Game() {
		balls[0] = new Ball(12, 11, 50, 50, 1, 1);
		balls[1] = new Ball(40, 100, 30, 30, 2, 1);
		balls[2] = new Ball(40, 100, 80, 30, 2, 2);
		Ball.worldH = 500;
		Ball.worldW=500;
		
		JFrame frame = new JFrame();
		this.setSize(500, 500);
		frame.add(this);
		frame.pack();
		frame.setVisible(true);
		
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				draw();
			}
		};

		t.schedule(tt, 0, 50);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				t.cancel();
				tt.cancel();
			}
		});
	}

	public void draw() {
		// call the move() method of each balls
		// Tip: use an enhanced for loop to pick
//		  each ball in the balls array.
		for (Ball ball : balls) {
			ball.move();

		}
		this.repaint();
	}

	public void paint(Graphics g) {
		g.drawRect(0, 0, Ball.worldW, Ball.worldH);
		// move and draw each ball in balls array
		// Tip: use an enhanced for loop to pick
//		  each ball in the balls array.
		for (Ball b : balls) {

			g.drawOval(b.x, b.y, b.w, b.h);

		}

	}
}
