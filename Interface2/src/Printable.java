public interface Printable {

    void print();
    default void changeColor(){
        System.out.println("Color is change to red");
    }
    static void resetSettings(){
        System.out.println("Settings were changed");
    }
}
