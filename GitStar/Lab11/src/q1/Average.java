/**
 * 
 */
package q1;

/**
 * @author Justin
 *
 */
public class Average {

    /**
     * @param args
     */
    public static void main(String[] args) {
        float average = 0;
        if (args == null){
            System.out.print ("No arguments");
        } else {
            for (String s: args){
                System.out.println(Integer.parseInt(s));
                average += Integer.parseInt(s);
            }
            System.out.println("---\nAverage = " + average/args.length);
        }
        
    }

}
