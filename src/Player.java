public class Player {

    private String name;
    private int score;
    private int roundScore;



    public Player(String name) {
        this.name = name;
        roundScore = 0;
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void incrementScore() {
        score++;
    }

    public void reset() {
        score = 0;

    }
}