public class KindergartenPassingCalculatorFL implements PassingCalculator{
    public boolean passOrFail(Score score) {
        System.out.println("Florida");
        return score.getMathScore() > 75 && score.getReadingScore() > 75;
    }
}
