package com.arich.SpringAutowirePro1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arich.SpringAutowirePro1.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext cont=new ClassPathXmlApplicationContext("application.xml");
        Employee emp=cont.getBean("info",Employee.class);
        System.out.println("Employee information\n.......................");
        System.out.println("Employee ID :"+emp.getEmpid());
        System.out.println("Employee name :"+emp.getEmpname());
        System.out.println("Basic salary :"+emp.getBasic());
        System.out.println("Flat no. :"+emp.getAddress().getFlatno());
        System.out.println("Colony :"+emp.getAddress().getColony());
        System.out.println("City :"+emp.getAddress().getCity());
    }
}
