import java.util.Scanner;
public class Armstrong {

   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
          
     System.out.println("enter a number ");
     int n = sc.nextInt();
     int temp,cnt=0,result = 0;

     temp=n; 

     while (n>0)
     {
          cnt++;
          n=n/10;
     }
     n=temp; 
     while (n>0)
     {
          int rem = n % 10;
          result = result + (int)Math.pow(rem,cnt);
          n = n /10;
     }
     if(result == temp)
     
    System.out.println("Amstrong number");

     else
     
     System.out.println("not amstrong number");
     
     
   } 
}