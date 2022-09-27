public class Room {

    private String name;
    private String roomDescription;
    private Room north;
    private Room south;
    private Room east;
    private Room west;


    public Room(String name, String roomDescription) {
        this.name = name;
        this.roomDescription = roomDescription;
        this.north = null;
        this.south = null;
        this.east = null;
        this.west = null;
    }

    public String getName() {
        return name;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room east) {
        this.east = east;
    }

    public void setEast(Room south) {
        this.south = south;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public String toString() {
        return name + " " + roomDescription;
    }
}
