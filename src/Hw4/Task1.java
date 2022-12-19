package Hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public static void main(String[] args) throws IOException {
        System.out.println("Input 3 float numbers ");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input 1 number");
        float number = Float.parseFloat(bufferedReader.readLine());
        System.out.println("Input 2 number");
        float number1 = Float.parseFloat(bufferedReader.readLine());
        System.out.println("Input 3 number");
        float number2 = Float.parseFloat(bufferedReader.readLine());


        if(number >= -5 && number <= 5){
            System.out.println("Number 1 Belongs to the segment " + number);
        } else {
            System.out.println("Number 1 Dont belong");
        }


        if(number1 >= -5 && number1 <= 5){
            System.out.println("Number 2 Belongs to the segment " + number1);
        } else {
            System.out.println("Number 2 Dont belong");
        }


        if(number2 >= -5 && number2 <= 5){
            System.out.println("Number 2 Belongs to the segment " + number);
        } else {
            System.out.println("Number 2 Dont belong");
        }



    }


}
