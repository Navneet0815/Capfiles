package com.cg.ui;

import java.util.Scanner;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cg.controller.IController;
import com.cg.controller.ProductControl;

public class Client {
	public static void main(String[] args) {
		
		//Resource res = new ClassPathResource("Beans.xml");
		//BeanFactory fac = new XmlBeanFactory(res);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true)
		{
			IController controller =(ProductControl) ctx.getBean("controller");
			System.out.println("\n\n1.Add product\n2.Show all products\n3.Exit: ");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Enter product id, name and price: ");
				controller.addProduct(sc.nextInt(), sc.next(), sc.nextDouble());
				break;
			case 2:
				System.out.println(controller.getProducts());
				break;
			case 3: 
				System.out.println("terminated!!!!!");
				sc.close();
				System.exit(0);
			default: System.out.println("Wrong input!!!!!");
			}
		}
		
		
//		System.out.println("Enter quantity: ");
//		int quantity = sc.nextInt();
//		System.out.println(controller.getTotalProductAmount(quantity));
		
		
		
	}
}
