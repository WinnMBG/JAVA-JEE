package com.hitema;

import com.hitema.entities.Country;
import org.hibernate.Session;
import java.util.List;

import com.hitema.util.HibernateUtil;

public class HibernateMain {


    public static void main(String[] args) {
        //Employee emp = new Employee();
        //emp.setName("Pankaj");
        //emp.setRole("CEO");
        //emp.setInsertTime(new Date());

        //Get Session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //start transaction
        //session.beginTransaction();
        //Save the Model object
        System.out.println("<<<<<<<Connect to db with Hibernate>>>>>>>");
        System.out.println("<<<<<<<Getting countries>>>>>>>");
        List <Country> countries = session.createQuery("from Country", Country.class).list();
        for (Country country : countries) {
            System.out.println(country.toString());
            System.out.println("\n");
        }

        //terminate session factory, otherwise program won't end
        HibernateUtil.getSessionFactory().close();
    }

}