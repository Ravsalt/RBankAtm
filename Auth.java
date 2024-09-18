import java.util.Scanner;
public class Auth{
    boolean login = false;
    Menu menu = new Menu();
    Scanner sc = new Scanner(System.in);
    void start(){
        
        //Starting OUT//
        System.out.println("Insert Card:");
        menu.sleep(2);
        System.out.println("Inserting Card...");
        System.out.println("Authenticating user...");
        menu.sleep(3);
        menu.clearScreen();
        checkIflogin();
    }
    void login(){
        System.out.println("Enter Pin Name: ");
                String Username = sc.nextLine();
                    if (Username.equals("Nikko")){
                    System.out.println("Logging In..");
                    menu.sleep(3);
                    System.out.println("Login Success");
                    menu.sleep(3);
                    menu.clearScreen();
                    login = true;
                    }
                    else{
                        System.out.println("Invalid Username");
                    }
    }
    void checkIflogin(){
        while(true){
            if(login == true){
                menu.start();
    }
            else{
                login();
                }
        }
    
    }
}