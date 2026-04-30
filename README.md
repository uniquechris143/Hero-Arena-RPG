# Legendary Quest: Java Arena ⚔️

A turn-based RPG battle simulation built in Java. This project demonstrates game logic loops, randomized combat mechanics, and dynamic status tracking.

## 🕹️ Gameplay Features
- **Hero Registration**: Custom naming with default fallback for empty inputs.
- **Turn-Based Combat**: Randomized damage values for both the player and the enemy.
- **Healing System**: Uses `Math.sqrt` to determine fixed healing amounts.
- **Dynamic Status**: Uses ternary operators to track if the hero is "Healthy" or "Injured".
- **Final Stats**: Formatted summary using `printf` and `Math.PI`.

## 🛠️ Java Concepts Used
- **Loops**: `while` loop for the game engine.
- **Logic**: `if-else` branching for combat choices and game-over states.
- **Randomization**: `random.nextInt()` for unpredictable damage.
- **Formatting**: `printf` with width specifiers (`%-15s`) for aligned table-like output.
- **String Methods**: `.trim()`, `.toUpperCase()`, and `.isEmpty()`.

## 📂 Project Structure
- **File**: `LegendaryQuest.java`
- **Package**: `project`

## 💻 How To Run
1. Save as `LegendaryQuest.java`.
2. Compile: `javac LegendaryQuest.java`
3. Run: `java LegendaryQuest`

---
*Developed as a Java Learning Project focusing on Game Logic.*
