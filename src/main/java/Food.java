public class Food  extends Item{

    private int healthPoints;

    public Food(String itemName, String ability, int healthPoints) {
        super(itemName, ability);
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    @Override
    public String toString() {
        return getItemName() + ", " + getItemDescription();
    }
}
