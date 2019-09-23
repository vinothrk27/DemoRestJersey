package com.fastfire.dao;

import java.util.List;

import com.fastfire.bean.Alien;

public interface AlienDao {

	public List<Alien> getAliens();
	public Alien getAlien(int id);
	public boolean addAlien(Alien a);
	public boolean updateAlien(Alien a);
	public boolean deleteAlien(Alien a);
	
}
