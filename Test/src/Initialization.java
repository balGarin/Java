import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Initialization {

    DataBaseUsers base = new DataBaseUsers();
    Scanner scanner = new Scanner(System.in);


    public void setUser() {
        System.out.print("Set your new Login");
        String login = scanner.next();
        System.out.print("Ser your new Password");
        String password = scanner.next();
        base.add(new User(login,password));
        System.out.println("Register is completed!!!");
    }

    public void reSetUser() {
        System.out.println("Please input your login");
        String login = scanner.next();
        if(base.isContains(login)){
            System.out.println("This user is already registered");
            System.out.println("Do you want to change a password?");
            String answer = scanner.next();
            if(answer.toLowerCase().equals("yes")){
                System.out.println("Please input the new password");
                answer= scanner.next();
                base.getUser(login).setPassword(answer);
            }else{
                System.out.println("Goodbye");
            }

        }else {
            System.out.println("User had not found");
        }
        }

    }


