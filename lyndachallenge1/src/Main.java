import java.awt.*;

public class Main {

    public static void main(String[] args){
        Dog doggy = new Dog(Color.BLUE, 12, "Snoopy");

        doggy.Bark();
        System.out.println(doggy.getDogAge());

        doggy.fetch();


    }

}
