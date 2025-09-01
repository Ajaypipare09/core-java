import java.util.Scanner;

public class  PatternNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {           
            for (int j = 1; j <= n; j++) {       
                int val = n - Math.min(i, j) + 1;
                System.out.print(val);
            }
            System.out.println();
        }

        
    }
}