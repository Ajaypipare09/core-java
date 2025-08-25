import java.util.Scanner;

public class Pointxy {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in Quadrant I");
        } else if (x < 0 && y > 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in Quadrant II");
        } else if (x < 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in Quadrant III");
        } else if (x > 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in Quadrant IV");
        } else if (x == 0 && y == 0) {
            System.out.println("The point (" + x + ", " + y + ") lies at the Origin");
        } else if (x == 0) {
            System.out.println("The point (" + x + ", " + y + ") lies on the Y-axis");
        } else {
            System.out.println("The point (" + x + ", " + y + ") lies on the X-axis");
        }

        sc.close();
    }
}
