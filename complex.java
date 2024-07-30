package complexno;
import java.util.Scanner;
public class complex {
	int real1;
	int real2;
	int img1;
	int img2;
	complex()
	{
		System.out.println("Addition of two complex num:");
	}
	complex(int r1,int r2,int i1,int i2)
	{
		this.real1=r1;
		this.real2=r2;
		this.img1=i1;
		this.img2=i2;
	}
     void accept()
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter real part 1:");
    	 this.real1=sc.nextInt();
    	 System.out.println("Enter real part 2:");
    	 this.real2=sc.nextInt();
    	 System.out.println("Enter img part 1:");
    	 this.img1=sc.nextInt();
    	 System.out.println("Enter img part 2:");
    	 this.img2=sc.nextInt();
     }
     void display()
     {
    	 int sum_r=this.real1+this.real2;
    	 System.out.println("sum of two complex no is:"+(sum_r)+"+"+(this.img1+this.img2)+"i");
    	 int sub_r=this.real1-this.real2;
    	 System.out.println("substraction of two complex no is:"+(sub_r)+"-"+(this.img1-this.img2)+"i");
    	 int mul_r=this.real1*this.real2;
         System.out.println("multiplication of two complex no is:"+(mul_r)+"+"+(this.img1*this.img2)+"i");
         int div_r=this.real1/this.real2;
         System.out.println("Division of two complex no is:"+(div_r)+"+"+(this.img1/this.img2)+"i");

     }
	public static void main(String[] args) {
		complex c = new complex();
		c.accept();
		c.display();		
	}

}

/*
// Output:

Addition of two complex num:
Enter real part 1:
6
Enter real part 2:
3
Enter img part 1:
4
Enter img part 2:
2
sum of two complex no is:9+6i
substraction of two complex no is:3-2i
multiplication of two complex no is:18+8i
Division of two complex no is:2+2i
*/