package conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("joana");
	
	public EntityManager getEntityManager(){
		return emf.createEntityManager();
	}

}
