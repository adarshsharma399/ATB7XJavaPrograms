package ex_28072024;

public class Animal {//This class is public, we can access it from any folder
    String name ="Adarsh";
    String color;

    void walk(){};
    void talk(){};

    public static void main(String[] args) {
        Animal animalref = null; //Class loader loaded the class in JVM but no object is created and no memory is allocated in Heap area
        Animal animalref2 = new Animal(); // new object is created in heap
        Animal animalref3 = new Animal(); // another new object created in heap
        Animal animalref4 = animalref2; //pointing the same object "new Animal();"

        System.out.println(animalref3.name);
    }

}
