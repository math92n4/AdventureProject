public class Food  extends Item{

    public Food(String itemName, String ability) {
        super(itemName, ability);
    }

    @Override
    public String toString() {
        return getItemName() + ", " + getItemDescription();
    }
}
