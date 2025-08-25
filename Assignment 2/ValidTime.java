import java.util.Scanner;

public class ValidTime {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours (0-23): ");
        int hour = sc.nextInt();

        System.out.print("Enter minutes (0-59): ");
        int minute = sc.nextInt();

        System.out.print("Enter seconds (0-59): ");
        int second = sc.nextInt();

        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
         System.out.println("The time " + hour + " " + minute + " " + second + " is VALID.");
        } else {
         System.out.println("The entered time is INVALID.");
        }

        sc.close();
    }
}
