package com.example.SpringProject;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//where to search for beans(respective Package---com.example.SpringProject)
@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		
		int[] arr = new int[] {3,0,4,7,6,5,1};
		
		//binary search is loosly coupled and bean is (new QuickSort())
		//BinarySearchIMPL binarysearch = new BinarySearchIMPL(new QuickSort());
		/*
		 * int result = binarysearch.binarySearch(arr, arr.length, 7);
		 * System.out.println("result of springprojectappli " + result);
		 */
		
		//this is bean creation
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringProjectApplication.class, args);
		BinarySearchIMPL bean = applicationContext.getBean(BinarySearchIMPL.class);//this is adding dependencies
		BinarySearchIMPL bean1 = applicationContext.getBean(BinarySearchIMPL.class);//this is adding dependencies
		int result = bean.binarySearch(arr, arr.length, 4);
		System.out.println("result of applicationContext " + result);
	}

}
