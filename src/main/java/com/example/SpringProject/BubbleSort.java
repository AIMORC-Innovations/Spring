package com.example.SpringProject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
/*
 * @Primary// executes first bean
 */
@Qualifier("bubble")//specifies sort algorithms
public class BubbleSort implements SortAlgorithm{

	public int[] sort(int arr[]) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}System.out.println("Sorted array");
		return arr;
	}

	public static void main(String args[]) {
		BubbleSort obj1 = new BubbleSort();
		int[] arr = { 1, 3, 5, 6, 2 };
		int[] result = obj1.sort(arr);

		obj1.display(result);
	}

	public void display(int[] result) {
		System.out.println(" Sorted array...");
		for (int i = 0; i < result.length; i++) {
			System.out.println(" "+ result[i]);
		}
	}

}
