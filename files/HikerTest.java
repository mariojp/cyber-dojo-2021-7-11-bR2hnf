// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class HikerTest {

    @Test
    void life_the_universe_and_everything() {
        int expected = 42;
        int actual = Hiker.answer();
        assertEquals(expected, actual);
    }

    @Test
    void min_value_sequence() {
        int expected = -2;
        int actual = Hiker.minimumValue(new int[]{6, 9, 15, -2, 92, 11});
        assertEquals(expected, actual);
    }

    @Test
    void max_value_sequence() {
        int expected = 92;
        int actual = Hiker.maximumValue(new int[]{6, 9, 15, -2, 92, 11});
        assertEquals(expected, actual);
    }

}
