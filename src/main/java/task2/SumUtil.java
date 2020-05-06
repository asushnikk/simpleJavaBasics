package task2;

import java.util.List;

public class SumUtil {

    public static Integer Sum(List<Stationery> list) {
        Integer result = 0;
        for (Stationery stationery : list) {
            result += stationery.getCost() * stationery.getAmount();

        }
        return result;
    }
}
