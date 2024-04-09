package testJPAGimnasios.model;

import javax.persistence.Entity;
import javax.persistence.Table;




@Entity
@Table(name = "localidad")
public class Localidad {
	
	int id;
	String localidad;
	
	

	public Localidad() {
		super();
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	

}
