package minimarketdemo.controller.seguridades;

import java.util.List;

import javax.ejb.EJB;

import minimarketdemo.controller.JSFUtil;
import minimarketdemo.model.core.entities.SegProducto;
import minimarketdemo.model.seguridades.managers.ManagerProducto;


public class BeanSegProducto {


	@EJB
	private ManagerProducto managerProducto;
	
	private List<SegProducto> listaSegProducto;
	private SegProducto nuevoSegProducto;
		private SegProducto edicionSegProducto;
		
		public BeanSegProducto() {

		}

		public String actionMenuSegProducto() {
			listaSegProducto = managerProducto.findAllSegProducto(); // crear
			return "producto";
		}

		public void actionListenerActivarDesactivarSegProducto(int idSegProducto) {
			try {
				managerProducto.activarDesactivarSegProducto(idSegProducto);
				listaSegProducto= managerProducto.findAllSegProducto();
				
			} catch (Exception e) {
				JSFUtil.crearMensajeERROR(e.getMessage());
				e.printStackTrace();
			}
		}

		public void actionListenerInsertarNuevoSegProducto() {
			try {
				managerProducto.insertarSegProducto(nuevoSegProducto);// crearcli
				listaSegProducto = managerProducto.findAllSegProducto();
				nuevoSegProducto = new SegProducto();

				JSFUtil.crearMensajeINFO("Producto insertado.");
			} catch (Exception e) {
				JSFUtil.crearMensajeERROR(e.getMessage());
				e.printStackTrace();
			}
		}

		public String actionMenuNuevoSegProducto() {
			nuevoSegProducto = new SegProducto();
			
			return "producto_nuevo";
		}

		public String actionSeleccionarEdicionSegProducto(SegProducto Producto) {
			edicionSegProducto = Producto;
			return "producto_edicion";
		}

		public void actionListenerActualizarEdicionSegProducto() {
			try {
				managerProducto.actualizarSegProducto(edicionSegProducto); // cre
				listaSegProducto = managerProducto.findAllSegProducto();
				JSFUtil.crearMensajeINFO("Producto actualizado.");
			} catch (Exception e) {
				JSFUtil.crearMensajeERROR(e.getMessage());
				e.printStackTrace();
			}
		}

		public void actionListenerEliminarSegProducto(int idSegProducto) {
			try {
				managerProducto.eliminarSegProducto(idSegProducto); // crear
				listaSegProducto = managerProducto.findAllSegProducto();
				JSFUtil.crearMensajeINFO("Producto eliminado.");
			} catch (Exception e) {
				JSFUtil.crearMensajeERROR(e.getMessage());
				e.printStackTrace();
			}
		}

		public ManagerProducto getManagerProducto() {
			return managerProducto;
		}

		public void setManagerProducto(ManagerProducto managerProducto) {
			this.managerProducto = managerProducto;
		}

		public List<SegProducto> getListaSegProducto() {
			return listaSegProducto;
		}

		public void setListaSegProducto(List<SegProducto> listaSegProducto) {
			this.listaSegProducto = listaSegProducto;
		}

		public SegProducto getNuevoSegProducto() {
			return nuevoSegProducto;
		}

		public void setNuevoSegProducto(SegProducto nuevoSegProducto) {
			this.nuevoSegProducto = nuevoSegProducto;
		}

		public SegProducto getEdicionSegProducto() {
			return edicionSegProducto;
		}

		public void setEdicionSegProducto(SegProducto edicionSegProducto) {
			this.edicionSegProducto = edicionSegProducto;
		}

		
}
