package demo.juni.label;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class FizzBuzzTest {
    
    FizzBuzz fizzBuzz;
    String actualResult;

    @Test
    public void sayFizzWhenNumberDivedByThree() {
        Given:
        fizzBuzz = new FizzBuzz(3);
            
        When:
        actualResult = fizzBuzz.say();
       
        Then:
        assertEquals("Fizz", actualResult);
        
    }
}
