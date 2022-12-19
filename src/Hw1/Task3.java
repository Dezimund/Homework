package Hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // $ per minute
        double c1 = 3.3;
        double c2 = 2.7;
        double c3 = 1.2;


        System.out.println("Input minutes of three calls");
        double t1 = Double.parseDouble(br.readLine());
        double t2 = Double.parseDouble(br.readLine());
        double t3 = Double.parseDouble(br.readLine());

        double firstCall = c1 * t1;
        double secondCall = c2 * t2;
        double thirdCall = c3 * t3;

        System.out.printf("First call is %.2f $\n", firstCall);
        System.out.printf("Second call is %.2f $\n", secondCall);
        System.out.printf("Third Call is %.2f $\n", thirdCall);

        double sum = firstCall + secondCall + thirdCall;

        System.out.printf("Sum of calls %.2f $", sum);

    }
}
