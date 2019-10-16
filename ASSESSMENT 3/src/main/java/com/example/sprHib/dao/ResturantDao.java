package com.example.sprHib.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.sprHib.model.Resturant;



@Transactional
@Component
public class ResturantDao {

@Autowired
SessionFactory sessionFactory;


public void saveResturant(Resturant resturant)
{
Session session= sessionFactory.getCurrentSession();
session.save(resturant);
}

public  ArrayList<Resturant> getResturants()
{
Session session=sessionFactory.getCurrentSession();
ArrayList<Resturant> resturants=(ArrayList<Resturant>) session.createQuery("from Resturant").list();
return resturants;
}


public  Resturant getResturant(int resturantId)
{
Session session=sessionFactory.getCurrentSession();
Resturant resturant=session.get(Resturant.class, resturantId);
return resturant;
}


public  String updateResturant(Resturant resturant)
{
Session session=sessionFactory.getCurrentSession();
session.update(resturant);
return "Resturant Updated";
}

public  String deleteResturant(int resturantId)
{
Session session=sessionFactory.getCurrentSession();
Resturant resturant=getResturant(resturantId);
session.delete(resturant);
return "Resturant Deleted";
}

}