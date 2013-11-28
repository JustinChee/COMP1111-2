/**
 * 
 */
package q1;

/**
 * A simple test class that creates a Dog and makes it speak.
 * 
 * @author Justin
 *
 */
public class DogTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        /*Dog dog = new Dog("Spike");
        System.out.println(dog.getName() + " says " + dog.speak());
        */
        
        Labrador lab = new Labrador("Labby", "yellow");
        System.out.println(lab.getName() + " says " + lab.speak()
                + "\nWeight = " + lab.avgBreedWeight());
        
        Yorkshire york = new Yorkshire("Yorky");
        System.out.println(york.getName() + " says " + york.speak()
                + "\nWeight = " + york.avgBreedWeight());

    }

}
