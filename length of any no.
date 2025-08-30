import java.util.Scanner;

public class NumberLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        long n = sc.nextLong();  // using long to handle big numbers

        // Handle negative numbers by converting to positive
        n = Math.abs(n);

        // Special case: if number is 0, length = 1
        if (n == 0) {
            System.out.println("Length of number: 1");
        } else {
            int length = 0;
            while (n > 0) {
                n = n / 10;   // remove last digit
                length++;
            }
            System.out.println("Length of number: " + length);
        }

        sc.close();
    }
}
