package java24hours;
import java.util.*;

/**
 * Created by Tommy on 4/22/17.
 */
public class Dice {
    public static void main(String[] args){
        Random generator = new Random();
        int value = generator.nextInt();
        System.out.println("The random number is: " + value);
    }
}
