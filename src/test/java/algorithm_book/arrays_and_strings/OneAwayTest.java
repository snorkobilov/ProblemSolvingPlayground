package algorithm_book.arrays_and_strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OneAwayTest {

    OneAway oneAway;

    @BeforeEach
    void setUp() {
        oneAway = new OneAway();
    }

    @Test
    void returnsTrueWhenOneReplace() {
        assertTrue(oneAway.isOneAway("ana", "ani"));
    }

    @Test
    void returnsTrueWhenOneRemove() {
        assertTrue(oneAway.isOneAway("anak", "ana"));
    }

    @Test
    void returnsTrueWhenOneAddition() {
        assertTrue(oneAway.isOneAway("anak", "anakl"));
    }

    @Test
    void returnsFalseWhenTheSame() {
        assertFalse(oneAway.isOneAway("anabu", "anabu"));
    }

    @Test
    void returnsFalseWhenMoreEdits() {
        assertFalse(oneAway.isOneAway("asdf", "asaa"));
    }
}