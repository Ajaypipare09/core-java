import java.util.Scanner;

   public class Largestsmallest {
   
    public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number:");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Number" + n + "are");

    for(int i = 0; i<n; i++){
    arr[i] = sc.nextInt();

   }

       int largest = arr[0];
        int smallest = arr[0];

       for (int i = 1; i < n; i++) {
        if (arr[i] > largest) {
                largest = arr[i];
          }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest number = " + largest);
        System.out.println("Smallest number = " + smallest);

      }
  }

