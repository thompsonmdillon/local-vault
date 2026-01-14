package cli;

import java.util.Scanner;

public class CommandMenu {
    public static void menu() {
        System.out.println();
        // While loop, to continue until the user enters exit.
        while (true) {
            System.out.println("""
                    Enter one of the following commands. Users can search for an entry, add an entry, delete an entry, edit an 
                    entry, ask for help, or exit the application. 
                    """);
            System.out.println();
            System.out.println("1) search");
            System.out.println("2) add entry");
            System.out.println("3) delete entry");
            System.out.println("4) edit entry ");
            System.out.println("5) help");
            System.out.println("6) exit");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            if (userInput.charAt(0) == 1 || userInput == "search") {

            } else if (userInput.charAt(0) == 2 || userInput == "add entry") {

            } else if (userInput.charAt(0) == 3 || userInput == "delete entry") {

            } else if (userInput.charAt(0) == 4 || userInput == "edit entry") {

            } else if (userInput.charAt(0) == 5 || userInput == "help") {

            } else if (userInput.charAt(0) == 6 || userInput == "exit") {
                ExitCommand.exit();
            } else {
                System.out.println("Invalid command entered. Please try again.");
            }
            // Launch a shell for each command
        }
    }
}
