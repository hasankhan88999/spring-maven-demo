package com.capg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capg.beans.Student;
import com.capg.configuration.MyConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Student student = (Student)context.getBean("student");
		
		student.displayStudentInfo();
    }
}
