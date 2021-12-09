package com.tld.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tld.entities.User;

@Repository
public class UserDaoImpl implements UserDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<User> getUsers() {
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from User", User.class);
		 
		List<User>  users =  query.getResultList();
		return users;
	}

	@Override
	public void saveUser(User user ) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		
	}

}
