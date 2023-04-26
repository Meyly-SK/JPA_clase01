package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String dateInString = "2018-05-05";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);        
        Date fecha = formatter.parse(dateInString);
        
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Conex");
		EntityManager em = factory.createEntityManager();

		
		Usuario user = new Usuario();
		user.setNombre("Meyly");
		user.setApellido("Merma");
		user.setClave("987654");
		user.setFnacim(dateInString);
		user.setEstado(2);	
		user.setUsuario("U004");
		user.setTipo(1);
		
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
	}

}
