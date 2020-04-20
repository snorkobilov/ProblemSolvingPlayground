import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IpAddressTest {

    @Test
    void defangIPaddr() {
        String givenIpAddress = "1.1.1.1";
        String expectedAddress = "1[.]1[.]1[.]1";
        assertEquals(expectedAddress, IpAddress.defangIPaddr(givenIpAddress));
    }
}