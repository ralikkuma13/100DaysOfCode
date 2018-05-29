import java.util.Random;

public class Dice {

    //Create a variable that holds user input to know how many dice to roll
    //Create a dice that contains the numbers 1-6 in an array

    //Roll method
    //loop to go through the array picking a random number bound to 6 so it gives out a random number from 0 to 5
    //which matches the index for the array the dice values are put in

    public int numberOfDie;
    public int[] diceFace = {1, 2, 3, 4, 5, 6};

    public Dice(int x){
        this.numberOfDie = x;
    }

    public void roll(int x){
        Random rand = new Random();
        int i = 1;
        while (x <= this.numberOfDie){
            System.out.println("Throw " + i + ": " + this.diceFace[rand.nextInt(6)]);
            x++;
            i++;
        }
    }

}
