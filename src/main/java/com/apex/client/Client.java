package com.apex.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.apex.server.*;

public class Client {
	Calc calc= null;
	public static void main(String[] args){
		Client client= (Client)getBeanFactory().getBean("client");
		client.callOperations();
	}

	public  void callOperations() {
		
		
		int var1=calc.add(4, 2);
		int var2=calc.subtract(4, 2);
		int var3=calc.prod(4, 2);
		int var4=calc.div(4, 2);
		
		System.out.println("The sum is: "+var1);
		System.out.println("The diff is: "+var2);
		System.out.println("The prod is: "+var3);
		System.out.println("The quotient is: "+var4);
	}

	public Calc getCalc() {
		return calc;
	}

	public void setCalc(Calc calc) {
		this.calc = calc;
	}
	
	public static BeanFactory getBeanFactory(){
		Resource resource = new FileSystemResource("beans.xml");
		XmlBeanFactory factory= new XmlBeanFactory(resource);
		return factory;
	}
}
