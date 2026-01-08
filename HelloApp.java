public class HelloApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("  Hello from Java + Jenkins CI!  ");
        System.out.println("=================================");

        if (args.length > 0) {
            System.out.println("Welcome, " + args[0] + "!");
        } else {
            System.out.println("Welcome, Guest!");
        }
    }
}
