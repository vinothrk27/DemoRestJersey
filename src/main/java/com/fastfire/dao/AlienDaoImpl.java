package com.fastfire.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.fastfire.bean.Alien;
import com.fastfire.utils.HibernateUtils;

public class AlienDaoImpl implements AlienDao {

	@Override
	public List<Alien> getAliens() {
		EntityManager manager = HibernateUtils.getEntityManager();
		List<Alien> aliens = null;
		
		try {
			manager.getTransaction().begin();
			aliens = manager.createQuery("from Alien").getResultList();
			manager.getTransaction().commit();
		} catch (Exception e) {
			manager.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			manager.close();
		}
		
		return aliens;
	}

	@Override
	public Alien getAlien(int id) {
		EntityManager manager = HibernateUtils.getEntityManager();
		Alien alien = null;
		
		try {
			manager.getTransaction().begin();
			alien = manager.find(Alien.class, id);
			manager.getTransaction().commit();
		} catch (Exception e) {
			manager.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			manager.close();
		}
		
		return alien;
	}

	@Override
	public boolean addAlien(Alien a) {
		EntityManager manager = HibernateUtils.getEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(a);
		manager.getTransaction().commit();
		manager.close();
		return false;
	}

	@Override
	public boolean updateAlien(Alien a) {
		EntityManager manager = HibernateUtils.getEntityManager();
		
		manager.getTransaction().begin();
		manager.merge(a);
		manager.getTransaction().commit();
		manager.close();
		return false;
	}

	@Override
	public boolean deleteAlien(Alien a) {
		EntityManager manager = HibernateUtils.getEntityManager();
		
		manager.getTransaction().begin();
		Alien alien = manager.find(Alien.class, a.getId());
		manager.remove(alien);
		manager.getTransaction().commit();
		manager.close();
		return false;
	}

}
