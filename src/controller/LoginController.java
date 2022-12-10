package controller;

import view.LoginView;

public class LoginController {
	public static LoginView ventana = new LoginView();
	public static void mostrar() {ventana.setVisible(true);}
	public static void ocultar() {ventana.setVisible(false);}
}
