package ex_24082024;

public class Lab171 extends Object{
    public static void main(String[] args) {
        Person p1 = new Person("Pramod", "KA");
        Person p2 = new Person("Lucky", "Del");

        System.out.println(p1);
        System.out.println(p2);
    }

}


class Person{
    String name;
    String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        //return super.toString();
        return "ID is -> "+ name + "Address -> "+ address;
    }
}

//toString