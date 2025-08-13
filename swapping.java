import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter first positive integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second positive integer: ");
        int b = sc.nextInt();

       
        System.out.println("\nOriginal values:");
        System.out.println("a = " + a + ", b = " + b);

        
        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter swapping (using 3rd variable):");
        System.out.println("a = " + a + ", b = " + b);

       
        System.out.print("\nEnter first positive integer again: ");
        a = sc.nextInt();
        System.out.print("Enter second positive integer again: ");
        b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nAfter swapping (without 3rd variable):");
        System.out.println("a = " + a + ", b
