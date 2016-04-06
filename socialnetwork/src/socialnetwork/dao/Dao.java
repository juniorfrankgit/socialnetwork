package socialnetwork.dao;

/**
* This class allow to access to the data base:
* get users, add user or make others queries
* @author le06
*
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
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
	
	public User add(String lastname, String firstname, String email,String password) {
		synchronized(this) {
			EntityManager em = EMFService.get().createEntityManager();
			EntityTransaction tr = em.getTransaction();
			User user = new User(new Long((long)(Math.random()*10000)),lastname,firstname,email,
					password);
			em.persist(user);
			em.close();
			return user;
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
	
	public User getUser(String email){
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("select m from User m where m.email = :email");
		q.setParameter("email", email);
		List<User> res = (List<User>)q.getResultList();
		em.close();
		return res.get(0);
	}
	
}
