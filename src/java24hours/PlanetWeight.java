package java24hours;

import java.io.*;
import java.lang.*;

/**
 * Created by Tommy on 4/22/17.
 */
public class PlanetWeight {
    public static void main(String[] args) throws IOException{
        int weight;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Weight:");
        try{
            weight = Integer.parseInt(br.readLine());
            double mercury = weight * 0.378;
            double moon = weight * 0.166;
            double jupiter = weight * 2.364;
            System.out.println("Your weight on earth is: " + weight);
            System.out.println("Your weight on mercury is: " + mercury);
            System.out.println("Your weight on moon is: " + moon);
            System.out.println("Your weight on jupiter is: " + jupiter);
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format.");
        }

    }
}
