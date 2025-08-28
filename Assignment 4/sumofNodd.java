import java.util.Scanner; 

public class sumofodd {

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
  System.out.println("Enter a Number:");
  int n = sc.nextInt();
   int sum = 0;

   for(int i = 1; i<n; i+=2){
    sum = sum + i;

   System.out.println("sumnumber:"+ i + "=" + sum);
     }

   }

}