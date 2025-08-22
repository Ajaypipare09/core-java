import java.util.Scanner;

  public class CylinderCalculation{
    public static void main(String[] args){
      double r,h ,surfacearea,volume;

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter Radius :");
      r = sc.nextDouble();

      System.out.print("Enter Height :");
      h = sc.nextDouble();

     surfacearea = 2 * Math.PI * r * r + 2 * Math.PI * r * h;
     volume = Math.PI * r * r *h;


     System.out.println("surfacearea:" + surfacearea);
     System.out.println("volume:" + volume);

        }

  }



