package cli;

import java.util.Scanner;

public class Launch {

    /* STILL NEED TO IMPLEMENT:
    1. Persistently store username and password values for returning users. Also, add that to the functions when done.
    Likely use JSON.
    2. Write a check for if the LocalVault file exists, meaning, the program has already ran before on the user's
    system. Like an executable. Do this in launch().
    3. Once I figure out how to persistently store the username and password values for users, make sure to implement
    those values into the functions and entirety of the Launch class. Specifically in the if conditionals throughout
    the methods in this class.
    4. Add/delete/edit global variables in this class. */

    // Global variable for username, change when user creates username.
    public static String username = "placeholder value";
    public static String password = "placeholder value";
    // Global (boolean) variable for checking if VaultFile exists, if it does not, then run first time setup. Initialize as false.
    public static boolean vaultFileExists = false;

    public static void launch() {
        /* may need a global boolean variable for checking if vaultFile exists. Need to figure out how to check if the
        vaultFile, that is created once the application, exists. */
        // boolean vaultFileExists = false;
        // if it does not exist, then run first time setup.
        if (vaultFileExists == false){
            firstLaunchSetup();
        } else {
            // if it does exist, then prompt user to enter password and have them enter it and check what they enter.
            boolean incorrectPassword = true;
            while (incorrectPassword){
                if (checkReturningUserPassword() == true){
                    incorrectPassword = false;
                }
            }
        }
    }

    // This is pretty much fully implemented. Just configure once figure out how to persistently store users' passwords.
    public static void firstLaunchSetup(){
        Scanner scanner = new Scanner(System.in);
        String confirmPassword;
        System.out.println("====================================================================================================================");
        System.out.println();
        System.out.println("Hello new user! Thank you for downloading the LocalVault application.");
        System.out.println();
        System.out.println("====================================================================================================================");
        System.out.println();
        System.out.println("Please create and enter a username: ");
        System.out.println();
        System.out.println("====================================================================================================================");
        username = scanner.nextLine();
        System.out.println();
        boolean passwordLoop = true;
        while (passwordLoop) {
            System.out.println("================================================================================================================");
            System.out.println();
            System.out.println("Please create and enter a password: ");
            System.out.println();
            System.out.println("================================================================================================================");
            password = scanner.nextLine();
            System.out.println("================================================================================================================");
            System.out.println();
            System.out.println("Please confirm your password: ");
            System.out.println();
            System.out.println("================================================================================================================");
            confirmPassword = scanner.nextLine();
            if(confirmPassword.equals(password)){
                System.out.println("Success. Local account activation completed.");
                passwordLoop = false;
            } else {
                System.out.println();
                System.out.println("Passwords do not match. Please try again.");
                System.out.println();
            }
        }
    }

    /* Still need to figure out how to store the information (username and password) persistently, probably using
    * JSON. */
    public static boolean checkReturningUserPassword(){
        // Instead of user, print the persistently stored username to welcome the user back.
        Scanner scanner = new Scanner(System.in);
        boolean passwordLoop = true;
        while(passwordLoop){
            System.out.println("================================================================================================================");
            System.out.println();
            System.out.println("Welcome back user! Please enter your password to enter LocalVault:");
            System.out.println();
            System.out.println("================================================================================================================");
            String userPasswordAttempt = scanner.nextLine();
            if (userPasswordAttempt.equals(password)){
                System.out.println();
                System.out.println("============================================================================================================");
                System.out.println();
                System.out.println("Success! Proceeding to user's LocalVault.");
                System.out.println();
                passwordLoop = false;
            } else {
                System.out.println();
                System.out.println("Incorrect password. Please try again.");
                System.out.println();
            }
        }
        return true;
    }

}