package controller;
import view.PrincipalView;

public class PrincipalController {
	public static PrincipalView ventana = new PrincipalView();
	public static void mostrar() {ventana.setVisible(true);}
	public static void ocultar() {ventana.setVisible(false);}
	
	public static void loginButtonEvent() {
		ocultar();
		LoginController.mostrar();
	}
	public static void registerButtonEvent() {
		ocultar();
	}
}
