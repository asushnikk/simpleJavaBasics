package task4;

import lombok.Getter;

public class Animal {

    @Getter
    private String name;
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
