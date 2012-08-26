package net.javafun.career.dao;

import java.util.List;

import net.javafun.career.entity.User;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDAOHibernate extends BaseDAOHibernate<User> implements UserDAO {
	
	@Override
	public User getUserById(long id) {
		Criteria c = getCurrentSession().createCriteria(User.class);
		c.add(Restrictions.eq("id", id));
		return (User)c.uniqueResult();
	}

	
	@Override
	public List<User> getUsers() {
		Criteria c = getCurrentSession().createCriteria(User.class);
		return c.list();
	}

}