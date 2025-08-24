import java.util.Scanner;

    public class BetweenCheck {

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Three number:");

    int first = sc.nextInt();
    int second = sc .nextInt();
    int third = sc.nextInt();

    if((first > second && first < third ) || (first > third && first < second)){
     
    System.out.println(first + "in between " + second + "and" + third);
    } else {
   System.out.println(first + "is not between " + second + "and" + third );

      }


    }

}