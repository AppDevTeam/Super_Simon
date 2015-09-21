/**
 *  Tests the ScoreKeeper class
 *
 *  @author Zina Schroeder
 *  @version 1.0
 */
public class ScoreTester {

    public static void main(String[] args) {

        ScoreKeeper scoreKeeper = new ScoreKeeper();
        
        scoreKeeper.addNewScore("Zina", 29);
        scoreKeeper.addNewScore("Jacob", 42);
        scoreKeeper.addNewScore("Janet", 18);
        scoreKeeper.addNewScore("Jason", 32);
        scoreKeeper.addNewScore("Amanda", 56);

        System.out.print(scoreKeeper.getHighScoreList());
    }
}