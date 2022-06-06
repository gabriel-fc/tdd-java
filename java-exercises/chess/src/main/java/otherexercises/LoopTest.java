package otherexercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoopTest {

    @Test
    public void forLoopTest(){
        assertEquals(1, Loop.fatorialWithFor(0));
        assertEquals(1, Loop.fatorialWithFor(1));
        assertEquals(3628800, Loop.fatorialWithFor(10));
    }

    @Test
    public void whileLoopTest(){
        assertEquals(1, Loop.fatorialWithWhile(0));
        assertEquals(1, Loop.fatorialWithWhile(1));
        assertEquals(3628800, Loop.fatorialWithWhile(10));
    }
}
