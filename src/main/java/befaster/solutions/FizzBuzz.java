package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        String numberString = number.toString();
        boolean isAllMatch = Arrays.asList(string.toCharArray()).stream().collect(Collectors.toSet());
        boolean isDeluxe = number > 0 && isAllMatch(numberString);
        boolean isFizz = number % 3 == 0 || numberString.contains("3");
        boolean isBuzz = number % 5 == 0 || numberString.contains("5");
        if (isFizz && isBuzz) {
            return "fizz buzz";
        }
        if (isFizz) {
            return "fizz";
        }
        if (isBuzz) {
            return "buzz";
        }
        return numberString;
    }

}
