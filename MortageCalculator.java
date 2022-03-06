
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal : ");
        int principal = scanner.nextInt();
        System.out.print("Annual Intereset Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/ PERCENT / MONTH_IN_YEAR;
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayements = years*MONTH_IN_YEAR;

        double mortage = principal*(monthlyInterest * Math.pow(1+ monthlyInterest, numberOfPayements))/ (Math.pow(1+ monthlyInterest, numberOfPayements) - 1);

        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortage: "+mortageFormatted);

    }
}
