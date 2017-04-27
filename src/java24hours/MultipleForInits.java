package java24hours;

/**
 * Created by Tommy on 4/24/17.
 */
public class MultipleForInits {
    public static void main(String[] args){
        int i, j;
        for(i=0, j=0; i*j<=1000; i++, j+=2){
            System.out.println(i + " * " + j + " = " + i*j);
        }
    }
}
