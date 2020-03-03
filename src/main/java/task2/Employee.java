package task2;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private List<Stationery> stationeries = new ArrayList<>();

    public Integer Sum() {
        Integer result = 0;
        for (Stationery stationery : stationeries) {
            result += stationery.getCost() * stationery.getAmount();

        }
        return result;
    }

    public List<Stationery> getStationeries() {
        return stationeries;
    }

    public void setStationeries(List<Stationery> stationeries) {
        this.stationeries = stationeries;
    }
}
