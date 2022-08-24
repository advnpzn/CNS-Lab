import java.util.Scanner;

public class CaesarCipher
{

    public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static String encryptData(String inputStr, int shiftKey)
    {

        inputStr = inputStr.toLowerCase();
        String encryptedString = "";

        for (int i = 0; i < inputStr.length(); i++)
        {
            if (inputStr.charAt(i) == ' ')
            {
                encryptedString += ' ';
            }
            else 
            {
                int pos = alphabet.indexOf(inputStr.charAt(i));
                int encryptPos = (pos + shiftKey) % 26;
                char encryptChar = alphabet.charAt(encryptPos);
                encryptedString += encryptChar;
            }
            
        }

        return encryptedString;
    }

    public static String decryptData(String inputStr, int shiftKey)
    {

        inputStr = inputStr.toLowerCase();
        String decryptedString = "";

        for (int i = 0; i < inputStr.length(); i++)
        {
            if (inputStr.charAt(i) == ' ')
            {
                decryptedString += ' ';
            }
            else 
            {
                int pos = alphabet.indexOf(inputStr.charAt(i));
                int decryptPos = (pos - shiftKey) % 26;
                if(decryptPos < 0)
                {
                    decryptPos = alphabet.length() + decryptPos;
                }
                char decryptChar = alphabet.charAt(decryptPos);
                decryptedString += decryptChar;
            }
            
        }

        return decryptedString;
    }

    public static void main(String[] args) 
    {
        System.out.println("---------------\nCaesar Cipher\n---------------");
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter plain text : ");
        String text = s.nextLine();
        s.close();
        String cipher = encryptData(text, 3);
        System.out.println("\nEncrypted text : " + cipher + "\n");
        System.out.println("Decrypted text : " + decryptData(cipher, 3));

    }
}   
