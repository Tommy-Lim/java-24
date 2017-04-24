package java24hours;

/**
 * Created by Tommy on 4/24/17.
 */
public class SwitchExample {

    public static void main(String[] args){
        char grade = 'G';

        switch(grade){
            case 'A':
                System.out.println("You got an A.");
                break;
            case 'B':
                System.out.println("You got an B.");
                break;
            case 'C':
                System.out.println("You got an C.");
                break;
            case 'D':
                System.out.println("You got an D.");
                break;
            case 'F':
                System.out.println("You got an D.");
                break;
            default:
                System.out.println("Unrecognized grade.");

        }
    }
}
