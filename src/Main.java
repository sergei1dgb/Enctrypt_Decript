public class Main {
    final static String GAMMA = "I am best of the best";
    static String message = "I love to exercise sport and make my body stronger";
    static char[] chars;
    public static void main(String[] args) {
        EncryptDecrypt encDec = new EncryptDecrypt();
        chars = encDec.encrypt(GAMMA, message);
       System.out.println(chars);
       chars = encDec.dencrypt(GAMMA, chars.toString());
        System.out.println(chars);


    }
}
