package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        String numberString = number.toString();
        
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        
        boolean isDeluxe = (isFizz && numberString.contains("3")) ||
                (isBuzz && numberString.contains("5"));
        boolean isFakeDeluxe = false;
        if (isDeluxe && (number % 2 == 1)) {
            isFakeDeluxe = true;
            isDeluxe = false;
        }
        
        String[] keys = new String[] {"fizz", "buzz", "deluxe", "fake deluxe"};
        List<String> retval = new ArrayList<>();
        HashMap<String, Boolean> hashMap = new HashMap<>();
        hashMap.put("fizz", isFizz);
        hashMap.put("buzz", isBuzz);
        hashMap.put("deluxe", isDeluxe);
        hashMap.put("fake deluxe", isFakeDeluxe);
        
        for (String key : keys) {
            if (hashMap.get(key)) {
                retval.add(key);
            }
        }

        
        if (retval.size()> 0) {
            return retval.stream().collect(Collectors.joining(" "));
        }
        return numberString;
    }
    
    public static boolean isAllMatch(String number) {
        List<String> list = Arrays.asList(number.split(""));
        return list.stream().collect(Collectors.toSet()).size() == 1;
    }

}
