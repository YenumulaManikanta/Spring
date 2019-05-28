package com.pawana.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.pawana.model.Department;
import com.pawana.model.Employee;

public class Test {

	public static void main(String[] args) {

		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/pawana/config/AppContext.xml"));
		Department dept=(Department) factory.getBean("dept", Department.class);
		//Department dept1=(Department) factory.getBean("department", Department.class);
		Employee emp=(Employee) factory.getBean("emp", Employee.class);
		System.out.println(dept);
		//System.out.println(dept1);
		System.out.println(emp);
		

	}

}
