// Represents a player-controlled character.
// Players can attack, defend, heal, and upgrade equipment.
public class Player extends Character {

    // Used to assign unique IDs to players
    private static int NEXT_PLAYER_ID = 1;

    // Player-specific identifier
    private final int id;

    // Number of healing potions the player has
    private int potions;

    // Damage dealt when attacking
    private int weaponDamage;

    // Creates a new player with starting stats
    public Player(int hp) {
        super(hp);
        this.id = NEXT_PLAYER_ID++;
        this.potions = 2;
        this.weaponDamage = 4; // Starter weapon damage
    }

    // Returns the damage dealt by an attack
    public int attack() {
        return weaponDamage;
    }

    // Uses a healing potion to restore random HP
    public void usePotion() {

        // Prevent potion use if none remain
        if (potions <= 0) {
            System.out.println("Player " + id + " has no potions left!");
            return;
        }

        // Heal between 1 and 6 HP
        int heal = (int)(Math.random() * 6) + 1;
        hp += heal;
        potions--;

        System.out.println("Player " + id + " heals " + heal + " HP!");
    }

    // Getter for potion count
    public int getPotions() {
        return potions;
    }

    // Heals a fixed amount (used by rewards and round recovery)
    public void heal(int amount) {
        hp += amount;
    }

    // Adds a healing potion to the inventory
    public void addPotion() {
        potions++;
    }

    // Increases weapon damage (used for upgrades)
    public void upgradeWeapon(int amount) {
        weaponDamage += amount;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    // Returns formatted weapon info for display
    public String getWeaponInfo() {
        return "Weapon Damage: " + weaponDamage;
    }
    // Getter for player ID
        public int getId() {
            return id;
        }
        
    // Convenience method for increasing damage (for a later version...)
    /**public void increaseDamage(int amount) {
    *    weaponDamage += amount;
    *}
    **/
    
}
