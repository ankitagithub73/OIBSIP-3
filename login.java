import java.time.LocalDateTime;
import java.util.Scanner;
public class login {

    public static void main(String[] args) {
        int balance =0;
        int Withdraw=0, Deposite=0;

        int ATMNumber = 78965432;
        int pinNumber = 5632;

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine");

        System.out.println("Enter ATM Number");
        int atm = sc.nextInt();
        System.out.println("Enter PIN Number");
        int Pin = sc.nextInt();

        if ((ATMNumber == atm) && (pinNumber == Pin)) {
            System.out.println("1. Transaction History\n 2. View Balance\n 3. Withdraw\n  4. Deposite\n  5. Quit");
             while (true) {
                System.out.println("Enter Choice : ");
                int ch = sc.nextInt();
               if(ch==1){
                   System.out.println(LocalDateTime.now());
                   balance = balance + Deposite;
                   System.out.println(Deposite + " has been credited");

                   System.out.println(LocalDateTime.now());
                   balance = balance - Withdraw;
                   System.out.println(Withdraw + " has been debited");
                }

               else if(ch==2) {

                   System.out.println("Your  available balance is : " + balance);
               }

             else if(ch==3) {
                System.out.println("Enter money to withdrawn: ");
                Withdraw = sc.nextInt();

               if (balance >= Withdraw) {
                balance = balance - Withdraw;
                System.out.println("Please collect your money");
                System.out.println("Available balance is: "+ balance);
               } else {
                System.out.println("Insufficient Balance");
              }
             }

        else if(ch==4) {
            System.out.println("Enter money to be deposited: ");
            Deposite = sc.nextInt();
            balance = balance + Deposite;
            System.out.println(Deposite + " has been successfully deposited");
            System.out.println("Your available balance is: "+ balance);
        }

        else if(ch==5) {
            System.exit(0);
        }

}  }

            else{
                System.out.println("Incorrect Atm number or pin");
            }

    }
}
