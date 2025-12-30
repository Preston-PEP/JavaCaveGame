// Base class for all characters in the game (players and enemies).
// Contains shared health, defense, and turn-related behavior.
public abstract class Character {

    // Current health points
    protected int hp;

    // Whether the character is defending this turn
    protected boolean defending;

    // Constructor used by subclasses to set starting health
    public Character(int hp) {
        this.hp = hp;
        this.defending = false; // Defense only lasts for one turn
    }

    // ----- Core Health Logic -----

    // Applies damage to the character, reducing it if defending
    public void takeDamage(int damage) {

        // Defending halves incoming damage
        if (defending) {
            damage /= 2;
            System.out.println("Some damage was blocked!");
        }

        hp -= damage;

        // Clamp HP so it never goes below zero
        if (hp < 0) {
            hp = 0;
        }
    }

    // Returns true if the character is still alive
    public boolean isAlive() {
        return hp > 0;
    }

    // Getter for current health
    public int getHp() {
        return hp;
    }

    // ----- Turn Handling -----

    // Called at the start of each turn
    // Clears defensive state so it must be chosen again
    public void startTurn() {
        defending = false;
    }

    // Puts the character into a defensive stance for this turn
    public void defend() {
        defending = true;
    }
}

