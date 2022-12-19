package Hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      Person person1 = new Person();

      Person.setFirstName("Bebra");
      Person.setLastName("Bobr");
      Person.setBirthYear(1984);

        System.out.println(person1);

        System.out.println(Person.getFirstName());

        System.out.println(Person.getLastName());


        System.out.println(Person.getBirthYear());

        System.out.println("Calc Age " + Person.getAge());

        Person.changeName("Bera");
        Person.changeLastName("Borb");

        System.out.println(person1);







    }
}
