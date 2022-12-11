package controller;

import java.io.FileNotFoundException;

import model.CSVHandler;
import view.LoginView;

public class LoginController {
	public static LoginView ventana = new LoginView();
	public static void mostrar() {ventana.setVisible(true);}
	public static void ocultar() {ventana.setVisible(false);}
	
	public static void loginButtonEvent() throws FileNotFoundException {
		//TODO: Llamar al modelo para que revise los datos ingresados
		//TODO: Aprender pruebas unitarias
		//src: https://www.youtube.com/watch?v=sgGGjisdNPA&t=1850s
//		CSVHandler.readCSVFile().forEach(UsuarioDTO -> System.out.println(UsuarioDTO.toString())); //Funciona correctamente
		
	}
	public static void volverButtonEvent() {
		ocultar();
		//Volver a principal view
		PrincipalController.mostrar();
	}
}
