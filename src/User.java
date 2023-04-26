import java.security.PrivateKey;

public class User extends Thread {
    private String username;
    private Printer printer;

    public User(String username, Printer printer) {
        username = username;
        this.printer = printer;
    }

    @Override
    public void run() {
        synchronized (printer) {
            printer.print(username + " - profile.pdf");
        }
    }
}

