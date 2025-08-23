import java.util.Scanner;
 
  public class PreviousNextChar{

  public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  
  System.out.print("Enter a Charater:");
  char ch = sc.next().charAt(0);

  char prev = (char) (ch-1);

  char next = (char) (ch+1);

  System.out.println("Previous Charater:" + prev);
  System.out.println("Next Charater :" + next);

    } 

}