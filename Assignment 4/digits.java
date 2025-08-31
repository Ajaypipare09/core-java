import java.util.Scanner;
  
   public class digits { 

   public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
  
    String str = Integer.toString(num);
  
     System.out.println("Digit are :");
      for(int i = 0; i < str.length(); i++) {
       
       System.out.println(str.charAt(i));

       }

    }
}