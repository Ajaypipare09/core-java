import java.util.Scanner;
 
  public class ArithmeticHarmonic{

   public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
   
    System.out.print("Enter a  First Number:");
    double a = sc.nextDouble();
   
    System.out.print("Enter a Second Number:");
    double b = sc.nextDouble();
  
    double am = (a+b)/2;

    double hm = (a*b)/(a+b);

    System.out.println("arithmetic :" + am);
    System.out.println(" harmonic :" + hm);

      }

 }