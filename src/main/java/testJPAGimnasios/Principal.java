package testJPAGimnasios;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import testJPAGimnasios.model.Asistente;
import testJPAGimnasios.model.Gimnasio;
import testJPAGimnasios.model.Localidad;

public class Principal {

	public static void main(String[] args) {

		EntityManager em = Persistence.createEntityManagerFactory("Gimnasios") // el nombre Gimnasios viene dentro de
																				// persitence.xml
				.createEntityManager();

		Localidad l = em.find(Localidad.class, 4);
		System.out.println("Localidad " + l.getLocalidad());
		
		
		
//		Asistente a = em.find(Asistente.class,1);
//		System.out.println("Asistente " + a.getNombre() + " - Localidad: " + a.getIdLocalidad());
		
		Asistente a = em.find(Asistente.class,4);
		System.out.println("Asistente " + a.getNombre() + " - Localidad: " + a.getLocalidad().getLocalidad());
		
		
		for(Asistente asistente : a.getLocalidad().getAsistentes()) {
			System.out.println("Asistente: " + asistente.getNombre() + " " + asistente.getApellidos() );
		}
		
		
//		obtieneUnGimnasio(em);
	}

//	private static void obtieneUnGimnasio(EntityManager em) {
//
//		Gimnasio gimnasio = em.find(Gimnasio.class, 1);
//
//		System.out.println("Gimnasio: " + gimnasio.getDescripcion());
//
//	}

}
