import java.util.Scanner;

public class  Libaryfine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days late: ");
        int days = sc.nextInt();
        int fine = 0;

        if (days <= 5) {
            fine = days * 1;   
        } else if (days <= 10) {
            fine = days * 2;   
        } else {
            fine = days * 5;  
        }

        System.out.println("Fine to be paid: Rs. " + fine);
    }
}
