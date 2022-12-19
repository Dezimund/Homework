package Hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input a");
        double a = Double.parseDouble(br.readLine());

        System.out.println("Input b");
        double b = Double.parseDouble(br.readLine());

        System.out.println("Product is : " + (a*b));

    }
}
