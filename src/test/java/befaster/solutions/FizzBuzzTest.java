package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzTest {

    @Test
    public void compute_sum() {
        assertThat(FizzBuzz.fizzBuzz(31), equalTo("fizz"));
    }
}