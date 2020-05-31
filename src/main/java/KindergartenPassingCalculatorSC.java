public class KindergartenPassingCalculatorSC implements PassingCalculator{
    public boolean passOrFail(Score score) {
        return score.getMathScore() > 70 && score.getReadingScore() > 70;
    }
}
