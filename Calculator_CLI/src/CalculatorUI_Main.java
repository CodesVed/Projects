import java.util.Scanner;

public class CalculatorUI_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Just Calculator =====");

        int choice;
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
                    try {
                        Calculation.add();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case 2:
                    try {
                        System.out.print("\nEnter first number: ");
                        double a = sc.nextDouble();
                        System.out.print("Enter second number: ");
                        double b = sc.nextDouble();
                        Calculation.subtract(a,b);
                        break;
                    } catch (Exception e){
                        System.out.println("Failed Operation!");
                        sc.next();
                    }
                    break;

                case 3:
                    try {
                        System.out.print("\nEnter first number: ");
                        double a = sc.nextDouble();
                        System.out.print("Enter second number: ");
                        double b = sc.nextDouble();
                        Calculation.multiply(a,b);
                        break;
                    } catch (Exception e){
                        System.out.println("Failed Operation!");
                        sc.next();
                    }
                    break;

                    case 4:
                    try {
                        System.out.print("\nEnter first number: ");
                        double a = sc.nextDouble();
                        System.out.print("Enter second number: ");
                        double b = sc.nextDouble();
                        Calculation.divide(a,b);
                        break;
                    } catch (Exception e){
                        System.out.println("Failed Operation!");
                        sc.next();
                    }
                    break;

                case 5:
                    System.out.println("\nThank You for using our calculator.\nHave a Good Day :)");
                    break;
            }
        } while (choice != 5);
    }
}