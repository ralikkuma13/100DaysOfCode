import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of die/dice to roll: ");
        int inputI = input.nextInt();

        while(inputI <= 0) {
            System.out.println("Invalid. Try again: ");
            inputI = input.nextInt();
        }

/*
            try {
                inputI = input.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Invalid. Try again: ");
            }
*/


        Dice dice = new Dice(inputI);
        dice.roll(1);
    }
}
