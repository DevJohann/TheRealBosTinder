package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PrincipalView extends JFrame{
	
	private JPanel titlePanel;
	private JLabel title;
	
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
		titlePanel.setBackground(Color.GREEN);
		
		title = new JLabel("BosTinder");
		title.setBounds(220, 28, 140, 30);
		title.setFont(new Font(Constants.TextTypo, Font.BOLD, 30));
		titlePanel.add(title);
		
		add(titlePanel);
	}
}
