package com.jsquared.karrow;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Loader extends JFrame {
	
	private JLabel label = new JLabel("Loader");
	
	public Loader(){
		setSize(200,200);
		setTitle("Loader");
		add(label);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Loader();
	}
}
