package br.display;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class Display {
	
	private JFrame jframe;
	private Canvas canvas;
	
	public Display(String title, int width, int height) {
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setFocusable(false);
		
		
		jframe = new JFrame(title);
		jframe.add(canvas);
		jframe.pack();
		
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setResizable(false);
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
	
	}
	
	
	public BufferStrategy getBufferStrategy() {
		return canvas.getBufferStrategy();
	}
	
	public void createBufferStartegy() {
		canvas.createBufferStrategy(3);
	}
	
	public void setKeyListener(KeyListener kl) {
		jframe.addKeyListener(kl);
	}
	
	
}
