public class Main {

    static String key = "1234ASD56789ASD";
    static String message = "I love to exercise sport and make my body stronger";
    //static String message = "zR\u009F£·¸d©¥W\u009D±¦Å§\u009A¥\u0098T´Ã³§ªW\u0099§¥s±\u0092\u009D\u0098T®Ìd\u0097¥\u009B±Y´Ç¶  \u009A\u0099³";
    static char[] crypt;

    public static void main(String[] args) {
       EncryptDecrypt encDec = new EncryptDecrypt();
       message = String.valueOf(encDec.encrypt());
       System.out.println( message);
        message = String.valueOf(encDec.dencrypt());
        System.out.println(message);


    }
}
