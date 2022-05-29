public class XORCipher {
    public String encrypt(String message, int key)
    {
        String result = "";
        for(int i = 0; i < message.length(); i++)
        {
            char c = (char)(message.charAt(i) ^ key);
            result += c;
        }
        return result;
    }
    public String decrypt(String message, int key)
    {
        return encrypt(message, key);
    }

    public static void main(String[] args)
    {
        int key = 99;
        String message = "I love coding";

        XORCipher cipher = new XORCipher();
        String encryptedMessage = cipher.encrypt(message, key);
        System.out.println("Encrypted message:" + encryptedMessage);

        String decryptedMessage = cipher.decrypt(encryptedMessage, key);
        System.out.println("Decrypted message:" + decryptedMessage);
    }
}
