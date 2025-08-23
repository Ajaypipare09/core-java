import java.util.Scanner;
  
   public class  cuboid{
   
   public static void main(String[] args){
   
   Scanner sc = new Scanner(System.in);
   
   System.out.print("Enter a Length:");
   double l = sc.nextDouble();
   
   System.out.print("Enter a Breadth:");
   double b = sc.nextDouble();

   System.out.print("Enter a Height:");
   double h = sc.nextDouble();
 
     double surfacearea=2*(l*b + l*h + b*h);

     double volume = l*b*h;
                                                                                                                                                                                
     System.out.println("surfacearea:" + surfacearea);
     System.out.println("Volume: " + volume);


      }


 }

  
  
  
   