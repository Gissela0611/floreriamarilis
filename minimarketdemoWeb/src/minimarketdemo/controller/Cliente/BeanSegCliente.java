package minimarketdemo.controller.Cliente;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import minimarketdemo.controller.JSFUtil;
import minimarketdemo.model.core.entities.Cliente;

import minimarketdemo.model.seguridades.managers.ManagerSeguridades;

@Named
@SessionScoped
public class BeanSegCliente implements Serializable {
	/**
	 * 
	 */

	@EJB
	private ManagerSeguridades managerSeguridades;

	private List<Cliente> listaCliente;
	private Cliente nuevoCliente;
		private Cliente edicionCliente;

	public BeanSegCliente() {

	}

	public String actionMenuCliente() {
		listaCliente = managerSeguridades.findAllCliente(); // crear
		return "cliente";
	}

	public void actionListenerActivarDesactivarCliente(int idCliente) {
		try {
			managerSeguridades.activarDesactivarCliente(idCliente);
			listaCliente = managerSeguridades.findAllCliente();
			JSFUtil.crearMensajeINFO("Cliente activado/desactivado");
		} catch (Exception e) {
			JSFUtil.crearMensajeERROR(e.getMessage());
			e.printStackTrace();
		}
	}

	public void actionListenerInsertarNuevoCliente() {
		try {
			managerSeguridades.insertarCliente(nuevoCliente);// crearcli
			listaCliente = managerSeguridades.findAllCliente();
			nuevoCliente = new Cliente();

			JSFUtil.crearMensajeINFO("cliente insertado.");
		} catch (Exception e) {
			JSFUtil.crearMensajeERROR(e.getMessage());
			e.printStackTrace();
		}
	}

	public String actionMenuNuevoCliente() {
		nuevoCliente = new Cliente();
		nuevoCliente.setActivo(true);

		return "cliente_nuevo";
	}

	public String actionSeleccionarEdicionCliente(Cliente Cliente) {
		edicionCliente = Cliente;
		return "cliente_edicion";
	}

	public void actionListenerActualizarEdicionCliente() {
		try {
			managerSeguridades.actualizarCliente(edicionCliente); // cre
			listaCliente = managerSeguridades.findAllCliente();
			JSFUtil.crearMensajeINFO("Cliente actualizado.");
		} catch (Exception e) {
			JSFUtil.crearMensajeERROR(e.getMessage());
			e.printStackTrace();
		}
	}

	public void actionListenerEliminarCliente(int idCliente) {
		try {
			managerSeguridades.eliminarCliente(idCliente); // crear
			listaCliente = managerSeguridades.findAllCliente();
			JSFUtil.crearMensajeINFO("Cliente eliminado.");
		} catch (Exception e) {
			JSFUtil.crearMensajeERROR(e.getMessage());
			e.printStackTrace();
		}
	}

	public List<Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(List<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

	public Cliente getNuevoCliente() {
		return nuevoCliente;
	}

	public void setNuevoCliente(Cliente nuevoCliente) {
		this.nuevoCliente = nuevoCliente;
	}

	

	
	public Cliente getEdicionCliente() {
		return edicionCliente;
	}

	public void setEdicionCliente(Cliente edicionCliente) {
		this.edicionCliente = edicionCliente;
	}

}
