import java.util.Scanner;

   public class calculate {
   
     public static void main(String[] args){
  
     Scanner sc = new Scanner(System.in);

      System.out.println("Enter a num1 :");
      int num1 = sc.nextInt();
  
      System.out.println("Enter a num2 : ");
      int num2 = sc.nextInt();

      System.out.println("Enter a opertor (+,-,*,/)");
      char op  = sc.next().charAt(0);
      int result;

      switch(op) {

        case '+':
        result = num1 + num2;
        System.out.println("Result:" + result);
         break;
   
         case '-':
        result = num1 - num2;
        System.out.println("Result:" + result);
          break;

         case '*':
        result = num1 * num2;
        System.out.println("Result:" + result);
          break;

         case '/':
        result = num1 / num2;
        System.out.println("Result:" + result);
          break;

       }


   }

}