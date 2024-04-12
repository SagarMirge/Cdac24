//Write a program by creating an ;Employee; class having the following methods
//and print the final salary.
//a. ;getInfo(); which takes the salary, number of hours of work per day of
//employee as parameter
//b. ;AddSal(); which adds $10 to salary of the employee if it is less
//than $500.
//c. ;AddWork(); which adds $5 to salary of employee if the number of hours of
//work per day is more than 6 hours.

package Assignment;

public class Employee {
	
		public double salary;
		public double hr;

		public void getInfo(double salary,double hr) {
			this.salary=salary;
			this.hr=hr;
		}
		
		public void AddSal() {
			if(salary<500) {
				salary+=10;
			}
		}
		public void AddWork() {
			if(hr>6) {
				salary+=5;
			}
		}
		public void display() {
			System.out.println("Emplyee Salary :\t"+salary);
			System.out.println("Employee Working Hrs :\t"+hr);
		}

		public static void main(String[] args) {
	        Employee e=new Employee();
	        e.getInfo(600, 8);
	        e.AddSal();
	        e.AddWork();
	        e.display();
		}
		

	}
	

