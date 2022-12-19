package Hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task11 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input a :");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Input b :");
        int b = Integer.parseInt(br.readLine());
        System.out.print("Input c :");
        int c = Integer.parseInt(br.readLine());
        System.out.print("Input d :");
        int d = Integer.parseInt(br.readLine());
        System.out.print("Input e :");
        int e = Integer.parseInt(br.readLine());

        int average = (a+b+c+d+e) / 5;

        System.out.println("Average : " + average);
    }
}
