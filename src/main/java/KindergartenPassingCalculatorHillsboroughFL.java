public class KindergartenPassingCalculatorHillsboroughFL extends KindergartenPassingCalculatorFL {
    public boolean isAtRisk(Score score) {
        return score.getAlphabetScore() < 80;
    }
    public boolean passOrFail(Score score) {
        System.out.println("Hillsborough");
        return super.passOrFail(score) && score.getAlphabetScore() > 80;
    }
}
