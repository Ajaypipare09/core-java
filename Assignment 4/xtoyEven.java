import java.util.Scanner;

   public class xtoyEven{

    public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a x:");
    int x = sc.nextInt();
  
    System.out.println("Enter a y:");
     int y = sc.nextInt();

    if (x % 2 != 0) {
            x++;
        }

   for(int i = x; i<=y; i+=2){

    System.out.println(i);

    }

  }

} 