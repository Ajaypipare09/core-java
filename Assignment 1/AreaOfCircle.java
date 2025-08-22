import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        double r, area; 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        r = sc.nextDouble();

        area = Math.PI * r * r;

        System.out.println("Area of Circle is: " + area);
    }
}
