package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.MainAppController;

/**
 * <h1>MainAppView</h1>
 * <p>
 * MainAppView agrupa todos los componentes visuales de la vista principal del usuario.
 * </p>
 * <p>
 * Tiene una primera seccion que muestra los datos relevantes de usuarios al alzar.
 * La segunda seccion agrupa los botones de like, dislike y volver, botones cuyas acciones maneja el controlador.
 * </p>
 * @see MainAppController
 * @author Johann
 * 
 * TODO: Terminar esta clase
 *
 */
public class MainAppView extends JFrame implements ActionListener{
	
	private JLabel nombreCompleto;
	private JLabel sexo;
	private JLabel fechaNacimiento;
	private JLabel edad;
	private JLabel ingresos;
	private JLabel divorcio;
	private JLabel likesEnviados;
	private JLabel likesRecibidos;
	private JLabel estado;
	
	public MainAppView() {
		setSize(Constants.JFrameX, Constants.JFrameY);
		setTitle(Constants.JFrameTitle);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		iniciarComponentes();
	}
	
	public void iniciarComponentes() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
