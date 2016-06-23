package fr.adaming.dao;

import java.util.List;

/**
 * Interface generique DAO
 * @author INTI-0332
 *
 */
public interface IGenericDAO<T> {
	
	public void add(T t);
	
	public void update(T t);
	
	public void delete(T t);
	
	public T getById(Object id);
	
	public List<T> getAll();

}
