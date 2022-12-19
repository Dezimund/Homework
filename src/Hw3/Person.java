package Hw3;

public class Person {

    private static String firstName;
    private static String lastName;
    private static int birthYear;


    public Person() {
    }

    public Person(String firstName, String lastName) {

    Person.firstName = firstName;
    Person.lastName = lastName;

    }


    public static int getAge() {
        return 2022 - birthYear;
    }


    public static void setFirstName(String firstName) {
        Person.firstName = firstName;
    }

    public static void setLastName(String lastName) {
        Person.lastName = lastName;
    }

    public static void setBirthYear(int birthYear) {
        Person.birthYear = birthYear;
    }



    public static void changeName(String firstName){

        Person.firstName = firstName;

    }

    public static void changeLastName(String lastName){
        Person.lastName = lastName;
    }


    public static String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "Person First name " + firstName + " last name " + lastName + " BirthYear " + birthYear;
    }
}
