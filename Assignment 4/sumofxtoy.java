import java.util.Scanner;

   public class sumofxtoy{

    public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a x:");
    int x = sc.nextInt();
  
    System.out.println("Enter a y:");
     int y = sc.nextInt();
    int sum = 0;

   for(int i = x; i<=y; i++){
     sum = sum + i;

    System.out.println("sum of" + i + "=" + sum);

    }

  }

} 