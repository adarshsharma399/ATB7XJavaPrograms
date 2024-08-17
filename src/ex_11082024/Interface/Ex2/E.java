package ex_11082024.Interface.Ex2;

public interface E {
    void startEngine();

    void stopEngine();

    default void haltingEngineJustStart() {
        System.out.println("Halt the Engine");
    }

    default void haltingEngineJustStop() {
        System.out.println("Halt the Engine");
    }

    static void M1() {
        System.out.println("M1");
    }

    //Static methods are allowed in Abstract class and Interfaces both
    //Default methods are only allowed in Interfaces


    void m2();
    void m3();
//   void m4(){
//       System.out.println("Not possible");   //Concrete method not possible in interface
//   }
}