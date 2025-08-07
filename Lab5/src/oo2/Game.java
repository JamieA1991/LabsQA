package oo2;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

class Shape {

	private Color colour;
	private ShapeType shapeType;

	public Color getColourtype() {

		return colour;
	}

	public ShapeType getShapeType() {
		return shapeType;
	}

	public Shape(ShapeType shapeType) {

	}

	public static int worldW = 500, worldH = 500;

	public int x, y, w, h, dirX, dirY;

	public Shape(int x, int y, int w, int h, int dirX, int dirY, ShapeType shapeType, Color colour) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.dirX = dirX;
		this.dirY = dirY;
		this.shapeType = shapeType;
		this.colour = colour;

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

		if (x > Shape.worldW - w) {
			x = Shape.worldW - w;
			dirX = -dirX;
		}

		if (y > Shape.worldH - h) {
			y = Shape.worldH - h;
			dirY = -dirY;
		}

	}

}

enum ShapeType {

	Rectangle, ThreeDRectangle, RoundRectangle, Oval, Arc

}

public class Game extends Canvas {
	public static void main(Strings[] args) {

		new Game();

	}

	// create an array of 3 balls
	Shape[] shapes = new Shape[3];
	// call this array balls

	Game() {
		shapes[0] = new Shape(40, 11, 50, 50, 1, 1, ShapeType.RoundRectangle, Color.cyan);
		shapes[1] = new Shape(40, 100, 30, 30, 2, 1, ShapeType.Arc, Color.green);
		shapes[2] = new Shape(40, 100, 80, 30, 2, 2, ShapeType.Oval, Color.ORANGE);
		Shape.worldH = 500;
		Shape.worldW = 500;

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
		for (Shape b : shapes) {
			b.move();

		}
		this.repaint();
	}

	public void paint(Graphics g) {

		// g.drawRect(0, 0, Shape.worldW, Shape.worldH);
		// move and draw each ball in balls array
		// Tip: use an enhanced for loop to pick
//		  each ball in the balls array.
		for (Shape b : shapes) {

			g.setColor(b.getColourtype());

			if (b != null) {
				if (b.getShapeType() == ShapeType.Rectangle) {
					g.drawRect(b.x, b.y, b.w, b.h);
				} else if (b.getShapeType() == ShapeType.ThreeDRectangle) {
					g.fill3DRect(b.x, b.y, b.w, b.h, true);
				} else if (b.getShapeType() == ShapeType.RoundRectangle) {
					g.drawRoundRect(b.x, b.y, b.w, b.h, 20, 20);
				} else if (b.getShapeType() == ShapeType.Oval) {
					g.drawOval(b.x, b.y, b.w, b.h);
				} else if (b.getShapeType() == ShapeType.Arc) {
					g.drawArc(b.x, b.y, b.w, b.h, 0, 180);
				}
			}
		}

	}
}
