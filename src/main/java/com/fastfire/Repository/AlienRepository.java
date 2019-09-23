package com.fastfire.Repository;

import java.util.List;

import com.fastfire.bean.Alien;
import com.fastfire.dao.AlienDao;
import com.fastfire.dao.AlienDaoImpl;

public class AlienRepository {

	AlienDao dao = new AlienDaoImpl();
	
	public AlienRepository() {

	}
	
	/*
	 * Function to get all aliens
	 */
	public List<Alien> getAliens()
	{
		return dao.getAliens();
	}
	
	/*
	 * Function to get an alien by id
	 */
	public Alien getAlien(int id)
	{
		return dao.getAlien(id);
	}
	
	/*
	 * Function to add an alien
	 */
	public void addAlien(Alien a)
	{
		dao.addAlien(a);
	}
	
	/*
	 * Function to update an alien
	 */
	public void updateAlien(Alien a)
	{
		dao.updateAlien(a);
	}
	
	/*
	 * Function to delete an alien
	 */
	public void deleteAlien(Alien a)
	{
		dao.deleteAlien(a);
	}
}
