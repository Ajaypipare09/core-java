import java.util.Scanner;
  
  public class  circleOption{

    public static void main(String[] args){
   
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter a radius:");
     double r = sc.nextInt();

     System.out.println("choose a option");
     System.out.println("Area of Circle");
     System.out.println("Circumference of Circle");
     System.out.println(" Volume of Sphere ");

      int choice = sc.nextInt();

     switch(choice) {

       case 1: 
       double area = Math.PI * r * r;
       System.out.println("Area of circle" + area);
       break;
  
       case 2: 
       double circumference = 2 * Math.PI * r;
       System.out.println("circumference of circle" + circumference);
       break;

        case 3: 
       double volume =(4.0 / 3.0) * Math.PI * r * r * r;
       System.out.println("volume of Sphere" + volume);
       break;

       }


    }

}
       
      