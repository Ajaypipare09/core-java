import java.util.Scanner;

   public class ArmstrongNumber {

     public static void main(String[] args){

     Scanner sc = new Scanner(System.in);

      System.out.println("Enter n:");
      int n = sc.nextInt();

      
           System.out.println("Armstrong numbers between 1 and " + n + ":");

            for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;

            
            int digits = String.valueOf(num).length();

          
            int temp = num;
            while (temp > 0) {
            int rem = temp % 10;                  
            sum += Math.pow(rem, digits);        
            temp /= 10;                         
            }

            
            if (sum == num) {
            System.out.print(num + " ");
            }
        }

       
    }
}