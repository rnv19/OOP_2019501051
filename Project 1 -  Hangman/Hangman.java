import java.util.*;
import java.io.*;

class Hangman{
    public static String[] dataFrame;
    public static Words[] wordsList;
    public static String secretWord;
    public static String[] wordsGuessed;
    public static String[] letters;
    public String randMovie(){
        int n;
        Random rand = new Random();
        n = rand.nextInt(wordsList.length);
        return wordsList[n].getMovie();
    }

    public Boolean isWordGuessed(String secretWord, String[] wordsGuessed){
        int count = 0;
        for(int i = 0; i < wordsGuessed.length; i++){
            for(int j = 0; j < secretWord.length(); j++){
                if(wordsGuessed[i].equals(secretWord.charAt(j))){
                    count += 1;
                }
            }
        }if (count == secretWord.length()){
            return true;
        }return false;
    }

    public String[] availableLetters(){

    }

    public static void main(String args[]){
        Hangman hg = new Hangman();
        secretWord = hg.randMovie();
        dataFrame = ReadFile.readFile("movies.txt");
        int size = 0;
        wordsList = new Words[22];
        // ArrayList<Words> wordsList = new ArrayList<Words>(size);
        for(int i = 0; i < dataFrame.length - 2; i+=6){
            wordsList[size++] = new Words(dataFrame[i], dataFrame[i+1], dataFrame[i+2], dataFrame[i+3]);
        }
        // System.out.println(size);
        System.out.println(hg.randMovie());
    }
}
