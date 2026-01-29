package cli.commands;
import cli.CommandMenu;
import java.util.Scanner;

public class ChangePasswordCommand {

    /* STILL NEED TO IMPLEMENT:
    1.Replace variables and values and check if conditional statements once I figure out how to store passwords
    persistently across classes.
    2. Store the new password persistently and replace the old one.
    3. Will need to be changed once a user's password for the application may be stored securely and persistently.*/
    public static void changePassword(){
        Scanner scanner = new Scanner(System.in);
        String newPassword, newPasswordConfirm;
        // Please enter your old password to confirm you wish to change your password
        // Do this once it is stored persistently.
        System.out.println("====================================================================================================================");
        System.out.println("Your current password is PASSWORD HERE WHEN I KNOW HOW TO STORE PERSISTENTLY");
        System.out.println("====================================================================================================================");
        System.out.println(""" 
                Type and enter 'exit' if you wish to keep your current password. Please note that your password may not 
                be 'exit' if you wish to use this application. Otherwise, please type and enter what you would like to 
                change your password to and then press enter: """);
        newPassword = scanner.nextLine();
        System.out.println("====================================================================================================================");
        if(newPassword.equalsIgnoreCase("exit")){
            System.out.println("Password not changed. Exiting the change password menu and returning to the command menu...");
            CommandMenu.menu();
            return;
        }
        System.out.println("Please enter the same password as you entered above to confirm the change: ");
        newPasswordConfirm = scanner.nextLine();
        System.out.println("====================================================================================================================");
        if(newPasswordConfirm.equalsIgnoreCase("exit")){
            System.out.println("Password not changed. Exiting the change password menu and returning to the command menu...");
            CommandMenu.menu();
            return;
        }
        while(!newPassword.equals(newPasswordConfirm)){
            System.out.println("The two passwords you entered did not match. Please try again.");
            System.out.println("Type and enter what you would like to change your password to and then press enter: ");
            newPassword = scanner.nextLine();
            System.out.println("====================================================================================================================");
            if(newPassword.equalsIgnoreCase("exit")){
                System.out.println("Password not changed. Exiting the change password menu and returning to the command menu...");
                CommandMenu.menu();
                return;
            }
            System.out.println("Please enter the same password as you entered above to confirm this change: ");
            newPasswordConfirm = scanner.next();
            System.out.println("====================================================================================================================");
            if(newPasswordConfirm.equalsIgnoreCase("exit")){
                System.out.println("Password not changed. Exiting the change password menu and returning to the command menu...");
                CommandMenu.menu();
                return;
            }
        }
        System.out.println("""
                Your password has successfully been changed! PLEASE write it down and/or save it somewhere in the event
                that you forget it. Now, you will be returned to the command menu...""");
        CommandMenu.menu();
        }

}