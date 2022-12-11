package controller;

import java.io.FileNotFoundException;
import java.util.List;

import model.CSVHandler;
import model.LoginBrain;
import model.UsuarioDTO;
import view.LoginView;
import view.Windows;

/**
 * <h1>LoginController</h1>
 * <p>
 * En esta clase encontramos las acciones que seran mandadas a hacer en base al boton presionado en LoginView.
 * </p>
 * <p>
 * El atributo ventana es lo que representa a la clase LoginView.
 * El atributo brain es en el modelo quien revisa que el usuario y contraseña ingresados sean correctos.
 * 
 * Tiene 2 metodos principales, mostrar y ocultar, que lo que hacen es mostrar u ocultar la ventana respectivamente.
 * Los otros dos metodos, loginButtonEvent() y volverButtonEvent, seran para el boton de login y el de volver respectivamente.
 * </p>
 * @author Johann
 * @see LoginView
 */
public class LoginController {
	public static LoginView ventana = new LoginView();
	public static LoginBrain brain = new LoginBrain();
	
	public static void mostrar() {ventana.setVisible(true);}
	public static void ocultar() {ventana.setVisible(false);}
	
	/**
	 * <h2>loginButtonEvent</h2>
	 * <p>
	 *	//TODO: Terminar Javadoc
	 * </p>
	 * @param usernameField
	 * @param passwordField
	 * @throws FileNotFoundException
	 */
	public static void loginButtonEvent(String usernameField, String passwordField) throws FileNotFoundException {

		boolean response = brain.checkUser(usernameField, passwordField);
		if(response) 
			Windows.showMessage("Usuario corecto");
		else
			Windows.showMessage("Usuario incorrecto");
		//TODO: Aprender pruebas unitarias
		//src: https://www.youtube.com/watch?v=sgGGjisdNPA&t=1850s
//		CSVHandler.readCSVFile().forEach(UsuarioDTO -> System.out.println(UsuarioDTO.toString())); //Funciona correctamente
		
//		List<UsuarioDTO> response = CSVHandler.readCSVFile(); //Funciona correctamente
//		for(int i = 0; i < response.size(); i++) {
//			//System.out.println(response.get(i).toString()); //Funciona correctamente
//			if(response.get(i).getNombre().equals("María")) {
//				System.out.println(response.get(i));
//			}
//		}
	}
	public static void volverButtonEvent() {
		ocultar();
		//Volver a principal view
		PrincipalController.mostrar();
	}
}
