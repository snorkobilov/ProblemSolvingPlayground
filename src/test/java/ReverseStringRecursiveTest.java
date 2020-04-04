import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringRecursiveTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void shouldPrintReverseString(){
        var givenString = "hello";
        ReverseStringRecursive.reverseString(givenString);
        assertEquals("olleh", outContent.toString());
    }

    @Test
    public void shouldNotReverseWhenEmpty(){
        var givenString = "";
        ReverseStringRecursive.reverseString(givenString);
        assertEquals(0, outContent.toString().length());
    }

    @Test
    public void shouldHandleNull(){
        ReverseStringRecursive.reverseString(null);
        assertEquals(0, outContent.toString().length());
    }
}
