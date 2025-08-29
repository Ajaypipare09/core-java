import java.util.Scanner;

   public class sumofcountfacotor {
   
    public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter a number :");
    int n = sc.nextInt();
  
    int count = 0;
    int sum = 0;
  for(int i = 1; i<= n; i++){

     if (n % i == 0) {
     System.out.println(i + " ");
     count++;
     sum=sum+i;
  }

}

System.out.println("Number of factor" + count);
System.out.println("sumof " + sum);
  }

}
