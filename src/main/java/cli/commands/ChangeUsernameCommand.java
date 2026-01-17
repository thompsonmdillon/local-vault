package cli.commands;
import java.util.Scanner;

public class ChangeUsernameCommand {

    /* STILL NEED TO IMPLEMENT:
    1. Replace variables and values and check if conditional statements once I figure out how to store usernames
    persistently across classes.
    2. Store the new username persistently and replace the old one. */

    public static void changeUsername(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("====================================================================================================================");
        System.out.println();
        System.out.println("Your current username is USERNAME HERE WHEN I KNOW HOW TO STORE PERSISTENTLY");
        System.out.println();
        System.out.println("====================================================================================================================");
        System.out.println();
        System.out.println(""" 
                Type and enter "8" or type and enter "exit" if you wish to keep your current username. Otherwise, please 
                type what you would like to change your username to and press enter: """);
        System.out.println();
        System.out.println("====================================================================================================================");
        String newUsername = scanner.nextLine();
        if(newUsername.equals("8") || newUsername.equalsIgnoreCase("exit")){
            System.out.println();
            System.out.println("Username not changed. Returning to the command menu...");
            System.out.println();
        } else {
            // Store the new username persistently and replace the old one.
            System.out.println();
            System.out.println("================================================================================================================");
            System.out.println();
            System.out.print("Your new username is PERSISTENT USERNAME HERE");
            System.out.println();
        }
    }

}