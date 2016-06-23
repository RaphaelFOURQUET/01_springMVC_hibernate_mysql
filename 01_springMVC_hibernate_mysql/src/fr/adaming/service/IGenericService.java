package fr.adaming.service;

import java.util.List;

public interface IGenericService<T> {

	public void add(T t);

	public void update(T t);

	public void delete(T t);

	public T getById(Object id);

	public List<T> getAll();

}
