package Resort_Furama.models.Person;

import org.omg.CORBA.PRIVATE_MEMBER;

public abstract class Person {
    private String Name;
    private int id;
    private int age;
    public Person(){}

    public Person(String name, int id, int age) {
        Name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
