
import java.util.Scanner;

public class bank {

    public static void main(String args[]) {
        for (int i = 1; i <= 3; i--) {
            Scanner input = new Scanner(System.in);
            System.out.println("WELCOME TO YOUR BANK");
            System.out.println("Enter the Account no.");
            String aa = input.nextLine();
            System.out.println("Enter the Account Holder's Name");
            String bb = input.nextLine();
            System.out.println("initial deposit amount");
            double cc = input.nextDouble();
            System.out.println("if you want to deposit the amount (type deposit)");
            System.out.println("if you want to withdraw the amount (type withdraw)");
            Scanner iinput = new Scanner(System.in);
            String type = iinput.nextLine().toUpperCase();
            {

                if (type.equals("DEPOSIT")) {

                    Scanner iiinput = new Scanner(System.in);
                    System.out.println("enter the amount you deposit");
                    double dd = iiinput.nextDouble();
                    Double a = dd + cc;
                    System.out.println("Your updated amount : " + a);
                } else if (type.equals("WITHDRAW")) {

                    Scanner iiinput = new Scanner(System.in);
                    System.out.println("enter the amount you withdraw");
                    double ee = iiinput.nextDouble();
                    if (ee <= cc) {
                        System.out.println("Your updated amount : " + (cc - ee));
                    } else {
                        System.out.println("withdrawl amount should le be less");
                    }

                } else {
                    System.out.println("invalid input");
                }
            }
        }
    }
}
