package cli.commands;
import cli.CommandMenu;
import java.util.Scanner;

public class ChangeUsernameCommand {

    /* STILL NEED TO IMPLEMENT:
    1. Replace variables and values and check if conditional statements once I figure out how to store usernames
    persistently across classes.
    2. Set current username equal to the new username once figured out how to store this data persistently.
    3. Also, this does not need to be used to login, this is just for the system to address the local user in messages
    and in the CLI.*/

    public static void changeUsername() {
        String newUsername, newUsernameConfirm;
        Scanner scanner = new Scanner(System.in);
        System.out.println("====================================================================================================================");
        System.out.println("Hello USERNAME.");
        System.out.println("====================================================================================================================");
        System.out.println(""" 
                Type and enter 'exit' if you wish to keep your current username. Please note that your username may not 
                be 'exit' if you wish to use this application. Otherwise, please type and enter what you would like to 
                change your password to and then press enter: """);
        newUsername = scanner.next();
        System.out.println("====================================================================================================================");
        if (newUsername.equalsIgnoreCase("exit")) {
            System.out.println("Username not changed. Exiting the change username menu and returning to the command menu...");
            CommandMenu.menu();
            return;
        }
        System.out.println("Please enter the same username as you entered above to confirm the change: ");
        newUsernameConfirm = scanner.nextLine();
        if (newUsernameConfirm.equalsIgnoreCase("exit")) {
            System.out.println("Username not changed. Exiting the change username menu and returning to the command menu...");
            CommandMenu.menu();
            return;
        }
        while (!newUsername.equals(newUsernameConfirm)) {
            System.out.println("The two usernames you entered did not match. Please try again.");
            System.out.println("Type and enter what you would like to change your username to and then press enter: ");
            newUsername = scanner.nextLine();
            System.out.println("====================================================================================================================");
            if (newUsername.equalsIgnoreCase("exit")) {
                System.out.println("Username not changed. Exiting the change username menu and returning to the command menu...");
                CommandMenu.menu();
                return;
            }
            System.out.println("Please enter the same username as you entered above to confirm the change: ");
            newUsernameConfirm = scanner.nextLine();
            System.out.println("====================================================================================================================");
            if (newUsernameConfirm.equalsIgnoreCase("exit")) {
                System.out.println("Username not changed. Exiting the change username menu and returning to the command menu...");
                CommandMenu.menu();
                return;
            }
        }
        //username = newUsername;
        //return currentUsername;
    }

}