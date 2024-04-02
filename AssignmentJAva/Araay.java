package Assignments;

import java.util.Arrays;
public class Araay {

	
	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5}; 
	        
	        System.out.println("Original Array: " + Arrays.toString(array));
	        
	        Araay(array);
	        
	        System.out.println("Reversed Array: " + Arrays.toString(array));
	    }
	    
	   
	    public static void Araay(int[] arr) {
	        int start = 0;
	        int end = arr.length - 1;
	        
	        while (start < end) {
	           
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }
}
	    
	


