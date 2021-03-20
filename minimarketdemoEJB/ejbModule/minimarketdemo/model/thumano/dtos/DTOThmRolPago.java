package minimarketdemo.model.thumano.dtos;

import java.math.BigDecimal;

import minimarketdemo.model.core.entities.ThmRolCabecera;
import minimarketdemo.model.core.entities.ThmRolDetalle;

public class DTOThmRolPago {
	
	private String periodoRol; 
	private Double subtotalIngresos;
	private Double subtotalIngresosAdicionales;
	private Double subtotalEgresos;
	private Double total;
	
	public DTOThmRolPago() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPeriodoRol() {
		return periodoRol;
	}

	public void setPeriodoRol(String periodoRol) {
		this.periodoRol = periodoRol;
	}

	public Double getSubtotalIngresos() {
		return subtotalIngresos;
	}

	public void setSubtotalIngresos(Double subtotalIngresos) {
		this.subtotalIngresos = subtotalIngresos;
	}

	public Double getSubtotalIngresosAdicionales() {
		return subtotalIngresosAdicionales;
	}

	public void setSubtotalIngresosAdicionales(Double subtotalIngresosAdicionales) {
		this.subtotalIngresosAdicionales = subtotalIngresosAdicionales;
	}

	public Double getSubtotalEgresos() {
		return subtotalEgresos;
	}

	public void setSubtotalEgresos(Double subtotalEgresos) {
		this.subtotalEgresos = subtotalEgresos;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
}