import java.util.Scanner;
class BankAccount {
     private double balance;
     public BankAccount(double initialBalance) {
          this.balance = initialBalance;
     }
     public double getBalance() {
          return balance;
     }
     public void deposit(double amount) {
          if (amount > 0) {
               balance += amount;
               System.out.println("Successfully Deposited: " + amount);
          } else {
               System.out.println("Invalid Deposit Amount");
          }
     }
     public void withdraw(double amount) {
          if (amount > 0 && amount <= balance) {
               balance -= amount;
               System.out.println("Successfully Withdrawn: " + amount);
          } else if (amount > balance) {
               System.out.println("Insufficient Balance");
          } else {
               System.out.println("Invalid Withdrawal Amount");
          }
     }
}
class ATM {
     BankAccount account;
     Scanner sc;
     public ATM(BankAccount account) {
          this.account = account;
          sc = new Scanner(System.in);
     }
     public void start() {
          int choice;
          do {
               System.out.println("\n===== ATM MENU =====");
               System.out.println("1. Check Balance");
               System.out.println("2. Deposit");
               System.out.println("3. Withdraw");
               System.out.println("4. Exit");
               System.out.print("Enter your choice: ");
               choice = sc.nextInt();
               switch (choice) {
                    case 1:
                         System.out.println("Balance: " + account.getBalance());
                         break;
                    case 2:
                         System.out.print("Enter deposit amount: ");
                         double dep = sc.nextDouble();
                         account.deposit(dep);
                         break;
                    case 3:
                         System.out.print("Enter withdrawal amount: ");
                         double wit = sc.nextDouble();
                         account.withdraw(wit);
                         break;
                    case 4:
                         System.out.println("Thank you for using ATM!");
                         break;
                    default:
                         System.out.println("Invalid choice");
               }
          } while (choice != 4);
     }
}
public class ATMInterface {
     public static void main(String[] args) {
          BankAccount userAccount = new BankAccount(1000);
          ATM atm = new ATM(userAccount);
          atm.start();
     }
}
