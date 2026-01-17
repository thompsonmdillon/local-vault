package cli;

import java.util.Scanner;

public class Launch {

    // Global variable for username, change when user creates username.
    public static String username = "placeholder value";
    public static String password = "placeholder value";
    // Global (boolean) variable for checking if VaultFile exists, if it does not, then run first time setup. Initialize as false.
    public static boolean vaultFileExists = false;

    public static void launch() {
        // may need a global boolean variable for checking if vaultFile exists.
        boolean vaultFile = false;
        // Define username once user has created their username.
        String username;
        // if it does not, then run first time setup.
        if (vaultFile == false){
            firstLaunchSetup();
        } else {
            boolean correctPassword = false;
            if (correctPassword = checkReturningUserPassword() == true){
                return;
            }
            // Otherwise if vault file exists prompt the user for their password.
            Scanner scanner = new Scanner(System.in);
            String masterPassword = scanner.nextLine();
            // if masterPassword matches the masterKey, then launch the cli menu for LocalVault.
            //if(masterPassword == )
        }
    }

    public static void firstLaunchSetup(){
        Scanner scanner = new Scanner(System.in);
        String confirmPassword = "";
        System.out.println("====================================================================================================================");
        System.out.println();
        System.out.println("Hello new user! Thank you for downloading the LocalVault application.");
        System.out.println();
        System.out.println("====================================================================================================================");
        System.out.println();
        System.out.println("Please create and enter a username: ");
        username = scanner.nextLine();
        System.out.println();
        System.out.println("====================================================================================================================");
        System.out.println();
        boolean passwordLoop = true;
        while (passwordLoop) {
            System.out.println("Please create and enter a password: ");
            password = scanner.nextLine();
            System.out.println();
            System.out.println("Please confirm your password: ");
            confirmPassword = scanner.nextLine();
            if(confirmPassword.equals(password)){
                System.out.println("Success. Local account activation completed.");
                passwordLoop = false;
            } else {
                System.out.println("Passwords do not match. Please try again.");
            }
        }
    }

    public static boolean checkReturningUserPassword(){
        if
        return true;
    }
}
