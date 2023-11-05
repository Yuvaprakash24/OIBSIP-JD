import java.util.*;

public class ATMmachine {
	Scanner sc = new Scanner(System.in);
    //id is "Yuvi";
    //pin is '123456789';
    double amount = 1000000;
    int withdrawlAmount;
    int depositAmount, transaction, transferAmount,transferred;
    int Account;
    double balance;

    void login() {

        System.out.println("\tWelcome To ATM Interface!!!");

        System.out.println("Please Enter the following details : ");

        System.out.print("Enter your user id : ");
        String id = sc.next();

        System.out.print("Enter your user pin : ");
        int pin = sc.nextInt();


        if (id.equals("Yuvi") && pin ==123456789) {
            System.out.println("Login Successful");
            menu();
        } else {
            System.out.println("Login failed, try again!!!");
            login();
        }
    }

    void menu() {
        int ch;

        //performing operations
        do {
            System.out.println("\nSelect your choice: \n1.Transaction history \n2.Withdraw \n3.Deposit \n4.Transfer \n5.View balance \n6.Quit");
            System.out.println("\nEnter your choice:");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    Transactionhistory();
                    break;
                case 2:
                    Withdrawl();
                    break;
                case 3:
                    Deposit();
                    break;
                case 4:
                    Transfer();
                    break;
                case 5:
                    viewBalance();
                    break;
                case 6:
                	quit();
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;
            }
        } while (ch <= 6);
    }

    //view transaction history
    void Transactionhistory() {
        if (transaction ==1)
            System.out.println("You deposited Rs." + depositAmount);
        else if (transaction ==-1)
            System.out.println("You withdrawn Rs." + withdrawlAmount);
        else
            System.out.println("You have not done any transaction yet...");

    }


    //withdrawing money
    void Withdrawl() {
        System.out.print("Enter Withdrawl Amount:");
        withdrawlAmount = sc.nextInt();

        System.out.println("Withdrawl successful");


        transaction = -1;
    }

    //deposit money
    void Deposit() {
        System.out.print("Enter deposit Amount:");
        depositAmount = sc.nextInt();
        System.out.println("Deposit Sccessful");
        transaction = 1;
    }

    //transferring money
    void Transfer() {
        System.out.print("Enter transfer amount:");
        transferAmount = sc.nextInt();
        System.out.print("Enter the account number you want money to be transfered:");
        Account = sc.nextInt();
        if (transferAmount > balance) {
            System.out.println("Insufficient money to transfer...");
        } else
        {
            System.out.println("Transfer Successful");
            transferred=transferAmount;
        }
    }

    //viewing balance
    void viewBalance() {
        balance = (amount - (withdrawlAmount+transferred)) + depositAmount;
        System.out.println("Amount available:" + balance);

    }

    //quit
    void quit() {
    	System.out.println("Thank You!!!");
    	System.exit(0);

    }

    public static void main(String[] args) {
        ATMmachine s1 = new ATMmachine();
        s1.login();
    }

}