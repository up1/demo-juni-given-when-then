package demo.juni.label;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;

import static com.insightfullogic.lambdabehave.Suite.describe;

@RunWith(JunitSuiteRunner.class)
public class FizzBuzzFluentTest {
    {
        describe("FizzBuzz game", it -> {

            it.should("say Fizz", expect -> {
                FizzBuzz fizzBuzz;
                Given: 
                fizzBuzz = new FizzBuzz(3);

                String actualResult;
                When: 
                actualResult = fizzBuzz.say();

                Then: 
                expect.that(actualResult).is("Fizz");

            });

        });
    }

}
