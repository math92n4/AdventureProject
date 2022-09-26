import java.util.Scanner;

public class UserInterface {

    Scanner s = new Scanner(System.in);
    public void start() {

        Adventure game = new Adventure();


        System.out.println("WELCOME TO THE ADVENTURE GAME");
        System.out.println("-----------------------------");
        System.out.println("Type 'go north' to go north");
        System.out.println("Type 'go south' to go south");
        System.out.println("Type 'go west' to go west");
        System.out.println("Type 'go east' to go east");
        System.out.println("Type 'look around' to look around");

        do {

            String walk = s.nextLine();

            switch (walk) {
                case "go north":
                    System.out.println("You've gone north");
                    break;
                case "go south":
                    System.out.println("You've gone south");
                    break;
                case "go west":
                    System.out.println("You've gone west");
                    break;
                case "go east":
                    System.out.println("You've gone east");
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
