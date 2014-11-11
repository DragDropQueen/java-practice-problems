package dna;

/**
 * Created by savannah on 11/11/14.
 */
public class Calculator {
    public float calc(String dna) {
        dna = dna.toLowerCase();
        float count = 0;

        int length = dna.length();

        char[] chars = new char[length];
        dna.getChars(0, length, chars, 0);

        for (int i = 0; i < length; i++) {
            if (chars[i] == 'g' || chars[i] == 'c') {
                count++;
            }
        }

        return count/length;
    }
}
