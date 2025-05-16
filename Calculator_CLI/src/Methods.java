import java.util.InputMismatchException;
import java.util.Scanner;

public class Methods {
    private static final Scanner sc = new Scanner(System.in);

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

    public static double[] inputArray(int n){
        double[] arr = new double[n];

        sc.useDelimiter("\\D");

        try {
            System.out.print("Enter numbers for calculation: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextDouble();
            }
        } catch (Exception e){
            System.out.println("Error!");
        }

        return arr;
    }

    public static void pause(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("error: process interrupted!");
        }
    }

    public static void animatedDots(String s){
        System.out.print(s);
        System.out.flush();

        for (int i = 0; i < 3; i++) {
            pause(500);
            System.out.print(".");
            System.out.flush();        // flush to show immediately
        }

        System.out.println();
    }

}
