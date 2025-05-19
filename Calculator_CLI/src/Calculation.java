import java.lang.reflect.Method;
import java.math.BigInteger;
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

        sc.close();
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

    public static void exponent(double base, double power){
        double result = 1;

        Methods.animatedDots("\nCalculating");
        for (int i=0; i<power; i++){
            result *= base;
        }

        System.out.printf("%.2f raised to the power %.2f is: %.2f%n", base,power,result);
        Methods.pause(500);
    }

    public static void percentOf(double percent, double value){
        Methods.animatedDots("\nCalculating");
        double result = (percent/100)*value;

        System.out.printf("%.2f%% of %.2f is %.2f%n", percent,value,result);
        Methods.pause(500);
    }

    public static BigInteger factorial(int n){
        if (n==0){
            return BigInteger.ONE;
        }

        return BigInteger.valueOf(n).multiply(factorial(n-1));
    }
}
