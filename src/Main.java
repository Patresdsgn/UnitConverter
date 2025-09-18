import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Display menu
            System.out.println("Select conversion type:");
            System.out.println("1. Length");
            System.out.println("2. Weight");
            System.out.println("3. Temperature");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected length conversion");
                    break;
                case 2:
                    System.out.println("You selected weight conversion.");
                    break;
                case 3: 
                    System.out.println("You selected temperature conversion.");
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option, try again.");
                    break;
                }
            System.out.println();
        }
        scanner.close();
    }
}
