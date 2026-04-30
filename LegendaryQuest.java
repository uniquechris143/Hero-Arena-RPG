package project;
import java.util.Random;
import java.util.Scanner;

public class LegendaryQuest {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    String name;
    int HP = 100;
    boolean isGameOver = false;

    System.out.println("--- Welcome to the Java Arena ---");
    System.out.print("Enter your Hero's name: ");
    name = scanner.nextLine().trim();

    if (name.isEmpty()) {
        name = "Unknown Hero";
    }

    System.out.println("\nGreetings, " + name.toUpperCase() + "!");
    System.out.println("A wild Slime appears!");

    while (!isGameOver) {
      String status = (HP > 30) ? "Healthy" : "Injured";

      System.out.println("\nWhat will you do?");
      System.out.println("1. Attack");
      System.out.println("2. Heal");
      System.out.println("3. Run");
      System.out.print("Choice: ");

      String choice = scanner.nextLine().trim();

      if (choice.equals("1")) {
        int heroDamage = random.nextInt(20) + 5;
        int slimeDamage = random.nextInt(10) + 5;
        
        System.out.printf("You hit the slime for %d damage!\n", heroDamage);
        
        HP -= slimeDamage;
        System.out.printf("The slime counters! You take %d damage. Your HP is now: %d\n", slimeDamage, HP);
        System.out.println("Status: " + status);
      } 
      else if (choice.equals("2")) {
        int heal = (int) Math.sqrt(400); 
        HP += heal;
        System.out.println("You used a Magic Herb! Healed for: " + heal);
        System.out.println("Your HP is now: " + HP);
        System.out.println("Status: " + status);
      } 
      else if (choice.equals("3")) {
        System.out.println("You fled the battle safely.");
        isGameOver = true;
      } 
      else {
        System.out.println("Invalid choice, the slime stares at you confusedly.");
      }

      if (HP <= 0) {
        System.out.println("\n--- You have been defeated! ---");
        isGameOver = true;
      }
    }

    System.out.println("\n--- FINAL BATTLE STATS ---");
    System.out.printf("Hero: %-15s\n", name);
    System.out.printf("Ending HP: %-10d\n", HP);
    System.out.printf("Luck Factor (PI): %.2f\n", Math.PI);

    scanner.close();
  }
}
