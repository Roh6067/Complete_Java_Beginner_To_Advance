import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        
        // for (int i = 2; i <= 10; i+=2) {
        //     System.out.println(i);
        // }

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a n no:");
        int val = s.nextInt();

        int sum = 0;
        
        for (int count = 1; count <= val; count++) {
            sum = sum + count;
        }
            System.out.println("The sum of no from 1 to " + val + " is: " + sum);
            s.close();
    }
}
