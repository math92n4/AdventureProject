public class Adventure {

    Map rooms = new Map();

    private Room currentRoom = null;

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public boolean goNorth() {
        Room requestedRoom = null;
        requestedRoom = currentRoom.getNorth();
       if (requestedRoom != null) {
           currentRoom = requestedRoom;
           return true;
       } return false;
    }

    public boolean goSouth() {
        Room requestedRoom = null;
        requestedRoom = currentRoom.getSouth();
        if (requestedRoom != null) {
            currentRoom = requestedRoom;
            return true;
        } return false;
    }

    public boolean goWest() {
        Room requestedRoom = null;
        requestedRoom = currentRoom.getWest();
        if (requestedRoom != null) {
            currentRoom = requestedRoom;
            return true;
        } return false;
    }

    public boolean goEast() {
        Room requestedRoom = null;
        requestedRoom = currentRoom.getEast();
        if (requestedRoom != null) {
            currentRoom = requestedRoom;
            return true;
        } return false;
    }

    public Adventure() {
        rooms.mapBuild();
        currentRoom = rooms.getStartRoom();
    }
}
