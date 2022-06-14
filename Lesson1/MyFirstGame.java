public class MyFirstGame {
    public static void main(String[] args) {
        int guess = (int) System.currentTimeMillis() % 100 + 1;
        int max = 100;
        int min = 0;
        int answer = max - ((max - min) / 2);
        while(answer != guess) {
            if(answer > guess) {
                System.out.printf("Число %d больше, чем загаданное\n", answer);
                max = answer;
            } else {
                System.out.printf("Число %d меньше, чем загаданное\n", answer);
                min = answer;
            }
            answer = max - ((max - min) / 2);
        }
        System.out.println("Вы победили!");
    }
}
