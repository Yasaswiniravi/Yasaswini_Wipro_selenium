package Assignment6;
enum Difficulty {
    EASY, MEDIUM, HARD
}
class Game {
    public Game(Difficulty diff) {
        int bullets;
        switch (diff) {
            case EASY:
                bullets = 3000;
                break;
            case MEDIUM:
                bullets = 2000;
                break;
            case HARD:
                bullets = 1000;
                break;
            default:
                bullets = 0; // Just in case
        }
        System.out.println("Difficulty: " + diff);
        System.out.println("Bullets: " + bullets);
    }
}
public class gamesetup {
    public static void main(String[] args) {
        new Game(Difficulty.EASY);
        new Game(Difficulty.MEDIUM);
        new Game(Difficulty.HARD);
    }
}

