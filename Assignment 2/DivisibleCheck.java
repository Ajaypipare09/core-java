import java.util.Scanner;

   public class DivisibleCheck{
    
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
   
     System.out.println("Enter a Number:");
     int num = sc.nextInt();

     if(num % 5 == 0 && num % 7 == 0){
    
       System.out.println(num + "the divisible by both 5 and 7");
        } else {
      
       System.out.println(num + "is not divisible by both");

       }
  
      if (num % 5 == 0) {
      if(num % 7 == 0) {
      System.out.println(num + "is divisible by both");
      } else {

        System.out.println(num +  "is divisible by 5 but not 7 ");
            } 

         } else {
           System.out.println(num + " is not divisible by");
          }
     }

}
   

 
  
     