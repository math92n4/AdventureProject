public class RangedWeapon extends Weapon{

    private int ammo;

    public RangedWeapon(String itemName, String ability, int damage, int ammo) {
        super(itemName, ability, damage);
        this.ammo = ammo;
    }

    public int getAmmoLeft() {
        return ammo;
    }

    @Override
    public boolean canUse() {
        return (ammo > 0);
    }
}
