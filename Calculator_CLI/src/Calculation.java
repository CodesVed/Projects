import java.lang.reflect.Method;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Supplier;

public class Calculation {
    private static final Scanner sc = new Scanner(System.in);

    public static void addition() throws InterruptedException {
        System.out.print("Enter count of numbers: ");
        int count = sc.nextInt();
        double[] nums = Methods.inputArray(count);

        double sum = 0;
        Methods.animatedDots("Adding");
        Thread.sleep(500);
        for (int i=0; i<count; i++){
            sum += nums[i];
        }

        System.out.println("Result: " + sum);
    }

    public static void subtract(double a, double b){
        double result = a-b;
        System.out.println("Result: " + result);
    }
}
