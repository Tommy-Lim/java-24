package java24hours;

/**
 * Created by Tommy on 4/24/17.
 */
public class ForInWhile {
    public static void main(String[] args){
        int points = 0;
        int target = 100;
        while(points <= 100){
            for(int i = 0; i<target; i++){
                if(points >50){
                    break;
                }
                points += i;
                System.out.println("Points: " + points);
            }
        }
    }
}
