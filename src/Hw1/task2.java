package Hw1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class task2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input name and surname and address");

        String name = br.readLine();
        String surname = br.readLine();
        String address = br.readLine();

        System.out.println("What is your name ?");
        System.out.println("My name is " + name + " " + surname);

        System.out.println("Where are you live " + name + "?");
        System.out.println(address + " street");




    }
}
