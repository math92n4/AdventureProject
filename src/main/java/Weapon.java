import java.util.ArrayList;

public class Weapon extends Item{

    private boolean equipWeapon;
    private int damage;

    public Weapon(String itemName, String ability, boolean equipWeapon, int damage) {
        super(itemName, ability);
        this.equipWeapon = equipWeapon;
        this.damage = damage;
    }

    public Weapon(String itemName, String ability) {
        super(itemName, ability);
        this.equipWeapon = equipWeapon;
        this.damage = damage;
    }

    public boolean isWeaponEquipped() {
        return equipWeapon;
    }

    public int getDamage() {
        return damage;
    }


    @Override
    public String toString() {
        return getItemName() + ", " + getItemDescription();
    }
}
