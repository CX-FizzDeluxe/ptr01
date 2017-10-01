package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        String numberString = number.toString();
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
