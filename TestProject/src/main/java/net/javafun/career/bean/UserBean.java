package net.javafun.career.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import net.javafun.career.entity.User;
import net.javafun.career.service.UserService;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component(value = "userBean")
@Scope(value="request")
public class UserBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Resource(name="userSevice")
	private UserService userService;
	
	private String name;
	
	private String surname;
	
	public List<User> getDataList(){
		List<User> userList = userService.getUsers();		
		return userList;
	}
	
	public void saveCommand() {
		User user = new User();
		user.setName(name);
		user.setSurname(surname);
		userService.addUser(user);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

}
