import java.util.Scanner;

   public class RightanglePattern {

    public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
  
    System.out.println("Enter a number");
    int n = sc.nextInt();

    for(int i = 1; i<=n; i++){

    for(int j = n; j>=n -i+1; j--){
      System.out.print(j);
   }

    System.out.println();

      }

    }
 }
 