package beans;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteBanco {

	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Joana");
		EntityManager entityManager = emf.createEntityManager();
		entityManager.getTransaction().begin();
		/*Alelo alelo = new Alelo();
		alelo.setMfi(1000);
		alelo.setNome("B*44:03");
		entityManager.persist(alelo);*/
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}

}
