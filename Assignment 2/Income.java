import java.util.Scanner;

  public class Income {
  public static void main(String[] args){
  
  Scanner sc = new Scanner(System.in);

 System.out.println("Enter a Salary:");
  double salary =sc.nextDouble();

 double tax;

    if (salary < 150000) {
            tax = 0;
        } else if (salary <= 300000) {
            tax = 0.20 * salary;
        } else {
            tax = 0.30 * salary;
        }

        System.out.println("Annual Salary: " + salary);
        System.out.println("Income Tax: " + tax);

        
    }
}
  
 
   
   