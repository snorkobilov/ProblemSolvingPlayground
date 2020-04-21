import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelsAndStonesTest {

    @Test
    void numJewelsInStones() {
        String J = "aA", S = "aAAbbbb";

        assertEquals(3, JewelsAndStones.numJewelsInStones(J, S));
    }

    @Test
    void numJewelsInStones2() {
        String J = "aA", S = "aAAbbbb";

        assertEquals(3, JewelsAndStones.numJewelsInStones2(J, S));
    }
}