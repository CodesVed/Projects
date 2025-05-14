import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorUI_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Just Calculator =====");

        int choice = 0;
        do{
            System.out.println("""
                    \nAvailable Functions:
                    1. Addition
                    2. Subtraction
                    3. Multiplication
                    4. Division
                    5. Exit""");

            choice = Methods.getValidInput("\nChoose an option: ", sc);

            switch (choice) {
                case 1:
                    int size = Methods.getValidInput("\nEnter total no. to be added: ", sc);
                    if (size == -1){
                        break;
                    }
                    Calculation.addition(size);
                    break;
                case 5:
                    System.out.println("\nThank You for using our application.\nHave a Good Day :)");
                    break;
            }
        } while (choice != 5);
    }
}