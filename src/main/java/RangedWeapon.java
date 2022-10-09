public class RangedWeapon extends Weapon{

    private int ammoLeft;

    public RangedWeapon(String itemName, String ability) {
        super(itemName, ability);
        this.ammoLeft = ammoLeft;
    }

    public int getUsesleft() {
        return ammoLeft;
    }
}
