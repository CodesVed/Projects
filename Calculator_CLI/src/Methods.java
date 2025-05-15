import java.util.InputMismatchException;
import java.util.Scanner;

public class Methods {
    private static final Scanner sc = new Scanner(System.in);

    // incorrect input exception handler
    public static int getValidInput(String prompt, Scanner sc){
        int input;
        try {
            System.out.print(prompt);
            input = sc.nextInt();
            return input;
        } catch (InputMismatchException ime){
            System.out.println("error: only numerical inputs are allowed.");
            sc.next();
            return -1;
        }
    }

    // method make an array of numbers
    public static double[] inputArray(int n){
        double[] arr = new double[n];

        sc.useDelimiter("\\D");

        System.out.print("Enter numbers for calculation: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        return arr;
    }

    public static void animatedDots(String s) throws InterruptedException {
        System.out.print(s);
        System.out.flush();

        for (int i = 0; i < 3; i++) {
            Thread.sleep(500);         // wait 200 milliseconds
            System.out.print(".");     // print a dot
            System.out.flush();        // flush to show immediately
        }

        System.out.println(); // move to next line after all dots
    }

}
