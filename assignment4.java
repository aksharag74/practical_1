package area;
import java.util.Scanner;

abstract class shape {
    double length;
    double breadth;
    double triarea;
    double rectarea;
    
	    void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenght :");
	    length = sc.nextDouble();
        System.out.println("Enter breadth :");
        breadth = sc.nextDouble();
	    }
        abstract void compute_area();
}

    class triangle extends shape{
	void compute_area() {
	    triarea=0.5*length*breadth;
}
	public void display()  {
		System.out.println("Length :"+length);
	      System.out.println("Breadth :"+breadth);
          System.out.println("Area of triangle :"+triarea);

		}
    }
	 class rectangle extends shape{
        void compute_area() {
        	rectarea=length*breadth;
        }
	public void display() {
		System.out.println("Length :"+length);
	    System.out.println("Breadth :"+breadth);
	    System.out.println("Area of rectangle :"+rectarea);
         }
	 }
public class assignment4 {

	public static void main(String[] args) {
		System.out.println("select the following option");
		System.out.println("1.Area of triangle\n2.Area of rectangle");
	    Scanner sr = new Scanner(System.in);
	    int option=sr.nextInt();
	    switch(option) {
	    case 1:
		triangle T = new triangle();
		T.accept();
		T.compute_area();
		T.display();
		break;
		
	    case 2 :
		rectangle R = new rectangle();
		R.accept();
		R.compute_area();
		R.display();
		break;
	    }
	}
}