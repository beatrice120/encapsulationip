
import java.util.Scanner;
public class CaesarCipher {
    private String text;
    private int shiftkey;

    public CaesarCipher(String text, int shiftkey) {
        this.text = text;
        this.shiftkey = shiftkey;
    }

    public String  getText(){
        return this.text;
    }
public  int getShiftkey(){

        return this.shiftkey;
    }
    public static final String ALPHABETS="abcdefghijklmnopqrstuvwxyz";
    public static String CaesarCipher1(String message,int shiftKey){

      message = message.toLowerCase();
      StringBuilder CaesarCipher2=new StringBuilder();
      for (int counter = 0; counter < message.length() ; counter++){
       if(Character.isLetter(message.charAt(counter))){
           int CharPosition= ALPHABETS.indexOf(message.charAt(counter));
           int KeyValue= (CharPosition +shiftKey) % 26;
           char CyperValue = ALPHABETS .charAt(KeyValue);
           CaesarCipher2.append(CyperValue);

       }
       else {

           CaesarCipher2.append(message.charAt(counter));

       }
      }
return CaesarCipher2.toString();
    }


}