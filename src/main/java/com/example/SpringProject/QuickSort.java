package com.example.SpringProject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component//specifies bean
@Qualifier("quick")//specifies sort algorithms
public class QuickSort implements SortAlgorithm {
	
	public int[] sort(int arr[]) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String args[]) {
		QuickSort obj1 = new QuickSort();
		int[] arr = { 6, 2, 3, 9, 10 };
		int[] result = obj1.sort(arr);

		obj1.display(result);
	}

	public void display(int arr[]) {
		System.out.print(" Sorted array...");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+ arr[i]);
		}
	}


}
