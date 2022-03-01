package com.ecommerce.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.EProductEntity;

@Repository
public class EProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<EProductEntity> getAllProducts()
	{
		return sessionFactory.getCurrentSession().createQuery("from EProductEntity").list();
	}
}
