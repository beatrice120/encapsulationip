import static org.junit.Assert.*;
import java.util.Scanner;
public class decryptTest {


    private static final String ALPHABETS = "abcdefghijklmnopqrstuvwxyz";

    public static String decrypt1(String cipherText, int shiftKey) {

        cipherText = cipherText.toLowerCase();
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++) {

            int charPosition = ALPHABETS.indexOf(cipherText.charAt(i));
            int keyVal = (charPosition - shiftKey) % 26;
            if (keyVal < 0) {
                keyVal = CaesarCipher.ALPHABETS.length() + keyVal;
            }
            char replaceVal = CaesarCipher.ALPHABETS.charAt(keyVal);
            plainText += replaceVal;
        }
        return plainText;
    }

}