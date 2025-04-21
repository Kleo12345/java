import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Principle: ");
        int P = scan.nextInt();

        System.out.print("The interest rate (annual %): ");
        double annualRate = scan.nextDouble();

        System.out.print("The time period (years): ");
        int years = scan.nextInt();

        double monthlyRate = (annualRate / 100) / 12;

        int n = years * 12;

        double monthlyPayment = Math.round((P * monthlyRate * Math.pow(1 + monthlyRate, n)) /
                (Math.pow(1 + monthlyRate, n) - 1));

        System.out.printf("Monthly Payment: ");
        System.out.println(monthlyPayment);
    }
}
