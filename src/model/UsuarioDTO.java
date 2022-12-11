package model;

import java.util.Date;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvCustomBindByPosition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class UsuarioDTO {
	@CsvBindByPosition(position = 0)
	private String UID;
	@CsvBindByPosition(position = 1)
	private String nombre;
	@CsvBindByPosition(position = 2)
	private String apellido1;
	@CsvBindByPosition(position = 3)
	private String apellido2;
	@CsvBindByPosition(position = 4)
	private String sexo;
	@CsvBindByPosition(position = 5)
	private String usuario;
	@CsvBindByPosition(position = 6)
	private String contrasena;
	@CsvBindByPosition(position = 7)
	private String correo;
	@CsvCustomBindByPosition(position = 8, converter = DateConverter.class)
	private Date nacimiento;
	@CsvBindByPosition(position = 9)
	private String edad;
	@CsvBindByPosition(position = 12)
	private int noLikesRecibidos; 
	@CsvBindByPosition(position = 13)
	private int noLikesEnviados; 
	@CsvBindByPosition(position = 14)
	private int noMatch;
	@CsvBindByPosition(position = 15)
	private String estado;
	
	//TODO: Aprender DATE

	
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Date getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public int getNoLikesRecibidos() {
		return noLikesRecibidos;
	}
	public void setNoLikesRecibidos(int noLikesRecibidos) {
		this.noLikesRecibidos = noLikesRecibidos;
	}
	public int getNoLikesEnviados() {
		return noLikesEnviados;
	}
	public void setNoLikesEnviados(int noLikesEnviados) {
		this.noLikesEnviados = noLikesEnviados;
	}
	public int getNoMatch() {
		return noMatch;
	}
	public void setNoMatch(int noMatch) {
		this.noMatch = noMatch;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "UsuarioDTO [UID=" + UID + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", sexo=" + sexo + ", usuario=" + usuario + ", contrasena=" + contrasena + ", correo=" + correo
				+ ", nacimiento=" + nacimiento + ", edad=" + edad + ", noLikesRecibidos=" + noLikesRecibidos
				+ ", noLikesEnviados=" + noLikesEnviados + ", noMatch=" + noMatch + ", estado=" + estado + "]";
	}
	
	
}
