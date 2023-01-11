
/**
 * Write a description of class RenameThisClass here.
 *
 * @author Yasin McCaskill
 * @version 1-3-23
 */
public class Yahtzee
{
    private Die6 die1;
    private Die6 die2;
    private Die6 die3;
    private Die6 die4;
    private Die6 die5;
    
    public Yahtzee() {
        die1 = new Die6();
        die2 = new Die6();
        die3 = new Die6();
        die4 = new Die6();
        die5 = new Die6();
    }

    public void roll() {
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
    }
    
    public void roll(int dieNumber) {
        if (dieNumber == 1) {
            die1.roll();
        } else if (dieNumber == 2) {
            die2.roll();
        } else if (dieNumber == 3) {
            die3.roll();
        } else if (dieNumber == 4) {
            die4.roll();
        } else {
            die5.roll();
        }
    }
    
    public String values() {
        return die1.getValue() + " " + die2.getValue()
        + " " + die3.getValue() + " " + die4.getValue() + " " + die5.getValue();
    }
    
    public String summarize() {
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int[] dice = new int[5];
        dice[0] = die1.getValue();
        dice[1] = die2.getValue();
        dice[2] = die3.getValue();
        dice[3] = die4.getValue();
        dice[4] = die5.getValue();
        for (int i = 0; i < 5; i++) {
            if (dice[i] == 1) {
                one += 1;
            } else if (dice[i] == 2) {
                two += 1;
            } else if (dice[i] == 3) {
                three += 1;
            } else if (dice[i] == 4) {
                four += 1;
            } else if (dice[i] == 5) {
                five += 1;
            } else {
                six += 1;
            }
        }
        return "Dice Values: " + "1-" + one + "; 2-" + two + "; 3-" + three 
          + "; 4-" + four + "; 5-" + five + "; 6-" + six;
    }
}

