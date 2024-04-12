//Write a program to print the area and perimeter of a triangle having sides of
//3, 4 and 5 units by creating a class named &#39;Triangle&#39; with parameter in its
//constructor.

package Assignment;

public class Traingle {

	private int a;
	private int b;
	private int c;
	
	public Traingle(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	void  getArea() {
		System.out.println(a*b*c); 
	}
	void getPeri() {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
          Traingle tr=new Traingle(5,10,15);
          System.out.println("Area of traingle is");
          tr.getArea();
          System.out.println("Perimeter of traingle is");
          tr.getPeri();
		
	}

}
