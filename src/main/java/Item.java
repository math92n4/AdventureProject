import java.util.ArrayList;

public class Item {

    Adventure game = new Adventure();

    private String itemName;
    private String ability;
    private double powerLevel;

    public Item(String itemName, String ability, double powerLevel) {
        this.itemName = itemName;
        this.ability = ability;
        this.powerLevel = powerLevel;
    }

    public Item() {
        Item items = new Item();

        items.getItemName();
        items.getAbility();
        items.getPowerLevel();

        Item item1 = new Item("Boom Blaster", "Some sort of gun", 250);
        Item item2 = new Item("Thunder Strike", "A sword? A lightsaber?", 500);
        Item item3 = new Item("Night goggles", "Night vision", 300);
        Item item4 = new Item("Cybermunch", "Restores hp", 150);
        Item item5 = new Item("adrenaline", "Temporary damage boost", 500);
        Item item6 = new Item("Super boots", "Makes you move faster", 200);
        Item item7 = new Item("Key", "For a door?", 0);
        Item item8 = new Item("Sandevistian", "Makes you move 10x faster in battle for a few seconds", 1000);
    }

    public String getItemName() {
        return itemName;
    }

    public String getAbility() {
        return ability;
    }

    public double getPowerLevel() {
        return powerLevel;
    }

    public String toString() {
        return itemName + ", " + ability + ", " + powerLevel;
    }

}