package Zadatak4;

public class Person {
    private String name;
    private int age;
    private String email;

    Person(String name, int age, String email){
        this.setName(name);
        this.setAge(age);
        this.setEmail(email);
    }
    public String getName(){return name;}
    public int getAge(){return age;}
    public String getEmail(){return email;}

    public void setName(String name){this.name=name;}
    public void setAge(int age){this.age=age;}
    public void setEmail(String email){this.email=email;}
}
