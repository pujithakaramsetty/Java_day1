import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.swing.JOptionPane;
public class BlowFishCipher
{
public static void main(String[] args) throws Exception
{
KeyGenerator keygenerator=KeyGenerator.getInstance("Blowfish");
SecretKey secretkey=keygenerator.generatekey();
Cipher cipher=Cipher.getInstance("Blowfish");
cipher.init(Cipher.ENCRYPT_MODE,secretkey);
String inputText="HELLO WORLD";
byte[] encrypted=cipher.doFinal(inputText.getBytes());
cipher.init(Cipher.DECRYPT_MODE,secretkey);
byte[] decrypted=cipher.doFinal(encrypted);
System.out.println("ORIGINAL STRING:"+inputText);
System.out.println("\nEncrypted text:"+newString(encrypted));
System.out.println("Decrypted text:"+newString(decrypted));
System.exit(0);
}
}
