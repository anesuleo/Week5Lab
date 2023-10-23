package ie.atu;

public class Main {
    public static void main (String[] args)
    {
        Person student1 = new Person("Anesu", "Njove", 21);
        System.out.println("Details are" + " " + student1.getFirstName());

        Person user = new Person();

        user.getUserInput();

        user.displayInfo();
    }
}