/**
 * Given a string and a non-negative int n, we'll say that the front
 * of the string is the first 3 chars, or whatever is there if the
 * string is less than length 3. Return n copies of the front;
 *
 * Input : frontTimes("Chocolate", 2)
 * Output : ChoCho
 *
 * Input : frontTimes("Chocolate", 3)
 * Output : ChoChoCho
 *
 * Input : frontTimes("Abc", 3)
 * Output : AbcAbcAbc
 *
 * @author: Siva Sankar
 */

public final class FrontTimes {
     /**.
    Constructer
    */
    private FrontTimes() {
        //unused
    }
    /** Not a javadoc (ignored). */
    public static final int LEN = 3;
    /**
     * This method returns n copies of the front.
     * @param str the string to be considered.
     * @param n the non-negative integer value.
     * @return the n copies of the front string.
     */
    public static String frontTimes(final String str, final int n) {
        //  Your code goes here....
        if (str.length() >= LEN) {
            String res1 = str.substring(0, LEN);
            int i;
            String res = "";
            for (i = 0; i < n; i++) {
                res = res + res1;
            }
            return res;
        } else {
            int j;
            String res1 = "";
            for (j = 0; j < n; j++) {
                res1 = res1 + str;
            }
            return res1;
        }
    }
}
