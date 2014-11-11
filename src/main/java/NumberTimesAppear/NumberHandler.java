package NumberTimesAppear;

/**
 * Created by savannah on 11/11/14.
 */
public class NumberHandler {
    public int count(int search, int base) {
        String stringBase = Integer.toString(base);
        char stringSearch = Integer.toString(search).charAt(0);
        int count = 0;

        char[] chars = stringBase.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == stringSearch) {
                count++;
            }
        }

        return count;
    }
}
