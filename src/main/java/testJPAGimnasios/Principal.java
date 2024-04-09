package testJPAGimnasios;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import testJPAGimnasios.model.Gimnasio;

public class Principal {

	public static void main(String[] args) {
		obtieneUnGimnasio();

	}

	
	
	private static void obtieneUnGimnasio() {
		EntityManager em =  Persistence
		.createEntityManagerFactory("Gimnasios")      //el nombre Gimnasios viene dentro de persitence.xml
		.createEntityManager();  
		
		
		Gimnasio gimnasio = em.find(Gimnasio.class, 1);
		
		System.out.println("Gimnasio: " + gimnasio.getDescripcion());
		
	}
	
	
}
