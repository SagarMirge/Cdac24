package Assignments;

public class NoPyramid {
               
	public static void main(String[] args)  
	{  
	for (int i = 0; i <= 8; i++)   
	{  
	int number =1;   
	for (int j = 8; j > i; j--)  
	{  
	System.out.print(" ");  
	}  
	for (int k = 0; k <= i; k++)  
	{  
	System.out.print((int) (number + k) + " ");  
	}  
	System.out.println();  
	}  
	}  
	} 

