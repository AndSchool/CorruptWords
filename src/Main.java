//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CorruptWord weird6 = new CorruptWord("epicword");
        //it's a word, so it won't take spaces
        System.out.println("Randomly Corrupting: " + "epicword");
        System.out.println(weird6.Corrupting());
        System.out.println("-------------------------------");
        System.out.println("Encrypting with random key: " + "epicword");
        System.out.println(weird6.Encrypt());
        System.out.println("-------------------------------");
        System.out.println("Decrypting an encrypted version of: epicword with a key of 7");
        System.out.println(weird6.Decrypt("LWPJDVYK", 7));
        System.out.println("-------------------------------");
    }
}
