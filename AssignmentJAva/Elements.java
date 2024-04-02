package Assignments;

	import java.util.Scanner;

	public class Elements {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();
	      
	        int[] array = new int[size];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }
	        scanner.close();
	        int max = array[0];
	        for (int i = 1; i < size; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }
	   
	        int sum = 0;
	        for (int num : array) {
	            sum += num;
	        }
	        
	        double average = (double) sum / size;
	        
	        System.out.println("Maximum Element: " + max);
	        System.out.println("Average of Elements: " + average);
	    }
	}
