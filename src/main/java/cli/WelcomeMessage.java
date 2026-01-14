package cli;

import java.util.Scanner;

public class WelcomeMessage{
    // Define username once user has created their username.
    String username;

    public static void welcome() {
        System.out.println("====================================================================================================================");
        System.out.println("""
                Welcome to LocalVault - Version 0.0.1! We appreciate your use of our application. If you have any questions, 
                recommendations, or requests, please try to contact our developer. This application remains in a state of 
                development. Updates may be released, be sure to check with the developer for a newer version. 
                """);
        System.out.println("====================================================================================================================");
    }


        //Scanner password = new Scanner(System.in);
        //String userPassword = scanner.nextLine();


       // System.out.println(userPassword);

}