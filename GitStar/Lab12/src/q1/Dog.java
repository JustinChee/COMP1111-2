/**
 * 
 */
package q1;

/**
 * A class that holds a dog's name and can make it speak.
 * @author Justin
 *
 */
public abstract class Dog {
    protected String name;
    
    // Constructor -- store name
    public Dog(String name){
        this.name = name;
    }
    
    // Returns the dog's name
    public String getName(){
        return name;
    }
    
    // Returns a string with the dog's comments
    public String speak(){
        return "Woof";
    }
    
    // Returns dog's weight
    public abstract int avgBreedWeight();

}
