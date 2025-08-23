import java.util.Scanner;

  public class AsciiValue{
  
  public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a charater:");

   int ch = sc.next().charAt(0);

    int ascii = (int) ch;

    System.out.println("the Ascii value of '" + ch + "' is: " + ascii);

    }

}