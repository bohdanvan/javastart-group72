/**
 * @author bvanchuhov
 */
public class LikesStatistic {
    public static void main(String[] args) {
        long likesCount = 5;
        int registrationYear = 2017;
        int currentYear = java.time.Year.now().getValue();

        double likesPerYear = (double) likesCount /
                (currentYear - registrationYear + 1);

        System.out.println(likesPerYear + " likes / year");
    }

}