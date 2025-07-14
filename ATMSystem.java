import java.util.Scanner;


class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }


    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be more than $0.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
    }

    
    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }
}


class ATM {
    private BankAccount account;
    private Scanner sc;

    
    public ATM(BankAccount acc) {
        account = acc;
        sc = new Scanner(System.in);
    }

    
    public void start() {
        int choice = 0;

        while (choice != 4) {
            showMenu();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    withdrawOption();
                    break;
                case 2:
                    depositOption();
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void showMenu() {
        System.out.println("ATM Menu");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    private void withdrawOption() {
        System.out.print("Enter amount to withdraw: $");
        double amt = sc.nextDouble();
        account.withdraw(amt);
    }

    private void depositOption() {
        System.out.print("Enter amount to deposit: $");
        double amt = sc.nextDouble();
        account.deposit(amt);
    }
}


public class ATMSystem {
    public static void main(String[] args) {
    
        BankAccount myAccount = new BankAccount(10000); 
        ATM atm = new ATM(myAccount);
        atm.start();
    }
}
