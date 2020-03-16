import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ReverseStringRecursiveTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void shouldPrintReverseString(){
        var givenString = "hello";
        ReverseStringRecursive.reverseString(givenString);
        Assert.assertEquals("olleh", outContent.toString());
    }

    @Test
    public void shouldNotReverseWhenEmpty(){
        var givenString = "";
        ReverseStringRecursive.reverseString(givenString);
        Assert.assertEquals(0, outContent.toString().length());
    }

    @Test
    public void shouldHandleNull(){
        ReverseStringRecursive.reverseString(null);
        Assert.assertEquals(0, outContent.toString().length());
    }
}
