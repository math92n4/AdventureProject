import java.util.ArrayList;

public class Player {

    private Room currentRoom;
    private ArrayList<Item> inventory = new ArrayList<>();

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
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
