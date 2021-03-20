package minimarketdemo.model.core.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the seg_producto database table.
 * 
 */
@Entity
@Table(name="seg_producto")
@NamedQuery(name="SegProducto.findAll", query="SELECT s FROM SegProducto s")
public class SegProducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_seg_producto")
	private Integer idSegProducto;

	private String codigoproducto;

	private String nombres;

	private BigDecimal precio;

	private String tipo;

	public SegProducto() {
	}

	public Integer getIdSegProducto() {
		return this.idSegProducto;
	}

	public void setIdSegProducto(Integer idSegProducto) {
		this.idSegProducto = idSegProducto;
	}

	public String getCodigoproducto() {
		return this.codigoproducto;
	}

	public void setCodigoproducto(String codigoproducto) {
		this.codigoproducto = codigoproducto;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}