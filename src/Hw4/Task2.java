package Hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input 3 int numbers ");

        System.out.println("Input 1 number");
        int number = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Input 2 number");
        int number1 = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Input 3 number");
        int number2 = Integer.parseInt(bufferedReader.readLine());




        if (number > number2 && number > number1){
            System.out.println("Max number : " + number );
        }else if (number1 > number && number1 > number2){
            System.out.println("Max number :" + number1);
        }else {
            System.out.println("Max number : " + number2);
        }


        if (number < number2 && number < number1){
            System.out.println("Min number : " + number );
        }else if (number1 < number && number1 < number2){
            System.out.println("Min number :" + number1);
        }else {
            System.out.println("Min number : " + number2);
        }

    }
}
