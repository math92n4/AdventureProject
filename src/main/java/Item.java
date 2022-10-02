public class Item {

    private String itemName;
    private String ability;
    private double powerLevel;

    public Item(String itemName, String ability, double powerLevel) {
        this.itemName = itemName;
        this.ability = ability;
        this.powerLevel = powerLevel;
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