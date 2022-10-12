import java.util.ArrayList;

public class Enemy extends Player{

    private String enemyName;
    private String description;
    private int enemyHealth;
    private int enemyDamage;
    private ArrayList<Item> enemyInventory = new ArrayList<>();


    public Enemy(String enemyName, String description, int health, int damage) {
        this.enemyName = enemyName;
        this.description = description;
        this.enemyHealth = health;
        this.enemyDamage = damage;
    }

    public ArrayList<Item> getEnemyInventory() {
        return enemyInventory;
    }


    public int getEnemyHealth() {
        return enemyHealth;
    }

    public int getEnemyDamage() {
        return enemyDamage;
    }

    public void addWeapon(Weapon weapon) {
        enemyInventory.add(weapon);
    }

    @Override
    public String toString() {
        return enemyName + ", " + enemyInventory;
    }

}
