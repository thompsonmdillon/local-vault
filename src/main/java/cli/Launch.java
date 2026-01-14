package cli;

import java.util.Scanner;

public class Launch {
    // Global variable for username, change when user creates username.
    public static String username = "placeholder value";
    // Global (boolean) variable for checking if VaultFile exists, if it does not, then run first time setup. Initialize as false.
    public static boolean vaultFileExists = false;

    public static void launch() {
        // Define username once user has created their username.
        String username;
        /* may need a global boolean variable for checking if vaultFile exists. if it does not, then run first time setup.
        //if(vaultFile == false){
            // Run first time setup
        }else{
            // Otherwise if vault file exists prompt the user for their password.
            Scanner scanner = new Scanner(System.in);
            String masterPassword = scanner.nextLine();
            // if masterPassword matches the masterKey, then launch the cli menu for LocalVault.
            //if(masterPassword == )
        }*/
    }
}
