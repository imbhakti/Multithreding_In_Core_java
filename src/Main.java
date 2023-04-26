public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer("BITCODE-69034", true);

        User u1 = new User("bhakti", printer);
        User u2 = new User("sakshi", printer);
        User u3 = new User("geeta" , printer);

        u1.start();
        u2.start();
        u3.start();

    }

}