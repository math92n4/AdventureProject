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

        Item item2 = new Item("sword", " +attack");
        Item item3 = new Item("goggles", " +utility");
        Item item4 = new Item("shotgun", " +attack");
        Item item5 = new Item("adrenaline,", " +dmg boost");
        Item item6 = new Item("boots", " +movement");
        Item item7 = new Item("armor", " +toughness");
        Item item8 = new Item("key", " for a door?");

        Food food1 = new Food("apple", " +15 hp");
        Food food2 = new Food("proteinbar", " +20 hp");
        Food food3 = new Food("rotten meat", " -25 hp");
        Food food4 = new Food("tequila", " -35 hp");
        Food food5 = new Food("mountain dew", " +15 hp");
        Food food6 = new Food("sushi", " +50 hp");

        // food placement
        room1.addItem(food1);
        room2.addItem(food2);
        room3.addItem(food3);
        room4.addItem(food4);
        room9.addItem(food5);
        room7.addItem(food6);

        // item placement
        room2.addItem(item2);
        room3.addItem(item3);
        room4.addItem(item4);
        room5.addItem(item5);
        room6.addItem(item6);
        room7.addItem(item7);
        room9.addItem(item8);

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
