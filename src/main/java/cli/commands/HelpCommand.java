package cli.commands;
import cli.CommandMenu;

import java.util.Scanner;

public class HelpCommand {
    public static void help(){
        Scanner exitMenu = new Scanner(System.in);
        System.out.println();
        System.out.println("====================================================================================================================");
        System.out.println("""
        You have selected the help command and thus are viewing the help description. When in the command menu, enter 
        the corresponding number or name for selecting any of the commands listed below when in the command menu. For 
        further help, contact the developer if he's available. 
        """);
        System.out.println("""
        The commands available to you are listed below. Type and enter "8" or type and enter "exit" in the command line 
        and then press enter to exit the help menu and return to the command menu. """);
        System.out.println();
        System.out.println("====================================================================================================================");
        System.out.println();
        System.out.println("""
        1) search ---> Search for the name of an entry, typically based off an application, website, or 
        email, and for that entry or entries associated with the search to come up. Upon selecting an entry, the user
        may then view, edit, or delete the entry selected. """);
        System.out.println("2) add entry ---> Add an entry to the user's LocalVault. Only usable in the command menu.");
        System.out.println("3) delete entry ---> Delete an entry from the user's LocalVault.");
        System.out.println("4) edit entry ---> Edit a preexisting entry in the LocalVault.");
        System.out.println("5) change username ---> Change one's LocalVault username.");
        System.out.println("6) change password ---> Change one's LocalVault password.");
        System.out.println("7) help ---> Bring about a descriptive list of LocalVault commands. ");
        System.out.println("8) exit ---> Exit LocalVault's command menu and return to the login page.");
        System.out.println();
        System.out.println("====================================================================================================================");
        System.out.println();
        String exitInput = exitMenu.nextLine();
        if(exitInput.equals("8") || exitInput.equalsIgnoreCase("exit")){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            CommandMenu.menu();
        }
    }
}