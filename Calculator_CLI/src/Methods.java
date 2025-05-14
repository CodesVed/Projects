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
        double[] nums = new double[n];
        sc.useDelimiter("\\D");

        if (n <= 1){
            System.out.println("Invalid Operation.");
        } else {
            try {
                System.out.print("Enter desired numbers for calculation: ");
                for (int i = 0; i < n; i++) {
                    nums[i] = sc.nextDouble();
                }
            } catch (InputMismatchException ime) {
                System.out.println("error: only numerical inputs are allowed.");
                sc.next();
            }
        }
        return nums;
    }
}
