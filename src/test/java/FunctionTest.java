package test.java;

import main.java.Function;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionTest {

    @Test
    public void testAdd(){
        Function f = new Function();
        assertEquals(2, f.add(1, 1));
    }

    @Test
    public void testCompareTo(){
        Function f = new Function();
        assertEquals(-2, f.compareTo("1", null));
    }
}