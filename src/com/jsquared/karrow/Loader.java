package com.jsquared.karrow;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.jsquared.karrow.config.ConfigMenu;

@SuppressWarnings("serial")
public class Loader extends JFrame implements LoaderConstants {
	
	private JLabel defaultlabel = new JLabel(LOADER_INFO);
	private JButton defaultButton = new JButton(DEFAULT_BUTTON_LABEL);
	private JButton customButton = new JButton(CUSTOM_BUTTON_LABEL);
	private JLabel customLabel = new JLabel(CONFIG_INFO);
	
	private Loader(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,2,HORIZONTAL_PADDING, VERTICAL_PADDING));
		setTitle(LOADER_TITLE);
		defaultButton.addActionListener(new DefaultHandler());
		customButton.addActionListener(new CustomHandler());
		add(defaultlabel);
		add(customLabel);
		add(defaultButton);
		add(customButton);
		pack();
		setVisible(true);
	}
	
	private class DefaultHandler implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			new Game(DEFAULT_SETTINGS);
			cleanup();
		}
		
	}
	
	private class CustomHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			new ConfigMenu();
			cleanup();
		}
	}
	
	private void cleanup(){
		setVisible(false);
	}

	public static void main(String[] args) {
		new Loader();
	}
}
