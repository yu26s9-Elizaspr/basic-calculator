import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();


        System.out.println("Possible calculations:\n" +
                "(A)dd\n" +
                "(S)ubtract\n" +
                "(M)ultiply\n" +
                "(D)ivide");

        scanner.nextLine();

        System.out.println("Please select an option: ");
        String option = scanner.nextLine();

        if (option.equals("A")) {
            int sum = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + sum);
        } else if (option.equals(("S"))) {
            int sum = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + sum);
        } else if (option.equals("M")) {
            int sum = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + sum);
        } else if (option.equals("D")) {
            int sum = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + sum);
        }
        else {
            System.out.println("Error");
        }


    }
}
