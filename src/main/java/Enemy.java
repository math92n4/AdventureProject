import java.util.ArrayList;

public class Enemy extends Player {

    private String enemyName;
    private String description;

    public Enemy(String enemyName, String description, int health, Weapon weapon) {
        super.health = health;
        super.equippedWeapon = weapon;
        this.enemyName = enemyName;
        this.description = description;
    }

    public String getEnemyName() {
        return enemyName;
    }

    @Override
    public String toString() {
        return enemyName + " " + description;
    }
}