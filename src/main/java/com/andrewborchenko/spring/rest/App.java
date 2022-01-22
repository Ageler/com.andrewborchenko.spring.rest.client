package com.andrewborchenko.spring.rest;

import com.andrewborchenko.spring.rest.configuration.MyConfig;
import com.andrewborchenko.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
      /* List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);*/

    /*    Employee employeeByID = communication.getEmployee(1);
        System.out.println(employeeByID);*/
        /*Employee emp = new Employee("Sveta", "Sokolova", "IT", 1200);
        emp.setId(7);
        communication.saveEmployee(emp);*/
        communication.deleteEmployee(7);
    }
}
