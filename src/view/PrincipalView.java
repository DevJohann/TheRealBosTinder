package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.PrincipalController;

public class PrincipalView extends JFrame implements ActionListener{
	
	private JPanel titlePanel;
	private JLabel title;
	
	private JPanel buttonsPanel;
	private JButton loginButton;
	private JButton registerButton;
	
	public PrincipalView() {
		setSize(Constants.JFrameX, Constants.JFrameY);
		setLocationRelativeTo(null);
		setLayout(null);
		setTitle(Constants.JFrameTitle);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		iniciarComponentes();
	}
	
	public void iniciarComponentes() {
		titlePanel = new JPanel();
		titlePanel.setBounds(10, 10, 560, 100);
		titlePanel.setLayout(null);
		//titlePanel.setBackground(Color.GREEN);
		
		title = new JLabel("BosTinder");
		title.setBounds(220, 28, 140, 30);
		title.setFont(new Font(Constants.TextTypo, Font.BOLD, 30));
		titlePanel.add(title);
		
		add(titlePanel);
		
		
		buttonsPanel = new JPanel();
		buttonsPanel.setBounds(10, 150, 560, 400);
		buttonsPanel.setLayout(null);
		//buttonsPanel.setBackground(Color.BLUE);
		
		loginButton = new JButton("Iniciar sesion");
		loginButton.setBounds(40, 150, Constants.largerButtonW, Constants.largeButtonH);
		loginButton.setFont(new Font(Constants.TextTypo, Font.PLAIN, 16));
		loginButton.addActionListener(this);
		loginButton.setActionCommand("login");
		loginButton.setFocusable(false);
		
		registerButton = new JButton("Registrarse");
		registerButton.setBounds(360, 150, Constants.largerButtonW, Constants.largeButtonH);
		registerButton.setFont(new Font(Constants.TextTypo, Font.PLAIN, 16));
		registerButton.addActionListener(this);
		registerButton.setActionCommand("register");
		registerButton.setFocusable(false);
		
		buttonsPanel.add(loginButton);
		buttonsPanel.add(registerButton);
		
		add(buttonsPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		
		switch(command) {
		case "login":
			PrincipalController.loginButtonEvent();
			break;
		case "register":
			PrincipalController.registerButtonEvent();
			break;
		}
	}
}
