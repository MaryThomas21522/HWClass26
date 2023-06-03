package HWClass26;


import java.util.TreeMap;

public class Person {

    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary){
        this.name = name;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }

    public String toString(){
        return "Name: "+name+", Last Name: "+lastName+", Age: "+age+ ", Salary: "+salary;
    }
}

class PersonTester{
    public static void main(String[] args) {
        var person = new TreeMap<>();
        person.put(1, new Person("Duncan", "Dooky", 45, 110000));
        person.put(2, new Person("Kara", "Beltran", 75, 150000));
        person.put(3, new Person("Pepper", "Solis", 65, 210000));
        person.put(4, new Person("Mimo", "Lim", 35, 120000));

        for (var p : person.entrySet()) {
            System.out.println(p.getKey() + " " + p.getValue());

        }

    }
}

/*
    /*
         Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
 */