public class RangedWeapon extends Weapon{

    private int ammo;

    public RangedWeapon(String itemName, String ability, int damage, int ammo) {
        super(itemName, ability, damage);
        this.ammo = ammo;
    }

    public int ammoLeft() {
        return ammo;
    }

}
