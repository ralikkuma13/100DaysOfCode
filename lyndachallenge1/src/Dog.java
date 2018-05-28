import java.awt.*;

public class Dog {

    Color dogColor;
    int dogAge;
    String dogName;
    String[] fetchedItems = {"bone", "ball", "dead animal"};
    int fetchIndex;

    public Dog(Color newColor, int newAge, String newName){
      this.dogColor = newColor;
      this.dogAge = newAge;
      this.dogName = newName;

    }

    public void Bark(){

        System.out.println("Woof");
    }

    public int getDogAge(){
        return this.dogAge;
    }

    public void fetch(){
        while(fetchIndex < fetchedItems.length) {
            String item = fetchedItems[fetchIndex];
            System.out.println(this.dogName + " fetched a " + item);
            fetchIndex++;
        }

    }




}
