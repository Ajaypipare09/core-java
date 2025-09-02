import java.util.Scanner;

  public class Multiplicationtable {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a n ");
    int n = sc.nextInt();

    for(int i = 1; i<=n; i++){
    System.out.println("Table" + i + ":");
  
   for(int j = 1; j<=10; j++) {

   System.out.println( i + "x" + j  + "=" +(i*j));
    
   } 
    System.out.println();

    
   }
 
  }

}