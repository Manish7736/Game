
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int comp;
        int choice;
        int h = 0, c = 0;
        int game = 1;
        while (game <= 5) {
            System.out.print("Choose one : ");
            System.out.println("0 - Rock \t " + "1 - Paper \t" + "2 - scssior");
            choice = sc.nextInt();
            comp = rand.nextInt(3);
            switch (comp) {
                case 0:
                    System.out.println("Computer choose Rock !");
                    break;
                case 1:
                    System.out.println("Computer choose Paper !");
                    break;
                case 2:
                    System.out.println("Computer choose Scissor !");
                    break;
            }

            if (comp == choice) {
                System.out.println("Match Draw.....");
            } else if (comp == 0 && choice == 1 || comp == 1 && choice == 2 || comp == 2 && choice == 0) {
                System.out.println("You Won !");
                h++;
            } else {
                System.out.println("Computer Won !");
                c++;
            }
            game++;
        }
        System.out.println("----------------------------------");
        System.out.println("computer Point : " + c);
        System.out.println("Your Pint : " + h);
        System.out.println("------------------------------------");
        if (c > h) {
            System.out.println("Computer Won the Game!");
        } else if (c < h) {
            System.out.println("Congrats! You Won The Match..");
        } else {
            System.out.println("Match Draw... Please Play Again...");
        }
    }
}
