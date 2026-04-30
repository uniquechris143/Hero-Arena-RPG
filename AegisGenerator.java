package project;
import java.util.Random;
import java.util.Scanner;

public class AegisGenerator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("--- AEGIS SYSTEM INITIALIZED ---");

        System.out.print("Register Username: ");
        String username = scanner.nextLine().trim();

        if (username.isEmpty()) {
            System.out.println("ERROR: System Failure! Username cannot be empty.");
            System.out.println("Please restart the terminal to register.");
        } 
        else {
            if (username.length() < 6) {
                System.out.println("RESULT: Access Denied. Name must be at least 6 characters.");
            } 
            else {
                System.out.println("\n[Step 1: Cleaning Data...]");
                System.out.printf("Cleaned Name: %s\n", username.toLowerCase());
                System.out.printf("Length: %d characters\n", username.length());

                System.out.println("\n--- SECURITY SCAN ---");
                if (username.toLowerCase().contains("admin") || username.toLowerCase().contains("root")) {
                    System.out.println("SECURITY ALERT: Restricted name detected!");
                    System.out.println("Access Blocked.");
                } 
                else {
                    System.out.print("Enter Secret key (Must match the first letter): ");
                    char secretKey = scanner.next().charAt(0);
                    scanner.nextLine(); 

                    if (Character.toUpperCase(username.charAt(0)) == Character.toUpperCase(secretKey)) {
                        System.out.println("Key Verification: SUCCESSFUL!");

                        double number = random.nextDouble(1, 100);

                        System.out.println("\n--- CALCULATING IDENTITY STATS ---");
                        System.out.printf("Base Power: %.2f\n", number);
                        System.out.printf("Shield Strength (Sqrt): %.2f\n", Math.sqrt(number));
                        System.out.printf("Energy Capacity (Power^2): %.2f\n", Math.pow(number, 2));

                        System.out.println("\n----------------------------------");
                        System.out.printf("ID Card: %S\n", username); 
                        System.out.printf("STATUS: VERIFIED\n");
                        System.out.println("----------------------------------");

                        System.out.print("\nSync data now? (Yes/No): ");
                        String sync = scanner.nextLine().trim();

                        if (sync.equalsIgnoreCase("yes")) {
                            System.out.println("Final Status: Profile Synced [true]");
                        } else {
                            System.out.println("Final Status: Profile Synced [false]");
                            System.out.println("Note: Profile saved to local drive only.");
                        }
                    } 
                    else {
                        System.out.println("Key Verification: FAILED.");
                        System.out.println("Identity could not be confirmed.");
                    }
                }
            }
        }
        scanner.close();
    }
}
