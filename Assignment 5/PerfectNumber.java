import java.util.Scanner;

   public class PerfectNumber {

   public static void main(String[] args){

   Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Number:");
    int n = sc.nextInt();

     System.out.println("Perfect numbers between 1 and " + n +":");

      for (int i = 1; i<= n; i++) {

        int sum = 0;
           
       for (int j = 1; j <=i /2; j++) {

          if (i % j == 0) {
            sum +=j;


         }

      }
      if (sum == i) {
            System.out.print(i + " ");

        }
      }

    }

  }