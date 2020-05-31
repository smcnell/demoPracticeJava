import java.util.Arrays;
import java.util.List;

public class KindergartenApp {
    public static void main(String[] args) {
        System.out.println("Hello");
        Score score = new Score();
        score.setReadingScore(71);
        score.setMathScore(88);
        KindergartenPassingCalculatorHillsboroughFL kindergartenPassingCalculatorHillsboroughFL = new KindergartenPassingCalculatorHillsboroughFL();
        kindergartenPassingCalculatorHillsboroughFL.passOrFail(score);

        List<String> nameList = Arrays.asList("bob", "bailey", "daniel");
        System.out.println(nameList);
        nameList
                .stream()
                .filter(n -> n.startsWith("b"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
