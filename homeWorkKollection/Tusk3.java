package homeWorkKollection;

import java.util.HashMap;
import java.util.Map;

public class Tusk3 {

    Parrot parrot = new Parrot("Kesha");
    Dog dog = new Dog("Bobik");
    Cat cat = new Cat("Barsik");

    public void homePets() {
        Map<String, Pet> pets = new HashMap<>();
        pets.put("name1", parrot);
        pets.put("name2", dog);
        pets.put("name3", cat);

        Pet result = pets.get("name1");
        System.out.println(result);
        Pet result2 = pets.get("name2");
        System.out.println(result2);
        Pet result3 = pets.get("name3");
        System.out.println(result3);

    }

}
