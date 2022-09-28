import java.util.Scanner;

public class UserInterface {

    Scanner s = new Scanner(System.in);

    public void start() {

        Adventure game = new Adventure();


        System.out.println("Night City.\n" +
                "A lot like a toxic lover. is seductive and ruthless, it's capable of\n" +
                "teasing you with the countless promises and joys of life, but for the most part screws you up. The city has spiraled out of\n" +
                "control ever since Chrome came to town... It's now a place of violence, greed and constant fight for power.\n" +
                "You're surrounded by countless corporate buildings, and high sky scrapers with glass walls shinier than most could imagine...\n" +
                "And if you've made it this far already, you're in for deep trouble. Welcome to Night City, the city of hope and despair\n");
        System.out.println("-----------------------------");
        System.out.println("Type 'go north' to go north");
        System.out.println("Type 'go south' to go south");
        System.out.println("Type 'go west' to go west");
        System.out.println("Type 'go east' to go east");
        System.out.println("Type 'look around' to look around");


        boolean error = false;

        do {
            error = false;
            String walk = s.nextLine();
            switch (walk) {
                case "go north":
                    if (game.goNorth() == true)
                        System.out.println("You've gone north");
                    else System.out.println("Do you really wanna jump out the window that bad...");
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
