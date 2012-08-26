package net.javafun.career.dao;

import java.util.List;

import net.javafun.career.entity.User;


public interface UserDAO extends BaseDAO<User> {

	/**
	 * Get User
	 * 
	 * @param int User Id
	 */
	public User getUserById(long id);

	/**
	 * Get User List
	 * 
	 */
	public List<User> getUsers();
}