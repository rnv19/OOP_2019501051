public class wordsADT{
    private Words[] easyWords, mediumWords, hardWords;

    private Word selectWord;

    private int esize, msize, hsize;

    private String[] wordList;

    private int wlsize;

    wordsADT(){
        easyWords = new easyWords[20];
        mediumWords = new mediumWords[20];
        hardWords = new hardWords[20];
        esize = 0;
        msize = 0;
        hsize = 0;
        wordList = new wordList[120];
        wsize = 0;
    }

    public void readTxt() {
        try {
            Scanner scan = new Scanner(new File("movies.txt"));
            // StringBuffer sb = new StringBuffer();
            while (scan.hasNextLine()) {
                wordsList[wlSize++] = scan.nextLine();
                // sb.append(scan.nextLine() + ";");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public int getCount(){
        return wordList.length/5;
    }

    public void fixWords(){
        for(int i = 0; i < getCount()*5; i+=5){
            String[] hints = new String[2];
            if(wordList[i+1].equals("easy")){
                word = wordList[i].toLowerCase();
                level = 1;
                hints[0] = wordList[i+2];
                hints[1] = wordList[i+3];
                easyWords[esize++] = Words(word, level, hints);
            }
            if(wordList[i+1].equals("medium")){
                word = wordList[i].toLowerCase();
                level = 2;
                hints[0] = wordList[i+2];
                hints[1] = wordList[i+3];
                mediumWords[msize++] = Words(word, level, hints);
            }
            if(wordList[i+1].equals("hard")){
                word = wordList[i].toLowerCase();
                level = 3;
                hints[0] = wordList[i+2];
                hints[1] = wordList[i+3];
                hardWords[hsize] = Words(word, level, hints);
            }
        }
    }


    public Words[] removeWords(Word[] words, int pos, int lvl){
        for(int i = 0; i < words.length; i++){
            if(words[i] == null){
                break;
            }words[i] = words[i+1];
        }if (lvl == 1){
            esize--;}
        if(lvl == 2){
            msize--;
        }else{hsize--;
        }return words;
    }

    public Word randomWord(int level){
        int l = level;
        Word out;
        while (lvl == 4) {
            double temp = Math.random();
            if (temp <= 0.33) {
                lvl = 1;
                if (eSize != 0) {
                    break;
                }
            } else if (temp <= 0.67) {
                lvl = 2;
                if (mSize != 0) {
                    break;
                }
            } else {
                lvl = 3;
                if (hSize != 0) {
                    break;
                }
            }
        }
            if (lvl == 1 && eSize != 0) {
            double temp = (Math.random() * eSize);
            out = easyWords[(int) temp];
            easyWords = remWord(easyWords, (int) temp, 1);
            return out;
        } else if (lvl == 2 && mSize != 0) {
            double temp = (Math.random() * mSize);
            out = mediumWords[(int) temp];
            mediumWords = remWord(mediumWords, (int) temp, 2);
            return out;
        } else if (hSize != 0) {
            double temp = (Math.random() * hSize);
            out = hardWords[(int) temp];
            hardWords = remWord(hardWords, (int) temp, 3);
            return out;
        }
        return null;
    }
}