package Unit8.Lesson17;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import chn.util.*;

public class Main
{
    public static ConsoleIO kb = new ConsoleIO();

    public static void main(String[] args) {
        boolean control = true;
        
        CheckingAccount cb = new CheckingAccount();
        System.out.println("ErrorFreeChecking Test\n");
        do {
            control = false;
            System.out.print("Please enter the starting balance --> ");
            try {cb = new CheckingAccount(kb.readInt());}
            catch(Exception IllegalArgumentException) {
                System.out.println("Error CheckingAccount: negative initial balance\n");
                control = true;
            };
        } while (control);
        System.out.println("Account opened with balance of " + cb.getBalance() + "\n");
        do {
            control = false;
            System.out.print("Please enter the amount to deposit --> ");
            try {cb.deposit(kb.readInt());}
            catch(Exception IllegalArgumentException){
                 System.out.println("Error deposit: negative amount\n");
                 control = true;
            };
        } while (control);
        System.out.println("Deposit made. Current account balance = " + cb.getBalance()+"\n");
        do {
            control = false;
            System.out.print("Please enter the amount to witdraw --> ");
            try {cb.withdraw(kb.readInt());}
            catch (Exception IllegalArgumentException){
                System.out.println("Error withdraw: illegal amount\n");
                control = true;
            };
        } while (control);
        System.out.println("Withdrawal made. Current account balance = " + cb.getBalance() + "\n");
        System.out.println("Thank you for using ErrorFreeChecking...goodbye!");
    }
}

