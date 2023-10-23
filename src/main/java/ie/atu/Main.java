package ie.atu;

public class Main {
    public static void main (String[] args){
        System.out.println("Hello World");
        Person student1 = new Person("Anesu", "Njove", 21);
        System.out.println("Details are" + " " + student1.getFirstName());
    }
}