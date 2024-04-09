package testJPAGimnasios.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "asistente")
public class Asistente {
	
	@Id
	int id;
	
//	int idGimnasio;
	//bi-directional many-to-one association to Fabricante
	@ManyToOne(fetch = FetchType.LAZY)   // sólo te cargará la información del fabricante cuando le preguntes por él.
	@JoinColumn(name="idGimnasio")
	private Gimnasio gimnasio;

	String dniNiePasaporte;
		
//	int idLocalidad;
	//bi-directional many-to-one association to Fabricante
	@ManyToOne(fetch = FetchType.LAZY)   // sólo te cargará la información del fabricante cuando le preguntes por él.
	@JoinColumn(name="idLocalidad")
	private Localidad localidad;
		
	boolean activo;
	String nombre;
	String apellidos;
	Date fechaNacimiento;
	float cuotaMensual;
	
	
	
	
	
	
	public Asistente() {
		super();
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
//	public int getIdGimnasio() {
//		return idGimnasio;
//	}
//	public void setIdGimnasio(int idGimnasio) {
//		this.idGimnasio = idGimnasio;
//	}
	
	public String getDniNiePasaporte() {
		return dniNiePasaporte;
	}
	public void setDniNiePasaporte(String dniNiePasaporte) {
		this.dniNiePasaporte = dniNiePasaporte;
	}
	
	
//	public int getIdLocalidad() {
//		return idLocalidad;
//	}
//	public void setIdLocalidad(int idLocalidad) {
//		this.idLocalidad = idLocalidad;
		
	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}
	
	
	
	public Gimnasio getGimnasio() {
		return gimnasio;
	}




	public void setGimnasio(Gimnasio gimnasio) {
		this.gimnasio = gimnasio;
	}




	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public float getCuotaMensual() {
		return cuotaMensual;
	}
	public void setCuotaMensual(float cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}
	
	
	

}
