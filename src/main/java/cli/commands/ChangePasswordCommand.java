package cli.commands;
import java.util.Scanner;

public class ChangePasswordCommand {

    /* STILL NEED TO IMPLEMENT:
    1.Replace variables and values and check if conditional statements once I figure out how to store passwords
    persistently across classes.
    2. Store the new password persistently and replace the old one. */

    public static void changePassword(){
        System.out.println("Change password method successfully executed.");
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("====================================================================================================================");
        System.out.println();
        System.out.println("Your current password is PASSWORD HERE WHEN I KNOW HOW TO STORE PERSISTENTLY");
        System.out.println();
        System.out.println("====================================================================================================================");
        System.out.println();
        System.out.println(""" 
                Type 8 or exit if you wish to keep your current username. Otherwise, please type what you would like to 
                change your username to and press enter: """);
        System.out.println();
        System.out.println("====================================================================================================================");
        String newPassword = scanner.nextLine();
        if(newPassword.equals("8") || newPassword.equalsIgnoreCase("exit")){
            System.out.println();
            System.out.println("Password not changed. Returning to the command menu...");
            System.out.println();
        } else {
            // Store the new password persistently and replace the old one.
            System.out.println();
            System.out.println("================================================================================================================");
            System.out.println();
            System.out.println("Your new password is PERSISTENT PASSWORD HERE");
            System.out.println();
        }
    }

}