import java.util.Scanner;

public class UserInterface {

    private Adventure game;
    private Scanner s = new Scanner(System.in);

    public UserInterface(Adventure controller) {
        this.game = controller;
    }

    public void start() {

        System.out.println("Night City.\n" +
                "A lot like a toxic lover. is seductive and ruthless, it's capable of\n" +
                "teasing you with the countless promises and joys of life, but for the most part screws you up. The city has spiraled out of\n" +
                "control ever since Chrome came to town... It's now a place of violence, greed and constant fight for power.\n" +
                "You're surrounded by countless corporate buildings, high skyscrapers with glass walls shinier than most could imagine, junkies and Cyberpunks.\n" +
                "And if you've made it this far already, you're in for a lot of trouble. Welcome to Night City, the place of your wildest desires.");
    }

    public void gameCommands() {
        System.out.println("\nCONTROLS: ");
        System.out.println("-----------------------------");
        System.out.println("Type 'north' to go north");
        System.out.println("Type 'south' to go south");
        System.out.println("Type 'west' to go west");
        System.out.println("Type 'east' to go east");
        System.out.println("Type 'look' to look around");
        System.out.println("-----------------------------");

        System.out.println("Type 'inventory' to see what is in your inventory");
        System.out.println("Type 'take' to pick up things from a room");
        System.out.println("Type 'drop' to drop an item from your inventory");
        System.out.println("-----------------------------");

        System.out.println("Type 'health/hp' to check current health status");
        System.out.println("Type 'eat' to consume food");
        System.out.println("-----------------------------");
    }

    public void gameEngine() {
        boolean error = false;
        do {
            error = false;
            String walk = s.nextLine();
            String[] userInputs = walk.split(" "); // array af strings // deler stringen op og splitter på mellemrum
            String command = userInputs[0];
            String userChoice = "";
            if (userInputs.length > 1) {
                userChoice = userInputs[1];
            }

            switch (command) {
                case "go":
                    boolean succes = game.go(userChoice);
                    if (succes) {
                        Room currentRoom = game.getCurrentRoom();
                        System.out.println("You've gone " + userChoice);
                        System.out.println(currentRoom.getName() + " " + currentRoom.getRoomDescription());

                    } else {
                        System.out.println("Do you really want jump out the window that bad huh?...");
                    }
                    break;
                case "look":
                    System.out.println("Looking around ");
                    System.out.println("You are in: " + game.getCurrentRoom().getName());
                    System.out.println("--------------");
                    System.out.println(game.getCurrentRoom().getRoomDescription());
                    System.out.println("\nThese are the items in the room: ");
                    Room currentRoom = game.getCurrentRoom();
                    for (Item item : currentRoom.getItems()) {
                        System.out.println(item.getItemName() + item.getItemDescription());
                    }
                    break;

                case "inventory", "inven", "inv":
                    System.out.println("Your inventory contains: " + game.getInventory());
                    break;
                case "take":
                    System.out.println("You've picked up " + game.takeItem(userChoice));
                    System.out.println();
                    break;
                case "drop":
                    System.out.println("You've dropped: " + game.dropItem(userChoice));
                    break;
                case "health", "hp":
                    if (game.getHealthPoints() >= 100)
                        System.out.println("You currently have: " + game.getHealthPoints() + " you're full health!");
                    if (game.getHealthPoints() > 50 && game.getHealthPoints() < 100)
                        System.out.println("You currently have: " + game.getHealthPoints() + " you're good to go!");
                    if (game.getHealthPoints() > 25 && game.getHealthPoints() < 50) ;
                    System.out.println("You currently have: " + game.getHealthPoints() + " find something to eat...");
                    if (game.getHealthPoints() > 1 && game.getHealthPoints() < 25)
                        System.out.println("You currently have: " + game.getHealthPoints() + " it's not looking good");
                    break;
                case "eat":
                    System.out.println("You've eaten: " + game.eatFood(userChoice));
                    break;
                default:
                    System.out.println("You can't eat that...");
            }
        } while (true);
    }
}


/* if (game.goNorth() == true) {
                        Room currentRoom = game.getCurrentRoom();
                        System.out.println("You've gone north to " + currentRoom.getName()
                                + " " + currentRoom.getRoomDescription());
                        System.out.println("These are the items in this room: ");
                        System.out.println(" ");
                        for( Item item : currentRoom.getItems() ) {
                            System.out.println(item.getItemName() + item.getItemDescription());
                        }
                    }
                    else System.out.println("You really wanna jump out the window that bad huh..."); */

/*  case "south", "s":
                    if (game.goSouth() == true){
                        Room currentRoom = game.getCurrentRoom();
                        System.out.println("You've gone south to " + currentRoom.getName()
                                + " " + currentRoom.getRoomDescription());
                        System.out.println("These are the items in this room: ");
                        for( Item item : currentRoom.getItems() ) {
                            System.out.println(item.getItemName() + item.getItemDescription());
                        }
                    }
                    else System.out.println("We're pretty high up in the sky, I'm not so sure about that...");
                    break;
                case "west", "w":
                    if (game.goWest() == true) {
                        Room currentRoom = game.getCurrentRoom();
                        System.out.println("You've gone west to " + currentRoom.getName()
                                + " " + currentRoom.getRoomDescription());
                        System.out.println("These are the items in this room: ");
                        for( Item item : currentRoom.getItems() ) {
                            System.out.println(item.getItemName() + item.getItemDescription());
                        }
                    }
                    else System.out.println("Uhmm not gonna happen, nope...");
                    break;
                case "east", "e":
                    if (game.goEast() == true) {
                        Room currentRoom = game.getCurrentRoom();
                        System.out.println("You've gone east to " + currentRoom.getName()
                                + " " + currentRoom.getRoomDescription());
                        System.out.println("These are the items in this room: ");
                        for( Item item : currentRoom.getItems() ) {
                            System.out.println(item.getItemName() + item.getItemDescription());
                        }
                    }
                    else System.out.println("Can we not have suicidal thoughts just for once?...");
                    break; */