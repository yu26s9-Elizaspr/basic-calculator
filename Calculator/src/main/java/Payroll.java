import java.util.Scanner;

public class Payroll {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter the amount of hours worked: ");
        float hours = scanner.nextFloat();

        System.out.println("Please enter your pay rate: ");
        float pay = scanner.nextFloat();

        float grossPay = hours * pay;

        System.out.println(name + " makes " + grossPay + " in total weekly");


    }
}
