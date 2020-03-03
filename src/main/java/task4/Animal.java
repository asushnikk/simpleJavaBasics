package task4;

import lombok.Getter;
import lombok.Setter;

public class Animal {

    @Setter
    @Getter
    private String name;
    @Setter
    @Getter
    private int weight;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal name: " + getName() + ", weight: " + getWeight();
    }

}
