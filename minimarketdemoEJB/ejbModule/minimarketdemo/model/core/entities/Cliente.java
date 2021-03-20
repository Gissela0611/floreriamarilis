package minimarketdemo.model.core.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@Table(name="Cliente")
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cliente")
	private Integer idCliente;

	private Boolean activo;

	private String apellidoscliente;

	private String clave;

	private String codigo;

	private String correo;

	private String nombrescliente;

	public Cliente() {
	}

	public Integer getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Boolean getActivo() {
		return this.activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public String getApellidoscliente() {
		return this.apellidoscliente;
	}

	public void setApellidoscliente(String apellidoscliente) {
		this.apellidoscliente = apellidoscliente;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombrescliente() {
		return this.nombrescliente;
	}

	public void setNombrescliente(String nombrescliente) {
		this.nombrescliente = nombrescliente;
	}

	public List<SegUsuario> getSegAsignacions() {
		// TODO Auto-generated method stub
		return null;
	}

}