import java.util.Scanner;

     public class ProfitLoss{
     
     public static void main(String[] args){

     Scanner sc = new Scanner(System.in);

     System.out.println("Enter cost Price:");
     double cp = sc.nextDouble();

     System.out.println("Enter Selling Price :");
     double sp = sc.nextDouble();

     if (sp > cp){
     double profit = sp - cp;
     System.out.println("profit" + profit);

      } else if (cp > sp) {
       double loss = cp - sp;
      System.out.println("loss "  + loss);
      } else {
     
     System.out.println("no profit ,no loss ");
       }


   }


}