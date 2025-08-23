import java.util.Scanner;
  public class Cashier{

  public static void main(String[] args){

  
   Scanner sc = new Scanner(System.in);

   System.out.print("Enter Amount to Withdraw: ");
   int amt = sc.nextInt();

   int ten = amt  /  10;
   int rem = amt  %  10;

   int five = rem  /  5;
   rem = rem  %  5;

   int one = rem;

  System.out.println("ten notes:" + ten);
  System.out.println("five notes: " + five);
  System.out.println("one notes: " + one);

    }  

}