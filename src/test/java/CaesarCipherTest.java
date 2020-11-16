import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherTest {

    @Test
    public void newCaesarCipher_instantiatesCorrectly() {
        CaesarCipher testCaesarCipher = new CaesarCipher("betty", 2);
        assertEquals(true, testCaesarCipher instanceof CaesarCipher);
    }


    @Test
    public void newCaesarCipher_getsText() {
        CaesarCipher testCaesarCipher = new CaesarCipher("betty", 3);
        assertEquals("betty", testCaesarCipher.getText());
    }

    @Test
    public void getCaesarCipher_getsShiftkey() {
        CaesarCipher testCaesarCipher  = new CaesarCipher("betty", 3);
        assertEquals("betty", testCaesarCipher.getShiftkey());
    }
}