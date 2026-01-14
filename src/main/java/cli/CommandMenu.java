package cli;

// Source: https://www.w3schools.com/java/ref_string_equals.asp

import cli.commands.*;
import java.util.Scanner;

public class CommandMenu {
    public static void menu() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        // While loop, to continue until the user enters exit.
        while (true) {
            System.out.println("""
                    Select one of the following commands by entering the corresponding digit or name of the command. 
                    Users can search for an entry, add an entry, delete an entry, edit an entry, ask for help, or exit 
                    the application. 
                    """);
            System.out.println("1) search");
            System.out.println("2) add entry");
            System.out.println("3) delete entry");
            System.out.println("4) edit entry ");
            System.out.println("5) help");
            System.out.println("6) exit");
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
            } else if (userInput.equals("5") || userInput.equalsIgnoreCase("help")) {
                HelpCommand.help();
            } else if (userInput.equals("6") || userInput.equalsIgnoreCase("exit")) {
                ExitCommand.exit();
            } else {
                System.out.println("Invalid command entered. Please try again.");
                System.out.println();
            }
        }
    }
}
