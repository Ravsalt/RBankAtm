import java.util.Scanner;

public class Menu{
    User user = new User();
    Scanner sc = new Scanner(System.in);
    void ShowBalance(){

        System.out.println("Your Bank Balance is: $ " + user.getBalance());
        
    }

    void Deposit(){
        System.out.println("Your Amount Balance Is: $" + user.getBalance());
        System.out.println("Enter the amount to deposit: ");
        double amount = sc.nextDouble();
        user.setBalance(user.getBalance() + amount);
        System.out.println("Deposit successful. Your new balance is: $" + user.getBalance());

    }
    void Withdraw() {
            System.out.println("Your Amount Balance Is: $" + user.getBalance());
            System.out.println("Enter the amount to withdraw: ");
            double amount = sc.nextDouble();
            
            // Check if the user has enough balance and if the amount is positive
            if (amount > 0) {
                if (amount <= user.getBalance()) {
                    user.setBalance(user.getBalance() - amount);  // Subtracting the amount from the balance
                    System.out.println("Withdrawal successful. Your new balance is: $" + user.getBalance());
                } else {
                    System.out.println("Insufficient funds.");
                }
            } else {
                System.out.println("Withdrawal amount must be positive.");
            }
        }
        public void clearScreen() {
            try {
                // Windows
                if (System.getProperty("os.name").contains("Windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                }
                // Linux or Mac
                else {
                    new ProcessBuilder("clear").inheritIO().start().waitFor();
                }
            } catch (Exception e) {
                System.out.println("Error clearing the screen.");
            }
        }
        public void sleep(int seconds) {
            try {
                Thread.sleep(seconds * 1000);  // Convert seconds to milliseconds
            } catch (InterruptedException e) {
                System.out.println("Sleep interrupted");
            }
        }
        
        

    void start(){
        int choice;
        while(true){
            System.out.println("Welcome R Bank");
            System.out.println("1. Show Balance ");
            System.out.println("2. Deposit ");
            System.out.println("3. Withdraw ");
            System.out.println("4.Exit ");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            clearScreen();
            switch(choice){
                case 1:
                    ShowBalance();
                    break;
                case 2:
                    Deposit();
                    sleep(3);
                    clearScreen();
                    break;
                case 3:
                    Withdraw();
                    sleep(3);
                    clearScreen();
                    break;
                case 4:
                    System.out.println("Thank you for using R Bank :))..");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }

        }
    }
}