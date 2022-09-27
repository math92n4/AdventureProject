public class Adventure {

    Room currentRoom = null;

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void createRooms() {
        Room room1 = new Room("Room 1", "its dark and lonely in here");
        Room room2 = new Room("Room 2", "its dark and lonely in here");
        Room room3 = new Room("Room 3", "its dark and lonely in here");
        Room room4 = new Room("Room 4", "its dark and lonely in here");
        Room room5 = new Room("Room 5", "its dark and lonely in here");
        Room room6 = new Room("Room 6", "its dark and lonely in here");
        Room room7 = new Room("Room 7", "its dark and lonely in here");
        Room room8 = new Room("Room 8", "its dark and lonely in here");
        Room room9 = new Room("Room 9", "its dark and lonely in here");

        // movement for room 1
        room1.setEast(room2);
        room1.setSouth(room4);

        // movement for room 2
        room2.setWest(room1);
        room2.setEast(room3);

        // movement for room 3
        room3.setWest(room2);
        room3.setSouth(room6);

        // movement for room 4
        room4.setNorth(room1);
        room4.setSouth(room7);

        // movement for room 5
        room5.setSouth(room8);

        // movement for room 6
        room6.setNorth(room3);
        room6.setSouth(room9);

        // movement for room 7
        room7.setNorth(room4);
        room7.setEast(room8);

        // movement for room 8
        room8.setNorth(room5);
        room8.setWest(room7);
        room8.setEast(room9);

        // movement for room 9
        room9.setNorth(room6);
        room9.setWest(room8);

        currentRoom = room1;
    }
}
