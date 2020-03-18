package task7;

import task7.Submarine.Engine;

public class Main {

    public static void main(String[] args) {

        Submarine submarine = new Submarine();
        Engine engine = submarine.egineStart();
        System.out.println("Первое значение поля:" + submarine.isEngineWorkStatus());
        submarine.egineStop(engine);
        System.out.println("Второе значение поля:" + submarine.isEngineWorkStatus());
    }
}
