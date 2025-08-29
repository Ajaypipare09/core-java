import java.util.Scanner;
 
   public class sumofFactor{
  
   public static void main(String[] args){
  
   Scanner sc = new Scanner(System.in);
 
   System.out.println("Enter a Number:");
   int n = sc.nextInt();

System.out.println("factor " + n );

int sum=0;
for(int i = 1; i<=n; i++){

  if(n % i == 0){
  sum = sum+i;
  
  System.out.println("sum of " + i + "=" + sum);
      }
    }

  }
}