public class Weapon extends Item{

    public Weapon(String itemName, String ability) {
        super(itemName, ability);
    }

    @Override
    public String toString() {
        return getItemName() + ", " + getItemDescription();
    }
}
