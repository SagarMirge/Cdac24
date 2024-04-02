package Assignments;

import java.util.Arrays;
public class Array2 {
	
	    public static void main(String[] args) {
	        int[] array = {10, 5, 8, 3, 12, 6}; 
	        
	        System.out.println("Original Array: " + Arrays.toString(array));
	        
	        findSecondMaxMin(array);
	    }
	    
	   
	    public static void findSecondMaxMin(int[] arr) {
	        int n = arr.length;
	        
	        if (n < 2) {
	            System.out.println("Array size must be at least 2");
	            return;
	        }
	        
	        Arrays.sort(arr);
	        
	        int secondMin = arr[1];
	        int secondMax = arr[n - 2];
	        
	        System.out.println("Second Minimum Element: " + secondMin);
	        System.out.println("Second Maximum Element: " + secondMax);
	    }
	}


