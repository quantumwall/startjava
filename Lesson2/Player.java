import java.util.Random;

public class Player {
    
    private String name;
    private boolean winner;
    private Random generator;

    public Player(String name) {
        this.name = name;
        winner = false;
        generator = new Random();
    }

    public String getName() {
        return name;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public boolean getWinner() {
        return winner;
    }

    public int guess() {
        return generator.nextInt(100) + 1;
    }
}
