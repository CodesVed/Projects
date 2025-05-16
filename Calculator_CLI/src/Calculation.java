import java.util.Scanner;

public class Calculation {
    private static final Scanner sc = new Scanner(System.in);

    public static void add() throws InterruptedException {
        System.out.print("Enter count of numbers: ");
        int count = sc.nextInt();
        double[] nums = Methods.inputArray(count);

        double sum = 0;
        Methods.animatedDots("\nAdding");
        Thread.sleep(500);
        for (int i=0; i<count; i++){
            sum += nums[i];
        }

        System.out.printf("Result: %.2f%n", sum);
        Thread.sleep(500);
    }

    public static void subtract(double a, double b){
        double result = a-b;
        Methods.animatedDots("\nSubtracting");
        System.out.printf("Result: %.2f%n", result);
        Methods.pause(500);
    }

    public static void multiply(double a, double b){
        double result = a*b;
        Methods.animatedDots("\nMultiplying");
        System.out.printf("Result: %.2f%n", result);
        Methods.pause(500);
    }

    public static void divide(double a, double b){
        double result = a/b;
        Methods.animatedDots("\nDividing");
        System.out.printf("Result: %.2f%n", result);
        Methods.pause(500);
    }
}
