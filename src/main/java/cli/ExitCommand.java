package cli;

public class ExitCommand {
    public static void exit(){
        System.out.println("Exiting program...");
        exit();
    }
}
