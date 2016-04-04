package socialnetwork.dao;

/**
* This class allow to access to the data base:
* get users, add user or make others queries
* @author le06
*
*/

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import socialnetwork.model.User;

public enum Dao {
	INSTANCE;
	
	public List<User> listUsers() {
		EntityManager em = EMFService.get().createEntityManager();
		//read the existing entries
		Query q = em.createQuery("select m from User m");
		List<User> users = q.getResultList();
		return users;
	}
	
	public void add(String lastname, String firstname, String email,String password) {
		synchronized(this) {
			EntityManager em = EMFService.get().createEntityManager();
			User user = new User(new Long((long)(Math.random()*10000)),lastname,firstname,email,
					password);
			em.persist(user);
			em.close();
		}
	}
	
	public void remove(long id) {
		EntityManager em = EMFService.get().createEntityManager();
		try {
			User user = em.find(User.class, id);
			em.remove(user);
		} finally {
			em.close();
		}
	}
}
