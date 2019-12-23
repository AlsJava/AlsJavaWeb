package dev.alsjava.web;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Created by aluis on 12/10/19.
 */
public class CheckTest {

    @Test
    void test() {
        assertEquals(4, 2 + 2, "Chequeo si 2 + 2 = 4?");
    }

    @Test
    void testFail() {
        assertNotEquals(5, 2 + 2, "Chequeo si 2 + 2 = 5?");
    }
}
