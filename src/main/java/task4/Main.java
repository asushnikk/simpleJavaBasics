package task4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Animal> animals = new ArrayList<>();

    static {
        animals.add(new Animal("Your Mom", 10000));
        animals.add(new Animal("Cat", 10));
        animals.add(new Animal("Dog", 20));
    }

    public static void main(String[] args) {

        animals.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        about();

        animals.sort((o1, o2) -> {
            if (o1.getName().compareTo(o2.getName()) == 0) {
                return o1.getWeight() - o2.getWeight();
            }
            return o1.getName().compareTo(o2.getName());
        });
        about();

        animals.sort((o1, o2) -> o1.getWeight() - o2.getWeight());
        about();
    }

    public static void about() {
        animals.forEach(System.out::println);
        System.out.println();
    }
}
