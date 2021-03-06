import java.util.Scanner;
public class ProjectCaesarCipher{
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner s = new Scanner(System.in);
        boolean done = false;
        while (!done) {

            System.out.println("please enter a cipher text");
            String ciphertext = s.next();
            System.out.println("please enter a key");
            int key = s.nextInt();
            CaesarCipher c = new CaesarCipher(key, ciphertext);
            String plainText = c.decrypt();
            System.out.println("the plain text of " + ciphertext + " is :" + plainText);
            System.out.println("do you want to perform another decryption operation?, Y or N");
            String input = s.next();
            if (input.equalsIgnoreCase("N")) {
                System.out.println("Thank you");
                done = true;
            }
        }
    }
}

class CaesarCipher {
  private int key;
    private String message; //plain text

    //default constructor
    public CaesarCipher() {
        this.key = 1;
        this.message = "message";
    }
    // second constructor to initialize instance variables
    public CaesarCipher(int k, String m) {
        this.key = k;
        this.message = m;
    }
    // this method uses the key value to encrypt the plain text message
    public String encrypt() {
        String text = "";
        char myChar;
        char newChar;
        String myString = this.message;
        for (int i = 0; i < myString.length(); i++) {
            //save the first character of the variable myString in the variable myChar
            myChar = myString.charAt(0);
            //save the next character of myChar into the varaible newChar
            newChar = (char) (myChar + key);
            text = text + newChar;
        }

        return text;

    }
       public String decrypt() {
        String text = "";
        char myChar;
        char newChar;
        String myString = this.message;
        for (int i = 0; i < myString.length(); i++) {
            //save the first character of the variable myString in the variable myChar
            myChar = myString.charAt(i);
            //save the next character of myChar into the varaible newChar
            newChar = (char) (myChar - key);
            text = text + newChar;
        }

        return text;

    } 
} 
