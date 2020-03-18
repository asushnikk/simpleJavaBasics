package task3;

import java.util.ArrayList;
import java.util.List;
import task2.Pen;
import task2.Pencil;
import task2.Stationery;

public class NewbiePackUtil {

    public static List<Stationery> createNewbiePack() {

        List<Stationery> newbieStationery = new ArrayList<>();
        newbieStationery.add(new Pen(5));
        newbieStationery.add(new Pencil(6));

        return newbieStationery;
    }

}