import java.util.Scanner;

public class GuessNumber {
    
    private int targetNumber;
    private Player player1;
    private Player player2;
     
    public GuessNumber(Player p1, Player p2) {
        player1 = p1;
        player2 = p2;
    }

    public void start() {
        Scanner input = new Scanner(System.in);
        targetNumber = (int) (Math.random() * 100 + 1);
        int playerNumber;
        while(true) {
            System.out.printf("Ход игрока %s. Введите число: ", player1.getName());
            player1.setNumber(input.nextInt());
            playerNumber = player1.getNumber();
            if(playerNumber == targetNumber) {
                System.out.printf("%s выиграл\n", player1.getName());
                break;
            } else if(playerNumber < targetNumber) {
                System.out.printf("%s: Число %d меньше загаданного\n", player1.getName(), playerNumber);
            } else {
                System.out.printf("%s: Число %d больше загаданного\n", player1.getName(), playerNumber);
            }

            System.out.printf("Ход игрока %s. Введите число: ", player2.getName());
            player2.setNumber(input.nextInt());
            playerNumber = player2.getNumber();
            if(playerNumber == targetNumber) {
                System.out.printf("%s выиграл\n", player2.getName());
                break;
            } else if(playerNumber < targetNumber) {
                System.out.printf("%s: Число %d меньше загаданного\n", player2.getName(), playerNumber);
            } else {
                System.out.printf("%s: Число %d больше загаданного\n", player2.getName(), playerNumber);
            }
        }
    }
}
