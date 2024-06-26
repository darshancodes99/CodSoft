import java.util.Scanner;
class BackAccount{
    private double balance;
    public BackAccount(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0) {
            balance += amount;
        }
    }

    public void withDraw(double amount){
        if (amount > balance){
            System.out.println("withdraw failed because not enough balance in your account");
        } else {
            balance -= amount;
        }
    }

    public void checkBalance(){
        System.out.println("current balance is : " + balance);
    }

}
public class ATMInterface {

    private BackAccount backAccount;
    public ATMInterface(BackAccount backAccount){
        this.backAccount = backAccount;
    }

    public void deposit(double amount){
        backAccount.deposit(amount);
    }

    public void withDraw(double amount){
        backAccount.withDraw(amount);
    }

    public void checkBalance(){
        backAccount.checkBalance();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BackAccount backAccount = new BackAccount(50000.0);
        ATMInterface atm = new ATMInterface(backAccount);
        int choice;
        do {
            System.out.println("ATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = input.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = input.nextDouble();
                    atm.withDraw(withdrawalAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
            System.out.println();

        } while(choice != 4);

    }
}

