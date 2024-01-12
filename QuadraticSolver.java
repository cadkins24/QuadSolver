import java.util.*;
public class QuadraticSolver{
    public static void main(String[] args) {
        System.out.println("Welcome to Quadratic Solver.");
        System.out.println("enter an a value: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        System.out.println("enter a b value: ");
        double b = input.nextDouble();
        System.out.println("enter a c value: ");
        double c = input.nextDouble();

        double descriminant = ((b*b) - (4*a*c));
        System.out.println(descriminant);
        if(descriminant > 0) {
        double xValue1 = (-b + Math.sqrt(descriminant)) / (2*a);
        double xValue2 = (-b - Math.sqrt(descriminant)) / (2*a);
        System.out.println("Your answers are: (" + xValue1 + ", " + xValue2 + ")");
        } if(descriminant == 0) {
            double xValue3 = (-b / (2*a));
            System.out.println(xValue3);
        } else {
            System.out.println("no");
        }
     }
}