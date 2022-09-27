import java.util.Scanner;

public class UserInterface {

    Scanner s = new Scanner(System.in);

    public void start() {

        Adventure game = new Adventure();
        game.createRooms();

        System.out.println("WELCOME TO THE ADVENTURE GAME");
        System.out.println("-----------------------------");
        System.out.println("Type 'go north' to go north");
        System.out.println("Type 'go south' to go south");
        System.out.println("Type 'go west' to go west");
        System.out.println("Type 'go east' to go east");
        System.out.println("Type 'look around' to look around");

        /*("Night City", "Is like a toxic lover. A seductive and ruthless one at that, it's capable of" +
            "teasing you with the promises ");*/

        do {
            String walk = s.nextLine();


           switch (walk) {
                case "go north":
                    game.goNorth();
                    if (game.getCurrentRoom() == null)
                        System.out.println("Do you really wanna jump out the window that bad...");
                    else System.out.println("You've gone north");
                    break;
                case "go south":
                    game.goSouth();
                    if (game.getCurrentRoom() == null)
                        System.out.println("Do you really wanna jump out the window that bad...");
                   else System.out.println("You've gone south");
                    break;
                case "go west":
                    game.goWest();
                    if (game.getCurrentRoom() == null)
                        System.out.println("Do you really wanna jump out the window that bad...");
                   else System.out.println("You've gone west");
                    break;
                case "go east":
                    game.goEast();
                    if (game.getCurrentRoom() == null)
                        System.out.println("Do you really wanna jump out the window that bad...");
                   else System.out.println("You've gone east");
                    break;
                case "look around":
                    System.out.println("Looking around ");
                    System.out.println("You are in: " + game.getCurrentRoom().getName());
                    System.out.println("--------------");
                    System.out.println(game.getCurrentRoom().getRoomDescription());
                    break;
            }
        } while (true);
    }
}
