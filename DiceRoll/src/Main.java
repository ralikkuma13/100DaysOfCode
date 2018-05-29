import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    public static void main(String[] args){
        System.out.println("Enter a number of die/dice to roll: ");
        int input = scanner.nextInt();
        Dice dice = new Dice(input);
        dice.roll(input);
    }
}
