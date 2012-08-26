package net.javafun.career.dao;


public interface BaseDAO<T> {
		
	public void save(T entiy);
	
	public void delete(T entiy);

	public void update(T entiy);

}
