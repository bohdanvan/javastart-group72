/**
 * @author bvanchuhov
 */
public class IncrementExample {

    public static void main(String[] args) {
        int x = 10;

        System.out.println("x = " + (x++)); // 10
        System.out.println("x = " + x); // 11

        int n = 10;
        n += n++ + ++n;
        System.out.println(n); // ?
    }
}
