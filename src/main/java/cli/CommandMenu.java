package cli;
import cli.commands.*;
import java.util.Scanner;

public class CommandMenu {
    public static void menu() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("====================================================================================================================");
            System.out.println();
            System.out.println("""
                    Select one of the following commands by typing the corresponding digit or name of the command in the
                    command line and then press enter. Users can search for an entry, add an entry, delete an entry, 
                    edit an entry, ask for help, or exit the application. 
                    """);
            System.out.println("1) search");
            System.out.println("2) add entry");
            System.out.println("3) delete entry");
            System.out.println("4) edit entry ");
            System.out.println("5) change username");
            System.out.println("6) change password");
            System.out.println("7) help");
            System.out.println("8) exit");
            System.out.println();
            System.out.println("====================================================================================================================");
            System.out.println();
            String userInput = scanner.nextLine();
            if (userInput.isEmpty()) {
                System.out.println("Invalid command entered. Please try again.");
            } else if (userInput.equals("1") || userInput.equalsIgnoreCase("search")) {
                SearchCommand.search();
            } else if (userInput.equals("2") || userInput.equalsIgnoreCase("add entry")) {
                AddEntryCommand.add();
            } else if (userInput.equals("3") || userInput.equalsIgnoreCase("delete entry")) {
                DeleteEntryCommand.delete();
            } else if (userInput.equals("4") || userInput.equalsIgnoreCase("edit entry")) {
                EditEntryCommand.edit();
            } else if (userInput.equals("5") || userInput.equalsIgnoreCase("change username")){
                ChangeUsernameCommand.changeUsername();
            } else if (userInput.equals("6") || userInput.equalsIgnoreCase("change password")) {
                ChangePasswordCommand.changePassword();
            } else if (userInput.equals("7") || userInput.equalsIgnoreCase("help")) {
                HelpCommand.help();
            } else if (userInput.equals("8") || userInput.equalsIgnoreCase("exit")) {
                ExitCommand.exit();
            } else {
                System.out.println("Invalid command entered. Please try again.");
                System.out.println();
            }
        }
    }
}