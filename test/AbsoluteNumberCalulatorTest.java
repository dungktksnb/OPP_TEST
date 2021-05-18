import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalulatorTest {

    @Test
    void findAbsolute() {
        int number=0;
        int experted=0;
        int result=AbsoluteNumberCalulator.findAbsolute(number);
        assertEquals(experted,result);
    }

    @Test
    void testHaiSoDoi() {
        int number=0;
        int expected=0;
        int result=AbsoluteNumberCalulator.findAbsolute(number);
        assertEquals(expected,result);
    }
}


