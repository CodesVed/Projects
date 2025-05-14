import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Supplier;

public class Calculation {
    private static final Scanner sc = new Scanner(System.in);

    public static void addition(int n){
        double[] addNum = Methods.inputArray(n);
        double sum = 0;

        for (int i = 0; i < addNum.length; i++) {
            sum += addNum[i];
        }

        if (sum != 0){
            System.out.println("Result: " + sum);
        }
    }
}
