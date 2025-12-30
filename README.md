# Java Cave Game 🕯️

Java Cave Game is a turn-based, console-based RPG written in Java.  
It was created as a learning-focused project for beginner to intermediate Java developers, with an emphasis on clean object-oriented design and readable, well-commented code.

---

## 🎮 Game Overview

You and your party enter a dark cave filled with goblins.  
Each round, players take turns choosing actions such as attacking, defending, or using healing potions.  
Enemies attack back, and surviving players earn rewards to prepare for increasingly difficult encounters.

The game continues until all players are defeated.

---

## 🧠 Learning Goals

This project is designed to help new developers practice:

- Object-Oriented Programming (OOP)
  - Inheritance
  - Encapsulation
  - Abstract base classes
- Turn-based game loops
- State management (HP, potions, defending, alive/dead)
- Randomization and scaling difficulty
- Clean separation of responsibilities between classes
- Reading and understanding commented code

---

## ✨ Features

- Multiple player support
- Turn-based combat system
- Defend mechanic that reduces damage
- Randomized enemy spawns and attack power
- Healing potions and round-based recovery
- Reward system between rounds
- Scalable difficulty as rounds increase
- Fully commented source code for learning purposes

---

## 🗂️ Project Structure
├── Main.java # Game loop, combat flow, and user interaction
├── Character.java # Abstract base class for all characters
├── Player.java # Player behavior and inventory
├── Enemy.java # Enemy behavior and scaling difficulty
└── README.md

---

## ▶️ How to Run

1. Make sure you have **Java 8 or higher** installed.
2. Clone or download this repository.
3. Compile and run `Main.java` using your IDE or the command line.

Example (command line):

```bash
javac Main.java
java Main

🧪 Version History

v1.0
Initial release of the console-based Cave Game.
Includes core combat mechanics, rewards, and scalable difficulty.

🚀 Future Plans

This project is intended to grow over time. Planned upgrades include:

GUI version using JavaFX

Improved enemy AI and special enemy types

Additional player actions and abilities

Save/load system

Porting the game to:

Desktop application

Android

Cross-platform commercial release

📌 Notes for Learners

This code prioritizes clarity over cleverness

Comments explain why things happen, not just what happens

Feel free to fork, modify, and experiment

Try adding new features or refactoring systems as practice
