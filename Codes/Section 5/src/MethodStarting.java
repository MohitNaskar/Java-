public class MethodStarting {
    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus){
        int finalScore = score;
        if (gameOver){
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;
    }

    public static void main(String[] args) {
        System.out.println(calculateScore(true, 800,5,100));
        System.out.println(calculateScore(true, 1000,8,200));

    }
}
