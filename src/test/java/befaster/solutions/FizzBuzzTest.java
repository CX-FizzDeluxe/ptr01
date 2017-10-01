package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzTest {

    @Test
    public void compute_sum() {
        assertThat(FizzBuzz.fizzBuzz(31), equalTo("fizz"));
    }
    
    @Test
    public void isAllMatch() {
        assertThat(FizzBuzz.isAllMatch("11"), equalTo(true));
        assertThat(FizzBuzz.isAllMatch("31"), equalTo(false));
        assertThat(FizzBuzz.isAllMatch("33"), equalTo(true));
    }
}