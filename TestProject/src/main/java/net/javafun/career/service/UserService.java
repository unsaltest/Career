package net.javafun.career.service;

import java.util.List;

import net.javafun.career.entity.User;


public interface UserService {

	/**
	 * 
	 * @param user
	 */
	public void addUser(User user);

	/**
	 * Update User
	 * 
	 * @param User
	 *            user
	 */
	public void updateUser(User user);

	/**
	 * Delete User
	 * 
	 * @param User
	 *            user
	 */
	public void deleteUser(User user);

	/**
	 * Get User
	 * 
	 * @param int User Id
	 */
	public User getUserById(long id);

	/**
	 * Get User List
	 * 
	 * @return List - User list
	 */
	public List<User> getUsers();
}