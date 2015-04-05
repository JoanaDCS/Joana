package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

import conexao.JPAUtil;

public class DAO<T> {

	private final Class<T> classe;

	public DAO(Class<T> classe) {
		this.classe = classe;
	}
	
	public void adiciona(T t){
		EntityManager em = new JPAUtil().getEntityManager();
		//abre transacao
		em.getTransaction().begin();
		
		//persiste o objeto
		em.persist(t);
		
		//commita a transa��o
		em.getTransaction().commit();
		
		//fecha a entity manager
		em.close();
	}
	
	public void remove(T t){
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		em.remove(em.merge(t));
		
		em.getTransaction().commit();
		
		em.close();
	}
	
	public void atualiza(T t){
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		em.merge(t);
		
		em.getTransaction().commit();
		
		em.close();
	}
	
	public List<T> listaTodos(){
		EntityManager em = new JPAUtil().getEntityManager();
		CriteriaQuery<T> query = em.getCriteriaBuilder().createQuery(classe);
		query.select(query.from(classe));
		
		List<T> lista = em.createQuery(query).getResultList();
		
		em.close();
		return lista;
	}
	
	public T buscaPorId(Long id){
		EntityManager em = new JPAUtil().getEntityManager();
		return (T) em.find(classe, id);
	}
	
}
