/**
 * Calories.
 *
 * @author Nico Bour
 */
public class Calories {
    
    /**
    * @param args - Command Line Arguments
    */
    public static void main(String[] args) {
    
        int years = 25;
        int feet = 5;
        int inches = 10;
        int pounds = 160;
        int ounces = 3;
    
        double weight = ((pounds * 16) + ounces) * 0.0283495;
        double height = ((feet * 12) * 2.54) + (inches * 2.54);
    
    
        double mbmr = (10 * weight) + (6.25 * height) - (5 * years) + 5;
        double wbmr = (10 * weight) + (6.25 * height) - (5 * years) - 161;
    
        System.out.println("Male BMR is " + mbmr + " calories/day.");
        System.out.println("Female BMR is " + wbmr + " calories/day.");
    
      
    
    }
}