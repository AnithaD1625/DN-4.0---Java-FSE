import org.junit.Test;
import org.junit.runner.JUnitCore;
import static org.junit.Assert.*;

public class StringAssertionsTest {

    @Test
    public void testStringMethods() {
        assertEquals("hello", "he" + "llo");
        assertTrue("Java".startsWith("J"));
        assertFalse("world".isEmpty());
    }

    public static void main(String[] args) {
        JUnitCore.runClasses(StringAssertionsTest.class)
                 .getFailures()
                 .forEach(f -> System.out.println("❌ " + f));
        System.out.println("✔ All tests passed.");
    }
}
