import java.util.Random;
import java.util.Scanner;

public class Main {
    static int height;
    static int width;
    static int path[][];
    static int b[][];
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("->");
        System.out.println("Enter 0 if the path is obstacle free");
        System.out.println("Enter 1 to introduce a snake");
        System.out.println("Enter 2 to introduce a ladder");
        System.out.println("->");
        System.out.println("Enter the height of game");
        height = sc.nextInt();
        System.out.println("Enter the width of game");
        width = sc.nextInt();
        path = new int[height][width];
        b = new int[height][width];
        int player[] = new int[4];
        int dice = 0, size = 0, currplayer = 0;
        size = height * width;
        System.out.println("There are total " + size + " blocks.");
        System.out.println("Enter the values('0','1','2') in each blocks for free path/ladder/Snakes and the advantage/penalty(if applicable)");
        int block = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.println("Enter value for Block " + block);
                block++;
                path[i][j] = sc.nextInt();
                if (path[i][j] == 0)
                    b[i][j] = 0;
                if (path[i][j] == 1) {
                    System.out.println("Enter the penalty");
                    int p = sc.nextInt();
                    b[i][j] = p;
                }
                if (path[i][j] == 2) {
                    System.out.println("Enter the advantage");
                    int ad = sc.nextInt();
                    b[i][j] = ad;
                }
            }
        }
        boolean run = true;
        while (run) {
            for (int k = 0; k < 4; k++) {
                dice = random.nextInt(6) + 1;
                System.out.println("Value of dice: " + dice);
                currplayer = player[k];
                player[k] = move(currplayer, dice);
                System.out.println("Present value of Player" + (k + 1) + ": " + player[k]);
                if (player[k] >= size) {
                    System.out.println("Player " + (k + 1) + " Wins!");
                    run = false;
                    System.exit(1); // Game Ends.
                }
            }
        }
    }
    static int move(int currplayer, int dice) {
        int co = 0;
        currplayer += dice;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                co++;
                if (co == currplayer) {
                    if (path[i][j] == 1 || path[i][j] == 2)
                        currplayer += b[i][j];
                    if (currplayer < 0)
                        currplayer = 0;
                }
            }
        }
        return currplayer;
    }
}
