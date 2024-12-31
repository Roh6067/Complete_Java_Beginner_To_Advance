
import java.util.Scanner;

public class factorial {

    public static int fact(int n) {
        int p = 1; // intial value 1
        
        for (int i = 1; i <= n; i++) {
            p *= i;
        }
        return p;
    }

    public static void main(String[] args) {
        System.out.print("Enter a n Factorial: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int result = fact(a);
        System.out.println("Factorial of " + a + " is: " + result);

    }
}
