import java.awt.*;

public class Dog {

    Color dogColor;
    int dogAge;
    String dogName;

    public Dog(Color newColor, int newAge, String newName){
      this.dogColor = newColor;
      this.dogAge = newAge;
      this.dogName = newName;

    }

    public void Bark(){

        System.out.println("Woof");
    }




}
