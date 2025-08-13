import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        
        if (a == 0) {
            System.out.println("This is not a quadratic equation (a cannot be zero).");
        } else {
            
            double discriminant = b * b - 4 * a * c;

           
            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Two real and distinct roots:");
                System.out.println("Root 1 = " + root1);
                System.out.println("Root 2 = " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("Two real and equal roots:");
                System.out.println("Root = " + root);
            } else {
                System.out.println("No real solu
