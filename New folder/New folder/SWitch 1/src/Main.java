public class Main {
    public static void main(String[] args) {
        String role = "admin"; // Initialize role variable

        // Use switch statement to check role
        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
                break;
        }
    }
}