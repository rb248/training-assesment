package com.mysprhib.resturantdao;

import org.hibernate.Query;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysprhib.model.Resturant;

@Component
public class ResturantDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public void saveResturant(Resturant resturant){	
	Session session=	sessionFactory.getCurrentSession();
	session.save(resturant);
	} 
	@Transactional
	public ArrayList<Resturant> searchRestaurant(String s) {
		Session session= sessionFactory.getCurrentSession(); 
		Query query=session.createQuery("from Resturant r where r.name like '%"+s+"%'"); 
		
		ArrayList<Resturant> rests=(ArrayList<Resturant>)query.list();
		return rests;
		
		
	} 
	@Transactional 
	public void updateRating(String rname,float rat) {
		Session session=sessionFactory.getCurrentSession(); 
		Resturant rest=(Resturant)session.get(Resturant.class, rname);
		rest.setRating((float) rat); 
		session.saveOrUpdate(rest);
		
	} 
	@Transactional 
	public ArrayList<Resturant> showRestaurant() {
		Session session=sessionFactory.getCurrentSession(); 
		Query query=session.createQuery("from Resturant"); 
		ArrayList<Resturant> rests=(ArrayList<Resturant>)query.list(); 
		
		return rests;
	} 
	@Transactional
	public void deleteRestaurant(String name) {
		Session session=sessionFactory.getCurrentSession(); 
		Resturant r=(Resturant)session.get(Resturant.class, name); 
		session.delete(r); 
	} 
	

	public ResturantDao(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	
	
	public ResturantDao() {
		}
	
	
}
