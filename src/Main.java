public class Main {
    final static String GAMMA = "I am best of the best";
    static String message = "I love to exercise sport and make my body strongerzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
    static char[] chars;
    public static void main(String[] args) {
        EncryptDecrypt encDec = new EncryptDecrypt();
        chars = encDec.encrypt(GAMMA, message);
       System.out.println(chars);
       chars = encDec.dencrypt(GAMMA, String.valueOf(chars));
        System.out.println(chars);


    }
}
