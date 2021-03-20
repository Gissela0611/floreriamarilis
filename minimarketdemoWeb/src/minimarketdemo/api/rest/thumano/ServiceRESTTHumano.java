package minimarketdemo.api.rest.thumano;

import java.math.BigDecimal;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import minimarketdemo.model.core.entities.ThmEmpleado;
import minimarketdemo.model.thumano.dtos.DTOThmCargo;
import minimarketdemo.model.thumano.dtos.DTOThmEmpleado;
import minimarketdemo.model.thumano.managers.ManagerTHumano;

@RequestScoped
@Path("thumano")
@Produces("application/json")
@Consumes("application/json")
public class ServiceRESTTHumano {
	
	@EJB
	private ManagerTHumano mTHumano;
	
	@GET
	@Path(value ="cargos")
	public List<DTOThmCargo> findallDtoThmCargos(){
		return mTHumano.findAllDTOThmCargo();
	}
	
	@GET
	@Path(value ="empleados")
	
	public List<DTOThmEmpleado> findAllDTOThmempleado(){
    	return mTHumano.findAllDTOThmempleado();
    }
	
	
	@POST
    @Path("/cargos")
    public void insertarCargo(@QueryParam("nombreCargo") String nombreCargo, @QueryParam("remuneracionMensual") BigDecimal remuneracionMensual) {
        //this.mTHumano.insertarCargo(cargo);   
        try {
            mTHumano.insertarCargo(nombreCargo, remuneracionMensual);
            //mTHumano.findAllDTOThmCargo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    @PUT
    @Path("/cargos")
    public void actualizarCargo(@QueryParam("idThmCargo") int idThmCargo, @QueryParam("nombreCargo") String nombreCargo, @QueryParam("remuneracionMensual") BigDecimal remuneracionMensual) {
        try {
            mTHumano.actualizarCargo(idThmCargo, nombreCargo, remuneracionMensual);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
   
    @DELETE
    @Path("/cargos")
    public void eliminarCargo(@QueryParam("idThmCargo") int idThmCargo) {
        try {
            mTHumano.eliminarCargo(idThmCargo);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
	

}
