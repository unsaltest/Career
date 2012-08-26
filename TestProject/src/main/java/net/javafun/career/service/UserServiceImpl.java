package net.javafun.career.service;

import java.util.List;

import javax.annotation.Resource;

import net.javafun.career.dao.UserDAO;
import net.javafun.career.entity.User;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("userSevice")
public class UserServiceImpl implements UserService {

	@Resource(name="userDAO")
	private UserDAO userDAO;

	@Transactional(readOnly = false)
	@Override
	public void addUser(User user) {
		userDAO.save(user);
	}

	
	@Transactional(readOnly = false)
	@Override
	public void deleteUser(User user) {
		userDAO.delete(user);
	}

	
	@Transactional(readOnly = false)
	@Override
	public void updateUser(User user) {
		userDAO.update(user);
	}

	@Transactional(readOnly = true)
	@Override
	public User getUserById(long id) {
		return userDAO.getUserById(id);
	}

	
	@Transactional(readOnly = true)
	@Override
	public List<User> getUsers() {
		return userDAO.getUsers();
	}

	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
}
