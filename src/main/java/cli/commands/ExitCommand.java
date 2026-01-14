package cli.commands;

public class ExitCommand {
    public static void exit() {
        System.out.println();
        System.out.println("Program exited successfully.");
        System.exit(0);
    }
}
