package testJPAGimnasios.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "localidad")
public class Localidad {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String localidad;
	

	@OneToMany(mappedBy="localidad")  // cojo el nombre que hay en asistente en el join column.
	private List<Asistente> asistentes; 
	
	
	
	


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
	
	
	
	
	
	

	public List<Asistente> getAsistentes() {
		return asistentes;
	}



	public void setAsistentes(List<Asistente> asistentes) {
		this.asistentes = asistentes;
	}

	
	
	
	
	

}
