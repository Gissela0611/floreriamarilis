package minimarketdemo.model.seguridades.dtos;


import java.util.ArrayList;
import java.util.List;

import minimarketdemo.model.core.entities.SegModulo;

public class LoginDTOCli {


	
	private int idCliente;
	private String correo;
	private List<SegModulo> listaModulos;
	
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public List<SegModulo> getListaModulos() {
		return listaModulos;
	}
	public void setListaModulos(List<SegModulo> listaModulos) {
		this.listaModulos = listaModulos;
	}
	
	
}