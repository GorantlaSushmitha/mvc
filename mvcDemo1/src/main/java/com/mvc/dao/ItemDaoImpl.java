package com.mvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.model.Item;


@Repository
@Transactional
public class ItemDaoImpl implements ItemDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public ItemDaoImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}

	public void saveItem(Item item)
	{
		Session session=sessionFactory.openSession();
	
		Transaction tx=session.beginTransaction();
		session.saveOrUpdate(item);
		tx.commit();
	}
}
