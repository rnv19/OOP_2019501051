/**
 * Given an array of Strings, convert each string of the array into
 * lower case String and then return the array.
 *
 * Input : {"Hello", "Hi"}
 * Output : {"hello", "hi"}
 *
 * @author Siva Sankar
 */

public final class StringHandling {
     /**.
    Constructer
    */
    private StringHandling() {
        //unused
    }

    /**
     * This method returns the array of lower case strings.
     * @param arr the input array.
     * @return the array of lower case Strings based on the input parameter.
     */
    public static String[] lower(final String[] arr) {
        //  your code goes here....
        String[] res = new String[arr.length];
        int i;
        for (i = 0; i < arr.length; i++) {
            res[i] = arr[i].toLowerCase();
        }
        
        return res;
    }
}
