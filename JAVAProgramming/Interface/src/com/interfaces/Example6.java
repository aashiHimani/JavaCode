package com.interfaces;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

interface Drawable{
	public void draw();
}
class Circles implements Drawable{

	@Override
	public void draw() {
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setVisible(true);
		JPanel panel=new JPanel() {
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.blue);
			g.fillOval(100, 100, 200, 200);
		}
	};
	frame.add(panel);
	}
}
class Triangles implements Drawable{

	@Override
	public void draw() {
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setVisible(true);
		JPanel panel=new JPanel() {
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			g.fillRect(100, 100, 200, 200);
		}
	};
	frame.add(panel);
	}
	
}
class Rectangless implements Drawable{

	@Override
	public void draw() {
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setVisible(true);
		JPanel panel=new JPanel() {
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.gray);
			int[] xPoints= {200,100,300};
			int[] yPoints= {100,300,300};
			g.fillPolygon(xPoints,yPoints,3);
		}
	};
	frame.add(panel);
	}
	
}
public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable Circle=new Circles();
		Drawable Rectangless=new Rectangless();
		Drawable Triangle=new Triangles();
		Circle.draw();
		Rectangless.draw();
		Triangle.draw();
	}

}
