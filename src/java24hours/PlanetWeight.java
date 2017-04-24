package java24hours;

import java.io.*;
import java.lang.*;

public class PlanetWeight {
    public static void main(String[] args) throws IOException{
        int weight;
        double mercury;
        double moon;
        double jupiter;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Weight: ");

        try{
            weight = Integer.parseInt(br.readLine());
            mercury = weight * 0.378;
            moon = weight * 0.166;
            jupiter = weight * 2.364;

            System.out.println("\n" + "Your weight on earth is: " + weight);
            System.out.println("Your weight on mercury is: " + mercury);
            System.out.println("Your weight on moon is: " + moon);
            System.out.println("Your weight on jupiter is: " + jupiter);
        } catch(NumberFormatException nfe){
            System.err.println("Invalid Format.");
        }

    }
}
