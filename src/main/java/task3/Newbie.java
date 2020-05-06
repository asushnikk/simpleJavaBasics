package task3;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import task2.Stationery;


public class Newbie {

    @Getter
    @Setter
    private List<Stationery> stationeryList = new ArrayList<>();

    public void printInfo() {
        for (Stationery stationery : stationeryList) {
            System.out.println(stationery.toString());
        }
    }
}
