import java.util.Random;

public class GuessNumber {
    
    private int targetNumber;
    private Player player1;
    private Player player2;
    private Random generator;
     
    public GuessNumber(Player p1, Player p2) {
        player1 = p1;
        player2 = p2;
        generator = new Random();
    }

    public int nextTargetNumber() {
        return generator.nextInt(100) + 1;
    }

    public void start() {
        targetNumber = nextTargetNumber();
        int answer;
        player1.setWinner(false);
        player2.setWinner(false);
        while(true) {
            answer = player1.guess();
            if(answer == targetNumber) {
                player1.setWinner(true);
                break;
            } else if(answer < targetNumber) {
                System.out.printf("%s: Число %d меньше загаданного\n", player1.getName(), answer);
            } else {
                System.out.printf("%s: Число %d больше загаданного\n", player1.getName(), answer);
            }
            answer = player2.guess();
            if(answer == targetNumber) {
                player2.setWinner(true);
                break;
            } else if(answer < targetNumber) {
                System.out.printf("%s: Число %d меньше загаданного\n", player2.getName(), answer);
            } else {
                System.out.printf("%s: Число %d больше загаданного\n", player2.getName(), answer);
            }
        }
    }
}
