import java.util.Scanner;

   public class PostiveNegative{
   
    public static void main(String[] args){
 
    Scanner sc = new Scanner(System.in);
   
    System.out.print("Enter a NUmber:");
    int n = sc.nextInt();

    if(n > 0)
    System.out.println("Postive number");
   
    else if (n < 0)
    
    System.out.println("Negative number");

    else
    System.out.println("Number is Zero");

    }


}