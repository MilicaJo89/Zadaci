package Zadatak4;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Charlotte",27,"wantstomarry@gmail.com");

        //to get private attributes we use getters
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getEmail());

        System.out.println("These are the changes");

        //to change the attributes we use setters
        person.setName("Lydia");
        person.setAge(15);
        person.setEmail("desperatetomarryfirst@gmail.com");

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getEmail());

    }
}
