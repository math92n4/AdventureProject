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

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public Room getNorth() {
        return north;
    }

    public Room getSouth() {
        return south;
    }

    public Room getEast() {
        return east;
    }

    public Room getWest() {
        return west;
    }

    public String toString() {
        return name + " " + roomDescription;
    }
}
