import java.util.Random;
import java.util.Scanner;

public class Game {

    private static void hit(Enemy enemy){
        Scanner scan = new Scanner(System.in);
        System.out.println("Where do you want to hit? (0 - 10)");
        int attack = scan.nextInt();
        enemy.hit(attack);
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int choice = 0;

        while(true) {
            Enemy enemy = new Enemy(random.nextInt(11), random.nextInt(4));
            System.out.println("New enemy appeared!");
            while (enemy.isAlive()) {
                System.out.println("What do you want to do? (1 - hit, 2 - look)");
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        hit(enemy);
                        break;
                    case 2:
                        enemy.look();
                        break;
                    default:
                        System.out.println("Sorry, I don't understand");
                        break;
                }
            }
        }
    }
}
