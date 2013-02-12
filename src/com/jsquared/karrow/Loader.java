package com.jsquared.karrow;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Loader extends JFrame implements LoaderConstants {
	
	private JLabel defaultlabel = new JLabel(LOADER_INFO);
	private JButton defaultbutton = new JButton(DEFAULT_BUTTON_LABEL);
	private JButton customButton = new JButton(CUSTOM_BUTTON_LABEL);
	private JLabel customLabel = new JLabel(CONFIG_INFO);
	
	public Loader(){
		setSize(200,200);
		setLayout(new GridLayout(2,2,5,5));
		setTitle("Loader");
		add(defaultlabel);
		add(customLabel);
		add(defaultbutton);
		add(customButton);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Loader();
	}
}
