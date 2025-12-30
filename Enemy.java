// Represents an enemy combatant (goblins).
// Enemies have randomized attack strength and unique IDs per round.
public class Enemy extends Character {

    // Used to assign IDs to goblins each round
    private static int NEXT_GOBLIN_ID = 1;

    // Goblin identifier
    private final int id;

    // Damage dealt when attacking
    private int attackDamage;

    // Creates a goblin with fixed HP and randomized attack power
    public Enemy(int hp, int maxAttackPower) {
        super(hp);
        this.id = NEXT_GOBLIN_ID++;

        // Attack damage is randomly rolled based on round difficulty
        this.attackDamage = (int)(Math.random() * maxAttackPower) + 1;
    }

    // Resets goblin IDs at the start of each round
    public static void resetIds() {
        NEXT_GOBLIN_ID = 1;
    }

    // Returns attack damage
    public int attack() {
        return attackDamage;
    }

    public int getId() {
        return id;
    }

    public int getAttackDamage() {
        return attackDamage;
    }
}
