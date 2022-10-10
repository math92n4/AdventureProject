import java.util.ArrayList;

public class Enemy extends Player{

    private String enemyName;
    private String description;
    private int health;
    private int damage;
    private ArrayList<Item> enemyInventory = new ArrayList<>();

    public Enemy(String itemName, String ability, int health, int damage) {
        this.enemyName = enemyName;
        this.description = description;
        this.health = health;
        this.damage = damage;
    }

    public ArrayList<Item> getEnemyInventory() {
        return enemyInventory;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

}
