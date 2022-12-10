package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * <h1>LoginView</h1>
 * <p>Clase que contiene los elementos gráficos del apartado de iniciar sesión</p>
 * <p>Dividido en 2 paneles, panel de usuario, panel de contraseña</p>
 * <p>En el panel de usuario se agrupan el label del usuario y su TextField para que ingrese su nombre de usuario</p>
 * <p>En el panel de contraseña se agrupa el label de la contraseña y su PasswordField para que ingrese su contraseña</p>
 * <p>Finalmente se encuentra un boton que cuando se le de click se le dirá al controlador que valide los datos ingresados</p>
 * 
 * @author Johann
 * @see JFrame
 * @see ActionListener
 * @version 0.1
 */

public class LoginView extends JFrame implements ActionListener{
	
	private JPanel usernamePanel;
	private JPanel passwordPanel;
	private JPanel buttonPanel;
	
	private JLabel title;
	
	private JLabel usernameLabel;
	private JLabel passwordLabel;
	
	private JTextField usernameField;
	private JPasswordField passwordField;
	
	private JButton loginButton;
	private JButton backButton;
	
	public LoginView() {
		setSize(Constants.JFrameX, Constants.JFrameY);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle(Constants.JFrameTitle);
		iniciarComponentes();
	}

	public void iniciarComponentes() {
		title = new JLabel("Iniciar sesion");
		title.setBounds(200, 20, 140, 30);
		title.setFont(new Font(Constants.TextTypo, Font.BOLD, 24));
		
		usernamePanel = new JPanel();
		usernamePanel.setLayout(null);
		usernamePanel.setBounds(10, 120, 560, 100);
		
		usernameLabel = new JLabel("Usuario");
		usernameLabel.setBounds(10, 30, 120, 28);
		usernameLabel.setFont(new Font(Constants.TextTypo, Font.PLAIN, 16));
		
		usernameField = new JTextField();
		usernameField.setBounds(10, 60, 180, 20);
		
		usernamePanel.add(usernameLabel);
		usernamePanel.add(usernameField);
		
		passwordPanel = new JPanel();
		passwordPanel.setLayout(null);
		passwordPanel.setBounds(10, 220, 560, 100);
		
		passwordLabel = new JLabel("Contrasena");
		passwordLabel.setBounds(10, 10, 120, 20);
		passwordLabel.setFont(new Font(Constants.TextTypo, Font.PLAIN, 16));
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 40, 180, 20);
		
		passwordPanel.add(passwordLabel);
		passwordPanel.add(passwordField);
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(null);
		buttonPanel.setBounds(10, 320, 560, 230);
		buttonPanel.setBackground(Color.green);
		
		loginButton = new JButton("Ingresar");
		loginButton.setBounds(10, 20, Constants.medButtonW, Constants.medButtonH);
		loginButton.setFont(new Font(Constants.TextTypo, Font.PLAIN, Constants.medButtonSize));
		
		//Crear un panel de barra inferior
		backButton = new JButton("Volver");
		backButton.setBounds(10, 190, Constants.medButtonW, Constants.medButtonH);
		backButton.setFont(new Font(Constants.TextTypo, Font.PLAIN, Constants.medButtonSize));
		
		buttonPanel.add(loginButton);
		buttonPanel.add(backButton);
		
		add(title);
		add(usernamePanel);
		add(passwordPanel);
		add(buttonPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
