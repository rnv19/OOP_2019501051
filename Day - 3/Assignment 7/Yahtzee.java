/**
 * Take the number of dice as 5 and check for Yahtzee
 * Yahtzee: where all dice show the same value, which is the 
 * highest-scoring combination
 * 
 * @author rnv sundeep
 */
public final class Yahtzee {
     /**.
    Constructer
    */
    private Yahtzee() {
        //unused
    }
    /**
     * This method should return a random value between 0 and 6
     * @return random integer between 0 and 6
     */
    public static int rollDice() {
        double randomNumber = Math.random();
        randomNumber = randomNumber * 6;
        randomNumber = randomNumber + 1;
        int randomInt = (int) randomNumber;
        return randomInt;
    }
    /**
     * This function should return a value, which is number of tries it
     * took to get the same value on all the 5 dices
     * @return number of tries to get the same value on all the dices
     */
    public static int keepRolling() {
        int dice1 = rollDice();
        int dice2 = rollDice();
        int dice3 = rollDice();
        int dice4 = rollDice();
        int dice5 = rollDice();
        int count = 1;

        while(!(dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)){
            dice1 = rollDice();
            dice2 = rollDice();
            dice3 = rollDice();
            dice4 = rollDice();
            dice5 = rollDice();
            count += 1;
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(keepRolling());
    }
}