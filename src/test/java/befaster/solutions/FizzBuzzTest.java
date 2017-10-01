package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzTest {

    @Test
    public void compute_sum() {
        assertThat(FizzBuzz.fizzBuzz(33), equalTo("fizz deluxe"));
        assertThat(FizzBuzz.fizzBuzz(11), equalTo("deluxe"));
        assertThat(FizzBuzz.fizzBuzz(55), equalTo("buzz deluxe"));
        assertThat(FizzBuzz.fizzBuzz(555), equalTo("fizz buzz deluxe"));
        assertThat(FizzBuzz.fizzBuzz(1), equalTo("1"));
    }
    
    @Test
    public void isAllMatch() {
        assertThat(FizzBuzz.isAllMatch("11"), equalTo(true));
        assertThat(FizzBuzz.isAllMatch("31"), equalTo(false));
        assertThat(FizzBuzz.isAllMatch("33"), equalTo(true));
    }
}
