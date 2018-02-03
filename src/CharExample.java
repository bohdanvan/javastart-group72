/**
 * @author bvanchuhov
 */
public class CharExample {

    public static void main(String[] args) {
        System.out.println("I ❤ Java");
        System.out.println("☺");
        System.out.println("\uD83D\uDE02");

        char c1 = 'a';
        char c2 = '\n'; // \n, \t, \\, \', \",
        char c3 = '\u2764';
        char c4 = 1001;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        // "D:\\"
        System.out.println("\"D:\\\\\"");
        System.out.println("\"D:\\\\\"");
    }
}
