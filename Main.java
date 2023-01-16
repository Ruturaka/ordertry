package com.confluxsys.demo;


import com.confluxsys.demo.model.Orders;
import com.confluxsys.demo.spring.config.AppConfig;
import com.confluxsys.demo.spring.dao.OrderDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to happy hours");
        SpringApplication.run(Main.class, args);


        /*
        System.out.println("Welcome to happy hours");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderDao orderDao = context.getBean(OrderDao.class);

        System.out.println("List of orders is:");

        for (Orders p : orderDao.getAllOrders()) {
            System.out.println("hello, Ru");
            System.out.println(p);
        }
/*
        System.out.println("\nGet person with ID 1");

        Person personById = personDAO.getPersonById(2);
        System.out.println(personById);

        System.out.println("\nCreating person: ");
        Person person = new Person(4, 36, "Sarphera", "Emets");
        System.out.println(person);
        personDAO.createPerson(person);
        System.out.println("\nList of person is:");

        for (Person p : personDAO.getAllPersons()) {
            System.out.println(p);
        }

        System.out.println("\nDeleting person with ID 2");
        personDAO.deletePerson(personById);

        System.out.println("\nUpdate person with ID 4");

        Person pperson = personDAO.getPersonById(4);
        pperson.setLastName("CHANGED");
        personDAO.updatePerson(pperson);

        System.out.println("\nList of person is:");
        for (Person p : personDAO.getAllPersons()) {
            System.out.println(p);
        }
        System.out.println("Done");
        context.close();
    }*/
    }
}