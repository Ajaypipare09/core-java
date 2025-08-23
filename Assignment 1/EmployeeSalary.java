import java.util.Scanner;

   public class EmployeeSalary{
  
   public static void main(String[] args){

   Scanner sc = new Scanner(System.in);

   System.out.print("Enter Employee ID:");
   int id = sc.nextInt();

   System.out.print("Enter Basic Salary:");
   double basic = sc.nextDouble();

    double hra = 0.10 * basic;
    double da = 0.30 * basic;
    double pt = 0.05 * basic;


  double House = basic + hra + da - pt;

  System.out.println("------Salary slip-----");
  System.out.println("Employee id:" + id);
  System.out.println("Basic Salary:" + basic);
  System.out.println("House rent: " + hra);
  System.out.println("dearness allowance: " + da);
  System.out.println("professional tax:" + pt);
  System.out.println("take home salary: " + House);

  }


}
   