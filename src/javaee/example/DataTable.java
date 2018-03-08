package javaee.example;

import java.io.IOException;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javaee.example.*;

public class DataTable { //Klasa Dao
	
	private static EntityManager em = Persistence.createEntityManagerFactory("javaee.example").createEntityManager();
	private static EntityTransaction et = em.getTransaction();
	
	
	public static List getAllLinks() {
		Query query = em.createQuery("SELECT s FROM LinkEntity s");
		List links = query.getResultList();
		if (links != null && links.size() > 0) {           
	            return links;
	        } else {
		        return null;
	        }
		}
	
	public static String insertIntoDB(String linkx, String autor, String tekst) throws IOException { 
		if(!et.isActive())
			et.begin();
		LinkEntity link = new LinkEntity();
				
		link.setId(getminId());
		link.setAutor(autor);
		link.setLink(linkx);
		link.setTekst(tekst);
		em.persist(link);
		et.commit();
		return null;
	}
	
	public static int getminId() {
		int ext = 1;
		Query queryObj = em.createQuery("SELECT MAX(s.id)+1 FROM LinkEntity s");
			        if(queryObj.getSingleResult() != null) {
			            ext = (Integer) queryObj.getSingleResult();
			        }
		
		return ext;
	}
	
}
