package Hw1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input radius of flower");

        double radius = Double.parseDouble(br.readLine());

        double area = Math.pow(radius,2) * Math.PI;

        System.out.printf("Area is : %.2f\n", area);

        double perimeter = 2 * radius * Math.PI;

        System.out.printf("Perimeter is : %.2f", perimeter);

    }

}
