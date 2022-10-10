import java.lang.reflect.Array;
import java.util.ArrayList;

public class Adventure {

    Player player = new Player();

    public Adventure() {
        Map map = new Map();
        map.mapBuild();
        player.setCurrentRoom(map.getStartRoom());
    }

    public boolean go(String direction) {
        return player.move(direction.charAt(0));
    }

    public Room getCurrentRoom() {
        return player.getCurrentRoom();
    }

    public ArrayList<Item> getInventory() {
        return player.getInventory();
    }

    public Weapon getEquippedWeapon() {
        return player.getEquippedWeapon();
    }

    public boolean takeItem(String itemName) {
        return player.takeItem(itemName);
    }

    public boolean dropItem(String itemName) {
        return player.dropItem(itemName);
    }

    public boolean eatFood(String itemName) {
        return player.eatFood(itemName);
    }

    public boolean equipWeapon(String itemName) {
        return player.equipWeapon(itemName);
    }

    public ENUM.attackCommands attackEnemy(String enemyName) {
        return player.attackEnemy(enemyName);
    }



    public int getHealthPoints() {
        return player.getHealth();
    }



}
