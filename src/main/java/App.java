
import java.util.Scanner;

public class App {
    public static void main(String []args) {
Scanner aScanner=new Scanner(System.in);
String plainText;
int shiftKey;
System.out.println("Please Enter message to encrypt:");
plainText=aScanner.nextLine();
System.out.println("Enter shift key");
shiftKey=aScanner.nextInt();
        System.out.println("the encrypted text:" + CaesarCipher.CaesarCipher1(plainText,shiftKey));

    }
    }

