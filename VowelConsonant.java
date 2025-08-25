import java.util.Scanner;

   public class VowelConsonant {
  
     public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a lower char:" );
     char ch = sc.next().charAt(0);

     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
 
     System.out.println(ch + " it is vowel");


      } else if (ch >= 'a' && ch <= 'z') {
     System.out.println(ch + " it is Consonant");    
       } else {
       System.out.println("invalid input");
    
       }

    }
}
     

      