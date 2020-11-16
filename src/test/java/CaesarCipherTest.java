import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherTest {

    @Test
    public void newCaesarCipher_instantiatesCorrectly() {
        CaesarCipher testCaesarCipher = new CaesarCipher("rwamagana", 2);
        assertEquals(true, testCaesarCipher instanceof CaesarCipher);
    }


    @Test
    public void newCaesarCipher_getsText() {
        CaesarCipher testCaesarCipher = new CaesarCipher("rwamagana", 2);
        assertEquals("rwamagana", testCaesarCipher.getText());
    }

    @Test
    public void getCaesarCipher_getsShiftkey() {
        CaesarCipher testCaesarCipher  = new CaesarCipher("rwamagana", 2);
        assertEquals("rwamagana", testCaesarCipher.getShiftkey());
    }
}