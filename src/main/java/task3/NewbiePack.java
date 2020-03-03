package task3;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import task2.Pen;
import task2.Pencil;
import task2.Stationery;

public class NewbiePack {

    @Getter
    @Setter
    private List<Stationery> newbieStationery = new ArrayList<>();

    public NewbiePack() {
        createNewbiePack();
    }

    public void createNewbiePack() {
        newbieStationery.add(new Pen(5));
        newbieStationery.add(new Pencil(6));
    }

}
