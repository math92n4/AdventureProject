import java.util.ArrayList;

public class Weapon extends Item{

    private int damage;

    public Weapon(String itemName, String ability) {
        super(itemName, ability);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }


    @Override
    public String toString() {
        return getItemName() + ", " + getItemDescription();
    }
}
