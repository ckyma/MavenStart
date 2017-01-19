package test.java.hello;

import main.java.hello.Greeter;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

/**
 * Created by yuchen on 1/18/2017.
 */
public class GreeterTest {

    private Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHello(){
        assertThat(greeter.sayHello(), containsString("Hello"));
    }

}
