package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        String numberString = number.toString();
        boolean isDeluxe = number > 10 && isAllMatch(numberString);
        boolean isFizz = number % 3 == 0 || numberString.contains("3");
        boolean isBuzz = number % 5 == 0 || numberString.contains("5");
        //TODO: Refactor
        Boolean[] bools = new Boolean[] {
            isFizz, isBuzz, isDeluxe
        };
        if (isFizz && isBuzz && isDeluxe) {
            return "fizz buzz deluxe";
        }
        if (isFizz && isDeluxe) {
            return "fizz deluxe";
        }
        if (isFizz && isBuzz) {
            return "fizz buzz";
        }
        if (isBuzz && isDeluxe) {
            return "buzz deluxe";
        }
        if (isDeluxe) {
            return "deluxe";
        }
        if (isFizz) {
            return "fizz";
        }
        if (isBuzz) {
            return "buzz";
        }
        return numberString;
    }
    
    public static boolean isAllMatch(String number) {
        List<String> list = Arrays.asList(number.split(""));
        return list.stream().collect(Collectors.toSet()).size() == 1;
    }

}
