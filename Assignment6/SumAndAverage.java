import java.util.Scanner;

    public class SumAndAverage {
 
     public static void main(String[] args) {
 
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter a Number:");
     int n = sc.nextInt();

     int[] arr = new int[n];
     int sum = 0;

     System.out.println("Enter " + n + "Number:");

     for (int i = 0; i<n; i++) {
     arr[i] = sc.nextInt();
     sum+=arr[i];
         
    double avg = (double)sum /n;

    System.out.println("Sum" + sum);
    System.out.println("Averge"+ avg);
       }

    }

}