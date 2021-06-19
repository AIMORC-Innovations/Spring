package com.example.SpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//what are beans, beans indicated by @component
@Component
@Scope("prototype")//specifies sort algorithms
public class BinarySearchIMPL {

	//what are dependencies of beans
	@Autowired// @primary has higher priorrity over name of variable... it gives first priority for @primary and the var name.
	@Qualifier("quick")//specifies sort algorithms

	private SortAlgorithm quickSort;//can change dependencies dynamically and give particular names
	
	//without both constructor and setter injection we can execute using only instance var of 
	//SortAlgorithm interface instead of implementing interface
	
	//constructor injection
	/*
	 * public BinarySearchIMPL(SortAlgorithm sortAlgorithm) { super();
	 * this.sortAlgorithm = sortAlgorithm; }
	 */
	//Setter injection
	/*
	 * public static void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
	 * BinarySearchIMPL.sortAlgorithm = sortAlgorithm; }
	 */

//	public static void main(String args[]) {
//		// BubbleSort sort = new BubbleSort();
//		int[] arr = { 2, 4, 0, 9, 1 };
//		// int[] result = sort.sort(arr);
//
//		// sortAlgorithm = new BubbleSort();
//
//		BinarySearchIMPL binarySearchIMPL = new BinarySearchIMPL();
//		int[] result = binarySearchIMPL.sortAlgorithm.sort(arr);
//
//		BubbleSort display = new BubbleSort();
//		display.display(result);
//
//		/*
//		 * BinarySearchIMPL obj = new BinarySearchIMPL(sortAlgorithm); int result1 =
//		 * obj.binarySearch(result, arr.length-1, 4);
//		 */
//
//		// System.out.println("Binary serach element found at index : "+ result1);
//	}
//	
	

	public int binarySearch(int[]arr, int n, int element) {
		
		// sort the array'
		arr = quickSort.sort(arr);
		
		BubbleSort display = new BubbleSort();
		display.display(arr);
		
		
		int l = 0, r = n; 

		while(l<r) {
			
			int mid = (l+r)/2;

			if(arr[mid] == element) {
				return mid;
			}
			else if(element < arr[mid]) {
				r = mid-1;
			}
			else {
				l = mid+1;
			}
		}
 		return -1;
	}

	


}
