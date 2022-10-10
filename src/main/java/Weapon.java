import java.util.ArrayList;

public abstract class Weapon extends Item{

    private int damage;

    public Weapon(String itemName, String ability, int damage) {
        super(itemName, ability);
        this.damage = damage;
    }

    public abstract boolean canUse();

    @Override
    public String toString() {
        return getItemName() + ", " + getItemDescription();
    }
}
