import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean fail = false;
        int inputI = 0;
        System.out.println("Enter a number of die/dice to roll: ");

        try
        {
             inputI = input.nextInt();
        }
        catch(InputMismatchException e)
        {
            fail = true;
        }

        if(fail || inputI <= 0){
            System.out.println("INVALID INPUT");
        }


     /*   while(inputI <= 0 || round((float)inputI) <= 0) {
            System.out.println("Invalid. Try again: ");
            inputI = input.nextInt();
        }*/
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
