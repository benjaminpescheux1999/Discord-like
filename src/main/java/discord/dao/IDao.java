package discord.dao;

import java.util.List;

public interface IDao<T, Id> {

	public List<T> findAll();
	public T findById(Id id);
	public T save(T entity);
	public void deleteById(Id id);
	
}
