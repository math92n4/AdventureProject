public class Adventure {

    Player player = new Player();

    public Adventure() {
        Map map = new Map();
        map.mapBuild();
        player.setCurrentRoom(map.getStartRoom());
    }

    public boolean goNorth() {
        return player.goNorth();
    }

    public boolean goSouth() {
        return player.goSouth();
    }

    public boolean goWest() {
        return player.goWest();
    }

    public boolean goEast() {
        return player.goEast();
    }

    public Room getCurrentRoom() {
        return player.getCurrentRoom();
    }


}
