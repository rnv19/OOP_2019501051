public class Word {

    /**
     * string to store the name of the movie.
     */
    private String word;

    /**
     * string array to store the hints availble for the movie.
     */
    private String[] hints;

    /**
     * int variable to store the difficulty level of the movie.
     */
    private int level;

    Word() {
    }

    Word(final String word, final String[] hints, final int level) {
        this.word = word;
        this.hints = hints;
        this.level = level;
    }

    /**
     * function to get the name of the movie.
     *
     * @return the name of the movie.
     */
    public String getWord() {
        return this.word;
    }

    /**
     * function to set the name of the movie.
     *
     * @param word the name of the movie.
     */
    public void setWord(final String word) {
        this.word = word;
    }

    /**
     * function to get the hints for the movie as per the user
     * requirement.
     *
     * @param i the index of the hint in the array.
     * @return the hint at the given index.
     */
    public String getHints(final int i) {
        return this.hints[i];
    }

    /**
     * function to store the hints for the movie.
     *
     * @param hints the hints given for the movie.
     */
    public void setHints(final String[] hints) {
        this.hints = hints;
    }

    /**
     * function to get the difficulty level of the movie.
     *
     * @return the difficulty level of the movie.
     */
    public int level() {
        return this.level;
    }

    /**
     * function to set the difficulty level of the movie.
     *
     * @param diffLevel the difficulty level of the movie.
     */
    public void level(final int level) {
        this.level = level;
    }

    /**
     * function to return the details of the movie.
     *
     * @return details of the movie in string format.
     */
    @Override
    public String toString() {
        return "{"
            + " word = '" + getWord() + "'"
            + ", level = '" + level() + "'"
            + "}";
    }

    /**
     * function to randomly generate the word with clues and underscores.
     *
     * @return the word in secret format.
     */
    public char[] secretWord() {
        char[] secretWord = new char[word.length()];
        int shows = word.length() / 4;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 97 && word.charAt(i) <= 122
                || word.charAt(i) >= 65 && word.charAt(i) <= 90) {
                    if (Math.random() >= 0.8 && shows != 0) {
                        secretWord[i] = word.charAt(i);
                        shows -= 1;
                    } else {
                        secretWord[i] = '_';
                    }
            } else {
                    secretWord[i] = word.charAt(i);
            }
        }
        // return new String(secretWord);
        return secretWord;
    }
}
