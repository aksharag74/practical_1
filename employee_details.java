package assingment3;
import java.util.Scanner;

class employee_details {
	String emp_name;
	int emp_id;
	String emp_add;
	String emp_emailid;
	long emp_mobileno;
	float basicpay;
	
	class programmer extends employee_details {
		Scanner sc = new Scanner(System.in);
		void basicpay() {
			System.out.println("Pay slip of programmer is:");
			float basicpay = 60000;
			System.out.println("Basicpay of programmer is"+basicpay);
						
		}
	}
	
    class teamlead extends employee_details {
    
    	Scanner sc = new Scanner(System.in);
    	void basicpay() {
    		System.out.println("Pay slip of teamlead is:");
			float basicpay = 50000;
			System.out.println("Basicpay of teamlead is"+basicpay);			
		}
	}
    
    class ass_project_manager extends employee_details{
    	
    	Scanner sc = new Scanner(System.in);
    	void basicpay() {
    		System.out.println("Pay slip of ass_project_manager  is:");
			float basicpay = 50000;
			System.out.println("Basicpay of ass_project_manager is"+basicpay);			
		}
	}
    
    class project_manager extends employee_details{
    	
    	Scanner sc = new Scanner(System.in);
    	void basicpay() {
    		System.out.println("Pay slip of project_manager  is:");
			float basicpay = 80000;
			System.out.println("Basicpay of project_manager is"+basicpay);
    			
		}
	}
	
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("enter name of the employee:");
			String emp_name = sc.nextLine();
			
			System.out.println("enter id of the employee:");
			int emp_id= sc.nextInt();
			
			sc.nextLine();
			System.out.println("enter address of the employee:");
			String emp_add = sc.nextLine();
			
			System.out.println("enter emailid of the employee:");
			String emp_emailid = sc.nextLine();
			
			System.out.println("enter mobile no of the employee:");
			long emp_mobileno = sc.nextLong();
			
		
		
			System.out.println("--------displaying details of the employee---------");
			System.out.println("Name of the employee is: "+emp_name);
			System.out.println("Id of employee is: "+emp_id);
			System.out.println("Address of employee is: "+emp_add);
			System.out.println("Email ID of employee is: "+emp_emailid);
			System.out.println("Mobie No of the employee is: "+emp_mobileno);
		
			float DA;
			float HRA;
			float PF;
			float SCF;
			float basicpay=300000;
			
			DA = 0.97f * basicpay;
			HRA = 0.10f * basicpay;
			PF = 0.12f * basicpay;
			SCF = 0.01f * basicpay;
			
			
			
	}
	}
			
	
	


