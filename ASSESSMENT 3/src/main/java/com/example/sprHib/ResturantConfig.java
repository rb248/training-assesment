package com.example.sprHib;



import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@Configuration
public class ResturantConfig {

@Autowired
EntityManagerFactory entityManagerFactory;

@Bean
public SessionFactory getSessionFactory()
{
return entityManagerFactory.unwrap(SessionFactory.class);
}

}