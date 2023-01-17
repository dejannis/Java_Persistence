package db;

public class Worker {

    public int id;
    public String name;
    public int age;
    public String address;
    public int salary;

    @Override
    public String toString() {
        return  id + "\t" + name + "\t" + age + "\t" + address + "\t" + salary;
    }
}
