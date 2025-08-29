import java.util.Scanner;
 
   public class prime {
    public static void main(String[] args){
    
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number:");
   int n = sc.nextInt();
    
  int cnt = 0; 
  for(int i = 1 ; i<=n; i++){
   if(n%i == 0){
    cnt++;
     }
  }
  if(cnt == 2)
  System.out.println( n + "prime number");
  else
  System.out.println(n + "not prime number");

   }

}