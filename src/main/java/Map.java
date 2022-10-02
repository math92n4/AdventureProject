import java.util.ArrayList;

public class Map {

   private Room startRoom = null;

    public void mapBuild() {
        Room room1 = new Room("Room 1", "its dark and lonely in here. Something also seems off, let's keep our eyes open and be ready for whatever" +
                " might happen...");
        Room room2 = new Room("Room 2", "its dark and lonely in here ");
        Room room3 = new Room("Room 3", "its dark and lonely in here ");
        Room room4 = new Room("Room 4", "its dark and lonely in here ");
        Room room5 = new Room("Room 5", "LUCY IS THAT YOU! ");
        Room room6 = new Room("Room 6", "its dark and lonely in here ");
        Room room7 = new Room("Room 7", "its dark and lonely in here ");
        Room room8 = new Room("Room 8", "its dark and lonely in here ");
        Room room9 = new Room("Room 9", "its dark and lonely in here ");


        Item item1 = new Item("Boom Blaster", "Some sort of gun", 250);
        Item item2 = new Item("Thunder Strike", "A sword? A lightsaber?", 500);
        Item item3 = new Item("Night goggles", "Night vision", 300);
        Item item4 = new Item("Cybermunch", "Restores hp", 150);
        Item item5 = new Item("adrenaline", "Temporary damage boost", 500);
        Item item6 = new Item("Super boots", "Makes you move faster", 200);
        Item item7 = new Item("Key", "For a door?", 0);
        Item item8 = new Item("Sandevistian", "Makes you move 10x faster in battle for a few seconds", 1000);


        // item placement for room1
        room1.addItems(item1);
        room2.addItems(item2);
        room3.addItems(item3);
        room4.addItems(item4);
        room5.addItems(item5);
        room6.addItems(item6);
        room7.addItems(item7);
        room8.addItems(item8);


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

        startRoom = room1;

    }

    public Room getStartRoom() {
        return startRoom;
    }

}
