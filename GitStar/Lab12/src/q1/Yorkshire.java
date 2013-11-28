/**
 * 
 */
package q1;

/**
 * A class derived from Dog that holds information about
 * a Yorkshire terrier. Overrides Dog speak method.
 * @author Justin
 *
 */
public class Yorkshire extends Dog{
    private static int breedWeight = 50;
    
    public Yorkshire(String name){
        super(name);
    }
    
    // Small bark -- overrides speak method in Dog
    public String speak(){
        return "woof";
    }
    
    // Returns weight
    public int avgBreedWeight(){
        return breedWeight;
    }

}
