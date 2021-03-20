package minimarketdemo.model.seguridades.managers;

import java.util.List;

import javax.ejb.EJB;

import minimarketdemo.model.auditoria.managers.ManagerAuditoria;
import minimarketdemo.model.core.entities.Cliente;
import minimarketdemo.model.core.entities.SegProducto;
import minimarketdemo.model.core.managers.ManagerDAO;

public class ManagerProducto {
	@EJB
	private ManagerDAO mDAO;
	@EJB
	private ManagerAuditoria mAuditoria;
    /**
     * Default constructor. 
     */
	
	 public List<SegProducto> findAllSegProducto(){
	    	return mDAO.findAll(SegProducto.class, "nombreproducto");
	    }
	    
	    public SegProducto findByIdSegProducto(int idSegProducto) throws Exception {
	    	return (SegProducto) mDAO.findById(Cliente.class, idSegProducto);
	    }
	    
	    public void insertarSegProducto(SegProducto nuevoSegProducto) throws Exception {
	    	nuevoSegProducto .setCodigoproducto("n/a");
	    	mDAO.insertar(nuevoSegProducto );
	    }
	    
	    public void actualizarSegProducto(SegProducto edicionSegProducto) throws Exception {
	    	SegProducto Producto=(SegProducto) mDAO.findById(SegProducto.class, edicionSegProducto.getIdSegProducto());
	    	Producto.setCodigoproducto(edicionSegProducto.getCodigoproducto());
	    	Producto.setNombres(edicionSegProducto.getNombres());
	    	Producto.setTipo(edicionSegProducto.getTipo());
	    	Producto.setPrecio(edicionSegProducto.getPrecio());
	    	
	    	mDAO.actualizar(Producto);
	    }
	    
	    public void activarDesactivarSegProducto(int idSegProducto) throws Exception {
	    	SegProducto Producto=(SegProducto) mDAO.findById(SegProducto.class, idSegProducto);
	    	
	    	System.out.println("activar/desactivar ");
	    	mDAO.actualizar(Producto);
	    }
	    
	    public void eliminarSegProducto(int idSegProducto) throws Exception {
	    	SegProducto Producto=(SegProducto) mDAO.findById(SegProducto.class, idSegProducto);
	    	
	    	
	    	mDAO.eliminar(SegProducto.class, Producto.getIdSegProducto());
	    }
	
}
