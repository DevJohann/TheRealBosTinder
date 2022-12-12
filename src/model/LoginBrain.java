package model;

import java.io.FileNotFoundException;
import java.util.List;

public class LoginBrain {
	
	public LoginBrain(){
		
	}
	
	public boolean checkUser(String username, String password) throws FileNotFoundException {
		
		List<UsuarioDTO> userList = CSVHandler.readCSVFile();
		
		for(int i = 0; i < userList.size(); i++) {
			if(userList.get(i).getUsuario().equals(username)&&userList.get(i).getContrasena().equals(password)) {
				//System.out.println(userList.get(i).toString());
				return true;
			}
			
		}
		
		return false;
	}
	
	public String checkUserRol(String username, String password) {
		return (username.equals("admin")&&password.equals("1234")) ? "rol_admin": "rol_user";
	}
}
