//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CorruptWord weird6 = new CorruptWord("epicword");
        //it's a word, so it won't take spaces
        System.out.print(weird6.Encrypt());
        System.out.print(weird6.Decrypt("LWPJDVYK", 7));
    }
}