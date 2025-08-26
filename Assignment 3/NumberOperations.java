import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x = sc.nextInt();

        System.out.print("Enter value of y: ");
        int y = sc.nextInt();

        System.out.println("Choose an option:");
        System.out.println("1: Equality");
        System.out.println("2: Less Than");
        System.out.println("3: Quotient and Remainder");
        System.out.println("4: Range");
        System.out.println("5: Swap");

            int choice = sc.nextInt();

            switch (choice) {
            case 1:
                if (x == y) {
                    System.out.println("x is equal to y");
                } else {
                    System.out.println("x is not equal to y");
                }
                break;
               case 2:
                if (x < y) {
                    System.out.println("x is less than y");
                } else {
                    System.out.println("x is not less than y");
                }
                break;
                case 3:
                if (y != 0) {
                    System.out.println("Quotient = " + (x / y));
                    System.out.println("Remainder = " + (x % y));
                } else {
                    System.out.println("Error: Division by zero not allowed!");
                }
                break;
                case 4:
                System.out.print("Enter a number to check range: ");
                int num = sc.nextInt();
                if (num >= x && num <= y) {
                    System.out.println(num + " lies between " + x + " and " + y);
                } else {
                    System.out.println(num + " does not lie between " + x + " and " + y);
                }
                break;
                case 5:
                System.out.println("Before Swap: x = " + x + ", y = " + y);
                int temp = x;
                x = y;
                y = temp;
                System.out.println("After Swap: x = " + x + ", y = " + y);
                break;

            
        }

     }
}
