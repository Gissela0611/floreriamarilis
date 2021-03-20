package minimarketdemo.model.thumano.dtos;

import java.math.BigDecimal;

import minimarketdemo.model.core.entities.ThmRolCabecera;
import minimarketdemo.model.core.entities.ThmRolDetalle;

public class DTOThmEmpleado {
	
	private String apellido;
	private String nombre;
	private String correo;
	private int idThmCargo;
	private String nombreCargo;
	private double remuneracionMensual;
	
	
	
	
	public DTOThmEmpleado() {
		
	}
	public DTOThmEmpleado(String apellido, String nombre, String correo, int idThmCargo, String nombreCargo,
			double remuneracionMensual) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.correo = correo;
		this.idThmCargo = idThmCargo;
		this.nombreCargo = nombreCargo;
		this.remuneracionMensual = remuneracionMensual;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getIdThmCargo() {
		return idThmCargo;
	}
	public void setIdThmCargo(int idThmCargo) {
		this.idThmCargo = idThmCargo;
	}
	public String getNombreCargo() {
		return nombreCargo;
	}
	public void setNombreCargo(String nombreCargo) {
		this.nombreCargo = nombreCargo;
	}
	public double getRemuneracionMensual() {
		return remuneracionMensual;
	}
	public void setRemuneracionMensual(double remuneracionMensual) {
		this.remuneracionMensual = remuneracionMensual;
	}
	
	
}
