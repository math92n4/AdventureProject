public class Room {

    private String name;
    private String roomDescription;

    public Room(String name,String roomDescription) {
        this.name = name;
        this.roomDescription = roomDescription;
    }

    public String getName() {
        return name;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public String toString() {
        return roomDescription;
    }


}
