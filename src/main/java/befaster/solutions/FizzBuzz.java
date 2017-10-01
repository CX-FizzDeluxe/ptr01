package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        String numberString = number.toString();
        boolean isDeluxe = number > 10 && isAllMatch(numberString);
        boolean isFakeDeluxe = false;
        if (isDeluxe && (number % 2 == 1)) {
            isFakeDeluxe = true;
            isDeluxe = false;
        }
        boolean isFizz = number % 3 == 0 || numberString.contains("3");
        boolean isBuzz = number % 5 == 0 || numberString.contains("5");
        //TODO: Refactor
        HashMap<String, Boolean> map = new HashMap<>();
        map.put("fizz", isFizz);
        map.put("buzz", isBuzz);
        map.put("deluxe", isDeluxe);
        map.put("fake deluxe", isFakeDeluxe);
        
        List<String> retval = map.entrySet().stream().map(entry -> {
            if (entry.getValue()) {
                return entry.getKey();
            }
        }).collect(Collectors.toList());
        
        if (retval.length() > 0) {
            return retval.join(" ");
        }
        return numberString;
    }
    
    public static boolean isAllMatch(String number) {
        List<String> list = Arrays.asList(number.split(""));
        return list.stream().collect(Collectors.toSet()).size() == 1;
    }

}
