//2.Print the sum, difference and product of two complex numbers by creating a
//class, named &#39;Complex&#39; with separate methods for each operation whose real and
//imaginary parts are entered by user. Use Constructors to initialize the data
//members

package Assignment;

public class Q2Complx {

	double real;
	double imaginary;
	public Q2Complx(double real, double imaginary) {
		
		super();
		this.real = real;
		this.imaginary = imaginary;
	}
	public Q2Complx add(Q2Complx num) {
		double real=this.real+num.real;
		double imaginary=this.imaginary+num.imaginary;
		return new Q2Complx(real,imaginary);
		
	}
	public Q2Complx sub(Q2Complx num) {
		double real=this.real-num.real;
		double imaginary=this.imaginary-num.imaginary;
		return new Q2Complx(real,imaginary);
	}
	
	public void display() {
		System.out.println(real+"+"+imaginary+"i");
	}
	public static void main(String []args) {
		Q2Complx c1=new Q2Complx(15,20);
		Q2Complx c2=new Q2Complx(10,30);
		Q2Complx result=c1.add(c2);
		result.display();
	}
	
	
}
