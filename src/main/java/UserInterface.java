import java.util.Scanner;

public class UserInterface {

    Adventure game;

    Scanner s = new Scanner(System.in);
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

    public void movement() {
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
                        System.out.println("You've gone north to " + game.getCurrentRoom().getName()
                                + " " + game.getCurrentRoom().getRoomDescription());
                    else System.out.println("You really wanna jump out the window that bad huh...");
                    break;
                case "go south":
                    game.goSouth();
                    if (game.goSouth() == true)
                        System.out.println("You've gone south to " + game.getCurrentRoom().getName()
                                + " " + game.getCurrentRoom().getRoomDescription());
                    else System.out.println("We're pretty high up in the sky, I'm not so sure about that...");
                    break;
                case "go west":
                    game.goWest();
                    if (game.goWest() == true)
                        System.out.println("You've gone west to " + game.getCurrentRoom().getName()
                                + " " + game.getCurrentRoom().getRoomDescription());
                    else System.out.println("Uhmm not gonna happen, nope...");
                    break;
                case "go east":
                    game.goEast();
                    if (game.goEast() == true)
                        System.out.println("You've gone east to " + game.getCurrentRoom().getName()
                                + " " + game.getCurrentRoom().getRoomDescription());
                    else System.out.println("Can we not have suicidal thoughts just for once?...");
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
