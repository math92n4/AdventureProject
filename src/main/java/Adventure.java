public class Adventure {

    Map rooms = new Map();
    Player player = new Player();

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
