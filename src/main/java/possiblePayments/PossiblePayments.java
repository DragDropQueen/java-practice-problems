package possiblePayments;

/**
 * Created by savannah on 11/11/14.
 */
public class PossiblePayments {
    public int calc(int bill, int cash) {
        int count = 0;

        for (int i = 1; i <= bill; i++) {
            float sum = bill + i;

            if (sum/10 < i) {
                break;
            }

            if (i >= sum/20 && sum % 5 == 0 && sum < cash) {
                count++;
            }
        }

        return count;
    }
}
