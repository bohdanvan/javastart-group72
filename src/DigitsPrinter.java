/**
 * @author bvanchuhov
 */
public class DigitsPrinter {
    public static void main(String[] args) {
        int n = 133423402;
        System.out.println(n/10000%10);
        System.out.println(n/1000%10);
        System.out.println(n/100%10);
        System.out.println(n/10%10);
        System.out.println(n%10);
    }
}
