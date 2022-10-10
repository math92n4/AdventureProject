import java.util.ArrayList;

public class Player {

    private Room currentRoom;
    private ArrayList<Item> inventory = new ArrayList();
    private Weapon equippedWeapon;
    private int health;

    public Player() {
        this.health = 100;
    }

    public int getHealth() {
        return health;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public boolean takeItem(String itemName) {
        for (Item item : currentRoom.getItems()) {
            if (item.getItemName().equals(itemName)) {
                inventory.add(item);
                currentRoom.removeItem(item);
                return true;
            }
        }
        return false;
    }

    public boolean dropItem(String itemName) {
        for (Item item : inventory) {
            if (item.getItemName().equals(itemName)) {
                currentRoom.addItem(item);
                inventory.remove(item);
                return true;
            }
        }
        return false;
    }

    public boolean eatFood(String itemName) {
        for (Item item : inventory) {
            if (item instanceof Food) {
                if (item.getItemName().equals(itemName)) {
                    currentRoom.removeItem(item);
                    inventory.remove(item);
                    health = health + ((Food) item).getHealthPoints();
                    return true;
                }
            }
        }
        return false;
    }

    public boolean equipWeapon(String itemName) {
        for (Item item : inventory) {
            if (item instanceof Weapon) {
                if (item.getItemName().equals(itemName)) {
                    equippedWeapon = (Weapon) item;
                    inventory.remove(item);
                }
                return true;
            }
        }
        return false;
    }

    public ENUM.attackCommands attackEnemy(String enemyName) {
        if (equippedWeapon == null) {
            return ENUM.attackCommands.NO_WEAPON_EQUIPPED;
        }
        if (!equippedWeapon.canUse()) {
            return ENUM.attackCommands.NO_AMMO;
        }
        if (!enemyName.equals(enemyName)) {
            return ENUM.attackCommands.NO_ENEMY_NAME;
        }
        return ENUM.attackCommands.Succesful;
    }

    public boolean move(char direction) {
        Room requestedRoom = null;

        if (direction == 'n') {
            requestedRoom = currentRoom.getNorth();
        } else if (direction == 'e') {
            requestedRoom = currentRoom.getEast();
        } else if (direction == 'w') {
            requestedRoom = currentRoom.getWest();
        } else if (direction == 's') {
            requestedRoom = currentRoom.getSouth();
        }
        if (requestedRoom == null) {
            return false;
        } else {
            currentRoom = requestedRoom;
            return true;
        }
    }

}
