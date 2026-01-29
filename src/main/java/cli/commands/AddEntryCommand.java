package cli.commands;
import cli.CommandMenu;
import java.util.Scanner;

public class AddEntryCommand {

    public static void add() {
        String accountCredential;
        String accountCredentialConfirm;
        String entryName;
        String password;
        String passwordConfirm;
        String continueOrFinished;
        Scanner scanner = new Scanner(System.in);
        System.out.println("====================================================================================================================");
        System.out.println("""
                Create a new entry. Type 'exit' at any time to stop the entry creation process and return to the command menu. 
                Please note that your account credentials, username or password, may not be 'exit'. If so, the add entry menu 
                will terminate and you will be brought back to the command menu. Thus, if you have any usernames or passwords
                that are 'exit' please change them if you wish to store them as an entry in this application.""");
        System.out.println("====================================================================================================================");
        System.out.println("Enter a name for this entry: ");
        entryName = scanner.nextLine();
        System.out.println("====================================================================================================================");
        if (entryName.equalsIgnoreCase("exit")) {
            System.out.println("Exiting the add entry menu...");
            CommandMenu.menu();
            return;
        }
        System.out.println("Enter an email, username, or some other account credential associated with this entry: ");
        accountCredential = scanner.nextLine();
        System.out.println("====================================================================================================================");
        if (accountCredential.equalsIgnoreCase("exit")) {
            System.out.println("Exiting the add entry menu...");
            CommandMenu.menu();
            return;
        }
        System.out.println("Please enter the same email, username, or account credential as the one above to confirm it: ");
        accountCredentialConfirm = scanner.nextLine();
        if (accountCredentialConfirm.equalsIgnoreCase("exit")) {
            System.out.println("Exiting the add entry menu...");
            CommandMenu.menu();
            return;
        }
        while (!accountCredential.equals(accountCredentialConfirm)) {
            System.out.println("====================================================================================================================");
            System.out.println("The two emails, usernames, or some other account credentials you entered did not match.");
            System.out.println("Enter an email, username, or some other account credential associated with this entry: ");
            accountCredential = scanner.nextLine();
            System.out.println("====================================================================================================================");
            if (accountCredential.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the add entry menu...");
                CommandMenu.menu();
                return;
            }
            System.out.println("Please enter the same email, username, or account credential as the one above to confirm it: ");
            accountCredentialConfirm = scanner.nextLine();
            System.out.println("====================================================================================================================");
            if (accountCredentialConfirm.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the add entry menu...");
                CommandMenu.menu();
                return;
            }
        }
        if (accountCredential.equals(accountCredentialConfirm)) {
            System.out.println("====================================================================================================================");
            System.out.println("Enter a password, token, or some other password credential associated with this entry: ");
            password = scanner.nextLine();
            System.out.println("====================================================================================================================");
            if (password.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the add entry menu...");
                CommandMenu.menu();
                return;
            }
            System.out.println("Please enter the same password, token, or some other password credential as the one above to confirm it: ");
            passwordConfirm = scanner.nextLine();
            if (passwordConfirm.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the add entry menu...");
                CommandMenu.menu();
                return;
            }
            while (!password.equals(passwordConfirm)) {
                System.out.println("====================================================================================================================");
                System.out.println("The two passwords, tokens, or some other password credential you entered did not match.");
                System.out.println("Enter a password, token, or some other password credential associated with this entry: ");
                password = scanner.nextLine();
                System.out.println("====================================================================================================================");
                if (password.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting the add entry menu...");
                    CommandMenu.menu();
                    return;
                }
                System.out.println("Please enter the same password, token, or some other password credential as the one above to confirm it: ");
                passwordConfirm = scanner.nextLine();
                System.out.println("====================================================================================================================");
                if (passwordConfirm.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting the add entry menu...");
                    CommandMenu.menu();
                    return;
                }
            }
            System.out.println("Entry successfully created!");
            System.out.println("====================================================================================================================");
            System.out.println("Enter 'continue' if you'd like to create another entry. Otherwise, enter anything else if you'd wish to return to the command menu: ");
            continueOrFinished = scanner.nextLine();
            if (continueOrFinished.equalsIgnoreCase("continue")) {
                add();
            } else if (continueOrFinished.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the add entry menu...");
                CommandMenu.menu();
            }
        }
    }
}