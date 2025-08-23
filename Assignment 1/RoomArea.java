import java.util.Scanner;

   public class RoomArea{

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Length of room:");
    double l = sc.nextDouble();

    System.out.println("Enter breath of room:");
    double b = sc.nextDouble();

    System.out.println("Enter height of room:");
    double h = sc.nextDouble();

    System.out.println("Enter Length of door:");
     double ld = sc.nextDouble();

    System.out.println("Enter breath of door:");
    double bd = sc.nextDouble();

    System.out.println("Enter Length of window:");
    double lw = sc.nextDouble();

    System.out.println("Enter breath of window:");
     double bw = sc.nextDouble();

    double totalwallarea = 2 * (l * h + b * h);

    double doorarea = ld * bd;																									

     double Windowarea = lw * bw;

    double paintarea = totalwallarea - doorarea - (2 * Windowarea);

    double roofarea = l * b;


    System.out.println("Area to be painted (walls):" + paintarea);
 
   System.out.print("Area to be whitewashed (roof):  " + roofarea);

     }

  }