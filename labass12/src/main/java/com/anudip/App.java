package com.anudip;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ap=new ClassPathXmlApplicationContext("config.xml");
        Agentdao dao=(Agentdao)ap.getBean("x");
        System.out.println( "Hello World!" );
        
        System.out.println(dao.saveAgent(new Agent(5,"Radhika",9000)));
    	//System.out.println(dao.saveAgent(new Agent(2,"shree",5000)));
    	//System.out.println(dao.saveAgent(new Agent(3,"Priya",2000)));
    	//System.out.println(dao.saveAgent(new Agent(4,"riya",10000)));
    	
    	
    	//System.out.println(dao.updateAgent(new Agent(1,"om",5000)));
    	
    	//System.out.println(dao.deleteAgent(new Agent(3)));
        
    }
}
