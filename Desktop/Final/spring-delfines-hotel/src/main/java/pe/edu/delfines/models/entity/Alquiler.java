package pe.edu.delfines.models.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "alquileres")
public class Alquiler {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "precio")
	private float precio;
	
	@Column(name = "fecha_entrada", length = 10)
	private Date fecha_entrada;
	
	@Column(name = "fecha_salida", length = 10)
	private Date fecha_salida;
	
	@Column(name = "estado", length = 100)
	private String estado;
	
	@Column(name = "observacion", length = 100)
	private String observacion;
	
	
	
	
	//------------------------------------------------------------
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vendedor_id")
	private Vendedor vendedor;

	//-------------------------------------------------------------
	
	@JsonIgnoreProperties("clientes")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	//---------------------------------------------------------------

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "habitacion_id")
	private Habitacion habitacion;
	
	//----------------------------------------------------------------
	
	
	
	
	
	
	
	
	public Integer getId() {
		return id;
	}



	public float getPrecio() {
		return precio;
	}



	public void setPrecio(float precio) {
		this.precio = precio;
	}



	public Date getFecha_entrada() {
		return fecha_entrada;
	}



	public void setFecha_entrada(Date fecha_entrada) {
		this.fecha_entrada = fecha_entrada;
	}



	public Date getFecha_salida() {
		return fecha_salida;
	}



	public void setFecha_salida(Date fecha_salida) {
		this.fecha_salida = fecha_salida;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public String getObservacion() {
		return observacion;
	}



	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public Vendedor getVendedor() {
		return vendedor;
	}



	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}



	public Habitacion getHabitacion() {
		return habitacion;
	}



	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}



	public void setAlquiler(Alquiler alquiler) {
		// TODO Auto-generated method stub
		
	}



	public List<Alquiler> getAlquiler() {
		// TODO Auto-generated method stub
		return null;
	}



	




	
	
	
}
