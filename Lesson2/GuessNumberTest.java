import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(input.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(input.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String repeat;
        do {
            game.start();
            if(player1.getWinner()) {
                System.out.printf("Игрок %s победил\n", player1.getName());
            } else {
                System.out.printf("Игрок %s победил\n", player2.getName());
            }
            do {
                System.out.print("Хотите повторить игру? [yes/no]: ");
                repeat = input.nextLine().toLowerCase();
            } while(!repeat.equals("yes") &&
                    !repeat.equals("no"));
        } while(repeat.equals("yes"));
        input.close();
    }
}
