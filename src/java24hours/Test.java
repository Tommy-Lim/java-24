package java24hours;

/**
 * Created by Tommy on 4/24/17.
 */
public class Test {

    public static void main(String[] args){
        boolean answer = true;

        // variable text must be declared outside of the if/else block.
        String text;
        if(answer){
            // can't do String text = "foo"
            text = "True";
        } else{
            // can't do String text = "bar"
            text = "False";
        }

        // single line conditional
        if(answer) System.out.println("Answer is true");

        // print text
        System.out.println("Text is: " + text);

        // pre- and post-fixing
        int num = 10;
        System.out.println("Num: " + num); // 10
        System.out.println("Num prefixed: " + (++num)); // 11
        System.out.println("Num: " + num); // 11
        System.out.println("Num postfixed: " + (num++)); // 11
        System.out.println("Num: " + num); // 12

        // ternary expression
        String newText = "Answer is ";
        newText += ((answer) ? "true" : "false");
        System.out.println("\n" + newText);
    }
}
