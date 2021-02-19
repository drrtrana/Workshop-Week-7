import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class AddressTest {
    /*@Test
    void toString_shouldReturnFormattedAddressAsString() {
        Address a1 = new Address(1234, "Willow Ave", 2, "Springfield", "Illinois", 987654);
        Address a2 = new Address(4, "Privet Drive", "Little Whinging", "Surrey", 123456);
        assertEquals("1234 Willow Ave\nSpringfield, Illinois 987654", a1.toString());
        assertEquals("4 Privet Drive\nLittle Whinging, Surrey 123456", a2.toString());
    }*/

    /*@Test
    void comesBefore_shouldReturnTrueIfCallingAddressComesBeforeParameterAddress() {
        Address a1 = new Address(1234, "Willow Ave", 2, "Springfield", "Illinois", 987654);
        Address a2 = new Address(4, "Privet Drive", "Little Whinging", "Surrey", 123456);
        assertFalse(a1.comesBefore(a2));
        assertTrue(a2.comesBefore(a1));
    }*/
}