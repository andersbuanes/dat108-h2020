package no.hvl.dat108;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class StudentEAO {
	
	@PersistenceContext(name = "studentPU")
    private EntityManager em;
	
	public List<Student> hentKlasselisteFor(String klassekode) {
		return em.find(Klasse.class, klassekode).getStudenter();
	}

}


