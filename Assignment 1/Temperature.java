import java.util.Scanner;
  
  public class Temperature{
   public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a Fahrenheit: ");
    double f = sc.nextDouble();
     
    double C = (f - 32) *( 5.0/9.0);
    double K = C + 273.15;

    System.out.println("Celsius:" + C);
    System.out.println("Kelvin: " + K);
 
     }


}